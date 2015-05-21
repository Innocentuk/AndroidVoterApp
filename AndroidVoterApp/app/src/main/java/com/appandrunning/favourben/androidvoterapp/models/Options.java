package com.appandrunning.favourben.androidvoterapp.models;

/**
 * Created by Eucheria on 16/05/2015.
 */
public class Options {

    private long option_id;
    private Election election;
    private String the_option;
    private String property1;
    private String property2;

    public long getOption_id() {
        return option_id;
    }

    public void setOption_id(long option_id) {
        this.option_id = option_id;
    }

    public Election getElection() {
        return election;
    }

    public void setElection(Election election) {
        this.election = election;
    }

    public String getThe_option() {
        return the_option;
    }

    public void setThe_option(String the_option) {
        this.the_option = the_option;
    }

    public String getProperty1() {
        return property1;
    }

    public void setProperty1(String property1) {
        this.property1 = property1;
    }

    public String getProperty2() {
        return property2;
    }

    public void setProperty2(String property2) {
        this.property2 = property2;
    }
    public String toString() {
        return String.format(
                "option: %s%s property1: %s%sproperty2: %s",
                new Object[]{this.the_option, "\n ",
                        this.property1, "\n ",
                        this.property2});
    }
}
