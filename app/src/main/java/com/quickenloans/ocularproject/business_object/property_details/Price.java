package com.quickenloans.ocularproject.business_object.property_details;

import org.simpleframework.xml.Element;

import java.util.List;

public class Price {

    @Element
    private String currency;
    @Element
    private String text;
    @Element
    private List<Object> toString = null;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Object> getToString() {
        return toString;
    }

    public void setToString(List<Object> toString) {
        this.toString = toString;
    }

}

