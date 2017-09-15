package com.quickenloans.ocularproject.business_object.solution_engine;

/**
 * Created by ctan on 8/31/17.
 */

public class Adjustments {

    private String AdjustmentName;

    private Number AdjustmentPoints;


    public String getAdjustmentName() {
        return AdjustmentName;
    }

    public void setAdjustmentName(String adjustmentName) {
        AdjustmentName = adjustmentName;
    }

    public Number getAdjustmentPoints() {
        return AdjustmentPoints;
    }

    public void setAdjustmentPoints(Number adjustmentPoints) {
        AdjustmentPoints = adjustmentPoints;
    }

    @Override
    public String toString() {
        return "ClassPojo [AdjustmentName = " + AdjustmentName + "," +
                " AdjustmentPoints = " + AdjustmentPoints + "]";
    }
}
