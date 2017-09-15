package com.quickenloans.ocularproject.business_object.solution_engine;

public class PricingOptions
{
    private String[] Attributes;

    private Number PMIPaymentAmount;

    private boolean HasSufficientAssetsForReserves;

    private boolean IsRecommended;

    private Number APR;

    private Number NewLoanBalanceAmount;

    private Number PrincipalAndInterestPaymentAmount;

    private Number PerDiemInterest;

    private ARMInfo ARMInfo;

    private NetPrePaids NetPrePaids;

    private Number DTI;

    private CashToClose CashToClose;

    private ItemsIncludedInLoanAmount ItemsIncludedInLoanAmount;

    private NetEscrows NetEscrows;

    private Number NewLoanPaymentAmount;

    private boolean IsApplicable;

    private Number TotalClosingCosts;

    private boolean HasSufficientAssetsForFundsToClose;

    private Number FullTermSavingsAmount;

    private Number GiftFundsAppliedToClosingCosts;

    private boolean BreakEvenCalculated;

    private Number SecondLiensFinancedAmount;

    private NetPerDiemInterest NetPerDiemInterest;

    private Number SellerConcessionsUsed;

    private Number MIPaymentAmount;

    private Number RequestedLoanAmount;

    private Number TotalMonthlyPaymentAmount;

    private Number LoanPaymentDifferenceAmount;

    private Number FiveYearSavingsAmount;

    private Number MidTermSavingsAmount;

    private ClosingCosts ClosingCosts;

    private NetFees NetFees;

    private boolean HasSufficientAssetsToApply;

    private Fees Fees;

    private Number PointsAmount;

    private Number BreakEvenMonths;

    private Number BaseLoanAmount;

    private Number GiftFundsAppliedToDownPayment;

    private Number UFMIPAmount;

    private boolean IsSelected;

    private String LockExpirationDate;

    private Number ReserveAmount;

    private Number FHA_MIP_Percent;

    private Number Rate;

    private String FHA_MIP_LTV;

    private FundsToClose FundsToClose;

    private boolean HasSufficientEligibleAssets;

    private Number Points;

    private Number LenderPaidCredit;

    private Number RecommendedCashoutAmount;

    private Number LTV;

    private Number FHA_MIP_Duration;

    private Number TenYearSavingsAmount;

    private Number ReserveMonths;

    private Number FinalLoanAmount;

    private ItemsIncludedInLoan ItemsIncludedInLoan;

    private Byte LockPeriod;

    private int PricingOptionID;

    private Number BasePoints;

    private float RecommendationScore;

    private Number BaseRate;

    private Number FredGrantAmount;

    private Number QualifyingRate;

    private Number CLTV;

    private Number HCLTV;

    private Number TotalUFMIPAmount;

    private Number MaximumSellerConcessions;

    private Number OriginationFee;

    private Number UndiscountedAllInPoints;

    private Number UndiscountedAllInRate;

    private boolean RefiCashOut;

    private Number HMDARateSpreadPercent;

    private Payments[] Payments;

    private Adjustments[] Adjustments;

    private boolean IsRentalIncomeUsed;

    private boolean IsTexas50a6;

    private Number QualifyingPayment;

    private Number AmountFinanced;

    private Number FinanceCharge;

    private Number TotalPayments;

    private TotalMonthlyPaymentAmountWithOtherPI TotalMonthlyPaymentAmountWithOtherPI;

    private Number CalculatedLTV;

    private Number LTVChopAdjustment;

    public String[] getAttributes ()
    {
        return Attributes;
    }

    public void setAttributes (String[] Attributes)
    {
        this.Attributes = Attributes;
    }

    public Number getPMIPaymentAmount ()
    {
        return PMIPaymentAmount;
    }

    public void setPMIPaymentAmount (Number PMIPaymentAmount)
    {
        this.PMIPaymentAmount = PMIPaymentAmount;
    }

    public boolean getHasSufficientAssetsForReserves ()
    {
        return HasSufficientAssetsForReserves;
    }

    public void setHasSufficientAssetsForReserves (boolean HasSufficientAssetsForReserves)
    {
        this.HasSufficientAssetsForReserves = HasSufficientAssetsForReserves;
    }

