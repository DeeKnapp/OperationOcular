package com.quickenloans.ocularproject.business_object.zillow;

import org.simpleframework.xml.Element;

public class LocalRealEstate {
  @Element private Region region;

  public Region getRegion() {
    return region;
  }

  public void setRegion(Region region) {
    this.region = region;
  }

  @Override public String toString() {
    return "ClassPojo [region = " + region + "]";
  }
}
