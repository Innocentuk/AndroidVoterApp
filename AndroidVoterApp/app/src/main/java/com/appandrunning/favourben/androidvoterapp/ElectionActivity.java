package com.appandrunning.favourben.androidvoterapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class ElectionActivity extends Activity {

   /* private ProgressDialog m_ProgressDialog = null;
    private ArrayList<ElectionView> vElections = null;
    private ElectionAdapter e_adapter;
    private Runnable viewelection;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_election);
        vElections = new ArrayList<ElectionView>();
        this.vElections = new vElections(this, R.layout.row, m_orders);
        setListAdapter(this.vElections);

        viewelection = new Runnable(){
            @Override
            public void run() {
                getOrders();
            }
        };
        Thread thread =  new Thread(null, viewelection, "MagentoBackground");
        thread.start();
        m_ProgressDialog = ProgressDialog.show(ElectionView.this,
                "Please wait...", "Retrieving data ...", true);
    }
    private Runnable returnRes = new Runnable() {

        @Override
        public void run() {
            if(m_orders != null && m_orders.size() > 0){
                m_adapter.notifyDataSetChanged();
                for(int i=0;i<m_orders.size();i++)
                    m_adapter.add(m_orders.get(i));
            }
            m_ProgressDialog.dismiss();
            m_adapter.notifyDataSetChanged();
        }
    };
    private void getOrders(){
        try{
            m_orders = new ArrayList<Order>();
            Order o1 = new Order();
            o1.setOrderName("SF services");
            o1.setOrderStatus("Pending");
            Order o2 = new Order();
            o2.setOrderName("SF Advertisement");
            o2.setOrderStatus("Completed");
            m_orders.add(o1);
            m_orders.add(o2);
            Thread.sleep(5000);
            Log.i("ARRAY", ""+ m_orders.size());
        } catch (Exception e) {
            Log.e("BACKGROUND_PROC", e.getMessage());
        }
        runOnUiThread(returnRes);
    }
    private class ElectionAdapter extends ArrayAdapter<ElectionView> {

        private ArrayList<Order> items;

        public OrderAdapter(Context context, int textViewResourceId, ArrayList<ElectionView> items) {
            super(context, textViewResourceId, items);
            this.items = items;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v = convertView;
            if (v == null) {
                LayoutInflater vi = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                v = vi.inflate(R.layout.row, null);
            }
            ElectionView o = items.get(position);
            if (o != null) {
                ListView lv = (TextView) v.findViewById(R.id.listView2);
                TextView bt = (TextView) v.findViewById(R.id.bottomtext);
                if (tt != null) {
                    tt.setText("Name: "+o.getOrderName());                            }
                if(bt != null){
                    bt.setText("Status: "+ o.getOrderStatus());
                }
            }
            return v;
        }
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_election);

        TextView txtElection = (TextView) findViewById(R.id.label);
        ListView lv2 = (ListView) findViewById(R.id.listView2);
        lv2.setItemsCanFocus(true);

        ElectionOptions[] optionElection = {
                new ElectionOptions("election", "post1"),
                new ElectionOptions("election", "post2"),
               // new Elections("election", "post3"),
        };

        ArrayAdapter<ElectionOptions> adapter = new ArrayAdapter<ElectionOptions>(this,
                android.R.layout.simple_list_item_1, optionElection);

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
