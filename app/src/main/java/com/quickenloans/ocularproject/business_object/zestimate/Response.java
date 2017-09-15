package com.quickenloans.ocularproject.business_object.zestimate;

import org.simpleframework.xml.Element;

/**
 * Created by dknapp on 7/28/17.
 */

public class Response {
  @Element private Zestimate zestimate;

  @Element private LocalRealEstate localRealEstate;

  @Element private Address address;

  @Element private Links links;

  @Element private Regions regions;

  @Element private String zpid;

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

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public Regions getRegions() {
    return regions;
  }

  public void setRegions(Regions regions) {
    this.regions = regions;
  }

  public String getZpid() {
    return zpid;
  }

  public void setZpid(String zpid) {
    this.zpid = zpid;
  }

  @Override public String toString() {
    return "ClassPojo [zestimate = "
        + zestimate
        + ", localRealEstate = "
        + localRealEstate
        + ", address = "
        + address
        + ", links = "
        + links
        + ", regions = "
        + regions
        + ", zpid = "
        + zpid
        + "]";
  }
}