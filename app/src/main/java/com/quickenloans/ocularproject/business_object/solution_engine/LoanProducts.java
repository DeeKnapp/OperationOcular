package com.quickenloans.ocularproject.business_object.solution_engine;

public class LoanProducts
{
    private PricingOptions[] PricingOptions;

    private String AmortizationType;

    private String ProductCode;

    private boolean IsRecommended;

    private boolean IsApplicable;

    private String OriginalProductDescription;

    private String[] DisclaimerTemplates;

    private Eligibility Eligibility;

    private int Term;

    private int RecommendationPriority;

    private String ProductGroupType;

    private Disclaimers[] Disclaimers;

    private String MIType;

    private boolean IsSelected;

    private int TermDifference;

    private String ProductDescription;

    private ARMInfo ARMInfo;

    private String ProductName;

    private int AmortizationTerm;

    private Number FinalMIRate;

    private Number ReserveAmount;

    private Number MaintenanceAndUtilityExpenses;

    private Number TaxWithholdings;

    private String DocumentationType;

    private int DaysUntilEndOfMonth;

    private boolean Tx50a6;

    private Number UndiscountedBasePoints;

    private Number UndiscountedBaseRate;

    private String[] Tags;

    public PricingOptions[] getPricingOptions ()
    {
        return PricingOptions;
    }

    public void setPricingOptions (PricingOptions[] PricingOptions)
    {
        this.PricingOptions = PricingOptions;
    }

    public String getAmortizationType ()
    {
        return AmortizationType;
    }

    public void setAmortizationType (String AmortizationType)
    {
        this.AmortizationType = AmortizationType;
    }

    public String getProductCode ()
    {
        return ProductCode;
    }

    public void setProductCode (String ProductCode)
    {
        this.ProductCode = ProductCode;
    }

    public boolean getIsRecommended ()
    {
        return IsRecommended;
    }

    public void setIsRecommended (boolean IsRecommended)
    {
        this.IsRecommended = IsRecommended;
    }

    public boolean getIsApplicable ()
    {
        return IsApplicable;
    }

    public void setIsApplicable (boolean IsApplicable)
    {
        this.IsApplicable = IsApplicable;
    }

    public String getOriginalProductDescription ()
    {
        return OriginalProductDescription;
    }

    public void setOriginalProductDescription (String OriginalProductDescription)
    {
        this.OriginalProductDescription = OriginalProductDescription;
    }

    public String[] getDisclaimerTemplates ()
    {
        return DisclaimerTemplates;
    }

    public void setDisclaimerTemplates (String[] DisclaimerTemplates)
    {
        this.DisclaimerTemplates = DisclaimerTemplates;
    }

    public Eligibility getEligibility ()
    {
        return Eligibility;
    }

    public void setEligibility (Eligibility Eligibility)
    {
        this.Eligibility = Eligibility;
    }

    public int getTerm ()
    {
        return Term;
    }

    public void setTerm (int Term)
    {
        this.Term = Term;
    }

    public int getRecommendationPriority ()
    {
        return RecommendationPriority;
    }

    public void setRecommendationPriority (int RecommendationPriority)
    {
        this.RecommendationPriority = RecommendationPriority;
    }

    public String getProductGroupType ()
    {
        return ProductGroupType;
    }

    public void setProductGroupType (String ProductGroupType)
    {
        this.ProductGroupType = ProductGroupType;
    }

    public Disclaimers[] getDisclaimers ()
    {
        return Disclaimers;
    }

    public void setDisclaimers (Disclaimers[] Disclaimers)
    {
        this.Disclaimers = Disclaimers;
    }

    public String getMIType ()
    {
        return MIType;
    }

    public void setMIType (String MIType)
    {
        this.MIType = MIType;
    }

    public boolean getIsSelected ()
    {
        return IsSelected;
    }

    public void setIsSelected (boolean IsSelected)
    {
        this.IsSelected = IsSelected;
    }

    public int getTermDifference ()
    {
        return TermDifference;
    }

    public void setTermDifference (int TermDifference)
    {
        this.TermDifference = TermDifference;
    }

    public String getProductDescription ()
    {
        return ProductDescription;
    }

    public void setProductDescription (String ProductDescription)
    {
        this.ProductDescription = ProductDescription;
    }

    public ARMInfo getARMInfo ()
{
    return ARMInfo;
}

