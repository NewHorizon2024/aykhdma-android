package com.mostathmer.aykhdma.model;

public class Offer {

    private int id;
    private int spid;
    private String offer_name;
    private int offer_details;
    private double price;
    private String start_date;
    private String end_date;

    public Offer(int id, int spid, String offer_name, int offer_details, double price, String start_date, String end_date) {
        this.id = id;
        this.spid = spid;
        this.offer_name = offer_name;
        this.offer_details = offer_details;
        this.price = price;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpid() {
        return spid;
    }

    public void setSpid(int spid) {
        this.spid = spid;
    }

    public String getOffer_name() {
        return offer_name;
    }

    public void setOffer_name(String offer_name) {
        this.offer_name = offer_name;
    }

    public int getOffer_details() {
        return offer_details;
    }

    public void setOffer_details(int offer_details) {
        this.offer_details = offer_details;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }
}
