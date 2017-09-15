package com.quickenloans.ocularproject.business_object.solution_engine;

public class Fees
{
    private String Description;

    private boolean IsAPRFee;

    private String Number;

    private int NumberInt;

    private Number BaseLineAmount;

    private Number TotalFeeAmount;

    public String getDescription ()
    {
        return Description;
    }

    public void setDescription (String Description)
    {
        this.Description = Description;
    }

    public boolean getIsAPRFee ()
    {
        return IsAPRFee;
    }

    public void setIsAPRFee (boolean IsAPRFee)
    {
        this.IsAPRFee = IsAPRFee;
    }

    public String getNumber ()
    {
        return Number;
    }

    public void setNumber (String Number)
    {
        this.Number = Number;
    }

    public int getNumberInt ()
    {
        return NumberInt;
    }

    public void setNumberInt (int NumberInt)
    {
        this.NumberInt = NumberInt;
    }

    public Number getBaseLineAmount ()
    {
        return BaseLineAmount;
    }

    public void setBaseLineAmount (Number BaseLineAmount)
    {
        this.BaseLineAmount = BaseLineAmount;
    }

    public Number getTotalFeeAmount ()
    {
        return TotalFeeAmount;
    }

    public void setTotalFeeAmount (Number TotalFeeAmount)
    {
        this.TotalFeeAmount = TotalFeeAmount;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Description = "+Description+", " +
                "IsAPRFee = "+IsAPRFee+", " +
                "Number = "+Number+", " +
                "NumberInt = "+NumberInt+", " +
                "BaseLineAmount = "+BaseLineAmount+", " +
                "TotalFeeAmount = "+TotalFeeAmount+"]";
    }
}


