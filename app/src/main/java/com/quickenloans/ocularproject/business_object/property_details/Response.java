package com.quickenloans.ocularproject.business_object.property_details;

import org.simpleframework.xml.Element;

public class Response {

    @Element
    private String zpid;
    @Element
    private PageViewCount pageViewCount;
    @Element
    private Address address;
    @Element (required = false)
    private Posting posting = null;
    @Element (required = false)
    private Price price = null;
    @Element
    private Links links;
    @Element
    private Images images;
    @Element
    private EditedFacts editedFacts;
    @Element
    private String homeDescription;
    @Element (required = false)
    private String whatOwnerLoves;
    @Element (required = false)
    private String neighborhood;
    @Element (required = false)
    private String schoolDistrict;
    @Element (required = false)
    private String elementarySchool;
    @Element (required = false)
    private String middleSchool;

    public String getZpid() {
        return zpid;
    }

    public void setZpid(String zpid) {
        this.zpid = zpid;
    }

    public PageViewCount getPageViewCount() {
        return pageViewCount;
    }

    public void setPageViewCount(PageViewCount pageViewCount) {
        this.pageViewCount = pageViewCount;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Posting getPosting() {
        return posting;
    }

    public Price getPrice() {
        return price;
    }

    public Links getLinks() {
        return links;
    }

    public Images getImages() {
        return images;
    }

    public EditedFacts getEditedFacts() {
        return editedFacts;
    }

    public String getHomeDescription() {
        return homeDescription;
    }

    public String getWhatOwnerLoves() {
        return whatOwnerLoves;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getSchoolDistrict() {
        return schoolDistrict;
    }

    public String getElementarySchool() {
        return elementarySchool;
    }

    public void setElementarySchool(String elementarySchool) {
        this.elementarySchool = elementarySchool;
    }

    public String getMiddleSchool() {
        return middleSchool;
    }
}
