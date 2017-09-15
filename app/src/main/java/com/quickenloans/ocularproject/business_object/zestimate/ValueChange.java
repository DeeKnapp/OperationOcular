package com.quickenloans.ocularproject.business_object.zestimate;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Text;

/**
 * Created by dknapp on 7/28/17.
 */

public class ValueChange {
  @Text private String content;

  @Attribute private String duration;

  @Attribute private String currency;

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  @Override public String toString() {
    return "ClassPojo [content = " + content + ", duration = " + duration + ", currency = " + currency + "]";
  }
}