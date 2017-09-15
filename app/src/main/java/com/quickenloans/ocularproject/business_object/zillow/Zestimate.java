package com.quickenloans.ocularproject.business_object.zillow;

import org.simpleframework.xml.Element;

public class Zestimate {
  @Element private Amount amount;

  @Element private String percentile;

  @Element private OneWeekChange oneWeekChange;

  @Element(name = "last-updated") private String lastUpdated;

  @Element private ValuationRange valuationRange;

  @Element private ValueChange valueChange;

  public Amount getAmount() {
      return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public String getPercentile() {
    return percentile;
  }

  public void setPercentile(String percentile) {
    this.percentile = percentile;
  }

  public OneWeekChange getOneWeekChange() {
    return oneWeekChange;
  }

  public void setOneWeekChange(OneWeekChange oneWeekChange) {
    this.oneWeekChange = oneWeekChange;
  }

  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public ValuationRange getValuationRange() {
    return valuationRange;
  }

  public void setValuationRange(ValuationRange valuationRange) {
      this.valuationRange = valuationRange;
  }

  public ValueChange getValueChange() {
    return valueChange;
  }

  public void setValueChange(ValueChange valueChange) {
    this.valueChange = valueChange;
  }

  @Override public String toString() {
    return "ClassPojo [amount = "
        + amount
        + ", percentile = "
        + percentile
        + ", oneWeekChange = "
        + oneWeekChange
        + ", last-updated = "
        + lastUpdated
        + ", valuationRange = "
        + valuationRange
        + ", valueChange = "
        + valueChange
        + "]";
  }
}
