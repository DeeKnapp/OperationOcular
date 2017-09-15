package com.quickenloans.ocularproject.business_object.solution_engine;

/**
 * Created by ctan on 8/31/17.
 */

public class PricingOptionTargets {

    private Number TotalMonthlyPaymentAmount;

    private Number TotalClosingCosts;

    private Number Points;

    public Number getTotalMonthlyPaymentAmount() {
        return TotalMonthlyPaymentAmount;
    }

    public void setTotalMonthlyPaymentAmount(Number TotalMonthlyPaymentAmount) {
        this.TotalMonthlyPaymentAmount = TotalMonthlyPaymentAmount;
    }

    public Number getTotalClosingCosts() {
        return TotalClosingCosts;
    }

    public void setTotalClosingCosts(Number TotalClosingCosts) {
        this.TotalClosingCosts = TotalClosingCosts;
    }

    public Number getPoints() {
        return Points;
    }

    public void setPoints(Number Points) {
        this.Points = Points;
    }
}