    public boolean getIsRecommended ()
    {
        return IsRecommended;
    }

    public void setIsRecommended (boolean IsRecommended)
    {
        this.IsRecommended = IsRecommended;
    }

    public Number getAPR ()
    {
        return APR;
    }

    public void setAPR (Number APR)
    {
        this.APR = APR;
    }

    public Number getNewLoanBalanceAmount ()
    {
        return NewLoanBalanceAmount;
    }

    public void setNewLoanBalanceAmount (Number NewLoanBalanceAmount)
    {
        this.NewLoanBalanceAmount = NewLoanBalanceAmount;
    }

    public Number getPrincipalAndInterestPaymentAmount ()
    {
        return PrincipalAndInterestPaymentAmount;
    }

    public void setPrincipalAndInterestPaymentAmount (Number PrincipalAndInterestPaymentAmount)
    {
        this.PrincipalAndInterestPaymentAmount = PrincipalAndInterestPaymentAmount;
    }

    public Number getPerDiemInterest ()
    {
        return PerDiemInterest;
    }

    public void setPerDiemInterest (Number PerDiemInterest)
    {
        this.PerDiemInterest = PerDiemInterest;
    }

    public ARMInfo getARMInfo ()
{
    return ARMInfo;
}

    public void setARMInfo (ARMInfo ARMInfo)
    {
        this.ARMInfo = ARMInfo;
    }

    public NetPrePaids getNetPrePaids ()
    {
        return NetPrePaids;
    }

    public void setNetPrePaids (NetPrePaids NetPrePaids)
    {
        this.NetPrePaids = NetPrePaids;
    }

    public Number getDTI ()
    {
        return DTI;
    }

    public void setDTI (Number DTI)
    {
        this.DTI = DTI;
    }

    public CashToClose getCashToClose ()
    {
        return CashToClose;
    }

    public void setCashToClose (CashToClose CashToClose)
    {
        this.CashToClose = CashToClose;
    }

    public ItemsIncludedInLoanAmount getItemsIncludedInLoanAmount ()
    {
    return ItemsIncludedInLoanAmount;
    }

    public void setItemsIncludedInLoanAmount (ItemsIncludedInLoanAmount ItemsIncludedInLoanAmount)
    {
        this.ItemsIncludedInLoanAmount = ItemsIncludedInLoanAmount;
    }

    public NetEscrows getNetEscrows ()
    {
        return NetEscrows;
    }

    public void setNetEscrows (NetEscrows NetEscrows)
    {
        this.NetEscrows = NetEscrows;
    }

    public Number getNewLoanPaymentAmount ()
    {
        return NewLoanPaymentAmount;
    }

    public void setNewLoanPaymentAmount (Number NewLoanPaymentAmount)
    {
        this.NewLoanPaymentAmount = NewLoanPaymentAmount;
    }

    public boolean getIsApplicable ()
    {
        return IsApplicable;
    }

    public void setIsApplicable (boolean IsApplicable)
    {
        this.IsApplicable = IsApplicable;
    }

    public Number getTotalClosingCosts ()
    {
        return TotalClosingCosts;
    }

    public void setTotalClosingCosts (Number TotalClosingCosts)
    {
        this.TotalClosingCosts = TotalClosingCosts;
    }

    public boolean getHasSufficientAssetsForFundsToClose ()
    {
        return HasSufficientAssetsForFundsToClose;
    }

    public void setHasSufficientAssetsForFundsToClose (boolean HasSufficientAssetsForFundsToClose)
    {
        this.HasSufficientAssetsForFundsToClose = HasSufficientAssetsForFundsToClose;
    }

    public Number getFullTermSavingsAmount ()
    {
        return FullTermSavingsAmount;
    }

    public void setFullTermSavingsAmount (Number FullTermSavingsAmount)
    {
        this.FullTermSavingsAmount = FullTermSavingsAmount;
    }

    public Number getGiftFundsAppliedToClosingCosts ()
    {
        return GiftFundsAppliedToClosingCosts;
    }

    public void setGiftFundsAppliedToClosingCosts (Number GiftFundsAppliedToClosingCosts)
    {
        this.GiftFundsAppliedToClosingCosts = GiftFundsAppliedToClosingCosts;
    }

