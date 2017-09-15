package com.quickenloans.ocularproject.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.quickenloans.ocularproject.R;
import com.quickenloans.ocularproject.activities.SavedSearchActivity;
import com.quickenloans.ocularproject.models.SavedSearch;

import io.realm.OrderedRealmCollection;
import io.realm.RealmBaseAdapter;

public class SavedSearchAdapter extends RealmBaseAdapter<SavedSearch> implements ListAdapter {

    private SavedSearchActivity activity;

    private static class ViewHolder {
        TextView textSavedAddress, textSavedPrice;
    }

    public SavedSearchAdapter(SavedSearchActivity activity, OrderedRealmCollection<SavedSearch> data) {
        super(data);
        this.activity = activity;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item_saved_search, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.textSavedAddress = convertView.findViewById(R.id.saved_address);
            viewHolder.textSavedPrice = convertView.findViewById(R.id.saved_price);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        if (adapterData != null) {
            SavedSearch search = adapterData.get(position);
            viewHolder.textSavedAddress.setText(search.getFullAddress());
            viewHolder.textSavedPrice.setText(activity.getApplicationContext().getString(R.string.listing_price, search.getPrice()));
        }

        return convertView;
    }

}
