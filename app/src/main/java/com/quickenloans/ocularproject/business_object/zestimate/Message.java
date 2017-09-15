package com.quickenloans.ocularproject.business_object.zestimate;

import org.simpleframework.xml.Element;

/**
 * Created by dknapp on 7/28/17.
 */

public class Message {
  @Element private String text;

  @Element private String code;

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  @Override public String toString() {
    return "ClassPojo [text = " + text + ", code = " + code + "]";
  }
}