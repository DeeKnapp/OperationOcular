package com.quickenloans.ocularproject.business_object.zillow;

import org.simpleframework.xml.Element;

public class Result {

    @Element private String zpid;

    @Element private Links links;

    @Element private Address address;

    @Element private Zestimate zestimate;

    @Element private LocalRealEstate localRealEstate;

    public String getZpid() {
        return zpid;
    }

    public void setZpid(String zpid) {
        this.zpid = zpid;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Zestimate getZestimate() {
        return zestimate;
    }

    public void setZestimate(Zestimate zestimate) {
        this.zestimate = zestimate;
    }

    public LocalRealEstate getLocalRealEstate() {
        return localRealEstate;
    }

    public void setLocalRealEstate(LocalRealEstate localRealEstate) {
        this.localRealEstate = localRealEstate;
    }

    @Override public String toString() {
        return "ClassPojo [zpid = "
                + zpid
                + ", links = "
                + links
                + ", address = "
                + address
                + ", zestimate = "
                + zestimate
                + ", localRealEstate = "
                + localRealEstate
                + "]";
    }
}
