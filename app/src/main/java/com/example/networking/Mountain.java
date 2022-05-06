package com.example.networking;

public class Mountain {

    private String mId;
    private String mMountain;
    private String mLocation;
    private int mHeight;
    private int   mCost;
    private Auxdata auxdata;

    public Mountain(String id, String name, String location, int size, int cost) {
        mId = id;
        mMountain = name;
        mLocation = location;
        mHeight= size;
        mCost = cost;
        auxdata = auxdata;
    }

    public String getId() {
        return mId;
    }

    public String getMountain() {
        return mMountain;
    }

    public String getLocation() {
        return mLocation;
    }

    public int getHeight() {
        return mHeight;
    }

    public int getCost() {
        return mCost;
    }

    public Auxdata getAuxdata() {
        return auxdata;
    }
}
