package com.quickenloans.ocularproject.business_object.solution_engine;

public class IncomeSources
{
    private Number TotalStateWithholding;

    private IncomeSourceCollection[] IncomeSourceCollection;

    private Number TotalFederalWithholding;

    private boolean Has2YearWorkHistory;

    private Number TotalWithholding;

    private Number TotalEligibleAmount;

    private int DaysWorked;

    private Number TotalSocialSecurityWithholding;

    public Number getTotalStateWithholding ()
    {
        return TotalStateWithholding;
    }

    public void setTotalStateWithholding (Number TotalStateWithholding)
    {
        this.TotalStateWithholding = TotalStateWithholding;
    }

    public IncomeSourceCollection[] getIncomeSourceCollection ()
    {
        return IncomeSourceCollection;
    }

    public void setIncomeSourceCollection (IncomeSourceCollection[] IncomeSourceCollection)
    {
        this.IncomeSourceCollection = IncomeSourceCollection;
    }

    public Number getTotalFederalWithholding ()
    {
        return TotalFederalWithholding;
    }

    public void setTotalFederalWithholding (Number TotalFederalWithholding)
    {
        this.TotalFederalWithholding = TotalFederalWithholding;
    }

    public boolean getHas2YearWorkHistory ()
    {
        return Has2YearWorkHistory;
    }

    public void setHas2YearWorkHistory (boolean Has2YearWorkHistory)
    {
        this.Has2YearWorkHistory = Has2YearWorkHistory;
    }

    public Number getTotalWithholding ()
    {
        return TotalWithholding;
    }

    public void setTotalWithholding (Number TotalWithholding)
    {
        this.TotalWithholding = TotalWithholding;
    }

    public Number getTotalEligibleAmount ()
    {
        return TotalEligibleAmount;
    }

    public void setTotalEligibleAmount (Number TotalEligibleAmount)
    {
        this.TotalEligibleAmount = TotalEligibleAmount;
    }

    public int getDaysWorked ()
    {
        return DaysWorked;
    }

    public void setDaysWorked (int DaysWorked)
    {
        this.DaysWorked = DaysWorked;
    }

    public Number getTotalSocialSecurityWithholding ()
    {
        return TotalSocialSecurityWithholding;
    }

    public void setTotalSocialSecurityWithholding (Number TotalSocialSecurityWithholding)
    {
        this.TotalSocialSecurityWithholding = TotalSocialSecurityWithholding;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [TotalStateWithholding = "+TotalStateWithholding+", " +
                "IncomeSourceCollection = "+IncomeSourceCollection+", " +
                "TotalFederalWithholding = "+TotalFederalWithholding+", " +
                "Has2YearWorkHistory = "+Has2YearWorkHistory+", " +
                "TotalWithholding = "+TotalWithholding+", " +
                "TotalEligibleAmount = "+TotalEligibleAmount+", " +
                "DaysWorked = "+DaysWorked+", " +
                "TotalSocialSecurityWithholding = "+TotalSocialSecurityWithholding+"]";
    }
}


