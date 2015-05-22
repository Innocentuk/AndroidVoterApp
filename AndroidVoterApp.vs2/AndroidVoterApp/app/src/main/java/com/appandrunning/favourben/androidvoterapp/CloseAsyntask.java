package com.appandrunning.favourben.androidvoterapp;

import android.os.AsyncTask;
import android.util.Log;

import java.util.logging.Handler;

/**
 * Created by Eucheria on 21/05/2015.
 * manages connection with server and sends closeDown command
 */
public class CloseAsyntask extends AsyncTask<String, String, VoteClient> {
    private static final String     COMMAND = "closedown";
    private              VoteClient  client;
    private              Handler    mHandler;
    private static final String     TAG = "ShutdownAsyncTask";

    /**
     *
     * @param mHandler
     */
    public CloseAsyntask(Handler mHandler){
        this.mHandler = mHandler;
    }

    @Override
    protected VoteClient doInBackground(String... params) {
        Log.d(TAG, "In do in background");

        try{
            client = new VoteClient(mHandler,
                    COMMAND,
                    "188.181.85.75",
                    new VoteClient().MessageCallback() {
                        @Override
                        public void callbackMsgReceiver(String message) {
                            publishProgress(message);
                        }
                    });

        }catch (NullPointerException e){
            Log.d(TAG, "Caught null pointer exception");
            e.printStackTrace();
        }
        client.run();
        return null;
    }
}
