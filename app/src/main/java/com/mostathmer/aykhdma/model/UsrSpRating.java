package com.mostathmer.aykhdma.model;

public class UsrSpRating {

    private int uid;
    private int spid;
    private double rating;

    public UsrSpRating(int uid, int spid, double rating) {
        this.uid = uid;
        this.spid = spid;
        this.rating = rating;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getSpid() {
        return spid;
    }

    public void setSpid(int spid) {
        this.spid = spid;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
