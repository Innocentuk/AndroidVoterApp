package com.appandrunning.favourben.androidvoterapp;

/**
 * Created by Eucheria on 20/05/2015.
 */
public enum  MessageCommand {

    CLOSE(1),
    LOGIN(2),
    GET(3),
    SAVE(4),
    REMOVE(5),
    BROADCAST(6),
    CONFIRM(7),
    UNKNOWN(8);

    private final int key;

    private MessageCommand(int key) {
        this.key = key;
    }

    public int getKey() {
        return this.key;
    }

    public static MessageCommand fromKey(int key) {
        MessageCommand[] var4;
        int var3 = (var4 = values()).length;

        for(int var2 = 0; var2 < var3; ++var2) {
            MessageCommand type = var4[var2];
            if(type.getKey() == key) {
                return type;
            }
        }

        return UNKNOWN;
    }
}
