package com.appandrunning.favourben.androidvoterapp;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Eucheria on 16/05/2015.
 */
public class Election {

    private long election_id;
    private String post;
    private Date date;
    private int minVote;
    private int maxVote;
    private boolean secret;
    private boolean active;
    private Set<Options> option = new HashSet<Options>();

    public Election(){
        option = new HashSet<Options>();
    }

    public Election(long election_id, String post, Date date, int minVote, int maxVote, boolean
            secret, boolean active){

        this.election_id = election_id;
        this.post = post;
        this.date = date;
        this.minVote = minVote;
        this.maxVote = maxVote;
        this.secret = secret;
        this.active = active;
        this.option = option;
    }

    public long getElection_id() {
        return election_id;
    }

    public void setElection_id(long election_id) {
        this.election_id = election_id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMinVote() {
        return minVote;
    }

    public void setMinVote(int minVote) {
        this.minVote = minVote;
    }

    public int getMaxVote() {
        return maxVote;
    }

    public void setMaxVote(int maxVote) {
        this.maxVote = maxVote;
    }
    public boolean isSecret(){
        return secret;
    }
    public void setSecret(boolean secret){
        this.secret = secret;
    }
    public boolean isActive(){
        return active;
    }
    public void setActive(boolean active){
        this.active = active;
    }
    public Set<Options> getOption(){
        return this.option;
    }
    public void setOption(Set<Options> option){
        this.option = option;
    }

    public String toString(){
        return String.format(
                "for: %s date: %s min: %d max: %d  %sClosed election: %b Active election: %b",
                new Object[] {
                        this.post,
                       // DateUtility.formatDate(this.date),
                        this.minVote,
                        this.maxVote, "\n",
                        this.secret,
                        this.active});
    }
}
