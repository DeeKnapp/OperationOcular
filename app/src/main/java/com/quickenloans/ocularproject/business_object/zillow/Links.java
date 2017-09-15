package com.quickenloans.ocularproject.business_object.zillow;

import org.simpleframework.xml.Element;

public class Links {
  @Element(required = false) private String homedetails;

  @Element(required = false) private String graphsanddata;

  @Element(required = false) private String mapthishome;

  @Element(required = false) private String comparables;

  @Element(required = false) private String forSaleByOwner;

  @Element(required = false) private String overview;

  @Element(required = false) private String forSale;

  public String getForSaleByOwner() {
    return forSaleByOwner;
  }

  public void setForSaleByOwner(String forSaleByOwner) {
    this.forSaleByOwner = forSaleByOwner;
  }

  public String getOverview() {
    return overview;
  }

  public void setOverview(String overview) {
    this.overview = overview;
  }

  public String getForSale() {
    return forSale;
  }

  public void setForSale(String forSale) {
    this.forSale = forSale;
  }

  public String getComparables() {
    return comparables;
  }

  public void setComparables(String comparables) {
    this.comparables = comparables;
  }

  public String getMapthishome() {

    return mapthishome;
  }

  public void setMapthishome(String mapthishome) {
    this.mapthishome = mapthishome;
  }

  public String getGraphsanddata() {

    return graphsanddata;
  }

  public void setGraphsanddata(String graphsanddata) {
    this.graphsanddata = graphsanddata;
  }

  public String getHomedetails() {

    return homedetails;
  }

  public void setHomedetails(String homedetails) {
    this.homedetails = homedetails;
  }

  @Override public String toString() {
    return "ClassPojo [forSaleByOwner = " + forSaleByOwner + ", overview = " + overview + ", forSale = " + forSale + "]";
  }
}