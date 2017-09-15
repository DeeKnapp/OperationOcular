package com.quickenloans.ocularproject.business_object.solution_engine;

public class Foreclosure
{
    private boolean HasForeclosure;

    private String DateOfLastForeclosure;

    private int MonthsSinceLastForeclosure;

    public boolean getHasForeclosure ()
    {
        return HasForeclosure;
    }

    public void setHasForeclosure (boolean HasForeclosure)
    {
        this.HasForeclosure = HasForeclosure;
    }

    public String getDateOfLastForeclosure ()
{
    return DateOfLastForeclosure;
}

    public void setDateOfLastForeclosure (String DateOfLastForeclosure)
    {
        this.DateOfLastForeclosure = DateOfLastForeclosure;
    }

    public int getMonthsSinceLastForeclosure ()
{
    return MonthsSinceLastForeclosure;
}

    public void setMonthsSinceLastForeclosure (int MonthsSinceLastForeclosure)
    {
        this.MonthsSinceLastForeclosure = MonthsSinceLastForeclosure;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [HasForeclosure = "+HasForeclosure+", " +
                "DateOfLastForeclosure = "+DateOfLastForeclosure+", " +
                "MonthsSinceLastForeclosure = "+MonthsSinceLastForeclosure+"]";
    }
}


