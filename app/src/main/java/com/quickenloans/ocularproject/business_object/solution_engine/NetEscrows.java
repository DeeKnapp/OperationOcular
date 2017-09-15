package com.quickenloans.ocularproject.business_object.solution_engine;

public class NetEscrows
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
        private Number EscrowInsurance;

        private Number LenderPaidCredit;

        private Number EscrowPropertyTax;

        private Number AggregateAdjustment;

        public Number getEscrowInsurance ()
        {
            return EscrowInsurance;
        }

        public void setEscrowInsurance (Number EscrowInsurance)
        {
            this.EscrowInsurance = EscrowInsurance;
        }

        public Number getLenderPaidCredit ()
        {
            return LenderPaidCredit;
        }

        public void setLenderPaidCredit (Number LenderPaidCredit)
        {
            this.LenderPaidCredit = LenderPaidCredit;
        }

        public Number getEscrowPropertyTax ()
        {
            return EscrowPropertyTax;
        }

        public void setEscrowPropertyTax (Number EscrowPropertyTax)
        {
            this.EscrowPropertyTax = EscrowPropertyTax;
        }

        public Number getAggregateAdjustment ()
        {
            return AggregateAdjustment;
        }

        public void setAggregateAdjustment (Number AggregateAdjustment)
        {
            this.AggregateAdjustment = AggregateAdjustment;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [EscrowInsurance = "+EscrowInsurance+", " +
                    "LenderPaidCredit = "+LenderPaidCredit+", " +
                    "EscrowPropertyTax = "+EscrowPropertyTax+", " +
                    "AggregateAdjustment = "+AggregateAdjustment+"]";
        }
    }


}

