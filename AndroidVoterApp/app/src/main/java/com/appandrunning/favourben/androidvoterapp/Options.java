package com.appandrunning.favourben.androidvoterapp;

/**
 * Created by Eucheria on 13/05/2015.
 */
public class Options {

    private int id;
    private String name;

    public Options(){

        super();
    }

    public Options(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {

        return this.id + ". " + this.name;
    }
}
