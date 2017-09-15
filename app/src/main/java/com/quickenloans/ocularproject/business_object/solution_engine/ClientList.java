package com.quickenloans.ocularproject.business_object.solution_engine;

public class ClientList
{
    private Assets Assets;

    private boolean HasRentalHistory;

    private DebtPayments DebtPayments;

    private boolean IsApplicable;

    private WorkNumberIncome WorkNumberIncome;

    private QualifyingEligibilityFactors QualifyingEligibilityFactors;

    private int MonthlyDebtPayments;

    private boolean IsFirstTimeHomeBuyer;

    private IncomeSources IncomeSources;

    private boolean IsQualifyingCreditScore;

    private String LivingSituation;

    private int CreditScore;

    private Number MonthlyChildcareExpenses;

    private String Id;

    private int MonthlyIncome;

    public Assets getAssets ()
{
    return Assets;
}

    public void setAssets (Assets Assets)
    {
        this.Assets = Assets;
    }

    public boolean getHasRentalHistory ()
    {
        return HasRentalHistory;
    }

    public void setHasRentalHistory (boolean HasRentalHistory)
    {
        this.HasRentalHistory = HasRentalHistory;
    }

    public DebtPayments getDebtPayments ()
    {
        return DebtPayments;
    }

    public void setDebtPayments (DebtPayments DebtPayments)
    {
        this.DebtPayments = DebtPayments;
    }

    public boolean getIsApplicable ()
    {
        return IsApplicable;
    }

    public void setIsApplicable (boolean IsApplicable)
    {
        this.IsApplicable = IsApplicable;
    }

    public WorkNumberIncome getWorkNumberIncome ()
{
    return WorkNumberIncome;
}

    public void setWorkNumberIncome (WorkNumberIncome WorkNumberIncome)
    {
        this.WorkNumberIncome = WorkNumberIncome;
    }

    public QualifyingEligibilityFactors getQualifyingEligibilityFactors ()
{
    return QualifyingEligibilityFactors;
}

    public void setQualifyingEligibilityFactors (QualifyingEligibilityFactors QualifyingEligibilityFactors)
    {
        this.QualifyingEligibilityFactors = QualifyingEligibilityFactors;
    }

    public int getMonthlyDebtPayments ()
    {
        return MonthlyDebtPayments;
    }

    public void setMonthlyDebtPayments (int MonthlyDebtPayments)
    {
        this.MonthlyDebtPayments = MonthlyDebtPayments;
    }

    public boolean getIsFirstTimeHomeBuyer ()
    {
        return IsFirstTimeHomeBuyer;
    }

    public void setIsFirstTimeHomeBuyer (boolean IsFirstTimeHomeBuyer)
    {
        this.IsFirstTimeHomeBuyer = IsFirstTimeHomeBuyer;
    }

    public IncomeSources getIncomeSources ()
    {
        return IncomeSources;
    }

    public void setIncomeSources (IncomeSources IncomeSources)
    {
        this.IncomeSources = IncomeSources;
    }

    public boolean getIsQualifyingCreditScore ()
    {
        return IsQualifyingCreditScore;
    }

    public void setIsQualifyingCreditScore (boolean IsQualifyingCreditScore)
    {
        this.IsQualifyingCreditScore = IsQualifyingCreditScore;
    }

    public String getLivingSituation ()
{
    return LivingSituation;
}

    public void setLivingSituation (String LivingSituation)
    {
        this.LivingSituation = LivingSituation;
    }

    public int getCreditScore ()
    {
        return CreditScore;
    }

    public void setCreditScore (int CreditScore)
    {
        this.CreditScore = CreditScore;
    }

    public Number getMonthlyChildcareExpenses ()
    {
        return MonthlyChildcareExpenses;
    }

    public void setMonthlyChildcareExpenses (Number MonthlyChildcareExpenses)
    {
        this.MonthlyChildcareExpenses = MonthlyChildcareExpenses;
    }

    public String getId ()
{
    return Id;
}

    public void setId (String Id)
    {
        this.Id = Id;
    }

    public int getMonthlyIncome ()
    {
        return MonthlyIncome;
    }

    public void setMonthlyIncome (int MonthlyIncome)
    {
        this.MonthlyIncome = MonthlyIncome;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Assets = "+Assets+", HasRentalHistory = "+HasRentalHistory+", DebtPayments = "+DebtPayments+", IsApplicable = "+IsApplicable+", WorkNumberIncome = "+WorkNumberIncome+", QualifyingEligibilityFactors = "+QualifyingEligibilityFactors+", MonthlyDebtPayments = "+MonthlyDebtPayments+", IsFirstTimeHomeBuyer = "+IsFirstTimeHomeBuyer+", IncomeSources = "+IncomeSources+", IsQualifyingCreditScore = "+IsQualifyingCreditScore+", LivingSituation = "+LivingSituation+", CreditScore = "+CreditScore+", MonthlyChildcareExpenses = "+MonthlyChildcareExpenses+", Id = "+Id+", MonthlyIncome = "+MonthlyIncome+"]";
    }
}


