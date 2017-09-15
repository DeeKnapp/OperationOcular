package com.quickenloans.ocularproject.business_object.solution_engine;

public class IncomeSourceCollection
{
    private String EndDate;

    private String StartDate;

    private Number StateWithholding;

    private int MonthsIncomeHasBeenCollected;

    private Number SocialSecurityWithholding;

    private Number EligibleAmount;

    private boolean IsCurrent;

    private String IncomeId;

    private Number FederalWithholding;

    private Number AnnualAmount;

    private String IncomeType;

    private boolean IsFullTime;

    public String getEndDate ()
{
    return EndDate;
}

    public void setEndDate (String EndDate)
    {
        this.EndDate = EndDate;
    }

    public String getStartDate ()
    {
        return StartDate;
    }

    public void setStartDate (String StartDate)
    {
        this.StartDate = StartDate;
    }

    public Number getStateWithholding ()
    {
        return StateWithholding;
    }

    public void setStateWithholding (Number StateWithholding)
    {
        this.StateWithholding = StateWithholding;
    }

    public int getMonthsIncomeHasBeenCollected ()
    {
        return MonthsIncomeHasBeenCollected;
    }

    public void setMonthsIncomeHasBeenCollected (int MonthsIncomeHasBeenCollected)
    {
        this.MonthsIncomeHasBeenCollected = MonthsIncomeHasBeenCollected;
    }

    public Number getSocialSecurityWithholding ()
    {
        return SocialSecurityWithholding;
    }

    public void setSocialSecurityWithholding (Number SocialSecurityWithholding)
    {
        this.SocialSecurityWithholding = SocialSecurityWithholding;
    }

    public Number getEligibleAmount ()
    {
        return EligibleAmount;
    }

    public void setEligibleAmount (Number EligibleAmount)
    {
        this.EligibleAmount = EligibleAmount;
    }

    public boolean getIsCurrent ()
    {
        return IsCurrent;
    }

    public void setIsCurrent (boolean IsCurrent)
    {
        this.IsCurrent = IsCurrent;
    }

    public String getIncomeId ()
{
    return IncomeId;
}

    public void setIncomeId (String IncomeId)
    {
        this.IncomeId = IncomeId;
    }

    public Number getFederalWithholding ()
    {
        return FederalWithholding;
    }

    public void setFederalWithholding (Number FederalWithholding)
    {
        this.FederalWithholding = FederalWithholding;
    }

    public Number getAnnualAmount ()
    {
        return AnnualAmount;
    }

    public void setAnnualAmount (Number AnnualAmount)
    {
        this.AnnualAmount = AnnualAmount;
    }

    public String getIncomeType ()
    {
        return IncomeType;
    }

    public void setIncomeType (String IncomeType)
    {
        this.IncomeType = IncomeType;
    }

    public boolean getIsFullTime ()
    {
        return IsFullTime;
    }

    public void setIsFullTime (boolean IsFullTime)
    {
        this.IsFullTime = IsFullTime;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [EndDate = "+EndDate+", " +
                "StartDate = "+StartDate+", " +
                "StateWithholding = "+StateWithholding+", " +
                "MonthsIncomeHasBeenCollected = "+MonthsIncomeHasBeenCollected+", " +
                "SocialSecurityWithholding = "+SocialSecurityWithholding+", " +
                "EligibleAmount = "+EligibleAmount+", " +
                "IsCurrent = "+IsCurrent+", " +
                "IncomeId = "+IncomeId+", " +
                "FederalWithholding = "+FederalWithholding+", " +
                "AnnualAmount = "+AnnualAmount+", " +
                "IncomeType = "+IncomeType+", " +
                "IsFullTime = "+IsFullTime+"]";
    }
}


