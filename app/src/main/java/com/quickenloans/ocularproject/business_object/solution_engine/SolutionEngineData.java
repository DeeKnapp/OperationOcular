package com.quickenloans.ocularproject.business_object.solution_engine;

public class SolutionEngineData
{
    private boolean IsLienSubordinationAllowed;

    private String LoanPurpose;

    private String CountyFIPS;

    private String PropertyType;

    private boolean IncludeAPRFeesInLoanAmount;

    private Number TotalClientStatedFunds;

    private String DocumentationDueDate;

    private int HomeValueAmount;

    private Number NewLoanBalanceAmount;

    private Scenarios Scenarios;

    private String LoanPurposeGoalRecommended;

    private int DownPaymentAmount;

    private String Address2;

    private String Address1;

    private int MonthlyIncome;

    private QualifyingFailureReasons[] QualifyingFailureReasons;

    private Number AnnualTaxAmount;

    private Number CurrentLoanBalanceAmount;

    private Liens Liens;

    private int NumberOfUnits;

    private Number PurchasePrice;

    private Number CurrentLoanPrincipleInterestMortgageInsuranceAmount;

    private String LoanPurposeGoalSelected;

    private LoanFeesList[] LoanFeesList;

    private boolean CalculateTaxProrations;

    private String PricingEngine;

    private ProductsAndPricingSets[] ProductsAndPricingSets;

    private String CurrentLoanAccountOpenedDate;

    private int MaxCashoutAvailableAmount;

    private int DaysUntilClosing;

    private Disclaimers[] Disclaimers;

    private boolean UseLoanEstimateValues;

    private VALoanInfo VALoanInfo;

    private SolutionOptions[] SolutionOptions;

    private Number AssetTotalDesiredAmountToApply;

    private Number AnnualInsuranceAmount;

    private int PropertySquareFootage;

    private Number CountyLimitVAAmount;

    private Number CountyLimitGovAmount;

    private EligibilityFactors EligibilityFactors;

    private Assets Assets;

    private Number CountyIncomeLimit;

    private Number SellerConcessionsAmount;

    private boolean IncludeNonAPRFeesInLoanAmount;

    private Integer DocumentationDueDays;

    private GiftFunds GiftFunds;

    private boolean HasPurchaseAgreement;

    private EstimatedPayoff EstimatedPayoff;

    private boolean AdjustCashoutByCountryLimit;

    private int LoanEstimateDaysPerdiem;

    private boolean ExistingQLClient;

    private boolean EstimatePayoff;

    private boolean IncludePrePaidsInLoanAmount;

    private Integer CurrentRemainingTerm;

    private String OccupancyType;

    private Number CountyLimitConvAmount;

    private Number TaxesDueAtClose;

    private Integer MonthlyDebtPayments;

    private AffordabilityCalculationFactors AffordabilityCalculationFactors;

    private String HOIEffectiveDate;

    private Integer CreditScore;

    private String Zip;

    private boolean WaiveEscrows;

    private ProductsAndPricing ProductsAndPricing;

    private String RequestedScenario;

    private Number CurrentLoanPaymentAmount;

    private boolean IncludePointsInLoanAmount;

    private SelectionTargets SelectionTargets;

    private ProductSelectionOptions ProductSelectionOptions;

    private Number DesiredCashoutAmount;

    private int FamilySize;

    private int RecommendedCashoutAmount;

    private DisclaimerTemplates[] DisclaimerTemplates;

    private String City;

    private boolean EscrowsCurrentlyWaived;

    private String County;

    private Clients Clients;

    private String State;

    private boolean IsTexas50a6;

    private String[] ProductRequestGroups;

    private int OriginalPurchasePrice;

    private String CurrentLoanGovernmentType;

    private TaxProrations TaxProrations;

    private ViableRules[] ViableRules;

    private PropertiesOwned[] PropertiesOwned;

    private Number TotalLienPayments;

    private Number TotalSubordinatedLienPayments;

    private Number TotalForcedSubordinatedLienPayments;

    private Notes[] Notes;

    private String LeadTypeCode;

    private Number TotalMonthlyRentalIncomeUsed;

    private String Channel;

    private String RecommendationModel;

    private Number CurrentLoanOriginalBalance;

