package com.quickenloans.ocularproject.business_object.solution_engine;

public class FundsToClose
{
    private Number TotalFundsToClose;

    private Details Details;

    private Number TotalPrePaids;

    public Number getTotalFundsToClose ()
    {
        return TotalFundsToClose;
    }

    public void setTotalFundsToClose (Number TotalFundsToClose)
    {
        this.TotalFundsToClose = TotalFundsToClose;
    }

    public Details getDetails ()
    {
        return Details;
    }

    public void setDetails (Details Details)
    {
        this.Details = Details;
    }

    public Number getTotalPrePaids ()
    {
        return TotalPrePaids;
    }

    public void setTotalPrePaids (Number TotalPrePaids)
    {
        this.TotalPrePaids = TotalPrePaids;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [TotalFundsToClose = "+TotalFundsToClose+", Details = "+Details+", TotalPrePaids = "+TotalPrePaids+"]";
    }

    public class Details
    {
        private Number DownPaymentAmount;

        private Number EscrowInsurance;

        private Number PerDiemInterest;

        private Number EscrowPropertyTax;

        private Number TaxProration;

        private Number ClosingCosts;

        private Number AggregateAdjustment;

        public Number getDownPaymentAmount ()
        {
            return DownPaymentAmount;
        }

        public void setDownPaymentAmount (Number DownPaymentAmount)
        {
            this.DownPaymentAmount = DownPaymentAmount;
        }

        public Number getEscrowInsurance ()
        {
            return EscrowInsurance;
        }

        public void setEscrowInsurance (Number EscrowInsurance)
        {
            this.EscrowInsurance = EscrowInsurance;
        }

        public Number getPerDiemInterest ()
        {
            return PerDiemInterest;
        }

        public void setPerDiemInterest (Number PerDiemInterest)
        {
            this.PerDiemInterest = PerDiemInterest;
        }

        public Number getEscrowPropertyTax ()
        {
            return EscrowPropertyTax;
        }

        public void setEscrowPropertyTax (Number EscrowPropertyTax)
        {
            this.EscrowPropertyTax = EscrowPropertyTax;
        }

        public Number getTaxProration ()
        {
            return TaxProration;
        }

        public void setTaxProration (Number TaxProration)
        {
            this.TaxProration = TaxProration;
        }

        public Number getClosingCosts ()
        {
            return ClosingCosts;
        }

        public void setClosingCosts (Number ClosingCosts)
        {
            this.ClosingCosts = ClosingCosts;
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
            return "ClassPojo [DownPaymentAmount = "+DownPaymentAmount+", " +
                    "EscrowInsurance = "+EscrowInsurance+", " +
                    "PerDiemInterest = "+PerDiemInterest+", " +
                    "EscrowPropertyTax = "+EscrowPropertyTax+", " +
                    "TaxProration = "+TaxProration+", " +
                    "ClosingCosts = "+ClosingCosts+", " +
                    "AggregateAdjustment = "+AggregateAdjustment+"]";
        }
    }



}

