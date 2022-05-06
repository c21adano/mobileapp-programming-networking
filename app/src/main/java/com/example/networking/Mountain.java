package com.example.networking;

public class Mountain {

    private String mId;
    private String mName;
    private String mLocation;
    private int mSize;
    private int   mCost;


    public Mountain(String id, String name, String location, int size, int cost) {
        mId = id;
        mName = name;
        mLocation = location;
        mSize = size;
        mCost = cost;
    }

    public String getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public String getLocation() {
        return mLocation;
    }

    public int getSize() {
        return mSize;
    }

    public int getCost() {
        return mCost;
    }
}
