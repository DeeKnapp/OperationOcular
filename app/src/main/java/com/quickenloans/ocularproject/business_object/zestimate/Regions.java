package com.quickenloans.ocularproject.business_object.zestimate;

import org.simpleframework.xml.Element;

/**
 * Created by dknapp on 7/28/17.
 */

public class Regions {
  @Element(name = "county-id") private String countyId;

  @Element(name = "zipcode-id") private String zipcodeId;

  @Element(name = "state-id") private String stateId;

  @Element(name = "city-id") private String cityId;

  public String getCountyid() {
    return countyId;
  }

  public void setCountyId(String countyId) {
    this.countyId = countyId;
  }

  public String getZipcodeId() {
    return zipcodeId;
  }

  public void setZipcodeId(String zipcodeId) {
    this.zipcodeId = zipcodeId;
  }

  public String getStateId() {
    return stateId;
  }

  public void setStateId(String stateId) {
    this.stateId = stateId;
  }

  public String getCityId() {
    return cityId;
  }

  public void setCityId(String cityId) {
    this.cityId = cityId;
  }

  @Override public String toString() {
    return "ClassPojo [county-id = " + countyId + ", zipcode-id = " + zipcodeId + ", state-id = " + stateId + ", city-id = " + cityId + "]";
  }
}
