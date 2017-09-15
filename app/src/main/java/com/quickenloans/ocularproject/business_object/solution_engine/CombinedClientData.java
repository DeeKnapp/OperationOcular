package com.quickenloans.ocularproject.business_object.solution_engine;

public class CombinedClientData
{
    private int NumberOfOpenTradelines;

    private Number MonthlyDebtPaymentsAgency;

    private Number MonthlyDebtPaymentsVA;

    private Number MonthlyDebtPaymentsFHA;

    public int getNumberOfOpenTradelines ()
    {
        return NumberOfOpenTradelines;
    }

    public void setNumberOfOpenTradelines (int NumberOfOpenTradelines)
    {
        this.NumberOfOpenTradelines = NumberOfOpenTradelines;
    }

    public Number getMonthlyDebtPaymentsAgency ()
    {
        return MonthlyDebtPaymentsAgency;
    }

    public void setMonthlyDebtPaymentsAgency (Number MonthlyDebtPaymentsAgency)
    {
        this.MonthlyDebtPaymentsAgency = MonthlyDebtPaymentsAgency;
    }

    public Number getMonthlyDebtPaymentsVA ()
    {
        return MonthlyDebtPaymentsVA;
    }

    public void setMonthlyDebtPaymentsVA (Number MonthlyDebtPaymentsVA)
    {
        this.MonthlyDebtPaymentsVA = MonthlyDebtPaymentsVA;
    }

    public Number getMonthlyDebtPaymentsFHA ()
    {
        return MonthlyDebtPaymentsFHA;
    }

    public void setMonthlyDebtPaymentsFHA (Number MonthlyDebtPaymentsFHA)
    {
        this.MonthlyDebtPaymentsFHA = MonthlyDebtPaymentsFHA;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [NumberOfOpenTradelines = "+NumberOfOpenTradelines+", " +
                "MonthlyDebtPaymentsAgency = "+MonthlyDebtPaymentsAgency+", " +
                "MonthlyDebtPaymentsVA = "+MonthlyDebtPaymentsVA+", " +
                "MonthlyDebtPaymentsFHA = "+MonthlyDebtPaymentsFHA+"]";
    }
}


