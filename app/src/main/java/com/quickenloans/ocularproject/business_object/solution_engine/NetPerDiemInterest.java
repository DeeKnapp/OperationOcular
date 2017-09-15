package com.quickenloans.ocularproject.business_object.solution_engine;

public class NetPerDiemInterest
{
    private Number Amount;

    private Details Details;

    public Number getAmount ()
    {
        return Amount;
    }

    public void setAmount (Number Amount)
    {
        this.Amount = Amount;
    }

    public Details getDetails ()
    {
        return Details;
    }

    public void setDetails (Details Details)
    {
        this.Details = Details;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Amount = "+Amount+", " +
                "Details = "+Details+"]";
    }

    public class Details
    {
        private Number PerDiemInterest;

        private Number LenderPaidCredit;

        public Number getPerDiemInterest ()
        {
            return PerDiemInterest;
        }

        public void setPerDiemInterest (Number PerDiemInterest)
        {
            this.PerDiemInterest = PerDiemInterest;
        }

        public Number getLenderPaidCredit ()
        {
            return LenderPaidCredit;
        }

        public void setLenderPaidCredit (Number LenderPaidCredit)
        {
            this.LenderPaidCredit = LenderPaidCredit;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [PerDiemInterest = "+PerDiemInterest+", " +
                    "LenderPaidCredit = "+LenderPaidCredit+"]";
        }
    }

}


