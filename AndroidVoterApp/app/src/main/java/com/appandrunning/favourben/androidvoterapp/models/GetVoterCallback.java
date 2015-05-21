package com.appandrunning.favourben.androidvoterapp.models;

/**
 * allows us to perform the activity which the server doese when the sreverrequest is completed
 * it send a
 * Created by Eucheria on 21/05/2015.
 */
interface GetVoterCallback {
    public abstract void done(Voter returnedVoter);

}
