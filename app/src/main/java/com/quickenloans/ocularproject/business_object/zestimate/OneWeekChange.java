package com.quickenloans.ocularproject.business_object.zestimate;

import org.simpleframework.xml.Attribute;

/**
 * Created by dknapp on 7/28/17.
 */

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