    public void setARMInfo (ARMInfo ARMInfo)
    {
        this.ARMInfo = ARMInfo;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [PricingOptions = "+PricingOptions+", " +
                "AmortizationType = "+AmortizationType+", " +
                "ProductCode = "+ProductCode+", " +
                "IsRecommended = "+IsRecommended+", " +
                "IsApplicable = "+IsApplicable+", " +
                "OriginalProductDescription = "+OriginalProductDescription+", " +
                "DisclaimerTemplates = "+DisclaimerTemplates+", " +
                "Eligibility = "+Eligibility+", " +
                "Term = "+Term+", " +
                "RecommendationPriority = "+RecommendationPriority+", " +
                "ProductGroupType = "+ProductGroupType+", " +
                "Disclaimers = "+Disclaimers+", " +
                "MIType = "+MIType+", " +
                "IsSelected = "+IsSelected+", " +
                "TermDifference = "+TermDifference+", " +
                "ProductDescription = "+ProductDescription+", " +
                "ARMInfo = "+ARMInfo+"]";
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public int getAmortizationTerm() {
        return AmortizationTerm;
    }

    public void setAmortizationTerm(int AmortizationTerm) {
        this.AmortizationTerm = AmortizationTerm;
    }

    public Number getFinalMIRate() {
        return FinalMIRate;
    }

    public void setFinalMIRate(Number FinalMIRate) {
        this.FinalMIRate = FinalMIRate;
    }

    public Number getReserveAmount() {
        return ReserveAmount;
    }

    public void setReserveAmount(Number ReserveAmount) {
        this.ReserveAmount = ReserveAmount;
    }

    public Number getMaintenanceAndUtilityExpenses() {
        return MaintenanceAndUtilityExpenses;
    }

    public void setMaintenanceAndUtilityExpenses(Number MaintenanceAndUtilityExpenses) {
        this.MaintenanceAndUtilityExpenses = MaintenanceAndUtilityExpenses;
    }

    public Number getTaxWithholdings() {
        return TaxWithholdings;
    }

    public void setTaxWithholdings(Number TaxWithholdings) {
        this.TaxWithholdings = TaxWithholdings;
    }

    public String getDocumentationType() {
        return DocumentationType;
    }

    public void setDocumentationType(String DocumentationType) {
        this.DocumentationType = DocumentationType;
    }

    public int getDaysUntilEndOfMonth() {
        return DaysUntilEndOfMonth;
    }

    public void setDaysUntilEndOfMonth(int DaysUntilEndOfMonth) {
        this.DaysUntilEndOfMonth = DaysUntilEndOfMonth;
    }

    public boolean isTx50a6() {
        return Tx50a6;
    }

    public void setTx50a6(boolean Tx50a6) {
        this.Tx50a6 = Tx50a6;
    }

    public Number getUndiscountedBasePoints() {
        return UndiscountedBasePoints;
    }

    public void setUndiscountedBasePoints(Number UndiscountedBasePoints) {
        this.UndiscountedBasePoints = UndiscountedBasePoints;
    }

    public Number getUndiscountedBaseRate() {
        return UndiscountedBaseRate;
    }

    public void setUndiscountedBaseRate(Number UndiscountedBaseRate) {
        this.UndiscountedBaseRate = UndiscountedBaseRate;
    }

    public String[] getTags() {
        return Tags;
    }

    public void setTags(String[] Tags) {
        this.Tags = Tags;
    }

    public class ARMInfo {

        private int InitialAdjustmentPeriod;

        private Number LifetimeRateCap;

        private Number YearlyAdjustmentCap;

        private Number FirstYearRateCap;

        private Number ARMIndex;

        private Number ARMMargin;

        private String IndexName;

        private int YearlyAdjustmentPeriod;

        private Number InterestRateRoundingPercent;

        private String InterestRateroundingType;

        private int LifetimeCeiling;

        public int getInitialAdjustmentPeriod() {
            return InitialAdjustmentPeriod;
        }

        public void setInitialAdjustmentPeriod(int InitialAdjustmentPeriod) {
            this.InitialAdjustmentPeriod = InitialAdjustmentPeriod;
        }

        public Number getLifetimeRateCap() {
            return LifetimeRateCap;
        }

        public void setLifetimeRateCap(Number LifetimeRateCap) {
            this.LifetimeRateCap = LifetimeRateCap;
        }

        public Number getYearlyAdjustmentCap() {
            return YearlyAdjustmentCap;
        }

        public void setYearlyAdjustmentCap(Number YearlyAdjustmentCap) {
            this.YearlyAdjustmentCap = YearlyAdjustmentCap;
        }

        public Number getFirstYearRateCap() {
            return FirstYearRateCap;
        }

        public void setFirstYearRateCap(Number FirstYearRateCap) {
            this.FirstYearRateCap = FirstYearRateCap;
        }

        public Number getARMIndex() {
            return ARMIndex;
        }

        public void setARMIndex(Number ARMIndex) {
            this.ARMIndex = ARMIndex;
        }

        public Number getARMMargin() {
            return ARMMargin;
        }

        public void setARMMargin(Number ARMMargin) {
            this.ARMMargin = ARMMargin;
        }

        public String getIndexName() {
            return IndexName;
        }

        public void setIndexName(String IndexName) {
            this.IndexName = IndexName;
        }

        public int getYearlyAdjustmentPeriod() {
            return YearlyAdjustmentPeriod;
        }

        public void setYearlyAdjustmentPeriod(int YearlyAdjustmentPeriod) {
            this.YearlyAdjustmentPeriod = YearlyAdjustmentPeriod;
        }

        public Number getInterestRateRoundingPercent() {
            return InterestRateRoundingPercent;
        }

        public void setInterestRateRoundingPercent(Number InterestRateRoundingPercent) {
            this.InterestRateRoundingPercent = InterestRateRoundingPercent;
        }

        public String getInterestRateroundingType() {
            return InterestRateroundingType;
        }

        public void setInterestRateroundingType(String InterestRateroundingType) {
            this.InterestRateroundingType = InterestRateroundingType;
        }

        public int getLifetimeCeiling() {
            return LifetimeCeiling;
        }

        public void setLifetimeCeiling(int LifetimeCeiling) {
            this.LifetimeCeiling = LifetimeCeiling;
        }
    }
}