    public boolean getBreakEvenCalculated ()
    {
        return BreakEvenCalculated;
    }

    public void setBreakEvenCalculated (boolean BreakEvenCalculated)
    {
        this.BreakEvenCalculated = BreakEvenCalculated;
    }

    public Number getSecondLiensFinancedAmount ()
    {
        return SecondLiensFinancedAmount;
    }

    public void setSecondLiensFinancedAmount (Number SecondLiensFinancedAmount)
    {
        this.SecondLiensFinancedAmount = SecondLiensFinancedAmount;
    }

    public NetPerDiemInterest getNetPerDiemInterest ()
    {
        return NetPerDiemInterest;
    }

    public void setNetPerDiemInterest (NetPerDiemInterest NetPerDiemInterest)
    {
        this.NetPerDiemInterest = NetPerDiemInterest;
    }

    public Number getSellerConcessionsUsed ()
    {
        return SellerConcessionsUsed;
    }

    public void setSellerConcessionsUsed (Number SellerConcessionsUsed)
    {
        this.SellerConcessionsUsed = SellerConcessionsUsed;
    }

    public Number getMIPaymentAmount ()
    {
        return MIPaymentAmount;
    }

    public void setMIPaymentAmount (Number MIPaymentAmount)
    {
        this.MIPaymentAmount = MIPaymentAmount;
    }

    public Number getRequestedLoanAmount ()
    {
        return RequestedLoanAmount;
    }

    public void setRequestedLoanAmount (Number RequestedLoanAmount)
    {
        this.RequestedLoanAmount = RequestedLoanAmount;
    }

    public Number getTotalMonthlyPaymentAmount ()
    {
        return TotalMonthlyPaymentAmount;
    }

    public void setTotalMonthlyPaymentAmount (Number TotalMonthlyPaymentAmount)
    {
        this.TotalMonthlyPaymentAmount = TotalMonthlyPaymentAmount;
    }

    public Number getLoanPaymentDifferenceAmount ()
    {
        return LoanPaymentDifferenceAmount;
    }

    public void setLoanPaymentDifferenceAmount (Number LoanPaymentDifferenceAmount)
    {
        this.LoanPaymentDifferenceAmount = LoanPaymentDifferenceAmount;
    }

    public Number getFiveYearSavingsAmount ()
    {
        return FiveYearSavingsAmount;
    }

    public void setFiveYearSavingsAmount (Number FiveYearSavingsAmount)
    {
        this.FiveYearSavingsAmount = FiveYearSavingsAmount;
    }

    public Number getMidTermSavingsAmount ()
    {
        return MidTermSavingsAmount;
    }

    public void setMidTermSavingsAmount (Number MidTermSavingsAmount)
    {
        this.MidTermSavingsAmount = MidTermSavingsAmount;
    }

    public ClosingCosts getClosingCosts ()
    {
        return ClosingCosts;
    }

    public void setClosingCosts (ClosingCosts ClosingCosts)
    {
        this.ClosingCosts = ClosingCosts;
    }

    public NetFees getNetFees ()
    {
        return NetFees;
    }

    public void setNetFees (NetFees NetFees)
    {
        this.NetFees = NetFees;
    }

    public boolean getHasSufficientAssetsToApply ()
    {
        return HasSufficientAssetsToApply;
    }

    public void setHasSufficientAssetsToApply (boolean HasSufficientAssetsToApply)
    {
        this.HasSufficientAssetsToApply = HasSufficientAssetsToApply;
    }

    public Fees getFees ()
{
    return Fees;
}

    public void setFees (Fees Fees)
    {
        this.Fees = Fees;
    }

    public Number getPointsAmount ()
    {
        return PointsAmount;
    }

    public void setPointsAmount (Number PointsAmount)
    {
        this.PointsAmount = PointsAmount;
    }

    public Number getBreakEvenMonths ()
{
    return BreakEvenMonths;
}

    public void setBreakEvenMonths (Number BreakEvenMonths)
    {
        this.BreakEvenMonths = BreakEvenMonths;
    }

    public Number getBaseLoanAmount ()
    {
        return BaseLoanAmount;
    }

