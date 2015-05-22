package com.appandrunning.favourben.androidvoterapp;

/**
 * allows us to perform the activity which the server doese when the sreverrequest is completed
 * it send a
 * Created by Eucheria on 21/05/2015.
 */
interface GetCallback {
    public abstract void done(Voter returnedVoter);

}
