package com.mostathmer.aykhdma.model;

public class ItemTransaction {
    private int id;
    private int tid;
    private int item_id;
    private double qty;

    public ItemTransaction(int id, int tid, int item_id, double qty) {
        this.id = id;
        this.tid = tid;
        this.item_id = item_id;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }
}