    private int CurrentLoanOriginalTerm;

    private int CommitmentPeriod;

    private String UnderwritingSource;

    public boolean getIsLienSubordinationAllowed ()
    {
        return IsLienSubordinationAllowed;
    }

    public void setIsLienSubordinationAllowed (boolean IsLienSubordinationAllowed)
    {
        this.IsLienSubordinationAllowed = IsLienSubordinationAllowed;
    }

    public String getLoanPurpose ()
    {
        return LoanPurpose;
    }

    public void setLoanPurpose (String LoanPurpose)
    {
        this.LoanPurpose = LoanPurpose;
    }

    public String getCountyFIPS ()
    {
        return CountyFIPS;
    }

    public void setCountyFIPS (String CountyFIPS)
    {
        this.CountyFIPS = CountyFIPS;
    }

    public String getPropertyType ()
    {
        return PropertyType;
    }

    public void setPropertyType (String PropertyType)
    {
        this.PropertyType = PropertyType;
    }

    public boolean getIncludeAPRFeesInLoanAmount ()
    {
        return IncludeAPRFeesInLoanAmount;
    }

    public void setIncludeAPRFeesInLoanAmount (boolean IncludeAPRFeesInLoanAmount)
    {
        this.IncludeAPRFeesInLoanAmount = IncludeAPRFeesInLoanAmount;
    }

    public Number getTotalClientStatedFunds ()
    {
        return TotalClientStatedFunds;
    }

    public void setTotalClientStatedFunds (Number TotalClientStatedFunds)
    {
        this.TotalClientStatedFunds = TotalClientStatedFunds;
    }

    public String getDocumentationDueDate ()
    {
        return DocumentationDueDate;
    }

    public void setDocumentationDueDate (String DocumentationDueDate)
    {
        this.DocumentationDueDate = DocumentationDueDate;
    }

    public int getHomeValueAmount ()
    {
        return HomeValueAmount;
    }

    public void setHomeValueAmount (int HomeValueAmount)
    {
        this.HomeValueAmount = HomeValueAmount;
    }

    public Number getNewLoanBalanceAmount ()
    {
        return NewLoanBalanceAmount;
    }

    public void setNewLoanBalanceAmount (Number NewLoanBalanceAmount)
    {
        this.NewLoanBalanceAmount = NewLoanBalanceAmount;
    }

    public Scenarios getScenarios ()
    {
        return Scenarios;
    }

    public void setScenarios (Scenarios Scenarios)
    {
        this.Scenarios = Scenarios;
    }

    public String getLoanPurposeGoalRecommended ()
    {
        return LoanPurposeGoalRecommended;
    }

    public void setLoanPurposeGoalRecommended (String LoanPurposeGoalRecommended)
    {
        this.LoanPurposeGoalRecommended = LoanPurposeGoalRecommended;
    }

    public int getDownPaymentAmount ()
    {
        return DownPaymentAmount;
    }

    public void setDownPaymentAmount (int DownPaymentAmount)
    {
        this.DownPaymentAmount = DownPaymentAmount;
    }

    public String getAddress2 ()
    {
        return Address2;
    }

    public void setAddress2 (String Address2)
    {
        this.Address2 = Address2;
    }

    public String getAddress1 ()
{
    return Address1;
}

    public void setAddress1 (String Address1)
    {
        this.Address1 = Address1;
    }

    public int getMonthlyIncome ()
    {
        return MonthlyIncome;
    }

    public void setMonthlyIncome (int MonthlyIncome)
    {
        this.MonthlyIncome = MonthlyIncome;
    }

    public QualifyingFailureReasons[] getQualifyingFailureReasons ()
    {
        return QualifyingFailureReasons;
    }

    public void setQualifyingFailureReasons (QualifyingFailureReasons[] QualifyingFailureReasons)
    {
        this.QualifyingFailureReasons = QualifyingFailureReasons;
    }

    public Number getAnnualTaxAmount ()
    {
        return AnnualTaxAmount;
    }

    public void setAnnualTaxAmount (Number AnnualTaxAmount)
    {
        this.AnnualTaxAmount = AnnualTaxAmount;
    }

    public Number getCurrentLoanBalanceAmount ()
    {
        return CurrentLoanBalanceAmount;
    }

