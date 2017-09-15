package com.quickenloans.ocularproject.models;

/**
 * Created by ctan on 9/5/17.
 */

public class SolutionItem {
    public String downPaymentAmount;
    public String downPaymentPercent;
    public String termYears;
    public String monthlyPayment;
    public String listingPrice;
    public String rateApr;
    public String loanAmount;

    public SolutionItem(String percent, String amount, String term, String monthlyPayment, String listingPrice, String rateApr, String loanAmount)
    {
        this.downPaymentAmount = amount;
        this.downPaymentPercent = percent;
        this.termYears = term;
        this.monthlyPayment = monthlyPayment;
        this.listingPrice = listingPrice;
        this.rateApr = rateApr;
        this.loanAmount = loanAmount;

    }

}