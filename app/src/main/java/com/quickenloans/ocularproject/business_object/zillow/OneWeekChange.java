package com.quickenloans.ocularproject.business_object.zillow;

import org.simpleframework.xml.Attribute;

public class OneWeekChange {
  @Attribute private String deprecated;

  public String getDeprecated() {
    return deprecated;
  }

  public void setDeprecated(String deprecated) {
    this.deprecated = deprecated;
  }

  @Override public String toString() {
    return "ClassPojo [deprecated = " + deprecated + "]";
  }
}