    public void setCurrentLoanBalanceAmount (Number CurrentLoanBalanceAmount)
    {
        this.CurrentLoanBalanceAmount = CurrentLoanBalanceAmount;
    }

    public Liens getLiens ()
    {
        return Liens;
    }

    public void setLiens (Liens Liens)
    {
        this.Liens = Liens;
    }

    public int getNumberOfUnits ()
    {
        return NumberOfUnits;
    }

    public void setNumberOfUnits (int NumberOfUnits)
    {
        this.NumberOfUnits = NumberOfUnits;
    }

    public Number getPurchasePrice ()
    {
        return PurchasePrice;
    }

    public void setPurchasePrice (Number PurchasePrice)
    {
        this.PurchasePrice = PurchasePrice;
    }

    public Number getCurrentLoanPrincipleInterestMortgageInsuranceAmount ()
    {
        return CurrentLoanPrincipleInterestMortgageInsuranceAmount;
    }

    public void setCurrentLoanPrincipleInterestMortgageInsuranceAmount (Number CurrentLoanPrincipleInterestMortgageInsuranceAmount)
    {
        this.CurrentLoanPrincipleInterestMortgageInsuranceAmount = CurrentLoanPrincipleInterestMortgageInsuranceAmount;
    }

    public String getLoanPurposeGoalSelected ()
    {
        return LoanPurposeGoalSelected;
    }

    public void setLoanPurposeGoalSelected (String LoanPurposeGoalSelected)
    {
        this.LoanPurposeGoalSelected = LoanPurposeGoalSelected;
    }

    public LoanFeesList[] getLoanFeesList ()
    {
        return LoanFeesList;
    }

    public void setLoanFeesList (LoanFeesList[] LoanFeesList)
    {
        this.LoanFeesList = LoanFeesList;
    }

    public boolean getCalculateTaxProrations ()
    {
        return CalculateTaxProrations;
    }

    public void setCalculateTaxProrations (boolean CalculateTaxProrations)
    {
        this.CalculateTaxProrations = CalculateTaxProrations;
    }

    public String getPricingEngine ()
    {
        return PricingEngine;
    }

    public void setPricingEngine (String PricingEngine)
    {
        this.PricingEngine = PricingEngine;
    }

    public ProductsAndPricingSets[] getProductsAndPricingSets ()
    {
        return ProductsAndPricingSets;
    }

    public void setProductsAndPricingSets (ProductsAndPricingSets[] ProductsAndPricingSets)
    {
        this.ProductsAndPricingSets = ProductsAndPricingSets;
    }

    public String getCurrentLoanAccountOpenedDate ()
    {
        return CurrentLoanAccountOpenedDate;
    }

    public void setCurrentLoanAccountOpenedDate (String CurrentLoanAccountOpenedDate)
    {
        this.CurrentLoanAccountOpenedDate = CurrentLoanAccountOpenedDate;
    }

    public int getMaxCashoutAvailableAmount ()
    {
        return MaxCashoutAvailableAmount;
    }

    public void setMaxCashoutAvailableAmount (int MaxCashoutAvailableAmount)
    {
        this.MaxCashoutAvailableAmount = MaxCashoutAvailableAmount;
    }

    public int getDaysUntilClosing ()
    {
        return DaysUntilClosing;
    }

    public void setDaysUntilClosing (int DaysUntilClosing)
    {
        this.DaysUntilClosing = DaysUntilClosing;
    }

    public Disclaimers[] getDisclaimers ()
    {
        return Disclaimers;
    }

    public void setDisclaimers (Disclaimers[] Disclaimers)
    {
        this.Disclaimers = Disclaimers;
    }

    public boolean getUseLoanEstimateValues ()
    {
        return UseLoanEstimateValues;
    }

    public void setUseLoanEstimateValues (boolean UseLoanEstimateValues)
    {
        this.UseLoanEstimateValues = UseLoanEstimateValues;
    }

    public VALoanInfo getVALoanInfo ()
    {
        return VALoanInfo;
    }

    public void setVALoanInfo (VALoanInfo VALoanInfo)
    {
        this.VALoanInfo = VALoanInfo;
    }

    public SolutionOptions[] getSolutionOptions ()
    {
        return SolutionOptions;
    }

