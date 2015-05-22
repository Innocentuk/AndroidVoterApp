package com.appandrunning.favourben.androidvoterapp;

import java.util.ArrayList;

/**
 * Created by Eucheria on 22/05/2015.
 */
public class VoteOptions {
    private long voteId;
    private String name;
    private String post;
   // public ArrayList<Integer, String> list

    public VoteOptions(long voteId, String name, String post){
        this.voteId = voteId;
        this.name = name;
        this.post = post;
    }
    public VoteOptions(){
       /* VoteOptions[] list = {
                new VoteOptions(1, "name", "post"),
                new VoteOptions(2, "name2", "post2"),
                new VoteOptions(3, "name", "post3"),
                new VoteOptions(4, "name2", "post4"),

        };*/
    }

    public long getVoteId() {
        return voteId;
    }

    public void setVoteId(long voteId) {
        this.voteId = voteId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {

        return this.voteId + ". " + this.name + ", " + this.post;
    }
}
