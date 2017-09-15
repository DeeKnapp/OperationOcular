package com.quickenloans.ocularproject.business_object.solution_engine;

public class CashToClose
{
    private Details Details;

    private Number TotalAmount;

    public Details getDetails ()
    {
        return Details;
    }

    public void setDetails (Details Details)
    {
        this.Details = Details;
    }

    public Number getTotalAmount ()
    {
        return TotalAmount;
    }

    public void setTotalAmount (Number TotalAmount)
    {
        this.TotalAmount = TotalAmount;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Details = "+Details+", " +
                "TotalAmount = "+TotalAmount+"]";
    }

    public class Details {
        private Number NetPrepaids;

        private Number NetClosingCosts;

        private Number DownPaymentAmount;

        private Number TaxProration;

        public Number getNetPrepaids() {
            return NetPrepaids;
        }

        public void setNetPrepaids(Number NetPrepaids) {
            this.NetPrepaids = NetPrepaids;
        }

        public Number getNetClosingCosts() {
            return NetClosingCosts;
        }

        public void setNetClosingCosts(Number NetClosingCosts) {
            this.NetClosingCosts = NetClosingCosts;
        }

        public Number getDownPaymentAmount() {
            return DownPaymentAmount;
        }

        public void setDownPaymentAmount(Number DownPaymentAmount) {
            this.DownPaymentAmount = DownPaymentAmount;
        }

        public Number getTaxProration() {
            return TaxProration;
        }

        public void setTaxProration(Number TaxProration) {
            this.TaxProration = TaxProration;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [NetPrepaids = "+NetPrepaids+", " +
                    "NetClosingCosts = "+NetClosingCosts+", " +
                    "DownPaymentAmount = "+DownPaymentAmount+", " +
                    "TaxProration = "+TaxProration+"]";
        }
    }
}


