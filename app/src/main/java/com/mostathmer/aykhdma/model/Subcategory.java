package com.mostathmer.aykhdma.model;

public class Subcategory {

    private int id;
    private int cid;
    private String name;
    private String name_en;

    public Subcategory(int id, int cid, String name, String name_en) {
        this.id = id;
        this.cid = cid;
        this.name = name;
        this.name_en = name_en;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }
}
