package com.appandrunning.favourben.androidvoterapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class VotingActivity extends Activity implements View.OnClickListener {
    TextView txtPoll;
    ListView listView1;
    Button bVote, bBack;
    ArrayAdapter<Options> adapter;
    ArrayList<String> selectedItems

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_voting);
        findViewById();

        Options[] list = {
                new Options(1, "name"),
                new Options(2, "name"),
                new Options(3, "name"),
                new Options(4, "name"),
                new Options(5, "name"),
                new Options(6, "name"),
                new Options(7, "name"),
                new Options(8, "name"),
                new Options(9, "name"),
        };

        adapter = new ArrayAdapter<Options>(this,
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
        /*listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

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
}
