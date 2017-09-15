package com.quickenloans.ocularproject.business_object.zestimate;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Text;

/**
 * Created by dknapp on 7/28/17.
 */

public class Amount {
  @Text private String content;

  @Attribute private String currency;

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  @Override public String toString() {
    return "ClassPojo [content = " + content + ", currency = " + currency + "]";
  }
}
