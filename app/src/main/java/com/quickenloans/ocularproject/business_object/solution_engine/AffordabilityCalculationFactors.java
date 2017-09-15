package com.quickenloans.ocularproject.business_object.solution_engine;

/**
 * Created by ctan on 8/30/17.
 */

public class AffordabilityCalculationFactors {

    private Number MaxBackenDTI;

    private Number BaseDownPaymentPercent;

    private Number MaxBackenDTIalternate;

    private Number BaseDownPaymentPercentAlternate;

    private boolean IsBaseDownPaymentPercentAlternateAlwaysEvaluated;

    private Number BaseDownPaymentPercentUsed;

    private Number MaxBackenDTIUsed;

    private Number TaxAndInsuranceFactor;

    private Number TaxAndInsuranceFactorBuffer;

    private int CalculatedTaxAndInsuranceFactorHomeValueAmount;

    private boolean IsTaxAndInsuranceFactorCalculated;

    private float EstimatedPurchasePriceRate;

    private Number EstimatedPurchasePriceMax;

    private Number EstimatedPurchasePriceDownPaymentPercent;

    private Number FeeFactor;

    private float EstimatedPurchasePriceThreshold;

    private Number FeeFactorBuffer;

    private Number EscrowsFactorBuffer;

    public Number getMaxBackenDTI() {
        return MaxBackenDTI;
    }

    public void setMaxBackenDTI(Number MaxBackenDTI) {
        this.MaxBackenDTI = MaxBackenDTI;
    }

    public Number getBaseDownPaymentPercent() {
        return BaseDownPaymentPercent;
    }

    public void setBaseDownPaymentPercent(Number BaseDownPaymentPercent) {
        this.BaseDownPaymentPercent = BaseDownPaymentPercent;
    }

    public Number getMaxBackenDTIalternate() {
        return MaxBackenDTIalternate;
    }

    public void setMaxBackenDTIalternate(Number MaxBackenDTIalternate) {
        this.MaxBackenDTIalternate = MaxBackenDTIalternate;
    }

    public Number getBaseDownPaymentPercentAlternate() {
        return BaseDownPaymentPercentAlternate;
    }

    public void setBaseDownPaymentPercentAlternate(Number BaseDownPaymentPercentAlternate) {
        this.BaseDownPaymentPercentAlternate = BaseDownPaymentPercentAlternate;
    }

    public boolean isBaseDownPaymentPercentAlternateAlwaysEvaluated() {
        return IsBaseDownPaymentPercentAlternateAlwaysEvaluated;
    }

    public void setBaseDownPaymentPercentAlternateAlwaysEvaluated(boolean IsBaseDownPaymentPercentAlternateAlwaysEvaluated) {
        this.IsBaseDownPaymentPercentAlternateAlwaysEvaluated = IsBaseDownPaymentPercentAlternateAlwaysEvaluated;
    }

    public Number getBaseDownPaymentPercentUsed() {
        return BaseDownPaymentPercentUsed;
    }

    public void setBaseDownPaymentPercentUsed(Number BaseDownPaymentPercentUsed) {
        this.BaseDownPaymentPercentUsed = BaseDownPaymentPercentUsed;
    }

    public Number getMaxBackenDTIUsed() {
        return MaxBackenDTIUsed;
    }

    public void setMaxBackenDTIUsed(Number MaxBackenDTIUsed) {
        this.MaxBackenDTIUsed = MaxBackenDTIUsed;
    }

    public Number getTaxAndInsuranceFactor() {
        return TaxAndInsuranceFactor;
    }

    public void setTaxAndInsuranceFactor(Number TaxAndInsuranceFactor) {
        this.TaxAndInsuranceFactor = TaxAndInsuranceFactor;
    }

    public Number getTaxAndInsuranceFactorBuffer() {
        return TaxAndInsuranceFactorBuffer;
    }

    public void setTaxAndInsuranceFactorBuffer(Number TaxAndInsuranceFactorBuffer) {
        this.TaxAndInsuranceFactorBuffer = TaxAndInsuranceFactorBuffer;
    }

    public int getCalculatedTaxAndInsuranceFactorHomeValueAmount() {
        return CalculatedTaxAndInsuranceFactorHomeValueAmount;
    }