    public void setSolutionOptions (SolutionOptions[] SolutionOptions)
    {
        this.SolutionOptions = SolutionOptions;
    }

    public Number getAssetTotalDesiredAmountToApply ()
    {
        return AssetTotalDesiredAmountToApply;
    }

    public void setAssetTotalDesiredAmountToApply (Number AssetTotalDesiredAmountToApply)
    {
        this.AssetTotalDesiredAmountToApply = AssetTotalDesiredAmountToApply;
    }

    public Number getAnnualInsuranceAmount ()
    {
        return AnnualInsuranceAmount;
    }

    public void setAnnualInsuranceAmount (Number AnnualInsuranceAmount)
    {
        this.AnnualInsuranceAmount = AnnualInsuranceAmount;
    }

    public int getPropertySquareFootage ()
    {
        return PropertySquareFootage;
    }

    public void setPropertySquareFootage (int PropertySquareFootage)
    {
        this.PropertySquareFootage = PropertySquareFootage;
    }

    public Number getCountyLimitVAAmount ()
    {
        return CountyLimitVAAmount;
    }

    public void setCountyLimitVAAmount (Number CountyLimitVAAmount)
    {
        this.CountyLimitVAAmount = CountyLimitVAAmount;
    }

    public Number getCountyLimitGovAmount ()
    {
        return CountyLimitGovAmount;
    }

    public void setCountyLimitGovAmount (Number CountyLimitGovAmount)
    {
        this.CountyLimitGovAmount = CountyLimitGovAmount;
    }

    public EligibilityFactors getEligibilityFactors ()
    {
        return EligibilityFactors;
    }

    public void setEligibilityFactors (EligibilityFactors EligibilityFactors)
    {
        this.EligibilityFactors = EligibilityFactors;
    }

    public Assets getAssets ()
    {
        return Assets;
    }

    public void setAssets (Assets Assets)
    {
        this.Assets = Assets;
    }

    public Number getCountyIncomeLimit ()
    {
        return CountyIncomeLimit;
    }

    public void setCountyIncomeLimit (Number CountyIncomeLimit)
    {
        this.CountyIncomeLimit = CountyIncomeLimit;
    }

    public Number getSellerConcessionsAmount ()
    {
        return SellerConcessionsAmount;
    }

    public void setSellerConcessionsAmount (Number SellerConcessionsAmount)
    {
        this.SellerConcessionsAmount = SellerConcessionsAmount;
    }

    public boolean getIncludeNonAPRFeesInLoanAmount ()
    {
        return IncludeNonAPRFeesInLoanAmount;
    }

    public void setIncludeNonAPRFeesInLoanAmount (boolean IncludeNonAPRFeesInLoanAmount)
    {
        this.IncludeNonAPRFeesInLoanAmount = IncludeNonAPRFeesInLoanAmount;
    }

    public int getDocumentationDueDays ()
    {
        return DocumentationDueDays;
    }

    public void setDocumentationDueDays (int DocumentationDueDays)
    {
        this.DocumentationDueDays = DocumentationDueDays;
    }

    public GiftFunds getGiftFunds ()
    {
        return GiftFunds;
    }

    public void setGiftFunds (GiftFunds GiftFunds)
    {
        this.GiftFunds = GiftFunds;
    }

    public boolean getHasPurchaseAgreement ()
    {
        return HasPurchaseAgreement;
    }

    public void setHasPurchaseAgreement (boolean HasPurchaseAgreement)
    {
        this.HasPurchaseAgreement = HasPurchaseAgreement;
    }

    public EstimatedPayoff getEstimatedPayoff ()
    {
        return EstimatedPayoff;
    }

    public void setEstimatedPayoff (EstimatedPayoff EstimatedPayoff)
    {
        this.EstimatedPayoff = EstimatedPayoff;
    }

    public boolean getExistingQLClient ()
    {
        return ExistingQLClient;
    }

    public void setExistingQLClient (boolean ExistingQLClient)
    {
        this.ExistingQLClient = ExistingQLClient;
    }

    public boolean getEstimatePayoff ()
    {
        return EstimatePayoff;
    }

    public void setEstimatePayoff (boolean EstimatePayoff)
    {
        this.EstimatePayoff = EstimatePayoff;
    }

