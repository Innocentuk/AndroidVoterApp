package com.appandrunning.favourben.androidvoterapp.models;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Eucheria on 14/05/2015.
 */
public class VoterStore {

    public static final String sp_voter = "Voterdetail";
    SharedPreferences voterData;

    public VoterStore(Context context) {
        voterData = context.getSharedPreferences(sp_voter, 0);
    }

    public void storeData(Voter voter){
        SharedPreferences.Editor spEditor = voterData.edit();
        spEditor.putString("pwd", voter.pwd);
        spEditor.putInt("id", -1);
        //spEditor.putString("election", voter.election);
        //spEditor.putString("options", voter.options);
        spEditor.commit();
    }
    public Voter getLoggedInVoter(){
        String pwd = voterData.getString("pinCode", "");
        //int maxVote = voterData.getInt("maxVote", 4);
        //int minVote = voterData.getInt("minVote", 2);
        //String election = voterData.getString("election", "");
        //String options = voterData.getString("options", "");
        int id = voterData.getInt("id", -1);
        // create new voter and get the ffg data
        Voter storeVoter = new Voter(pwd, id);
        return storeVoter;
    }
    public void setVoterLoggedIn(boolean loggedIn){
        SharedPreferences.Editor spEditor = voterData.edit();
        spEditor.putBoolean("loggedIn", loggedIn);
        spEditor.commit();
    }

    public  boolean getVoterLoggedIn(){
        if (voterData.getBoolean("loggedIn", false) == true) {
            return true;
        }else {
            return false;
        }
    }
    public void clearPwd(){
        SharedPreferences.Editor spEditor = voterData.edit();
        spEditor.clear();
        spEditor.commit();
    }
}
