package com.mostathmer.aykhdma.model;

public class Advertisement {

    private int id;
    private String advertiser;
    private String startdate;
    private String enddate;
    private String content;

    public Advertisement(int id, String advertiser, String startdate, String enddate, String content) {
        this.id = id;
        this.advertiser = advertiser;
        this.startdate = startdate;
        this.enddate = enddate;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdvertiser() {
        return advertiser;
    }

    public void setAdvertiser(String advertiser) {
        this.advertiser = advertiser;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
