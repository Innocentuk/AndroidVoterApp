package com.appandrunning.favourben.androidvoterapp.Model;

/**
 * Created by Eucheria on 22/05/2015.
 */
public class MinMaxSelection {

    int minSelection, maxSelection;

    public String NumberOfSelection(int maxSelection, int minSelection){
        String selectionError = "";
        if (minSelection - maxSelection <0){
            selectionError += "Der skal kunne afgives mindst en stemme.";
        }else {
            if (maxSelection != minSelection) {
                maxSelection = 2;
            }
        }
        return selectionError;
    }

    public int getMinSelection() {
        return minSelection;
    }

    public void setMinSelection(int minSelection) {
        this.minSelection = minSelection;
    }

    public int getMaxSelection() {
        return maxSelection;
    }

    public void setMaxSelection(int maxSelection) {
        this.maxSelection = maxSelection;
    }
}
