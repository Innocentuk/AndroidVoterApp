package com.appandrunning.favourben.androidvoterapp;

/**
 * Created by Eucheria on 18/05/2015.
 */
public class Vote {

    private long election_id;
    private long option_id;
    private long vote_id;
    private String pwd;

//private Event event;

    public Vote(long election_id, long option_id, long vote_id, String pwd){

        this.election_id = election_id;
        this.option_id = option_id;
        this.vote_id = vote_id;
        this.pwd = pwd;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public long getElection() {
        return election_id;
    }

    public void setElection(long election) {
        this.election_id = election_id;
    }

    public long getOptions() {
        return option_id;
    }

    public void setOptions(long option) {
        this.option_id = option_id;
    }

    public long getVote_id() {
        return vote_id;
    }

    public void setVote_id(long vote_id) {
        this.vote_id = vote_id;
    }

    public String toString(){
        return "[Vote= " + this.vote_id + ", Password="+ this.pwd + ", option=" + this.option_id +
                "election= " + this.election_id +"]";
    }

}