    public void setCalculatedTaxAndInsuranceFactorHomeValueAmount(int CalculatedTaxAndInsuranceFactorHomeValueAmount) {
        this.CalculatedTaxAndInsuranceFactorHomeValueAmount = CalculatedTaxAndInsuranceFactorHomeValueAmount;
    }

    public boolean isTaxAndInsuranceFactorCalculated() {
        return IsTaxAndInsuranceFactorCalculated;
    }

    public void setTaxAndInsuranceFactorCalculated(boolean IsTaxAndInsuranceFactorCalculated) {
        this.IsTaxAndInsuranceFactorCalculated = IsTaxAndInsuranceFactorCalculated;
    }

    public float getEstimatedPurchasePriceRate() {
        return EstimatedPurchasePriceRate;
    }

    public void setEstimatedPurchasePriceRate(float EstimatedPurchasePriceRate) {
        this.EstimatedPurchasePriceRate = EstimatedPurchasePriceRate;
    }

    public Number getEstimatedPurchasePriceMax() {
        return EstimatedPurchasePriceMax;
    }

    public void setEstimatedPurchasePriceMax(Number EstimatedPurchasePriceMax) {
        this.EstimatedPurchasePriceMax = EstimatedPurchasePriceMax;
    }

    public Number getEstimatedPurchasePriceDownPaymentPercent() {
        return EstimatedPurchasePriceDownPaymentPercent;
    }

    public void setEstimatedPurchasePriceDownPaymentPercent(Number EstimatedPurchasePriceDownPaymentPercent) {
        this.EstimatedPurchasePriceDownPaymentPercent = EstimatedPurchasePriceDownPaymentPercent;
    }

    public Number getFeeFactor() {
        return FeeFactor;
    }

    public void setFeeFactor(Number FeeFactor) {
        this.FeeFactor = FeeFactor;
    }

    public float getEstimatedPurchasePriceThreshold() {
        return EstimatedPurchasePriceThreshold;
    }

    public void setEstimatedPurchasePriceThreshold(float EstimatedPurchasePriceThreshold) {
        this.EstimatedPurchasePriceThreshold = EstimatedPurchasePriceThreshold;
    }

    public Number getFeeFactorBuffer() {
        return FeeFactorBuffer;
    }

    public void setFeeFactorBuffer(Number FeeFactorBuffer) {
        this.FeeFactorBuffer = FeeFactorBuffer;
    }

    public Number getEscrowsFactorBuffer() {
        return EscrowsFactorBuffer;
    }

    public void setEscrowsFactorBuffer(Number EscrowsFactorBuffer) {
        this.EscrowsFactorBuffer = EscrowsFactorBuffer;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [MaxBackenDTI = "+MaxBackenDTI+"," +
                " BaseDownPaymentPercent = "+BaseDownPaymentPercent+"," +
                " MaxBackenDTIalternate = "+MaxBackenDTIalternate+"," +
                " BaseDownPaymentPercentAlternate = "+BaseDownPaymentPercentAlternate+"," +
                " IsBaseDownPaymentPercentAlternateAlwaysEvaluated = "+IsBaseDownPaymentPercentAlternateAlwaysEvaluated+"," +
                " BaseDownPaymentPercentUsed = "+BaseDownPaymentPercentUsed+"," +
                " MaxBackenDTIUsed = "+MaxBackenDTIUsed+"," +
                " TaxAndInsuranceFactor = "+TaxAndInsuranceFactor+"," +
                " TaxAndInsuranceFactorBuffer = "+TaxAndInsuranceFactorBuffer+"," +
                " CalculatedTaxAndInsuranceFactorHomeValueAmount = "+CalculatedTaxAndInsuranceFactorHomeValueAmount+"," +
                " IsTaxAndInsuranceFactorCalculated = "+IsTaxAndInsuranceFactorCalculated+"," +
                " EstimatedPurchasePriceRate = "+EstimatedPurchasePriceRate+"," +
                " EstimatedPurchasePriceMax = "+EstimatedPurchasePriceMax+"," +
                " EstimatedPurchasePriceDownPaymentPercent = "+EstimatedPurchasePriceDownPaymentPercent+"," +
                " FeeFactor = "+FeeFactor+"," +
                " EstimatedPurchasePriceThreshold = "+EstimatedPurchasePriceThreshold+"," +
                " FeeFactorBuffer = "+FeeFactorBuffer+"," +
                " EscrowsFactorBuffer = "+EscrowsFactorBuffer+"]";
    }
}
