package com.quickenloans.ocularproject.business_object.property_details;

import org.simpleframework.xml.Element;

public class Links {

    @Element
    private String homeDetails;
    @Element
    private String photoGallery;
    @Element
    private String homeInfo;

    public String getHomeDetails() {
        return homeDetails;
    }

    public void setHomeDetails(String homeDetails) {
        this.homeDetails = homeDetails;
    }

    public String getPhotoGallery() {
        return photoGallery;
    }

    public void setPhotoGallery(String photoGallery) {
        this.photoGallery = photoGallery;
    }

    public String getHomeInfo() {
        return homeInfo;
    }

    public void setHomeInfo(String homeInfo) {
        this.homeInfo = homeInfo;
    }

}
