package com.quickenloans.ocularproject.business_object.solution_engine;

public class LoanFeesList
{
    private Fees[] Fees;

    private String ProductGroupType;

    private Number TotalAPRFeesAmount;

    private Number TotalFeesAmount;

    public Fees[] getFees ()
    {
        return Fees;
    }

    public void setFees (Fees[] Fees)
    {
        this.Fees = Fees;
    }

    public String getProductGroupType ()
    {
        return ProductGroupType;
    }

    public void setProductGroupType (String ProductGroupType)
    {
        this.ProductGroupType = ProductGroupType;
    }

    public Number getTotalAPRFeesAmount ()
    {
        return TotalAPRFeesAmount;
    }

    public void setTotalAPRFeesAmount (Number TotalAPRFeesAmount)
    {
        this.TotalAPRFeesAmount = TotalAPRFeesAmount;
    }

    public Number getTotalFeesAmount ()
    {
        return TotalFeesAmount;
    }

    public void setTotalFeesAmount (Number TotalFeesAmount)
    {
        this.TotalFeesAmount = TotalFeesAmount;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Fees = "+Fees+", " +
                "ProductGroupType = "+ProductGroupType+", " +
                "TotalAPRFeesAmount = "+TotalAPRFeesAmount+", " +
                "TotalFeesAmount = "+TotalFeesAmount+"]";
    }
}
