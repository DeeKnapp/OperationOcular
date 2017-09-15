package com.quickenloans.ocularproject.business_object.solution_engine;

public class TaxProrations
{
    private Details Details;

    private Number BuyerChargedAmount;

    public Details getDetails ()
    {
        return Details;
    }

    public void setDetails (Details Details)
    {
        this.Details = Details;
    }

    public Number getBuyerChargedAmount ()
    {
        return BuyerChargedAmount;
    }

    public void setBuyerChargedAmount (Number BuyerChargedAmount)
    {
        this.BuyerChargedAmount = BuyerChargedAmount;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Details = "+Details+", BuyerChargedAmount = "+BuyerChargedAmount+"]";
    }

    public class Details
    {
        private Number BuyerResponsible;

        private Number SellerResponsible;

        public Number getBuyerResponsible ()
        {
            return BuyerResponsible;
        }

        public void setBuyerResponsible (Number BuyerResponsible)
        {
            this.BuyerResponsible = BuyerResponsible;
        }

        public Number getSellerResponsible ()
        {
            return SellerResponsible;
        }

        public void setSellerResponsible (Number SellerResponsible)
        {
            this.SellerResponsible = SellerResponsible;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [BuyerResponsible = "+BuyerResponsible+", SellerResponsible = "+SellerResponsible+"]";
        }
    }
}


