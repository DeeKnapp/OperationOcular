package com.quickenloans.ocularproject.business_object.property_details;

import org.simpleframework.xml.Element;

public class PageViewCount {

    @Element
    private String currentMonth;
    @Element
    private String total;

    public String getCurrentMonth() {
        return currentMonth;
    }

    public void setCurrentMonth(String currentMonth) {
        this.currentMonth = currentMonth;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

}
