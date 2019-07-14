package com.mostathmer.aykhdma.model;

public class Item {
    private int id;
    private String item_name;
    private String item_logoURL;
    private double item_price;
    private int spid;
    private int none_active;

    public Item(int id, String item_name, String item_logoURL, double item_price, int spid, int none_active) {
        this.id = id;
        this.item_name = item_name;
        this.item_logoURL = item_logoURL;
        this.item_price = item_price;
        this.spid = spid;
        this.none_active = none_active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_logoURL() {
        return item_logoURL;
    }

    public void setItem_logoURL(String item_logoURL) {
        this.item_logoURL = item_logoURL;
    }

    public double getItem_price() {
        return item_price;
    }

    public void setItem_price(double item_price) {
        this.item_price = item_price;
    }

    public int getSpid() {
        return spid;
    }

    public void setSpid(int spid) {
        this.spid = spid;
    }

    public int getNone_active() {
        return none_active;
    }

    public void setNone_active(int none_active) {
        this.none_active = none_active;
    }
}
