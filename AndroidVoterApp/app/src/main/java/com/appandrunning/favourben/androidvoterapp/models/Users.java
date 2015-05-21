package com.appandrunning.favourben.androidvoterapp.models;

import java.util.PriorityQueue;

/**
 * Created by Eucheria on 20/05/2015.
 */
public class Users {
    private String pwd;
    private boolean active;

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Users(){
    }
}
