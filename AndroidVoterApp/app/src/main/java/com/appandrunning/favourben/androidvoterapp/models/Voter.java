package com.appandrunning.favourben.androidvoterapp.models;

import java.util.ArrayList;

/**
 * Created by Eucheria on 14/05/2015.
 */
public class Voter {
    int id;
    /*public static*/ int minVote = 2;
    /*public static*/ int maxVote = 4;
    /*public static*/ int election = 23;
    /*public static*/ ArrayList<String> options = new ArrayList<String>();
    /*public static*/ String pwd = "0000000000000000";

    public Voter (String pwd, int id){
        this.pwd = pwd;
        this.id = id;
        this.minVote = minVote;
        this.maxVote = maxVote;
    }
    /*public Voter(String pwd, int minVote, int maxVote){
        this.pwd = pwd;

    }*/
}