    public boolean getIncludePrePaidsInLoanAmount ()
    {
        return IncludePrePaidsInLoanAmount;
    }

    public void setIncludePrePaidsInLoanAmount (boolean IncludePrePaidsInLoanAmount)
    {
        this.IncludePrePaidsInLoanAmount = IncludePrePaidsInLoanAmount;
    }

    public boolean isAdjustCashoutByCountryLimit() {
        return AdjustCashoutByCountryLimit;
    }

    public int getLoanEstimateDaysPerdiem() {
        return LoanEstimateDaysPerdiem;
    }

    public void setLoanEstimateDaysPerdiem(int loanEstimateDaysPerdiem) {
        LoanEstimateDaysPerdiem = loanEstimateDaysPerdiem;
    }

    public void setAdjustCashoutByCountryLimit(boolean adjustCashoutByCountryLimit) {
        AdjustCashoutByCountryLimit = adjustCashoutByCountryLimit;
    }

    public int getCurrentRemainingTerm ()
    {
        return CurrentRemainingTerm;
    }

    public void setCurrentRemainingTerm (int CurrentRemainingTerm)
    {
        this.CurrentRemainingTerm = CurrentRemainingTerm;
    }

    public String getOccupancyType ()
    {
        return OccupancyType;
    }

    public void setOccupancyType (String OccupancyType)
    {
        this.OccupancyType = OccupancyType;
    }

    public Number getCountyLimitConvAmount ()
    {
        return CountyLimitConvAmount;
    }

    public void setCountyLimitConvAmount (Number CountyLimitConvAmount)
    {
        this.CountyLimitConvAmount = CountyLimitConvAmount;
    }

    public Number getTaxesDueAtClose ()
    {
        return TaxesDueAtClose;
    }

    public void setTaxesDueAtClose (Number TaxesDueAtClose)
    {
        this.TaxesDueAtClose = TaxesDueAtClose;
    }

    public int getMonthlyDebtPayments ()
    {
        return MonthlyDebtPayments;
    }

    public void setMonthlyDebtPayments (int MonthlyDebtPayments)
    {
        this.MonthlyDebtPayments = MonthlyDebtPayments;
    }

    public AffordabilityCalculationFactors getAffordabilityCalculationFactors ()
{
    return AffordabilityCalculationFactors;
}

    public void setAffordabilityCalculationFactors (AffordabilityCalculationFactors AffordabilityCalculationFactors)
    {
        this.AffordabilityCalculationFactors = AffordabilityCalculationFactors;
    }

    public String getHOIEffectiveDate ()
    {
        return HOIEffectiveDate;
    }

    public void setHOIEffectiveDate (String HOIEffectiveDate)
    {
        this.HOIEffectiveDate = HOIEffectiveDate;
    }

    public int getCreditScore ()
    {
        return CreditScore;
    }

    public void setCreditScore (int CreditScore)
    {
        this.CreditScore = CreditScore;
    }

    public String getZip ()
    {
        return Zip;
    }

    public void setZip (String Zip)
    {
        this.Zip = Zip;
    }

    public boolean getWaiveEscrows ()
    {
        return WaiveEscrows;
    }

    public void setWaiveEscrows (boolean WaiveEscrows)
    {
        this.WaiveEscrows = WaiveEscrows;
    }

    public ProductsAndPricing getProductsAndPricing ()
    {
        return ProductsAndPricing;
    }

    public void setProductsAndPricing (ProductsAndPricing ProductsAndPricing)
    {
        this.ProductsAndPricing = ProductsAndPricing;
    }

    public String getRequestedScenario ()
{
    return RequestedScenario;
}

    public void setRequestedScenario (String RequestedScenario)
    {
        this.RequestedScenario = RequestedScenario;
    }

    public Number getCurrentLoanPaymentAmount ()
    {
        return CurrentLoanPaymentAmount;
    }

    public void setCurrentLoanPaymentAmount (Number CurrentLoanPaymentAmount)
    {
        this.CurrentLoanPaymentAmount = CurrentLoanPaymentAmount;
    }

    public boolean getIncludePointsInLoanAmount ()
    {
        return IncludePointsInLoanAmount;
    }

    public void setIncludePointsInLoanAmount (boolean IncludePointsInLoanAmount)
    {
        this.IncludePointsInLoanAmount = IncludePointsInLoanAmount;
    }

