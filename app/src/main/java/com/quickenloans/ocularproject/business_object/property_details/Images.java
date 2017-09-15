package com.quickenloans.ocularproject.business_object.property_details;

import org.simpleframework.xml.Element;

public class Images {

    @Element
    private String count;
    @Element
    private Image image;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

}
