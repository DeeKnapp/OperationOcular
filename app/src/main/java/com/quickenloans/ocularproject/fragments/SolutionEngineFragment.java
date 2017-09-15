package com.quickenloans.ocularproject.fragments;

import android.location.Address;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.quickenloans.ocularproject.R;
import com.quickenloans.ocularproject.models.SolutionItem;
import com.quickenloans.ocularproject.adapters.SolutionItemAdapter;
import com.quickenloans.ocularproject.utils.SolutionEngineApiUtils;
import com.quickenloans.ocularproject.interfaces.SolutionEngineService;
import com.quickenloans.ocularproject.business_object.solution_engine.SolutionEngineResponse;
import com.quickenloans.ocularproject.business_object.solution_engine.SolutionOptions;

import retrofit2.Retrofit;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

import static com.google.android.gms.internal.zzail.runOnUiThread;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class SolutionEngineFragment extends Fragment{

    private SolutionItemAdapter itemAdapter;
    TextView textEstMonthlyPayment, textListingPrice, textRateApr, textLoanAmount;
    ListView listView;
    ProgressBar progressBar;

    public SolutionEngineFragment() {
        // Required empty public constructor
    }

    List<SolutionItem> solutionItems = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_solution_engine, container, false);

        textEstMonthlyPayment = rootView.findViewById(R.id.est_monthly_payment);
        textListingPrice = rootView.findViewById(R.id.listing_price);
        textRateApr = rootView.findViewById(R.id.rate_apr);
        textLoanAmount = rootView.findViewById(R.id.loan_amount);
        progressBar = rootView.findViewById(R.id.solutions_progress);

        progressBar.setVisibility(View.VISIBLE);

        String lastActivity = getActivity().getIntent().getStringExtra("activityName");
        String priceReceived = getActivity().getIntent().getStringExtra("purchasePrice");
        String zip;
        Address address;

        if (lastActivity.equals("SavedSearchActivity")) {
            zip = getActivity().getIntent().getStringExtra("zip");
        } else {
            address = getActivity().getIntent().getParcelableExtra("streetAddress");
            zip = address.getPostalCode();
        }

        Retrofit retrofitSolutions = SolutionEngineApiUtils.initRetrofit();
        retrofitSolutions.create(SolutionEngineService.class)
                .getSolutionResults("Basic TVBIX1dlYjpjcmVqZWNoZVRoZVNVMmV3cmV4dXF1RnVT", priceReceived, zip, "2500", "SingleFamily", "1")
                .subscribeOn(Schedulers.io()).subscribe(new Action1<SolutionEngineResponse>() {
            @Override public void call(final SolutionEngineResponse repoResponse) {
                Log.d("testing_solutions", "testing");

                SolutionOptions[] solutionsList = repoResponse.getSolutionEngineData().getSolutionOptions();

                NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
                DecimalFormat df = (DecimalFormat) nf;

                for (SolutionOptions solutionOption : solutionsList) {
                    SolutionItem newItem = new SolutionItem(
                            solutionOption.getDownPaymentPercent().toString(),
                            df.format(solutionOption.getDownPaymentAmount()),
                            solutionOption.getProductsAndPricing().getLoanProducts()[0].getProductDescription(),
                            df.format(solutionOption.getProductsAndPricing().getLoanProducts()[0].getPricingOptions()[0].getTotalMonthlyPaymentAmount()),
                            df.format(repoResponse.getSolutionEngineData().getPurchasePrice()),
                            solutionOption.getProductsAndPricing().getLoanProducts()[0].getPricingOptions()[0].getRate() + "%/"
                                    + solutionOption.getProductsAndPricing().getLoanProducts()[0].getPricingOptions()[0].getAPR()+"%",
                            df.format(solutionOption.getProductsAndPricing().getLoanProducts()[0].getPricingOptions()[0].getNewLoanBalanceAmount()));
                    solutionItems.add(newItem);
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        itemAdapter.notifyDataSetChanged();

                        listView.performItemClick(
                                listView.getAdapter().getView(1, null, null),
                                1,
                                listView.getAdapter().getItemId(1));

                        progressBar.setVisibility(View.INVISIBLE);

                    }
                });
            }
        }, new Action1<Throwable>() {
            @Override public void call(Throwable throwable) {
                Log.d("testing_solutions", throwable.getMessage());
                Toast.makeText(getContext(), "Error occured. Please try again.", Toast.LENGTH_SHORT).show();
            }
        });

        itemAdapter = new SolutionItemAdapter(getActivity(), solutionItems);

        listView = rootView.findViewById(R.id.list_solutions);
        listView.setAdapter(itemAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                textEstMonthlyPayment.setText(getContext().getString(R.string.payment_amount, solutionItems.get(i).monthlyPayment));
                textListingPrice.setText("Listing Price: " + "$" + solutionItems.get(i).listingPrice);
                textRateApr.setText(getContext().getString(R.string.rate_apr, solutionItems.get(i).rateApr));
                textLoanAmount.setText(getContext().getString(R.string.loan_amount, solutionItems.get(i).loanAmount));
            }
        });

        return rootView;
    }
}
