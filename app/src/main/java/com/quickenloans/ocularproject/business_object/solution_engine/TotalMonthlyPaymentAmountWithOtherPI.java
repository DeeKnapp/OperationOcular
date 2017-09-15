package com.quickenloans.ocularproject.business_object.solution_engine;

/**
 * Created by ctan on 8/31/17.
 */

public class TotalMonthlyPaymentAmountWithOtherPI {

    private Number Total;

    private Details Details;

    public Number getTotal() {
        return Total;
    }

    public void setTotal(Number Total) {
        this.Total = Total;
    }

    public Details getDetails() {
        return Details;
    }

    public void setDetails(Details Details) {
        this.Details = Details;
    }

    public class Details {

        private Number PrincipalAndInterestPaymentAmount;
        private Number OtherFinancingPrincipalAndInterestPaymentAmount;
        private Number HomeownersInsuranceEscrow;
        private Number RealEstateTaxesEscrow;
        private Number MIPaymentAmount;
        private Number PMIPaymentAmount;

        public Number getPrincipalAndInterestPaymentAmount() {
            return PrincipalAndInterestPaymentAmount;
        }

        public void setPrincipalAndInterestPaymentAmount(Number PrincipalAndInterestPaymentAmount) {
            this.PrincipalAndInterestPaymentAmount = PrincipalAndInterestPaymentAmount;
        }

        public Number getOtherFinancingPrincipalAndInterestPaymentAmount() {
            return OtherFinancingPrincipalAndInterestPaymentAmount;
        }

        public void setOtherFinancingPrincipalAndInterestPaymentAmount(Number OtherFinancingPrincipalAndInterestPaymentAmount) {
            this.OtherFinancingPrincipalAndInterestPaymentAmount = OtherFinancingPrincipalAndInterestPaymentAmount;
        }

        public Number getHomeownersInsuranceEscrow() {
            return HomeownersInsuranceEscrow;
        }

        public void setHomeownersInsuranceEscrow(Number HomeownersInsuranceEscrow) {
            this.HomeownersInsuranceEscrow = HomeownersInsuranceEscrow;
        }

        public Number getRealEstateTaxesEscrow() {
            return RealEstateTaxesEscrow;
        }

        public void setRealEstateTaxesEscrow(Number RealEstateTaxesEscrow) {
            this.RealEstateTaxesEscrow = RealEstateTaxesEscrow;
        }

        public Number getMIPaymentAmount() {
            return MIPaymentAmount;
        }

        public void setMIPaymentAmount(Number MIPaymentAmount) {
            this.MIPaymentAmount = MIPaymentAmount;
        }

        public Number getPMIPaymentAmount() {
            return PMIPaymentAmount;
        }

        public void setPMIPaymentAmount(Number PMIPaymentAmount) {
            this.PMIPaymentAmount = PMIPaymentAmount;
        }
    }
}