    public void setBaseLoanAmount (Number BaseLoanAmount)
    {
        this.BaseLoanAmount = BaseLoanAmount;
    }

    public Number getGiftFundsAppliedToDownPayment ()
    {
        return GiftFundsAppliedToDownPayment;
    }

    public void setGiftFundsAppliedToDownPayment (Number GiftFundsAppliedToDownPayment)
    {
        this.GiftFundsAppliedToDownPayment = GiftFundsAppliedToDownPayment;
    }

    public Number getUFMIPAmount ()
    {
        return UFMIPAmount;
    }

    public void setUFMIPAmount (Number UFMIPAmount)
    {
        this.UFMIPAmount = UFMIPAmount;
    }

    public boolean getIsSelected ()
    {
        return IsSelected;
    }

    public void setIsSelected (boolean IsSelected)
    {
        this.IsSelected = IsSelected;
    }

    public String getLockExpirationDate ()
    {
        return LockExpirationDate;
    }

    public void setLockExpirationDate (String LockExpirationDate)
    {
        this.LockExpirationDate = LockExpirationDate;
    }

    public Number getReserveAmount ()
    {
        return ReserveAmount;
    }

    public void setReserveAmount (Number ReserveAmount)
    {
        this.ReserveAmount = ReserveAmount;
    }

    public Number getFHA_MIP_Percent ()
    {
        return FHA_MIP_Percent;
    }

    public void setFHA_MIP_Percent (Number FHA_MIP_Percent)
    {
        this.FHA_MIP_Percent = FHA_MIP_Percent;
    }

    public Number getRate ()
    {
        return Rate;
    }

    public void setRate (Number Rate)
    {
        this.Rate = Rate;
    }

    public String getFHA_MIP_LTV ()
    {
        return FHA_MIP_LTV;
    }

    public void setFHA_MIP_LTV (String FHA_MIP_LTV)
    {
        this.FHA_MIP_LTV = FHA_MIP_LTV;
    }

    public FundsToClose getFundsToClose ()
    {
        return FundsToClose;
    }

    public void setFundsToClose (FundsToClose FundsToClose)
    {
        this.FundsToClose = FundsToClose;
    }

    public boolean getHasSufficientEligibleAssets ()
    {
        return HasSufficientEligibleAssets;
    }

    public void setHasSufficientEligibleAssets (boolean HasSufficientEligibleAssets)
    {
        this.HasSufficientEligibleAssets = HasSufficientEligibleAssets;
    }

    public Number getPoints ()
    {
        return Points;
    }

    public void setPoints (Number Points)
    {
        this.Points = Points;
    }

    public Number getLenderPaidCredit ()
    {
        return LenderPaidCredit;
    }

    public void setLenderPaidCredit (Number LenderPaidCredit)
    {
        this.LenderPaidCredit = LenderPaidCredit;
    }

    public Number getRecommendedCashoutAmount ()
{
    return RecommendedCashoutAmount;
}

    public void setRecommendedCashoutAmount (Number RecommendedCashoutAmount)
    {
        this.RecommendedCashoutAmount = RecommendedCashoutAmount;
    }

    public Number getLTV ()
    {
        return LTV;
    }

    public void setLTV (Number LTV)
    {
        this.LTV = LTV;
    }

    public Number getFHA_MIP_Duration ()
    {
        return FHA_MIP_Duration;
    }

    public void setFHA_MIP_Duration (Number FHA_MIP_Duration)
    {
        this.FHA_MIP_Duration = FHA_MIP_Duration;
    }

    public Number getTenYearSavingsAmount ()
    {
        return TenYearSavingsAmount;
    }

    public void setTenYearSavingsAmount (Number TenYearSavingsAmount)
    {
        this.TenYearSavingsAmount = TenYearSavingsAmount;
    }

    public Number getReserveMonths ()
    {
        return ReserveMonths;
    }

    public void setReserveMonths (Number ReserveMonths)
    {
        this.ReserveMonths = ReserveMonths;
    }

    public Number getFinalLoanAmount ()
    {
        return FinalLoanAmount;
    }

    public void setFinalLoanAmount (Number FinalLoanAmount)
    {
        this.FinalLoanAmount = FinalLoanAmount;
    }

