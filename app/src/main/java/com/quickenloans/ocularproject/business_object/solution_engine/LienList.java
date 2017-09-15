package com.quickenloans.ocularproject.business_object.solution_engine;

/**
 * Created by ctan on 8/31/17.
 */

public class LienList {

    private String Id;

    private String LienType;

    private boolean WasUsedForHomePurchase;

    private boolean IsSubordinated;

    private Number Balance;

    private int LienPosition;

    private Number HELOCMaxDraw;

    private String HELOCLastDrawDate;

    private boolean PayoffLien;

    private Number MonthlyPaymentAmount;

    private String AccountOpenedDate;

    private int RemainingTerm;

    private boolean EscrowsCurrentlyWaived;

    private boolean IsTexas50a6;

    private String GovernmentType;

    private boolean IsSubjectLien;

    private Number OriginalBalance;

    private int OriginalTerm;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getLienType() {
        return LienType;
    }

    public void setLienType(String LienType) {
        this.LienType = LienType;
    }

    public boolean isWasUsedForHomePurchase() {
        return WasUsedForHomePurchase;
    }

    public void setWasUsedForHomePurchase(boolean WasUsedForHomePurchase) {
        this.WasUsedForHomePurchase = WasUsedForHomePurchase;
    }

    public boolean isSubordinated() {
        return IsSubordinated;
    }

    public void setSubordinated(boolean IsSubordinated) {
        this.IsSubordinated = IsSubordinated;
    }

    public Number getBalance() {
        return Balance;
    }

    public void setBalance(Number Balance) {
        this.Balance = Balance;
    }

    public int getLienPosition() {
        return LienPosition;
    }

    public void setLienPosition(int LienPosition) {
        this.LienPosition = LienPosition;
    }

    public Number getHELOCMaxDraw() {
        return HELOCMaxDraw;
    }

    public void setHELOCMaxDraw(Number HELOCMaxDraw) {
        this.HELOCMaxDraw = HELOCMaxDraw;
    }

    public String getHELOCLastDrawDate() {
        return HELOCLastDrawDate;
    }

    public void setHELOCLastDrawDate(String HELOCLastDrawDate) {
        this.HELOCLastDrawDate = HELOCLastDrawDate;
    }

    public boolean isPayoffLien() {
        return PayoffLien;
    }

    public void setPayoffLien(boolean PayoffLien) {
        this.PayoffLien = PayoffLien;
    }

    public Number getMonthlyPaymentAmount() {
        return MonthlyPaymentAmount;
    }

    public void setMonthlyPaymentAmount(Number MonthlyPaymentAmount) {
        this.MonthlyPaymentAmount = MonthlyPaymentAmount;
    }

    public String getAccountOpenedDate() {
        return AccountOpenedDate;
    }

    public void setAccountOpenedDate(String AccountOpenedDate) {
        this.AccountOpenedDate = AccountOpenedDate;
    }

    public int getRemainingTerm() {
        return RemainingTerm;
    }

    public void setRemainingTerm(int RemainingTerm) {
        this.RemainingTerm = RemainingTerm;
    }

    public boolean isEscrowsCurrentlyWaived() {
        return EscrowsCurrentlyWaived;
    }

    public void setEscrowsCurrentlyWaived(boolean EscrowsCurrentlyWaived) {
        this.EscrowsCurrentlyWaived = EscrowsCurrentlyWaived;
    }

    public boolean isTexas50a6() {
        return IsTexas50a6;
    }

    public void setTexas50a6(boolean IsTexas50a6) {
        this.IsTexas50a6 = IsTexas50a6;
    }

    public String getGovernmentType() {
        return GovernmentType;
    }

    public void setGovernmentType(String GovernmentType) {
        this.GovernmentType = GovernmentType;
    }

    public boolean isSubjectLien() {
        return IsSubjectLien;
    }

    public void setSubjectLien(boolean IsSubjectLien) {
        this.IsSubjectLien = IsSubjectLien;
    }

    public Number getOriginalBalance() {
        return OriginalBalance;
    }

    public void setOriginalBalance(Number OriginalBalance) {
        this.OriginalBalance = OriginalBalance;
    }

    public int getOriginalTerm() {
        return OriginalTerm;
    }

    public void setOriginalTerm(int OriginalTerm) {
        this.OriginalTerm = OriginalTerm;
    }
}
