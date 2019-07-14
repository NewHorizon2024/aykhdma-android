package com.mostathmer.aykhdma.model;

public class Region {

    private int id;
    private String name;
    private String name_en;

    public Region(int id, String name, String name_en) {
        this.id = id;
        this.name = name;
        this.name_en = name_en;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
