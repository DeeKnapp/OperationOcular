package com.quickenloans.ocularproject.business_object.solution_engine;

public class SolutionOptions
{
    private ProductsAndPricing ProductsAndPricing;

    private Number DownPaymentPercent;

    private Number MonthlyPrincipalAndInterestAmount;

    private boolean DownPaymentRecommended;

    private LoanFeesList[] LoanFeesList;

    private ProductsAndPricingSets ProductsAndPricingSets;

    private Number LoanAmount;

    private Number LTV;

    private boolean DownPaymentSelected;

    private Number DownPaymentAmount;

    private Number MonthlyTaxAmount;

    private String Id;

    private Number RecommendedPurchasePrice;

    private int LockPeriod;

    private Number MonthlyInsuranceAmount;

    public ProductsAndPricing getProductsAndPricing ()
    {
        return ProductsAndPricing;
    }

    public void setProductsAndPricing (ProductsAndPricing ProductsAndPricing)
    {
        this.ProductsAndPricing = ProductsAndPricing;
    }

    public Number getDownPaymentPercent ()
    {
        return DownPaymentPercent;
    }

    public void setDownPaymentPercent (Number DownPaymentPercent)
    {
        this.DownPaymentPercent = DownPaymentPercent;
    }

    public Number getMonthlyPrincipalAndInterestAmount ()
    {
        return MonthlyPrincipalAndInterestAmount;
    }

    public void setMonthlyPrincipalAndInterestAmount (Number MonthlyPrincipalAndInterestAmount)
    {
        this.MonthlyPrincipalAndInterestAmount = MonthlyPrincipalAndInterestAmount;
    }

    public boolean getDownPaymentRecommended ()
    {
        return DownPaymentRecommended;
    }

    public void setDownPaymentRecommended (boolean DownPaymentRecommended)
    {
        this.DownPaymentRecommended = DownPaymentRecommended;
    }

    public LoanFeesList[] getLoanFeesList ()
    {
        return LoanFeesList;
    }

    public void setLoanFeesList (LoanFeesList[] LoanFeesList)
    {
        this.LoanFeesList = LoanFeesList;
    }

    public ProductsAndPricingSets getProductsAndPricingSets ()
{
    return ProductsAndPricingSets;
}

    public void setProductsAndPricingSets (ProductsAndPricingSets ProductsAndPricingSets)
    {
        this.ProductsAndPricingSets = ProductsAndPricingSets;
    }

    public Number getLoanAmount ()
    {
        return LoanAmount;
    }

    public void setLoanAmount (Number LoanAmount)
    {
        this.LoanAmount = LoanAmount;
    }

    public Number getLTV ()
    {
        return LTV;
    }

    public void setLTV (Number LTV)
    {
        this.LTV = LTV;
    }

    public boolean getDownPaymentSelected ()
    {
        return DownPaymentSelected;
    }

    public void setDownPaymentSelected (boolean DownPaymentSelected)
    {
        this.DownPaymentSelected = DownPaymentSelected;
    }

    public Number getDownPaymentAmount ()
    {
        return DownPaymentAmount;
    }

    public void setDownPaymentAmount (Number DownPaymentAmount)
    {
        this.DownPaymentAmount = DownPaymentAmount;
    }

    public Number getMonthlyTaxAmount ()
    {
        return MonthlyTaxAmount;
    }

    public void setMonthlyTaxAmount (Number MonthlyTaxAmount)
    {
        this.MonthlyTaxAmount = MonthlyTaxAmount;
    }

    public String getId ()
    {
        return Id;
    }

    public void setId (String Id)
    {
        this.Id = Id;
    }

    public Number getRecommendedPurchasePrice ()
    {
        return RecommendedPurchasePrice;
    }

    public void setRecommendedPurchasePrice (Number RecommendedPurchasePrice)
    {
        this.RecommendedPurchasePrice = RecommendedPurchasePrice;
    }

    public int getLockPeriod ()
    {
        return LockPeriod;
    }

    public void setLockPeriod (int LockPeriod)
    {
        this.LockPeriod = LockPeriod;
    }

    public Number getMonthlyInsuranceAmount ()
    {
        return MonthlyInsuranceAmount;
    }

    public void setMonthlyInsuranceAmount (Number MonthlyInsuranceAmount)
    {
        this.MonthlyInsuranceAmount = MonthlyInsuranceAmount;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ProductsAndPricing = "+ProductsAndPricing+", " +
                "DownPaymentPercent = "+DownPaymentPercent+", " +
                "MonthlyPrincipalAndInterestAmount = "+MonthlyPrincipalAndInterestAmount+", " +
                "DownPaymentRecommended = "+DownPaymentRecommended+", " +
                "LoanFeesList = "+LoanFeesList+", " +
                "ProductsAndPricingSets = "+ProductsAndPricingSets+", " +
                "LoanAmount = "+LoanAmount+", " +
                "LTV = "+LTV+", " +
                "DownPaymentSelected = "+DownPaymentSelected+", " +
                "DownPaymentAmount = "+DownPaymentAmount+", " +
                "MonthlyTaxAmount = "+MonthlyTaxAmount+", " +
                "Id = "+Id+", " +
                "RecommendedPurchasePrice = "+RecommendedPurchasePrice+", " +
                "LockPeriod = "+LockPeriod+", " +
                "MonthlyInsuranceAmount = "+MonthlyInsuranceAmount+"]";
    }
}


