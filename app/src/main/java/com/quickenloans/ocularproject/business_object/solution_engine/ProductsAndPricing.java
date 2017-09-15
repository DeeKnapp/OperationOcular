package com.quickenloans.ocularproject.business_object.solution_engine;

public class ProductsAndPricing
{
    private String Status;

    private boolean AreLiensSubordinated;

    private String AmortizationType;

    private LoanProducts[] LoanProducts;

    private String LoanPurposeGoalRecommended;

    private boolean IsEscrowWaived;

    private QualifyingFailureReasons[] QualifyingFailureReasons;

    private Number RecommendedCashoutAmount;

    private Number MaxCashoutLTV;

    private String Group;

    private String RecommendationModel;

    public String getStatus ()
{
    return Status;
}

    public void setStatus (String Status)
    {
        this.Status = Status;
    }

    public boolean getAreLiensSubordinated ()
    {
        return AreLiensSubordinated;
    }

    public void setAreLiensSubordinated (boolean AreLiensSubordinated)
    {
        this.AreLiensSubordinated = AreLiensSubordinated;
    }

    public String getAmortizationType ()
{
    return AmortizationType;
}

    public void setAmortizationType (String AmortizationType)
    {
        this.AmortizationType = AmortizationType;
    }

    public LoanProducts[] getLoanProducts ()
    {
        return LoanProducts;
    }

    public void setLoanProducts (LoanProducts[] LoanProducts)
    {
        this.LoanProducts = LoanProducts;
    }

    public String getLoanPurposeGoalRecommended ()
{
    return LoanPurposeGoalRecommended;
}

    public void setLoanPurposeGoalRecommended (String LoanPurposeGoalRecommended)
    {
        this.LoanPurposeGoalRecommended = LoanPurposeGoalRecommended;
    }

    public boolean getIsEscrowWaived ()
    {
        return IsEscrowWaived;
    }

    public void setIsEscrowWaived (boolean IsEscrowWaived)
    {
        this.IsEscrowWaived = IsEscrowWaived;
    }

    public QualifyingFailureReasons[] getQualifyingFailureReasons ()
    {
        return QualifyingFailureReasons;
    }

    public void setQualifyingFailureReasons (QualifyingFailureReasons[] QualifyingFailureReasons)
    {
        this.QualifyingFailureReasons = QualifyingFailureReasons;
    }

    public Number getRecommendedCashoutAmount ()
    {
        return RecommendedCashoutAmount;
    }

    public void setRecommendedCashoutAmount (Number RecommendedCashoutAmount)
    {
        this.RecommendedCashoutAmount = RecommendedCashoutAmount;
    }

    public Number getMaxCashoutLTV ()
    {
        return MaxCashoutLTV;
    }

    public void setMaxCashoutLTV (Number MaxCashoutLTV)
    {
        this.MaxCashoutLTV = MaxCashoutLTV;
    }

    public String getGroup ()
{
    return Group;
}

    public void setGroup (String Group)
    {
        this.Group = Group;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Status = "+Status+", " +
                "AreLiensSubordinated = "+AreLiensSubordinated+", " +
                "AmortizationType = "+AmortizationType+", " +
                "LoanProducts = "+LoanProducts+", " +
                "LoanPurposeGoalRecommended = "+LoanPurposeGoalRecommended+", " +
                "IsEscrowWaived = "+IsEscrowWaived+", " +
                "QualifyingFailureReasons = "+QualifyingFailureReasons+", " +
                "RecommendedCashoutAmount = "+RecommendedCashoutAmount+", " +
                "MaxCashoutLTV = "+MaxCashoutLTV+", " +
                "Group = "+Group+"]";
    }

    public String getRecommendationModel() {
        return RecommendationModel;
    }

    public void setRecommendationModel(String RecommendationModel) {
        this.RecommendationModel = RecommendationModel;
    }
}


