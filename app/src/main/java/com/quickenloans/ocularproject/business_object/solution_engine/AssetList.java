package com.quickenloans.ocularproject.business_object.solution_engine;

/**
 * Created by ctan on 8/30/17.
 */

public class AssetList {

    private String Id;

    private String AssetType;

    private Number Balance;

    private Number DesiredAmountToApply;

    private Number EligibleAmount;

    private Number EligibleAmountVA;

    private Number EligibleAmountFHA;

    private Number EligibleAmountHARP;

    private Number AmountToApply;

    private Number AmountToApplyVA;

    private Number AmountToApplyFHA;

    private Number AmountToApplyHARP;

    private String Comment;

    private boolean IsImported;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getAssetType() {
        return AssetType;
    }

    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    public Number getBalance() {
        return Balance;
    }

    public void setBalance(Number Balance) {
        this.Balance = Balance;
    }

    public Number getDesiredAmountToApply() {
        return DesiredAmountToApply;
    }

    public void setDesiredAmountToApply(Number DesiredAmountToApply) {
        this.DesiredAmountToApply = DesiredAmountToApply;
    }

    public Number getEligibleAmount() {
        return EligibleAmount;
    }

    public void setEligibleAmount(Number EligibleAmount) {
        this.EligibleAmount = EligibleAmount;
    }

    public Number getEligibleAmountVA() {
        return EligibleAmountVA;
    }

    public void setEligibleAmountVA(Number EligibleAmountVA) {
        this.EligibleAmountVA = EligibleAmountVA;
    }

    public Number getEligibleAmountFHA() {
        return EligibleAmountFHA;
    }

    public void setEligibleAmountFHA(Number EligibleAmountFHA) {
        this.EligibleAmountFHA = EligibleAmountFHA;
    }

    public Number getEligibleAmountHARP() {
        return EligibleAmountHARP;
    }

    public void setEligibleAmountHARP(Number EligibleAmountHARP) {
        this.EligibleAmountHARP = EligibleAmountHARP;
    }

    public Number getAmountToApply() {
        return AmountToApply;
    }

    public void setAmountToApply(Number AmountToApply) {
        this.AmountToApply = AmountToApply;
    }

    public Number getAmountToApplyVA() {
        return AmountToApplyVA;
    }

    public void setAmountToApplyVA(Number AmountToApplyVA) {
        this.AmountToApplyVA = AmountToApplyVA;
    }

    public Number getAmountToApplyFHA() {
        return AmountToApplyFHA;
    }

    public void setAmountToApplyFHA(Number AmountToApplyFHA) {
        this.AmountToApplyFHA = AmountToApplyFHA;
    }

    public Number getAmountToApplyHARP() {
        return AmountToApplyHARP;
    }

    public void setAmountToApplyHARP(Number AmountToApplyHARP) {
        this.AmountToApplyHARP = AmountToApplyHARP;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public boolean isImported() {
        return IsImported;
    }

    public void setImported(boolean IsImported) {
        this.IsImported = IsImported;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Id = "+Id+"," +
                " AssetType = "+AssetType+"," +
                " Balance = "+Balance+"," +
                " DesiredAmountToApply = "+DesiredAmountToApply+"," +
                " EligibleAmount = "+EligibleAmount+"," +
                " EligibleAmountVA = "+EligibleAmountVA+"," +
                " EligibleAmountFHA = "+EligibleAmountFHA+"," +
                " EligibleAmountHARP = "+EligibleAmountHARP+"," +
                " AmountToApply = "+AmountToApply+"," +
                " AmountToApplyVA = "+AmountToApplyVA+"," +
                " AmountToApplyFHA = "+AmountToApplyFHA+"," +
                " AmountToApplyHARP = "+AmountToApplyHARP+"," +
                " Comment = "+Comment+"," +
                " IsImported = "+IsImported+"]";
    }


}
