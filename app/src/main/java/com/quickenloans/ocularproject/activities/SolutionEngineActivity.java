package com.quickenloans.ocularproject.activities;

import android.location.Address;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.quickenloans.ocularproject.R;
import com.quickenloans.ocularproject.models.SavedSearch;
import com.quickenloans.ocularproject.fragments.PropertyDetailsFragment;
import com.quickenloans.ocularproject.fragments.SolutionEngineFragment;

import io.realm.Realm;
import io.realm.RealmResults;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SolutionEngineActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution_engine);

        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        realm = Realm.getDefaultInstance();
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new SolutionEngineFragment(), "Solutions");
        adapter.addFragment(new PropertyDetailsFragment(), "Property");
        viewPager.setAdapter(adapter);
    }

    private class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        private ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        private void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    public void addToRealm(View view) {

        Toast.makeText(getApplicationContext(), "Added to Saved Searches", Toast.LENGTH_SHORT).show();

        Address receivedAddress = getIntent().getParcelableExtra("streetAddress");
        String address = receivedAddress.getAddressLine(0);
        String shortAddress = receivedAddress.getSubThoroughfare() + " " + receivedAddress.getThoroughfare();
        String zip = receivedAddress.getPostalCode();
        String savedPrice = getIntent().getStringExtra("purchasePrice");

        realm.beginTransaction();
        SavedSearch search = realm.createObject(SavedSearch.class);
        search.setId(UUID.randomUUID().toString());
        search.setFullAddress(address);
        search.setPrice(savedPrice);
        search.setZip(zip);
        search.setShortAddress(shortAddress);
        realm.commitTransaction();

        RealmResults<SavedSearch> searches = realm.where(SavedSearch.class).findAll();
        for (SavedSearch s : searches) {
            Log.d("TESTT", "TESTT " + s.getFullAddress());
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        realm.close();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
