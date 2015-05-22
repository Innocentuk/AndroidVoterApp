package com.appandrunning.favourben.androidvoterapp;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.List;

/**
 * Created by Eucheria on 22/05/2015.
 */
public class ElectionsAdapter extends BaseAdapter {

    @SuppressWarnings("unused")
    private final static String TAG = ElectionsAdapter.class.getSimpleName();

    private Context context;
    private List<ElectionOptions> rowItems;
    LayoutInflater inflater;
    private int selectedItemCounter = 0;

    private final int limit;

    public ElectionsAdapter(Context context, List<ElectionOptions> items, int limit) {
        this.context = context;
        this.rowItems = items;
        this.limit = limit;
    }

    public View getView(final int position, View convertView, ViewGroup parent) {

        inflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

        final Account rowItem = (Account) getItem(position);

        convertView = inflater.inflate(R.layout.activity_election, null);

        TextView tv = (TextView) convertView.findViewById(R.id.label);
        ListView lv2 = (ListView) convertView.findViewById(R.id.listView2);

 /*       lv2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton lv2,
                                         boolean isChecked) {

                if (isChecked && !rowItem.isSelected()) {

                    if (selectedItemCounter >= limit) {
                        Toast.makeText(context,
                                "can't be more" + selectedItemCounter,
                                Toast.LENGTH_SHORT).show();
                        lv2.setChecked(false);
                        return;
                    }

                    rowItem.setSelected(true);
                    selectedItemCounter++;
                } else if (!isChecked && rowItem.isSelected()) {
                    rowItem.setSelected(false);
                    selectedItemCounter--;
                }

            }
        });*/

        return convertView;
    }

    @Override
    public int getCount() {
        return rowItems.size();
    }

    @Override
    public Object getItem(int position) {
        return rowItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return rowItems.indexOf(getItem(position));
    }

}
