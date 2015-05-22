package com.appandrunning.favourben.androidvoterapp;

import android.os.AsyncTask;

/**
 * Created by Eucheria on 21/05/2015.
 */
public class ServerRequest {
    public static final String SERVERIP = "188.181.85.75"; //your computer IP address
    public static final int SERVERPORT = 8080;

    public void storeVoterPwd(Voter voter, GetVoterCallback callback){

    }
    public void fetchVoterPwd(Voter voter, GetVoterCallback callback){

    }
    // the param, progress and the result
    public class StoreVoterDataAsyncTask extends AsyncTask<void, void, void>{

        @Override
        protected void doInBackground(void... params) {
            return null;
        }
    }


    public void storeElection(){

    }
    public void storeOptions(){

    }
    public  void storeVotes(){

    }
}
