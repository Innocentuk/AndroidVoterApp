package com.appandrunning.favourben.androidvoterapp;

/**
 * Created by Eucheria on 22/05/2015.
 */
public class ElectionOptions {
    private long electionId;
    private String name;
    private String post;
    boolean isSelected;


    public ElectionOptions(String name, String post){
        //this.electionId = electionId;
        this.name = name;
        this.post = post;
    }

    public long electionId() {
        return electionId;
    }

    public void electionId(long voteId) {
        this.electionId = voteId;
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

    public void setSelected(boolean s){
        this.isSelected = s;
    }
    boolean isSelected(){
        return isSelected;
    }
    @Override
    public String toString() {

        return this.name+ ","+ this.post + ".";
    }
}
