package com.quickenloans.ocularproject.business_object.zestimate;

/**
 * Created by dknapp on 7/28/17.
 */

public class ValuationRange
{
    private High high;

    private Low low;

    public High getHigh ()
    {
        return high;
    }

    public void setHigh (High high)
    {
        this.high = high;
    }

    public Low getLow ()
    {
        return low;
    }

    public void setLow (Low low)
    {
        this.low = low;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [high = "+high+", low = "+low+"]";
    }
}
