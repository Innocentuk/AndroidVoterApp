package com.appandrunning.favourben.androidvoterapp;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Eucheria on 21/05/2015.
 */
public class VoteStore {
    public static final String sp_voter = "Voterdetail";
    SharedPreferences voterData;

    public VoteStore(Context context) {
        voterData = context.getSharedPreferences(sp_voter, 0);
    }

    public void storeData(Voter voter){
        SharedPreferences.Editor spEditor = voterData.edit();
        spEditor.putString("pwd", voter.pwd);
        spEditor.putInt("id", -1);

        spEditor.commit();
    }
    public Voter getLoggedInVoter(){
        String pwd = voterData.getString("pinCode", "");

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