    public ItemsIncludedInLoan getItemsIncludedInLoan ()
{
    return ItemsIncludedInLoan;
}

    public void setItemsIncludedInLoan (ItemsIncludedInLoan ItemsIncludedInLoan)
    {
        this.ItemsIncludedInLoan = ItemsIncludedInLoan;
    }

    public Byte getLockPeriod ()
    {
        return LockPeriod;
    }

    public void setLockPeriod (Byte LockPeriod)
    {
        this.LockPeriod = LockPeriod;
    }

    public int getPricingOptionID ()
    {
        return PricingOptionID;
    }

    public void setPricingOptionID (int PricingOptionID)
    {
        this.PricingOptionID = PricingOptionID;
    }

    public Number getBasePoints() {
        return BasePoints;
    }

    public void setBasePoints(Number BasePoints) {
        this.BasePoints = BasePoints;
    }


    public float getRecommendationScore() {
        return RecommendationScore;
    }

    public void setRecommendationScore(float RecommendationScore) {
        this.RecommendationScore = RecommendationScore;
    }

    public Number getBaseRate() {
        return BaseRate;
    }

    public void setBaseRate(Number BaseRate) {
        this.BaseRate = BaseRate;
    }

    public Number getFredGrantAmount() {
        return FredGrantAmount;
    }

    public void setFredGrantAmount(Number FredGrantAmount) {
        this.FredGrantAmount = FredGrantAmount;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Attributes = "+Attributes+", " +
                "PMIPaymentAmount = "+PMIPaymentAmount+", " +
                "HasSufficientAssetsForReserves = "+HasSufficientAssetsForReserves+", " +
                "IsRecommended = "+IsRecommended+", " +
                "APR = "+APR+", " +
                "NewLoanBalanceAmount = "+NewLoanBalanceAmount+", " +
                "PrincipalAndInterestPaymentAmount = "+PrincipalAndInterestPaymentAmount+", " +
                "PerDiemInterest = "+PerDiemInterest+", " +
                "ARMInfo = "+ARMInfo+", " +
                "NetPrePaids = "+NetPrePaids+", " +
                "DTI = "+DTI+", " +
                "CashToClose = "+CashToClose+", " +
                "ItemsIncludedInLoanAmount = "+ItemsIncludedInLoanAmount+", " +
                "NetEscrows = "+NetEscrows+", " +
                "NewLoanPaymentAmount = "+NewLoanPaymentAmount+", " +
                "IsApplicable = "+IsApplicable+", " +
                "TotalClosingCosts = "+TotalClosingCosts+", " +
                "HasSufficientAssetsForFundsToClose = "+HasSufficientAssetsForFundsToClose+", " +
                "FullTermSavingsAmount = "+FullTermSavingsAmount+", " +
                "GiftFundsAppliedToClosingCosts = "+GiftFundsAppliedToClosingCosts+", " +
                "BreakEvenCalculated = "+BreakEvenCalculated+", " +
                "SecondLiensFinancedAmount = "+SecondLiensFinancedAmount+", " +
                "NetPerDiemInterest = "+NetPerDiemInterest+", " +
                "SellerConcessionsUsed = "+SellerConcessionsUsed+", " +
                "MIPaymentAmount = "+MIPaymentAmount+", " +
                "RequestedLoanAmount = "+RequestedLoanAmount+", " +
                "TotalMonthlyPaymentAmount = "+TotalMonthlyPaymentAmount+", " +
                "LoanPaymentDifferenceAmount = "+LoanPaymentDifferenceAmount+", " +
                "FiveYearSavingsAmount = "+FiveYearSavingsAmount+", " +
                "MidTermSavingsAmount = "+MidTermSavingsAmount+", " +
                "ClosingCosts = "+ClosingCosts+", " +
                "NetFees = "+NetFees+", " +
                "HasSufficientAssetsToApply = "+HasSufficientAssetsToApply+", " +
                "Fees = "+Fees+", PointsAmount = "+PointsAmount+", " +
                "BreakEvenMonths = "+BreakEvenMonths+", " +
                "BaseLoanAmount = "+BaseLoanAmount+", " +
                "GiftFundsAppliedToDownPayment = "+GiftFundsAppliedToDownPayment+", " +
                "UFMIPAmount = "+UFMIPAmount+", " +
                "IsSelected = "+IsSelected+", " +
                "LockExpirationDate = "+LockExpirationDate+", " +
                "ReserveAmount = "+ReserveAmount+", " +
                "FHA_MIP_Percent = "+FHA_MIP_Percent+", " +
                "Rate = "+Rate+", " +
                "FHA_MIP_LTV = "+FHA_MIP_LTV+", " +
                "FundsToClose = "+FundsToClose+", " +
                "HasSufficientEligibleAssets = "+HasSufficientEligibleAssets+", " +
                "Points = "+Points+", " +
                "LenderPaidCredit = "+LenderPaidCredit+", " +
                "RecommendedCashoutAmount = "+RecommendedCashoutAmount+", " +
                "LTV = "+LTV+", " +
                "FHA_MIP_Duration = "+FHA_MIP_Duration+", " +
                "TenYearSavingsAmount = "+TenYearSavingsAmount+", " +
                "ReserveMonths = "+ReserveMonths+", " +
                "FinalLoanAmount = "+FinalLoanAmount+", " +
                "ItemsIncludedInLoan = "+ItemsIncludedInLoan+", " +
                "LockPeriod = "+LockPeriod+", " +
                "PricingOptionID = "+PricingOptionID+"]";
    }

