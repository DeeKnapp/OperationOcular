package com.quickenloans.ocularproject.business_object.zestimate;

import org.simpleframework.xml.Element;

/**
 * Created by dknapp on 7/28/17.
 */

public class Request {
  @Element private String zpid;

  public String getZpid() {
    return zpid;
  }

  public void setZpid(String zpid) {
    this.zpid = zpid;
  }

  @Override public String toString() {
    return "ClassPojo [zpid = " + zpid + "]";
  }
}
