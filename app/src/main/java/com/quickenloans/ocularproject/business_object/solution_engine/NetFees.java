package com.quickenloans.ocularproject.business_object.solution_engine;

public class NetFees
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

    public class Details {

        private Number AprFees;

        private Number NonAprFees;

        private Number LenderPaidCreditAprFees;

        private Number LenderPaidCreditNonAprFees;

        public Number getAprFees() {
            return AprFees;
        }

        public void setAprFees(Number AprFees) {
            this.AprFees = AprFees;
        }

        public Number getNonAprFees() {
            return NonAprFees;
        }

        public void setNonAprFees(Number NonAprFees) {
            this.NonAprFees = NonAprFees;
        }

        public Number getLenderPaidCreditAprFees() {
            return LenderPaidCreditAprFees;
        }

        public void setLenderPaidCreditAprFees(Number LenderPaidCreditAprFees) {
            this.LenderPaidCreditAprFees = LenderPaidCreditAprFees;
        }

        public Number getLenderPaidCreditNonAprFees() {
            return LenderPaidCreditNonAprFees;
        }

        public void setLenderPaidCreditNonAprFees(Number LenderPaidCreditNonAprFees) {
            this.LenderPaidCreditNonAprFees = LenderPaidCreditNonAprFees;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [AprFees = "+AprFees+", " +
                    "NonAprFees = "+NonAprFees+"," +
                    "LenderPaidCreditAprFees = "+LenderPaidCreditAprFees+", " +
                    "LenderPaidCreditNonAprFees = "+LenderPaidCreditNonAprFees+"]";
        }
    }
}


