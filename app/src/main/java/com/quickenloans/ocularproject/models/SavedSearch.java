package com.quickenloans.ocularproject.models;

import io.realm.RealmObject;

/**
 * Created by ctan on 9/6/17.
 */

public class SavedSearch extends RealmObject {

    private String id;

    private String fullAddress;

    private String price;

    private String zip;

    private String shortAddress;

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getShortAddress() {
        return shortAddress;
    }

    public void setShortAddress(String shortAddress) {
        this.shortAddress = shortAddress;
    }
}
