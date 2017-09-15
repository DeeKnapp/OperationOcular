package com.quickenloans.ocularproject.fragments;

import android.location.Address;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.quickenloans.ocularproject.R;
import com.quickenloans.ocularproject.interfaces.PropertyDetailsService;
import com.quickenloans.ocularproject.utils.ZillowApiUtils;
import com.quickenloans.ocularproject.interfaces.ZillowSearchService;
import com.quickenloans.ocularproject.business_object.property_details.UpdatedPropertyDetails;
import com.quickenloans.ocularproject.business_object.zillow.SearchResults;
import com.squareup.picasso.Picasso;

import retrofit2.Retrofit;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

import java.text.NumberFormat;
import java.util.Locale;

import static com.google.android.gms.internal.zzail.runOnUiThread;

public class PropertyDetailsFragment extends Fragment {

    TextView textAddress, textZestimate;
    WebView webZillow;
    String mUrl;
    ImageView imageHouse;
    Button buttonWeb;

    public PropertyDetailsFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView =  inflater.inflate(R.layout.fragment_property_details, container, false);

        textAddress = rootView.findViewById(R.id.addressText);
        textZestimate = rootView.findViewById(R.id.zestimateText);
        webZillow = rootView.findViewById(R.id.zillow_web);
        imageHouse = rootView.findViewById(R.id.house_image);
        buttonWeb = rootView.findViewById(R.id.web_button);

        String lastActivity = getActivity().getIntent().getStringExtra("activityName");
        final String address;
        String citystatezip;
        Address addressReceived;

        buttonWeb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                webZillow.loadUrl(mUrl);
            }
        });

        if (lastActivity.equals("SavedSearchActivity")) {
            citystatezip = getActivity().getIntent().getStringExtra("zip");
            address = getActivity().getIntent().getStringExtra("shortAddress");
        }
        else {
            addressReceived = getActivity().getIntent().getParcelableExtra("streetAddress");

            address = addressReceived.getSubThoroughfare() + " " + addressReceived.getThoroughfare();
            citystatezip = addressReceived.getLocality() + ", " + addressReceived.getAdminArea();
        }

        textAddress.setText(getContext().getString(R.string.address, address));

        final Retrofit retrofit = ZillowApiUtils.initRetrofit();
        retrofit.create(ZillowSearchService.class)
                .getZillowResults(address, citystatezip).subscribeOn(Schedulers.io()).subscribe(new Action1<SearchResults>() {
            @Override public void call(final SearchResults repoResponse) {
                Log.d("testing", "testing");

                final int foo = Integer.parseInt(repoResponse.getResponse().getResults().getResult().getZestimate().getAmount().getContent());
                mUrl = repoResponse.getResponse().getResults().getResult().getLinks().getHomedetails();

                retrofit.create(PropertyDetailsService.class)
                        .getPropertyDetails(repoResponse.getResponse().getResults().getResult().getZpid())
                        .subscribeOn(Schedulers.io()).subscribe(new Action1<UpdatedPropertyDetails>() {
                    @Override public void call(final UpdatedPropertyDetails detailsResponse) {
                        Log.d("testing_details", "testing");

                        final String imageURL = detailsResponse.getResponse().getImages().getImage().url.get(0);

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                if (detailsResponse.getResponse() == null) {
                                    Toast.makeText(getActivity(), "This house is currently not in the market.", Toast.LENGTH_SHORT).show();
                                }
                                else if (detailsResponse.getResponse().getPosting() == null) {
                                    Toast.makeText(getActivity(), "This house is currently not in the market.", Toast.LENGTH_SHORT).show();
                                }
                                else if (detailsResponse.getResponse().getPosting().getStatus() == null) {
                                    Toast.makeText(getActivity(), "This house is currently not in the market.", Toast.LENGTH_SHORT).show();
                                }
                                else {
                                    Toast.makeText(getActivity(), "This house is currently on the market.", Toast.LENGTH_SHORT).show();
                                    textZestimate.setText(detailsResponse.getResponse().getPosting().getStatus());
                                }

                                Picasso.with(getContext()).load(imageURL).into(imageHouse);

                                if (detailsResponse.getResponse() == null) {
                                    textZestimate.setText(getContext().getString(R.string.price_estimate, NumberFormat.getNumberInstance(Locale.US).format(foo)));
                                }
                                else if (detailsResponse.getResponse().getPrice() == null) {
                                    textZestimate.setText(getContext().getString(R.string.price_estimate, NumberFormat.getNumberInstance(Locale.US).format(foo)));
                                }
                                else {
                                    textZestimate.setText(getContext().getString(R.string.listing_price, NumberFormat.getNumberInstance(Locale.US).format(detailsResponse.getResponse().getPrice())));
                                }
                            }
                        });
                    }
                }, new Action1<Throwable>() {
                    @Override public void call(Throwable throwable) {
                        Log.d("testing_details_fail", throwable.getMessage());
                    }
                });

            }
        }, new Action1<Throwable>() {
            @Override public void call(Throwable throwable) {
                Log.d("testing", throwable.getMessage());
            }
        });

        return rootView;
    }
}
