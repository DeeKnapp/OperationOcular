package com.quickenloans.ocularproject.business_object.zestimate;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

/**
 * Created by dknapp on 7/28/17.
 */

public class Region {

  @Attribute private String id;

  @Attribute private String name;

  @Element(required = false) private String zindexValue;

  @Element(required = false) private String zindexOneYearChange;

  @Element(required = false) private Links links;

  @Attribute private String type;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getZindexValue() {
    return zindexValue;
  }

  public void setZindexValue(String zindexValue) {
    this.zindexValue = zindexValue;
  }

  public String getZindexOneYearChange() {
    return zindexOneYearChange;
  }

  public void setZindexOneYearChange(String zindexOneYearChange) {
    this.zindexOneYearChange = zindexOneYearChange;
  }

  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override public String toString() {
    return "ClassPojo [id = "
        + id
        + ", name = "
        + name
        + ", zindexValue = "
        + zindexValue
        + ", zindexOneYearChange = "
        + zindexOneYearChange
        + ", links = "
        + links
        + ", type = "
        + type
        + "]";
  }
}
