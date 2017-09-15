package com.quickenloans.ocularproject.business_object.solution_engine;

public class DebtPayments
{
    private DebtPaymentsCollection[] DebtPaymentsCollection;

    private Number TotalEligibleAmountVA;

    private Number TotalEligibleAmountFHA;

    private Number TotalEligibleAmountAgency;

    public DebtPaymentsCollection[] getDebtPaymentsCollection ()
    {
        return DebtPaymentsCollection;
    }

    public void setDebtPaymentsCollection (DebtPaymentsCollection[] DebtPaymentsCollection)
    {
        this.DebtPaymentsCollection = DebtPaymentsCollection;
    }

    public Number getTotalEligibleAmountVA ()
    {
        return TotalEligibleAmountVA;
    }

    public void setTotalEligibleAmountVA (Number TotalEligibleAmountVA)
    {
        this.TotalEligibleAmountVA = TotalEligibleAmountVA;
    }

    public Number getTotalEligibleAmountFHA ()
    {
        return TotalEligibleAmountFHA;
    }

    public void setTotalEligibleAmountFHA (Number TotalEligibleAmountFHA)
    {
        this.TotalEligibleAmountFHA = TotalEligibleAmountFHA;
    }

    public Number getTotalEligibleAmountAgency ()
    {
        return TotalEligibleAmountAgency;
    }

    public void setTotalEligibleAmountAgency (Number TotalEligibleAmountAgency)
    {
        this.TotalEligibleAmountAgency = TotalEligibleAmountAgency;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [DebtPaymentsCollection = "+DebtPaymentsCollection+", " +
                "TotalEligibleAmountVA = "+TotalEligibleAmountVA+", " +
                "TotalEligibleAmountFHA = "+TotalEligibleAmountFHA+", " +
                "TotalEligibleAmountAgency = "+TotalEligibleAmountAgency+"]";
    }
}


