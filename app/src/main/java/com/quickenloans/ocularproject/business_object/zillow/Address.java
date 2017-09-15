package com.quickenloans.ocularproject.business_object.zillow;

import org.simpleframework.xml.Element;

public class Address {
    @Element private String street;

    @Element private String zipcode;

    @Element private String state;

    @Element private String longitude;

    @Element private String latitude;

    @Element private String city;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override public String toString() {
        return "ClassPojo [street = "
                + street
                + ", zipcode = "
                + zipcode
                + ", city = "
                + city
                + ", state = "
                + state
                + ", latitude = "
                + latitude
                + ", longitude = "
                + longitude
                + "]";
    }
}
