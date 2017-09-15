package com.quickenloans.ocularproject.business_object.solution_engine;

/**
 * Created by ctan on 8/31/17.
 */

public class Payments {

    private Number Total;

    private Number Base;

    private Number Mi;

    private Number Rate;

    private int Duration;

    private int Period;

    public Number getTotal() {
        return Total;
    }

    public void setTotal(Number Total) {
        this.Total = Total;
    }

    public Number getBase() {
        return Base;
    }

    public void setBase(Number Base) {
        this.Base = Base;
    }

    public Number getMi() {
        return Mi;
    }

    public void setMi(Number Mi) {
        this.Mi = Mi;
    }

    public Number getRate() {
        return Rate;
    }

    public void setRate(Number Rate) {
        this.Rate = Rate;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int Duration) {
        this.Duration = Duration;
    }

    public int getPeriod() {
        return Period;
    }

    public void setPeriod(int Period) {
        this.Period = Period;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Total = "+Total+"," +
                " Base = "+Base+"," +
                " Mi = "+Mi+"," +
                " Rate = "+Rate+"," +
                " Duration = "+Duration+"," +
                " Period = "+Period+"]";
    }
}