    public SelectionTargets getSelectionTargets ()
    {
        return SelectionTargets;
    }

    public void setSelectionTargets (SelectionTargets SelectionTargets)
    {
        this.SelectionTargets = SelectionTargets;
    }

    public ProductSelectionOptions getProductSelectionOptions ()
    {
        return ProductSelectionOptions;
    }

    public void setProductSelectionOptions (ProductSelectionOptions ProductSelectionOptions)
    {
        this.ProductSelectionOptions = ProductSelectionOptions;
    }

    public Number getDesiredCashoutAmount ()
    {
        return DesiredCashoutAmount;
    }

    public void setDesiredCashoutAmount (Number DesiredCashoutAmount)
    {
        this.DesiredCashoutAmount = DesiredCashoutAmount;
    }

    public int getFamilySize ()
    {
        return FamilySize;
    }

    public void setFamilySize (int FamilySize)
    {
        this.FamilySize = FamilySize;
    }

    public int getRecommendedCashoutAmount ()
    {
        return RecommendedCashoutAmount;
    }

    public void setRecommendedCashoutAmount (int RecommendedCashoutAmount)
    {
        this.RecommendedCashoutAmount = RecommendedCashoutAmount;
    }

    public DisclaimerTemplates[] getDisclaimerTemplates ()
    {
        return DisclaimerTemplates;
    }

    public void setDisclaimerTemplates (DisclaimerTemplates[] DisclaimerTemplates)
    {
        this.DisclaimerTemplates = DisclaimerTemplates;
    }

    public String getCity ()
    {
        return City;
    }

    public void setCity (String City)
    {
        this.City = City;
    }

    public boolean getEscrowsCurrentlyWaived ()
{
    return EscrowsCurrentlyWaived;
}

    public void setEscrowsCurrentlyWaived (boolean EscrowsCurrentlyWaived)
    {
        this.EscrowsCurrentlyWaived = EscrowsCurrentlyWaived;
    }

    public String getCounty ()
    {
        return County;
    }

    public void setCounty (String County)
    {
        this.County = County;
    }

    public Clients getClients ()
    {
        return Clients;
    }

    public void setClients (Clients Clients)
    {
        this.Clients = Clients;
    }

    public String getState ()
    {
        return State;
    }

    public void setState (String State)
    {
        this.State = State;
    }

    public boolean getIsTexas50a6 ()
    {
        return IsTexas50a6;
    }

    public void setIsTexas50a6 (boolean IsTexas50a6)
    {
        this.IsTexas50a6 = IsTexas50a6;
    }

    public String[] getProductRequestGroups ()
    {
        return ProductRequestGroups;
    }

    public void setProductRequestGroups (String[] ProductRequestGroups)
    {
        this.ProductRequestGroups = ProductRequestGroups;
    }

    public int getOriginalPurchasePrice ()
    {
        return OriginalPurchasePrice;
    }

    public void setOriginalPurchasePrice (int OriginalPurchasePrice)
    {
        this.OriginalPurchasePrice = OriginalPurchasePrice;
    }

    public String getCurrentLoanGovernmentType ()
    {
        return CurrentLoanGovernmentType;
    }

    public void setCurrentLoanGovernmentType (String CurrentLoanGovernmentType)
    {
        this.CurrentLoanGovernmentType = CurrentLoanGovernmentType;
    }

    public TaxProrations getTaxProrations ()
    {
        return TaxProrations;
    }

    public void setTaxProrations (TaxProrations TaxProrations)
    {
        this.TaxProrations = TaxProrations;
    }

    public ViableRules[] getViableRules ()
    {
        return ViableRules;
    }

    public void setViableRules (ViableRules[] ViableRules)
    {
        this.ViableRules = ViableRules;
    }

    public PropertiesOwned[] getPropertiesOwned() {
        return PropertiesOwned;
    }

