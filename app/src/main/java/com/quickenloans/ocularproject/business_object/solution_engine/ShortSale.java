package com.quickenloans.ocularproject.business_object.solution_engine;

public class ShortSale
{
    private boolean HasShortSaleHistory;

    private String ShortSaleHistoryDate;

    private int MonthsSinceLastShortSale;

    public boolean getHasShortSaleHistory ()
    {
        return HasShortSaleHistory;
    }

    public void setHasShortSaleHistory (boolean HasShortSaleHistory)
    {
        this.HasShortSaleHistory = HasShortSaleHistory;
    }

    public String getShortSaleHistoryDate ()
{
    return ShortSaleHistoryDate;
}

    public void setShortSaleHistoryDate (String ShortSaleHistoryDate)
    {
        this.ShortSaleHistoryDate = ShortSaleHistoryDate;
    }

    public int getMonthsSinceLastShortSale ()
{
    return MonthsSinceLastShortSale;
}

    public void setMonthsSinceLastShortSale (int MonthsSinceLastShortSale)
    {
        this.MonthsSinceLastShortSale = MonthsSinceLastShortSale;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [HasShortSaleHistory = "+HasShortSaleHistory+", " +
                "ShortSaleHistoryDate = "+ShortSaleHistoryDate+", " +
                "MonthsSinceLastShortSale = "+MonthsSinceLastShortSale+"]";
    }
}


