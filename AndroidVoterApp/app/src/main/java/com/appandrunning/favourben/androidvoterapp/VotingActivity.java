package com.appandrunning.favourben.androidvoterapp;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class VotingActivity extends Activity implements View.OnClickListener {
    TextView txtPoll;
    ListView listView1;
    Button bVote, bBack;
    ArrayAdapter<VoteOptions> adapter;
    ArrayList<String> selectedItems;
    int selectedItemCounter =0;
    int limit = 2;
    //VoteOptions list[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_voting);
        findViewById();

       VoteOptions[] list = {
                new VoteOptions(1, "name", "post"),
                new VoteOptions(2, "name2", "post2"),
                new VoteOptions(3, "name", "post3"),
                new VoteOptions(4, "name2", "post4"),

    };
        adapter = new ArrayAdapter<VoteOptions>(this,
                android.R.layout.simple_list_item_multiple_choice, list);

        listView1.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        listView1.setAdapter(adapter);
        bVote.setOnClickListener(this);
        //bBack.setOnClickListener(this);

        /*bBack.setBBack(R.String.bBack, new DialogInterface.OnClickListener() {
            @Override
        public  void onClick(DialogInterface dialog, int id){
                dialogListener.onOkay(selectedItems);
            }
        })*/
       /*
                String item = ((TextView) view).getText().toString();
                Toast.makeText(getBaseContext(), item, Toast.LENGTH_LONG).show();

            }
        });*/
    }
    private void findViewById(){
        txtPoll = (TextView) findViewById(R.id.election_label);
        listView1 = (ListView) findViewById(R.id.listView1);
        bVote = (Button) findViewById(R.id.bVote);
        bBack = (Button) findViewById(R.id.bBack);

    }
    public void onClick(View v){
        SparseBooleanArray checked = listView1.getCheckedItemPositions();
        selectedItems = new ArrayList<String>();
        for (int i = 0; i < checked.size(); i++) {
            // Item position in adapter
            int position = checked.keyAt(i);

           /* if (checked.size() > limit) {
                Toast.makeText(getBaseContext(),
                        "can't be more" + selectedItemCounter,
                        Toast.LENGTH_SHORT).show();
                //lv2.setChecked(false);
                //checked.size()= limit;
                return;
            }*/

            // Add sport if it is checked i.e.) == TRUE!
            if (checked.valueAt(i))
                selectedItems.add(String.valueOf(adapter.getItem(position)));
        }
        String[] outputStrArr = new String[selectedItems.size()];

        for (int i = 0; i < selectedItems.size(); i++) {
            outputStrArr[i] = selectedItems.get(i);
        }
        Intent intent = new Intent(getApplicationContext(),
                ViewPolls.class);

        // Create a bundle object
        Bundle b = new Bundle();
        b.putStringArray("selectedOptions", outputStrArr);

        // Add the bundle to the intent.
        intent.putExtras(b);

        // start the ResultActivity
        startActivity(intent);

        v.setSelected(true);
    }
    /*@Override
    public void onBackPressed() {
        // do something on back.
        if (!bBack.setOnClickListener(this)) {
            return Intent i = Intent(getApplicationContext(), VotingActivity.class);
        }
    }*/

}
