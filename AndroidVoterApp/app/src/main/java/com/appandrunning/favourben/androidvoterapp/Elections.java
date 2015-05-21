package com.appandrunning.favourben.androidvoterapp;

import java.util.Date;

/**
 * Created by Eucheria on 13/05/2015.
 */
public class Elections {

    private long id;
    private String name;
    private int minVote;
    private int maxVote;
    private boolean secret;
    private boolean active;
    private String post;
    private Date date;

    public Elections(){

        super();
    }

    public Elections(String name,/* int minVote, int maxVote, boolean secret, boolean
            active,*/ String post) {
        super();
        this.name = name;
        this.id = id;
        this.post = post;
        this.minVote = minVote;
        this.maxVote = maxVote;
        this.secret = secret;
        this.active = active;
    }
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getPost() {

        return this.post;
    }

    public void setPost(String post) {

        this.post = post;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMinVote() {
        return this.minVote;
    }

    public void setMinVote(int minVote) {
        this.minVote = minVote;
    }

    public int getMaxVote() {
        return this.maxVote;
    }

    public void setMaxVotes(int maxVote) {
        this.maxVote = maxVote;
    }

    public boolean isSecret() {
        return this.secret;
    }

    public void setSecret(boolean secret) {
        this.secret = secret;
    }

    public boolean isActive() {
        return this.active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    @Override
    public String toString() {

        return this.name + ", "+ this.post+" ";
    }
}
