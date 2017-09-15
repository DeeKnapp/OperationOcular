package com.quickenloans.ocularproject.business_object.solution_engine;

/**
 * Created by ctan on 8/31/17.
 */

public class ProductsAndPricingSets {

    private String Group;

    private String AmortizationType;

    private String LoanPurposeGoalRecommended;

    private Number MaxCashoutLTV;

    private Number RecommendedCashoutAmount;

    private String Status;

    private LoanProducts[] LoanProducts;

    private QualifyingFailureReasons[] QualifyingFailureReasons;

    private boolean AreLiensSubordinated;

    private boolean IsEscrowWaived;

    private String RecommendationModel;

    public String getGroup() {
        return Group;
    }

    public void setGroup(String Group) {
        this.Group = Group;
    }

    public String getAmortizationType() {
        return AmortizationType;
    }

    public void setAmortizationType(String AmortizationType) {
        this.AmortizationType = AmortizationType;
    }

    public String getLoanPurposeGoalRecommended() {
        return LoanPurposeGoalRecommended;
    }

    public void setLoanPurposeGoalRecommended(String LoanPurposeGoalRecommended) {
        this.LoanPurposeGoalRecommended = LoanPurposeGoalRecommended;
    }

    public Number getMaxCashoutLTV() {
        return MaxCashoutLTV;
    }

    public void setMaxCashoutLTV(Number MaxCashoutLTV) {
        this.MaxCashoutLTV = MaxCashoutLTV;
    }

    public Number getRecommendedCashoutAmount() {
        return RecommendedCashoutAmount;
    }

    public void setRecommendedCashoutAmount(Number RecommendedCashoutAmount) {
        this.RecommendedCashoutAmount = RecommendedCashoutAmount;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public com.quickenloans.ocularproject.business_object.solution_engine.LoanProducts[] getLoanProducts() {
        return LoanProducts;
    }

    public void setLoanProducts(LoanProducts[] LoanProducts) {
        this.LoanProducts = LoanProducts;
    }

    public com.quickenloans.ocularproject.business_object.solution_engine.QualifyingFailureReasons[] getQualifyingFailureReasons() {
        return QualifyingFailureReasons;
    }

    public void setQualifyingFailureReasons(QualifyingFailureReasons[] QualifyingFailureReasons) {
        this.QualifyingFailureReasons = QualifyingFailureReasons;
    }

    public boolean isAreLiensSubordinated() {
        return AreLiensSubordinated;
    }

    public void setAreLiensSubordinated(boolean AreLiensSubordinated) {
        this.AreLiensSubordinated = AreLiensSubordinated;
    }

    public boolean isEscrowWaived() {
        return IsEscrowWaived;
    }

    public void setEscrowWaived(boolean IsEscrowWaived) {
        this.IsEscrowWaived = IsEscrowWaived;
    }

    public String getRecommendationModel() {
        return RecommendationModel;
    }

    public void setRecommendationModel(String RecommendationModel) {
        this.RecommendationModel = RecommendationModel;
    }
}
