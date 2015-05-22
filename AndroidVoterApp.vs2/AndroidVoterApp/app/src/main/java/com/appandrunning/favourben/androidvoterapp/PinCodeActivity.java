package com.appandrunning.favourben.androidvoterapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.appandrunning.favourben.androidvoterapp.models.GetCallback;


public class PinCodeActivity extends Activity implements View.OnClickListener{

    Button bLogin;
    EditText etPin;
    TextView txtV;
    VoterStore voterStore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin_code);
        findViewById();

        bLogin.setOnClickListener(this);//bLoginConnectOnClickListener);
        voterStore = new VoterStore(this);
    }
    public void findViewById(){
        etPin = (EditText) findViewById(R.id.etPin);
        bLogin = (Button) findViewById(R.id.blogin);
        txtV = (TextView) findViewById(R.id.txtV);
    }

   /* @Override
    protected void onStart(){
        super.onStart();
        if (authenticate() == true) {
            //onClick(txtV);
        }
    }*/
    private void displayElections(){
        startActivity(new Intent(this, ElectionActivity.class));
    }
   /* private boolean authenticate(){
        return voterStore.getVoterLoggedIn();
    }*/
    // when button is click the method is notified
    @Override
    public void onClick(View v) {
        txtV.setText("");

        switch (v.getId()){//gets the id of view which notifies the method
            case R.id.blogin:
                String pinCode = etPin.getText().toString();
                Voter voter = new Voter(null, -1);
                authenticate(voter);

                voterStore.clearPwd();
                voterStore.storeData(voter);
                voterStore.setVoterLoggedIn(true);
                displayElections();
               // startActivity(new Intent(this, ElectionActivity.class));
                break;

        }
    }
    private void authenticate (Voter voter){
        ServerRequest serverRequest = new ServerRequest();
        serverRequest.fetchPwdInBacground(voter, new GetCallback){

        }
    }
   /* View.OnClickListener bLoginConnectOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View arg0) {
            VoteClient client = new VoteClient(etPin.getText().toString());
            client.execute();
        }
    };*/
}
