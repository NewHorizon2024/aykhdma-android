package com.mostathmer.aykhdma.model;

public class User {
    private int id;
    private int region;
    private int non_active;
    private String phone_number;
    private String full_name;
    private String profile_imgURL;
    private String email;
    private String password;

    public User(int id, int region, int non_active, String phone_number, String full_name, String profile_imgURL, String email, String password) {
        this.id = id;
        this.region = region;
        this.non_active = non_active;
        this.phone_number = phone_number;
        this.full_name = full_name;
        this.profile_imgURL = profile_imgURL;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRegion() {
        return region;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    public int getNon_active() {
        return non_active;
    }

    public void setNon_active(int non_active) {
        this.non_active = non_active;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getProfile_imgURL() {
        return profile_imgURL;
    }

    public void setProfile_imgURL(String profile_imgURL) {
        this.profile_imgURL = profile_imgURL;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
