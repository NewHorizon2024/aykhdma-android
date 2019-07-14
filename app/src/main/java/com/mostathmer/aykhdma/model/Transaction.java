package com.mostathmer.aykhdma.model;

public class Transaction {
    private int id;
    private int uid;
    private int spid;
    private String trans_date;

    public Transaction(int id, int uid, int spid, String trans_date) {
        this.id = id;
        this.uid = uid;
        this.spid = spid;
        this.trans_date = trans_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTrans_date() {
        return trans_date;
    }

    public void setTrans_date(String trans_date) {
        this.trans_date = trans_date;
    }
}
