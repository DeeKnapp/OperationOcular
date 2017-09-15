package com.quickenloans.ocularproject.business_object.solution_engine;

/**
 * Created by ctan on 8/30/17.
 */

public class DebtPaymentsCollection {

    private String DebtPaymentId;

    private String DebtType;

    private Number MonthlyEligibleAmountAgency;

    private Number MonthlyEligibleAmountFHA;

    private Number MonthlyEligibleAmountVA;

    private Number MonthlyPaymentAmount;

    private int NumberOfRemainingMonthlyPayments;


    public String getDebtPaymentId() {
        return DebtPaymentId;
    }

    public void setDebtPaymentId(String DebtPaymentId) {
        this.DebtPaymentId = DebtPaymentId;
    }

    public String getDebtType() {
        return DebtType;
    }

    public void setDebtType(String DebtType) {
        this.DebtType = DebtType;
    }

    public Number getMonthlyEligibleAmountAgency() {
        return MonthlyEligibleAmountAgency;
    }

    public void setMonthlyEligibleAmountAgency(Number MonthlyEligibleAmountAgency) {
        this.MonthlyEligibleAmountAgency = MonthlyEligibleAmountAgency;
    }

    public Number getMonthlyEligibleAmountFHA() {
        return MonthlyEligibleAmountFHA;
    }

    public void setMonthlyEligibleAmountFHA(Number MonthlyEligibleAmountFHA) {
        this.MonthlyEligibleAmountFHA = MonthlyEligibleAmountFHA;
    }

    public Number getMonthlyEligibleAmountVA() {
        return MonthlyEligibleAmountVA;
    }

    public void setMonthlyEligibleAmountVA(Number MonthlyEligibleAmountVA) {
        this.MonthlyEligibleAmountVA = MonthlyEligibleAmountVA;
    }

    public Number getMonthlyPaymentAmount() {
        return MonthlyPaymentAmount;
    }

    public void setMonthlyPaymentAmount(Number MonthlyPaymentAmount) {
        this.MonthlyPaymentAmount = MonthlyPaymentAmount;
    }

    public int getNumberOfRemainingMonthlyPayments() {
        return NumberOfRemainingMonthlyPayments;
    }

    public void setNumberOfRemainingMonthlyPayments(int NumberOfRemainingMonthlyPayments) {
        this.NumberOfRemainingMonthlyPayments = NumberOfRemainingMonthlyPayments;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [DebtPaymentId = "+DebtPaymentId+", " +
                "DebtType = "+DebtType+", " +
                "MonthlyEligibleAmountAgency = "+MonthlyEligibleAmountAgency+", " +
                "MonthlyEligibleAmountFHA = "+MonthlyEligibleAmountFHA+", " +
                "MonthlyEligibleAmountVA = "+MonthlyEligibleAmountVA+", " +
                "MonthlyPaymentAmount = "+MonthlyPaymentAmount+", " +
                "NumberOfRemainingMonthlyPayments = "+NumberOfRemainingMonthlyPayments+"]";
    }
}
