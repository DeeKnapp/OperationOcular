package com.quickenloans.ocularproject.business_object.zestimate;

import org.simpleframework.xml.Element;

/**
 * Created by dknapp on 7/28/17.
 */

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
