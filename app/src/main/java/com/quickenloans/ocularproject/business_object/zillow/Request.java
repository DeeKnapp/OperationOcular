package com.quickenloans.ocularproject.business_object.zillow;

import org.simpleframework.xml.Element;

public class Request {
    @Element private String address;

    @Element private String citystatezip;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCitystatezip() {
        return citystatezip;
    }

    public void setCitystatezip(String citystatezip) {
        this.citystatezip = citystatezip;
    }

    @Override public String toString() {
        return "ClassPojo [address = "
                + address
                + ", citystatezip = "
                + citystatezip
                + "]";
    }
}
