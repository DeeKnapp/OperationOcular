package com.quickenloans.ocularproject.business_object.solution_engine;

public class MortgageLate
{
    private int ThirtyDayMtgLatesInLast24Months;

    private int NinetyDayMtgLatesInLast24Months;

    private int SixtyDayMtgLatesInLast24Months;

    private int ThirtyDayMtgLatesInLast12Months;

    private int SixtyDayMtgLatesInLast12Months;

    private int NinetyDayMtgLatesInLast12Months;

    public int getThirtyDayMtgLatesInLast24Months ()
    {
        return ThirtyDayMtgLatesInLast24Months;
    }

    public void setThirtyDayMtgLatesInLast24Months (int ThirtyDayMtgLatesInLast24Months)
    {
        this.ThirtyDayMtgLatesInLast24Months = ThirtyDayMtgLatesInLast24Months;
    }

    public int getNinetyDayMtgLatesInLast24Months ()
    {
        return NinetyDayMtgLatesInLast24Months;
    }

    public void setNinetyDayMtgLatesInLast24Months (int NinetyDayMtgLatesInLast24Months)
    {
        this.NinetyDayMtgLatesInLast24Months = NinetyDayMtgLatesInLast24Months;
    }

    public int getSixtyDayMtgLatesInLast24Months ()
    {
        return SixtyDayMtgLatesInLast24Months;
    }

    public void setSixtyDayMtgLatesInLast24Months (int SixtyDayMtgLatesInLast24Months)
    {
        this.SixtyDayMtgLatesInLast24Months = SixtyDayMtgLatesInLast24Months;
    }

    public int getThirtyDayMtgLatesInLast12Months ()
    {
        return ThirtyDayMtgLatesInLast12Months;
    }

    public void setThirtyDayMtgLatesInLast12Months (int ThirtyDayMtgLatesInLast12Months)
    {
        this.ThirtyDayMtgLatesInLast12Months = ThirtyDayMtgLatesInLast12Months;
    }

    public int getSixtyDayMtgLatesInLast12Months ()
    {
        return SixtyDayMtgLatesInLast12Months;
    }

    public void setSixtyDayMtgLatesInLast12Months (int SixtyDayMtgLatesInLast12Months)
    {
        this.SixtyDayMtgLatesInLast12Months = SixtyDayMtgLatesInLast12Months;
    }

    public int getNinetyDayMtgLatesInLast12Months ()
    {
        return NinetyDayMtgLatesInLast12Months;
    }

    public void setNinetyDayMtgLatesInLast12Months (int NinetyDayMtgLatesInLast12Months)
    {
        this.NinetyDayMtgLatesInLast12Months = NinetyDayMtgLatesInLast12Months;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ThirtyDayMtgLatesInLast24Months = "+ThirtyDayMtgLatesInLast24Months+", " +
                "NinetyDayMtgLatesInLast24Months = "+NinetyDayMtgLatesInLast24Months+", " +
                "SixtyDayMtgLatesInLast24Months = "+SixtyDayMtgLatesInLast24Months+", " +
                "ThirtyDayMtgLatesInLast12Months = "+ThirtyDayMtgLatesInLast12Months+", " +
                "SixtyDayMtgLatesInLast12Months = "+SixtyDayMtgLatesInLast12Months+", " +
                "NinetyDayMtgLatesInLast12Months = "+NinetyDayMtgLatesInLast12Months+"]";
    }
}


