package com.quickenloans.ocularproject.business_object.solution_engine;

public class EstimatedPayoff {

    private Details Details;

    private Number EstimatedPayoffAmount;

    public Details getDetails ()
    {
        return Details;
    }

    public void setDetails (Details Details)
    {
        this.Details = Details;
    }

    public Number EstimatedPayoffAmount ()
    {
        return EstimatedPayoffAmount;
    }

    public void setEstimatedPayoffAmount (Number EstimatedPayoffAmount)
    {
        this.EstimatedPayoffAmount = EstimatedPayoffAmount;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Details = "+Details+", EstimatedPayoffAmount = "+EstimatedPayoffAmount+"]";
    }

    public class Details
    {
        private Number AccruedInterest;

        private Number CurrentLoanBalance;

        public Number getAccruedInterest ()
        {
            return AccruedInterest;
        }

        public void setAccruedInterest (Number AccruedInterest)
        {
            this.AccruedInterest = AccruedInterest;
        }

        public Number getLenderPaidCredit ()
        {
            return CurrentLoanBalance;
        }

        public void setCurrentLoanBalance (Number CurrentLoanBalance)
        {
            this.CurrentLoanBalance = CurrentLoanBalance;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [AccruedInterest = "+AccruedInterest+", CurrentLoanBalance = "+CurrentLoanBalance+"]";
        }
    }
}
