package com.appandrunning.favourben.androidvoterapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.appandrunning.favourben.androidvoterapp.models.Elections;


public class ElectionActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_election);

        TextView txtElection = (TextView) findViewById(R.id.label);
        ListView lv2 = (ListView) findViewById(R.id.listView2);
        Elections[] elcections = {
                new Elections("election", "post1"),
                new Elections("election", "post2"),
                new Elections("election", "post3"),
        };

        ArrayAdapter<Elections> adapter = new ArrayAdapter<Elections>(this,
                android.R.layout.simple_list_item_1, elcections);

        lv2.setAdapter(adapter);

        // listening to single list item on click
        lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // selected item
                String electOption = ((TextView) view).getText().toString();

                // Launching new Activity on selecting single List Item
                Intent i = new Intent(getApplicationContext(), VotingActivity.class);
                // sending data to new activity
                i.putExtra("option", electOption);
                startActivity(i);

            }
        });
    }

}
