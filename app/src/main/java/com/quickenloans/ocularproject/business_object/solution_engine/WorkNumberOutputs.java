package com.quickenloans.ocularproject.business_object.solution_engine;

/**
 * Created by ctan on 8/30/17.
 */

public class WorkNumberOutputs {

    private String Id;

    private Number BaseAmount;

    private Number URBEsAmount;

    private Number BonusAmount;

    private Number OvertimeAmount;

    private Number CommissionAmount;

    private Number AdjustedBaseAmount;

    private Number TotalEligibleIncome;


    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public Number getBaseAmount() {
        return BaseAmount;
    }

    public void setBaseAmount(Number BaseAmount) {
        this.BaseAmount = BaseAmount;
    }

    public Number getURBEsAmount() {
        return URBEsAmount;
    }

    public void setURBEsAmount(Number URBEsAmount) {
        this.URBEsAmount = URBEsAmount;
    }

    public Number getBonusAmount() {
        return BonusAmount;
    }

    public void setBonusAmount(Number BonusAmount) {
        this.BonusAmount = BonusAmount;
    }

    public Number getOvertimeAmount() {
        return OvertimeAmount;
    }

    public void setOvertimeAmount(Number OvertimeAmount) {
        this.OvertimeAmount = OvertimeAmount;
    }

    public Number getCommissionAmount() {
        return CommissionAmount;
    }

    public void setCommissionAmount(Number CommissionAmount) {
        this.CommissionAmount = CommissionAmount;
    }

    public Number getAdjustedBaseAmount() {
        return AdjustedBaseAmount;
    }

    public void setAdjustedBaseAmount(Number AdjustedBaseAmount) {
        this.AdjustedBaseAmount = AdjustedBaseAmount;
    }

    public Number getTotalEligibleIncome() {
        return TotalEligibleIncome;
    }

    public void setTotalEligibleIncome(Number TotalEligibleIncome) {
        this.TotalEligibleIncome = TotalEligibleIncome;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Id = "+Id+", " +
                "BaseAmount = "+BaseAmount+", " +
                "URBEsAmount = "+URBEsAmount+", " +
                "BonusAmount = "+BonusAmount+", " +
                "OvertimeAmount = "+OvertimeAmount+", " +
                "CommissionAmount = "+CommissionAmount+", " +
                "AdjustedBaseAmount = "+AdjustedBaseAmount+", " +
                "TotalEligibleIncome = "+TotalEligibleIncome+"]";
    }
}
