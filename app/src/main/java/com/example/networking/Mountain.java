package com.example.networking;

import android.util.Log;
import com.google.gson.annotations.SerializedName;
public class Mountain {

    private String id;
    private String name;
    private String location;
    private int size;
    private Auxdata auxdata;

    public Mountain(String id, String name, String location, int size, Auxdata auxdata) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.size = size;
        this.auxdata = auxdata;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }
    public int getSize() {
        return size;
    }
    public Auxdata getAuxdata() {
        return auxdata;
    }


}
