package com.quickenloans.ocularproject.business_object.solution_engine;

/**
 * Created by ctan on 8/31/17.
 */

public class ItemsIncludedInLoan {

    private Number TotalAmount;

    private Details Details;

    public Number getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(Number TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    public Details getDetails() {
        return Details;
    }

    public void setDetails(Details Details) {
        this.Details = Details;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [TotalAmount = "+TotalAmount+","+
                "Details = "+Details+"]";
    }

    public class Details {

        private Number NetPrepaids;

        private Number NetClosingCosts;

        private Number SecondaryLiensFinanced;

        private Number RoundingAdjustment;



        public Number getNetClosingCosts() {
            return NetClosingCosts;
        }

        public void setNetClosingCosts(Number NetClosingCosts) {
            this.NetClosingCosts = NetClosingCosts;
        }

        public Number getSecondaryLiensFinanced() {
            return NetClosingCosts;
        }

        public void setSecondaryLiensFinanced(Number SecondaryLiensFinanced) {
            this.SecondaryLiensFinanced = SecondaryLiensFinanced;
        }

        public Number getRoundingAdjustment() {
            return RoundingAdjustment;
        }

        public void setRoundingAdjustment(Number RoundingAdjustment) {
            this.RoundingAdjustment = RoundingAdjustment;
        }

        public Number getNetPrepaids() {
            return NetPrepaids;
        }

        public void setNetPrepaids(Number NetPrepaids) {
            this.NetPrepaids = NetPrepaids;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [NetPrepaids = "+NetPrepaids+", " +
                    "NetClosingCosts = "+NetClosingCosts+", " +
                    "SecondaryLiensFinanced = "+SecondaryLiensFinanced+", " +
                    "RoundingAdjustment = "+RoundingAdjustment+"]";
        }
    }
}
