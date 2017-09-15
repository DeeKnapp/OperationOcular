package com.quickenloans.ocularproject.business_object.property_details;

import org.simpleframework.xml.Element;

public class Request {

    @Element
    private String zpid;

    public String getZpid() {
        return zpid;
    }

    public void setZpid(String zpid) {
        this.zpid = zpid;
    }

}
