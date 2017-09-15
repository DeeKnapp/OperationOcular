package com.quickenloans.ocularproject.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.quickenloans.ocularproject.R;
import com.quickenloans.ocularproject.adapters.SavedSearchAdapter;
import com.quickenloans.ocularproject.models.SavedSearch;

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by ctan on 8/27/17.
 */
public class SavedSearchActivity extends AppCompatActivity {

    private Realm realm;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_search);

        realm = Realm.getDefaultInstance();

        final RealmResults<SavedSearch> searches = realm.where(SavedSearch.class).findAll();
        final SavedSearchAdapter adapter = new SavedSearchAdapter(this, searches);

        final ListView listView = (ListView) findViewById(R.id.list_saved_searches);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(SavedSearchActivity.this, SolutionEngineActivity.class);
                intent.putExtra("purchasePrice", searches.get(i).getPrice());
                intent.putExtra("zip", searches.get(i).getZip());
                intent.putExtra("activityName", "SavedSearchActivity");
                intent.putExtra("shortAddress", searches.get(i).getShortAddress());
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });
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
