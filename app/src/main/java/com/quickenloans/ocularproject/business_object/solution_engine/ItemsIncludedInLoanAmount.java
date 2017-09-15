package com.quickenloans.ocularproject.business_object.solution_engine;

/**
 * Created by ctan on 8/31/17.
 */

public class ItemsIncludedInLoanAmount {

    private Number TotalPrePaids;

    private Number TotalItemsIncludedInLoanAmount;

    private Details Details;


    public Number getTotalPrePaids() {
        return TotalPrePaids;
    }

    public void setTotalPrePaids(Number TotalPrePaids) {
        this.TotalPrePaids = TotalPrePaids;
    }

    public Number getTotalItemsIncludedInLoanAmount() {
        return TotalItemsIncludedInLoanAmount;
    }

    public void setTotalItemsIncludedInLoanAmount(Number TotalItemsIncludedInLoanAmount) {
        this.TotalItemsIncludedInLoanAmount = TotalItemsIncludedInLoanAmount;
    }

    public Details getDetails() {
        return Details;
    }

    public void setDetails(Details Details) {
        this.Details = Details;
    }

    @Override
    public String toString() {
        return "ClassPojo [TotalPrePaids = " + TotalPrePaids + "," +
                " TotalItemsIncludedInLoanAmount = " + TotalItemsIncludedInLoanAmount + "," +
                " Details = " + Details + "]";
    }

    public class Details {

        private Number EscrowInsurance;

        private Number EscrowPropertyTax;

        private Number AggregatedAdjustment;

        private Number PerDiemInterest;

        private Number LenderPaidCreditAppliedToPrepaids;

        private Number ClosingCostHigh;

        private Number SecondaryLiensFinanced;

        private Number RoundingAdjustment;

        public Number getEscrowInsurance() {
            return EscrowInsurance;
        }

        public void setEscrowInsurance(Number EscrowInsurance) {
            this.EscrowInsurance = EscrowInsurance;
        }

        public Number getEscrowPropertyTax() {
            return EscrowPropertyTax;
        }

        public void setEscrowPropertyTax(Number EscrowPropertyTax) {
            this.EscrowPropertyTax = EscrowPropertyTax;
        }

        public Number getAggregatedAdjustment() {
            return AggregatedAdjustment;
        }

        public void setAggregatedAdjustment(Number AggregatedAdjustment) {
            this.AggregatedAdjustment = AggregatedAdjustment;
        }

        public Number getPerDiemInterest() {
            return PerDiemInterest;
        }

        public void setPerDiemInterest(Number PerDiemInterest) {
            this.PerDiemInterest = PerDiemInterest;
        }

        public Number getLenderPaidCreditAppliedToPrepaids() {
            return LenderPaidCreditAppliedToPrepaids;
        }

        public void setLenderPaidCreditAppliedToPrepaids(Number LenderPaidCreditAppliedToPrepaids) {
            this.LenderPaidCreditAppliedToPrepaids = LenderPaidCreditAppliedToPrepaids;
        }

        public Number getClosingCostHigh() {
            return ClosingCostHigh;
        }

        public void setClosingCostHigh(Number ClosingCostHigh) {
            this.ClosingCostHigh = ClosingCostHigh;
        }

        public Number getSecondaryLiensFinanced() {
            return SecondaryLiensFinanced;
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

        @Override
        public String toString()
        {
            return "ClassPojo [EscrowInsurance = "+EscrowInsurance+"," +
                    " EscrowPropertyTax = "+EscrowPropertyTax+"," +
                    " AggregatedAdjustment = "+AggregatedAdjustment+"," +
                    " PerDiemInterest = "+PerDiemInterest+"," +
                    " LenderPaidCreditAppliedToPrepaids = "+LenderPaidCreditAppliedToPrepaids+"," +
                    " ClosingCostHigh = "+ClosingCostHigh+"," +
                    " SecondaryLiensFinanced = "+SecondaryLiensFinanced+"," +
                    " RoundingAdjustment = "+RoundingAdjustment+"]";
        }
    }
}