    public Number getQualifyingRate() {
        return QualifyingRate;
    }

    public void setQualifyingRate(Number QualifyingRate) {
        this.QualifyingRate = QualifyingRate;
    }

    public Adjustments[] getAdjustments() {
        return Adjustments;
    }

    public void setAdjustments(Adjustments[] Adjustments) {
        this.Adjustments = Adjustments;
    }

    public Number getCLTV() {
        return CLTV;
    }

    public void setCLTV(Number CLTV) {
        this.CLTV = CLTV;
    }

    public Number getHCLTV() {
        return HCLTV;
    }

    public void setHCLTV(Number HCLTV) {
        this.HCLTV = HCLTV;
    }

    public Number getTotalUFMIPAmount() {
        return TotalUFMIPAmount;
    }

    public void setTotalUFMIPAmount(Number TotalUFMIPAmount) {
        this.TotalUFMIPAmount = TotalUFMIPAmount;
    }

    public Number getMaximumSellerConcessions() {
        return MaximumSellerConcessions;
    }

    public void setMaximumSellerConcessions(Number MaximumSellerConcessions) {
        this.MaximumSellerConcessions = MaximumSellerConcessions;
    }

    public Number getOriginationFee() {
        return OriginationFee;
    }

    public void setOriginationFee(Number OriginationFee) {
        this.OriginationFee = OriginationFee;
    }

    public Number getUndiscountedAllInPoints() {
        return UndiscountedAllInPoints;
    }

    public void setUndiscountedAllInPoints(Number UndiscountedAllInPoints) {
        this.UndiscountedAllInPoints = UndiscountedAllInPoints;
    }

    public Number getUndiscountedAllInRate() {
        return UndiscountedAllInRate;
    }

    public void setUndiscountedAllInRate(Number UndiscountedAllInRate) {
        this.UndiscountedAllInRate = UndiscountedAllInRate;
    }

    public boolean isRefiCashOut() {
        return RefiCashOut;
    }

    public void setRefiCashOut(boolean RefiCashOut) {
        this.RefiCashOut = RefiCashOut;
    }

    public Number getHMDARateSpreadPercent() {
        return HMDARateSpreadPercent;
    }

    public void setHMDARateSpreadPercent(Number HMDARateSpreadPercent) {
        this.HMDARateSpreadPercent = HMDARateSpreadPercent;
    }

    public Payments[] getPayments() {
        return Payments;
    }

    public void setPayments(Payments[] Payments) {
        this.Payments = Payments;
    }

    public boolean isRentalIncomeUsed() {
        return IsRentalIncomeUsed;
    }

    public void setRentalIncomeUsed(boolean IsRentalIncomeUsed) {
        this.IsRentalIncomeUsed = IsRentalIncomeUsed;
    }

    public boolean isTexas50a6() {
        return IsTexas50a6;
    }