    public void setPropertiesOwned(PropertiesOwned[] PropertiesOwned) {
        this.PropertiesOwned = PropertiesOwned;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [IsLienSubordinationAllowed = "+IsLienSubordinationAllowed+", " +
                "LoanPurpose = "+LoanPurpose+", " +
                "CountyFIPS = "+CountyFIPS+", " +
                "PropertyType = "+PropertyType+", " +
                "IncludeAPRFeesInLoanAmount = "+IncludeAPRFeesInLoanAmount+", " +
                "TotalClientStatedFunds = "+TotalClientStatedFunds+", " +
                "DocumentationDueDate = "+DocumentationDueDate+", " +
                "HomeValueAmount = "+HomeValueAmount+", " +
                "NewLoanBalanceAmount = "+NewLoanBalanceAmount+", " +
                "Scenarios = "+Scenarios+", " +
                "LoanPurposeGoalRecommended = "+LoanPurposeGoalRecommended+", " +
                "DownPaymentAmount = "+DownPaymentAmount+", " +
                "Address2 = "+Address2+", " +
                "Address1 = "+Address1+", " +
                "MonthlyIncome = "+MonthlyIncome+", " +
                "QualifyingFailureReasons = "+QualifyingFailureReasons+", " +
                "AnnualTaxAmount = "+AnnualTaxAmount+", " +
                "CurrentLoanBalanceAmount = "+CurrentLoanBalanceAmount+", " +
                "Liens = "+Liens+", NumberOfUnits = "+NumberOfUnits+", " +
                "PurchasePrice = "+PurchasePrice+", " +
                "CurrentLoanPrincipleInterestMortgageInsuranceAmount = "+CurrentLoanPrincipleInterestMortgageInsuranceAmount+", " +
                "LoanPurposeGoalSelected = "+LoanPurposeGoalSelected+", " +
                "LoanFeesList = "+LoanFeesList+", " +
                "CalculateTaxProrations = "+CalculateTaxProrations+", " +
                "PricingEngine = "+PricingEngine+", " +
                "ProductsAndPricingSets = "+ProductsAndPricingSets+", " +
                "CurrentLoanAccountOpenedDate = "+CurrentLoanAccountOpenedDate+", " +
                "MaxCashoutAvailableAmount = "+MaxCashoutAvailableAmount+", " +
                "DaysUntilClosing = "+DaysUntilClosing+", " +
                "Disclaimers = "+Disclaimers+", " +
                "UseLoanEstimateValues = "+UseLoanEstimateValues+", " +
                "VALoanInfo = "+VALoanInfo+", " +
                "SolutionOptions = "+SolutionOptions+", " +
                "AssetTotalDesiredAmountToApply = "+AssetTotalDesiredAmountToApply+", " +
                "AnnualInsuranceAmount = "+AnnualInsuranceAmount+", " +
                "PropertySquareFootage = "+PropertySquareFootage+", " +
                "CountyLimitVAAmount = "+CountyLimitVAAmount+", " +
                "CountyLimitGovAmount = "+CountyLimitGovAmount+", " +
                "EligibilityFactors = "+EligibilityFactors+", " +
                "Assets = "+Assets+", " +
                "CountyIncomeLimit = "+CountyIncomeLimit+", " +
                "SellerConcessionsAmount = "+SellerConcessionsAmount+", " +
                "IncludeNonAPRFeesInLoanAmount = "+IncludeNonAPRFeesInLoanAmount+", " +
                "DocumentationDueDays = "+DocumentationDueDays+", " +
                "GiftFunds = "+GiftFunds+", " +
                "HasPurchaseAgreement = "+HasPurchaseAgreement+", " +
                "EstimatedPayoff = "+EstimatedPayoff+", " +
                "ExistingQLClient = "+ExistingQLClient+", " +
                "EstimatePayoff = "+EstimatePayoff+", " +
                "IncludePrePaidsInLoanAmount = "+IncludePrePaidsInLoanAmount+", " +
                "CurrentRemainingTerm = "+CurrentRemainingTerm+", " +
                "OccupancyType = "+OccupancyType+", " +
                "CountyLimitConvAmount = "+CountyLimitConvAmount+", " +
                "TaxesDueAtClose = "+TaxesDueAtClose+", " +
                "MonthlyDebtPayments = "+MonthlyDebtPayments+", " +
                "AffordabilityCalculationFactors = "+AffordabilityCalculationFactors+", " +
                "HOIEffectiveDate = "+HOIEffectiveDate+", CreditScore = "+CreditScore+", " +
                "Zip = "+Zip+", WaiveEscrows = "+WaiveEscrows+", " +
                "ProductsAndPricing = "+ProductsAndPricing+", " +
                "RequestedScenario = "+RequestedScenario+", " +
                "CurrentLoanPaymentAmount = "+CurrentLoanPaymentAmount+", " +
                "IncludePointsInLoanAmount = "+IncludePointsInLoanAmount+", " +
                "SelectionTargets = "+SelectionTargets+", " +
                "ProductSelectionOptions = "+ProductSelectionOptions+", " +
                "DesiredCashoutAmount = "+DesiredCashoutAmount+", " +
                "FamilySize = "+FamilySize+", " +
                "RecommendedCashoutAmount = "+RecommendedCashoutAmount+", " +
                "DisclaimerTemplates = "+DisclaimerTemplates+", City = "+City+", " +
                "EscrowsCurrentlyWaived = "+EscrowsCurrentlyWaived+", " +
                "County = "+County+", Clients = "+Clients+", State = "+State+", " +
                "IsTexas50a6 = "+IsTexas50a6+", " +
                "ProductRequestGroups = "+ProductRequestGroups+", " +
                "OriginalPurchasePrice = "+OriginalPurchasePrice+", " +
                "CurrentLoanGovernmentType = "+CurrentLoanGovernmentType+", " +
                "TaxProrations = "+TaxProrations+", ViableRules = "+ViableRules+"]";
    }


    public Number getTotalLienPayments() {
        return TotalLienPayments;
    }

    public void setTotalLienPayments(Number totalLienPayments) {
        TotalLienPayments = totalLienPayments;
    }

    public Number getTotalSubordinatedLienPayments() {
        return TotalSubordinatedLienPayments;
    }

    public void setTotalSubordinatedLienPayments(Number totalSubordinatedLienPayments) {
        TotalSubordinatedLienPayments = totalSubordinatedLienPayments;
    }

    public Number getTotalForcedSubordinatedLienPayments() {
        return TotalForcedSubordinatedLienPayments;
    }

    public void setTotalForcedSubordinatedLienPayments(Number totalForcedSubordinatedLienPayments) {
        TotalForcedSubordinatedLienPayments = totalForcedSubordinatedLienPayments;
    }

    public com.quickenloans.ocularproject.business_object.solution_engine.Notes[] getNotes() {
        return Notes;
    }

    public void setNotes(com.quickenloans.ocularproject.business_object.solution_engine.Notes[] notes) {
        Notes = notes;
    }

    public String getLeadTypeCode() {
        return LeadTypeCode;
    }

    public void setLeadTypeCode(String leadTypeCode) {
        LeadTypeCode = leadTypeCode;
    }

    public Number getTotalMonthlyRentalIncomeUsed() {
        return TotalMonthlyRentalIncomeUsed;
    }

    public void setTotalMonthlyRentalIncomeUsed(Number totalMonthlyRentalIncomeUsed) {
        TotalMonthlyRentalIncomeUsed = totalMonthlyRentalIncomeUsed;
    }

    public String getChannel() {
        return Channel;
    }

    public void setChannel(String channel) {
        Channel = channel;
    }

    public String getRecommendationModel() {
        return RecommendationModel;
    }

    public void setRecommendationModel(String recommendationModel) {
        RecommendationModel = recommendationModel;
    }

    public Number getCurrentLoanOriginalBalance() {
        return CurrentLoanOriginalBalance;
    }

    public void setCurrentLoanOriginalBalance(Number currentLoanOriginalBalance) {
        CurrentLoanOriginalBalance = currentLoanOriginalBalance;
    }

    public int getCurrentLoanOriginalTerm() {
        return CurrentLoanOriginalTerm;
    }

    public void setCurrentLoanOriginalTerm(int currentLoanOriginalTerm) {
        CurrentLoanOriginalTerm = currentLoanOriginalTerm;
    }

    public int getCommitmentPeriod() {
        return CommitmentPeriod;
    }

    public void setCommitmentPeriod(int commitmentPeriod) {
        CommitmentPeriod = commitmentPeriod;
    }

    public String getUnderwritingSource() {
        return UnderwritingSource;
    }

    public void setUnderwritingSource(String underwritingSource) {
        UnderwritingSource = underwritingSource;
    }
}

