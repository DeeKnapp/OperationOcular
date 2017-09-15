package com.quickenloans.ocularproject.business_object.solution_engine;

/**
 * Created by ctan on 8/30/17.
 */

public class Assets {

    private Number TotalBalance;

    private Number TotalDesiredAmountToApply;

    private Number TotalEligibleAmount;

    private Number TotalAmountToApply;

    private Number TotalEligibleAmountVA;

    private Number TotalAmountToApplyVA;

    private Number TotalEligibleAmountFHA;

    private Number TotalAmountToApplyFHA;

    private Number TotalAmountToApplyHARP;

    private AssetList[] AssetList;


    public Number getTotalBalance() {
        return TotalBalance;
    }

    public void setTotalBalance(Number TotalBalance) {
        this.TotalBalance = TotalBalance;
    }

    public Number getTotalDesiredAmountToApply() {
        return TotalDesiredAmountToApply;
    }

    public void setTotalDesiredAmountToApply(Number TotalDesiredAmountToApply) {
        this.TotalDesiredAmountToApply = TotalDesiredAmountToApply;
    }

    public Number getTotalEligibleAmount() {
        return TotalEligibleAmount;
    }

    public void setTotalEligibleAmount(Number TotalEligibleAmount) {
        this.TotalEligibleAmount = TotalEligibleAmount;
    }

    public Number getTotalAmountToApply() {
        return TotalAmountToApply;
    }

    public void setTotalAmountToApply(Number TotalAmountToApply) {
        this.TotalAmountToApply = TotalAmountToApply;
    }

    public Number getTotalEligibleAmountVA() {
        return TotalEligibleAmountVA;
    }

    public void setTotalEligibleAmountVA(Number TotalEligibleAmountVA) {
        this.TotalEligibleAmountVA = TotalEligibleAmountVA;
    }

    public Number getTotalAmountToApplyVA() {
        return TotalAmountToApplyVA;
    }

    public void setTotalAmountToApplyVA(Number TotalAmountToApplyVA) {
        this.TotalAmountToApplyVA = TotalAmountToApplyVA;
    }

    public Number getTotalEligibleAmountFHA() {
        return TotalEligibleAmountFHA;
    }

    public void setTotalEligibleAmountFHA(Number totalElTotalEligibleAmountFHAigibleAmountFHA) {
        this.TotalEligibleAmountFHA = TotalEligibleAmountFHA;
    }

    public Number getTotalAmountToApplyFHA() {
        return TotalAmountToApplyFHA;
    }

    public void setTotalAmountToApplyFHA(Number TotalAmountToApplyFHA) {
        this.TotalAmountToApplyFHA = TotalAmountToApplyFHA;
    }

    public Number getTotalAmountToApplyHARP() {
        return TotalAmountToApplyHARP;
    }

    public void setTotalAmountToApplyHARP(Number TotalAmountToApplyHARP) {
        this.TotalAmountToApplyHARP = TotalAmountToApplyHARP;
    }

    public com.quickenloans.ocularproject.business_object.solution_engine.AssetList[] getAssetList() {
        return AssetList;
    }

    public void setAssetList(AssetList[] AssetList) {
        this.AssetList = AssetList;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [TotalBalance = "+TotalBalance+"," +
                " TotalDesiredAmountToApply = "+TotalDesiredAmountToApply+"," +
                " TotalEligibleAmount = "+TotalEligibleAmount+"," +
                " TotalAmountToApply = "+TotalAmountToApply+"," +
                " TotalEligibleAmountVA = "+TotalEligibleAmountVA+"," +
                " TotalAmountToApplyVA = "+TotalAmountToApplyVA+"," +
                " TotalEligibleAmountFHA = "+TotalEligibleAmountFHA+"," +
                " TotalAmountToApplyFHA = "+TotalAmountToApplyFHA+"," +
                " TotalAmountToApplyHARP = "+TotalAmountToApplyHARP+"," +
                " AssetList = "+AssetList+"]";
    }
}