    public void setTexas50a6(boolean IsTexas50a6) {
        this.IsTexas50a6 = IsTexas50a6;
    }

    public Number getQualifyingPayment() {
        return QualifyingPayment;
    }

    public void setQualifyingPayment(Number QualifyingPayment) {
        this.QualifyingPayment = QualifyingPayment;
    }

    public Number getAmountFinanced() {
        return AmountFinanced;
    }

    public void setAmountFinanced(Number AmountFinanced) {
        this.AmountFinanced = AmountFinanced;
    }

    public Number getFinanceCharge() {
        return FinanceCharge;
    }

    public void setFinanceCharge(Number FinanceCharge) {
        this.FinanceCharge = FinanceCharge;
    }

    public Number getTotalPayments() {
        return TotalPayments;
    }

    public void setTotalPayments(Number TotalPayments) {
        this.TotalPayments = TotalPayments;
    }

    public TotalMonthlyPaymentAmountWithOtherPI getTotalMonthlyPaymentAmountWithOtherPI() {
        return TotalMonthlyPaymentAmountWithOtherPI;
    }

    public void setTotalMonthlyPaymentAmountWithOtherPI(TotalMonthlyPaymentAmountWithOtherPI TotalMonthlyPaymentAmountWithOtherPI) {
        this.TotalMonthlyPaymentAmountWithOtherPI = TotalMonthlyPaymentAmountWithOtherPI;
    }

    public Number getCalculatedLTV() {
        return CalculatedLTV;
    }

    public void setCalculatedLTV(Number CalculatedLTV) {
        this.CalculatedLTV = CalculatedLTV;
    }

    public Number getLTVChopAdjustment() {
        return LTVChopAdjustment;
    }

    public void setLTVChopAdjustment(Number LTVChopAdjustment) {
        this.LTVChopAdjustment = LTVChopAdjustment;
    }

    public class ARMInfo {

        private Number PotentialInterestRateAfterLock;

        private Number PotentialPrincipalInterestAndMIPaymentAfterLock;

        private Number PotentialMonthlyPaymentAfterLock;

        private Number FullyIndexedRate;

        private Number MaximumInterestRate;

        public Number getPotentialInterestRateAfterLock() {
            return PotentialInterestRateAfterLock;
        }

        public void setPotentialInterestRateAfterLock(Number potentialInterestRateAfterLock) {
            PotentialInterestRateAfterLock = potentialInterestRateAfterLock;
        }

        public Number getPotentialPrincipalInterestAndMIPaymentAfterLock() {
            return PotentialPrincipalInterestAndMIPaymentAfterLock;
        }

        public void setPotentialPrincipalInterestAndMIPaymentAfterLock(Number potentialPrincipalInterestAndMIPaymentAfterLock) {
            PotentialPrincipalInterestAndMIPaymentAfterLock = potentialPrincipalInterestAndMIPaymentAfterLock;
        }

        public Number getPotentialMonthlyPaymentAfterLock() {
            return PotentialMonthlyPaymentAfterLock;
        }

        public void setPotentialMonthlyPaymentAfterLock(Number potentialMonthlyPaymentAfterLock) {
            PotentialMonthlyPaymentAfterLock = potentialMonthlyPaymentAfterLock;
        }

        public Number getFullyIndexedRate() {
            return FullyIndexedRate;
        }

        public void setFullyIndexedRate(Number fullyIndexedRate) {
            FullyIndexedRate = fullyIndexedRate;
        }

        public Number getMaximumInterestRate() {
            return MaximumInterestRate;
        }

        public void setMaximumInterestRate(Number maximumInterestRate) {
            MaximumInterestRate = maximumInterestRate;
        }

        @Override
        public String toString() {
            return "ClassPojo [PotentialInterestRateAfterLock = " + PotentialInterestRateAfterLock + "," +
                    " PotentialPrincipalInterestAndMIPaymentAfterLock = " + PotentialPrincipalInterestAndMIPaymentAfterLock + "," +
                    " PotentialMonthlyPaymentAfterLock = " + PotentialMonthlyPaymentAfterLock + "," +
                    " FullyIndexedRate = " + FullyIndexedRate + "," +
                    " MaximumInterestRate = " + MaximumInterestRate + "]";
        }
    }

}


