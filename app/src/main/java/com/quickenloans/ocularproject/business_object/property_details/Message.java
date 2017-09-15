package com.quickenloans.ocularproject.business_object.property_details;

import org.simpleframework.xml.Element;

public class Message {

    @Element
    private String text;
    @Element
    private String code;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
