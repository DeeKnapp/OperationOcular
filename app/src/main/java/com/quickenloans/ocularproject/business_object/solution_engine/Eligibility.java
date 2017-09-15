package com.quickenloans.ocularproject.business_object.solution_engine;


public class Eligibility
{
    private String EarliestEligibleDate;

    private boolean IsEligible;

    private boolean IsBelowBankerThreshold;

    private EligibilityMessages[] EligibilityMessages;

    public String getEarliestEligibleDate ()
{
    return EarliestEligibleDate;
}

    public void setEarliestEligibleDate (String EarliestEligibleDate)
    {
        this.EarliestEligibleDate = EarliestEligibleDate;
    }

    public boolean getIsEligible ()
    {
        return IsEligible;
    }

    public void setIsEligible (boolean IsEligible)
    {
        this.IsEligible = IsEligible;
    }

    public boolean getIsBelowBankerThreshold ()
{
    return IsBelowBankerThreshold;
}

    public void setIsBelowBankerThreshold (boolean IsBelowBankerThreshold)
    {
        this.IsBelowBankerThreshold = IsBelowBankerThreshold;
    }

    public EligibilityMessages[] getEligibilityMessages ()
    {
        return EligibilityMessages;
    }

    public void setEligibilityMessages (EligibilityMessages[] EligibilityMessages)
    {
        this.EligibilityMessages = EligibilityMessages;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [EarliestEligibleDate = "+EarliestEligibleDate+", " +
                "IsEligible = "+IsEligible+", " +
                "IsBelowBankerThreshold = "+IsBelowBankerThreshold+", " +
                "EligibilityMessages = "+EligibilityMessages+"]";
    }
}


