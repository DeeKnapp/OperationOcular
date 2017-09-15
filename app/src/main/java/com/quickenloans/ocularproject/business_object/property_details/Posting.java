package com.quickenloans.ocularproject.business_object.property_details;

import org.simpleframework.xml.Element;

public class Posting {

    @Element
    private String status;
    @Element
    private String type;
    @Element
    private String lastUpdatedDate;

    public String getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public String getLastUpdatedDate() {
        return lastUpdatedDate;
    }
}
