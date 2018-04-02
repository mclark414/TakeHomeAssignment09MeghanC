package com.example.android.takehomeassignment09_meghanc;

/**
 * Created by mclark on 4/1/18.
 */

public class Animal {
    private String name;
    private int numLegs;
    private boolean hasFur;

    public Animal(String name, int numLegs, boolean hasFur) {
        this.name = name;
        this.numLegs = numLegs;
        this.hasFur = hasFur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }
}
