package com.quickenloans.ocularproject.adapters;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.quickenloans.ocularproject.R;
import com.quickenloans.ocularproject.models.SolutionItem;

import java.util.List;

public class SolutionItemAdapter extends ArrayAdapter<SolutionItem> {
    private static final String LOG_TAG = SolutionItemAdapter.class.getSimpleName();

    public SolutionItemAdapter(Activity context, List<SolutionItem> solutionItems) {
        super(context, 0, solutionItems);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        SolutionItem solutionItem = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_solution, parent, false);
        }

        TextView downPaymentPercentView = convertView.findViewById(R.id.down_payment_percent);
        downPaymentPercentView.setText(getContext().getString(R.string.payment_percent, solutionItem.downPaymentPercent));

        TextView downPaymentAmountView = convertView.findViewById(R.id.down_payment_amount);
        downPaymentAmountView.setText(getContext().getString(R.string.payment_amount, solutionItem.downPaymentAmount));

        TextView termView = convertView.findViewById(R.id.term);
        termView.setText(solutionItem.termYears);

        return convertView;
    }
}
