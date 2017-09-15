package com.quickenloans.ocularproject.business_object.solution_engine;

/**
 * Created by ctan on 8/30/17.
 */

public class EligibilityFactors {

    private boolean HasIncompletedData;

    private Bankruptcy Bankruptcy;

    private Foreclosure Foreclosure;

    private MortgageLate MortgageLate;

    private ShortSale ShortSale;

    private PublicRecords PublicRecords;

    private DisputedAccounts DisputedAccounts;

    private CollectionAccounts CollectionAccounts;

    public boolean isHasIncompletedData() {
        return HasIncompletedData;
    }

    public void setHasIncompletedData(boolean HasIncompletedData) {
        this.HasIncompletedData = HasIncompletedData;
    }

    public Bankruptcy getBankruptcy() {
        return Bankruptcy;
    }

    public void setBankruptcy(Bankruptcy Bankruptcy) {
        this.Bankruptcy = Bankruptcy;
    }

    public Foreclosure getForeclosure() {
        return Foreclosure;
    }

    public void setForeclosure(Foreclosure Foreclosure) {
        this.Foreclosure = Foreclosure;
    }

    public MortgageLate getMortgageLate() {
        return MortgageLate;
    }

    public void setMortgageLate(MortgageLate MortgageLate) {
        this.MortgageLate = MortgageLate;
    }

    public ShortSale getShortSale() {
        return ShortSale;
    }

    public void setShortSale(ShortSale ShortSale) {
        this.ShortSale = ShortSale;
    }

    public PublicRecords getPublicRecords() {
        return PublicRecords;
    }

    public void setPublicRecords(PublicRecords PublicRecords) {
        this.PublicRecords = PublicRecords;
    }

    public DisputedAccounts getDisputedAccounts() {
        return DisputedAccounts;
    }

    public void setDisputedAccounts(DisputedAccounts DisputedAccounts) {
        this.DisputedAccounts = DisputedAccounts;
    }

    public CollectionAccounts getCollectionAccounts() {
        return CollectionAccounts;
    }

    public void setCollectionAccounts(CollectionAccounts CollectionAccounts) {
        this.CollectionAccounts = CollectionAccounts;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [HasIncompletedData = "+HasIncompletedData+", " +
                "Bankruptcy = "+Bankruptcy+", " +
                "Foreclosure = "+Foreclosure+", " +
                "MortgageLate = "+MortgageLate+", " +
                "ShortSale = "+ShortSale+", " +
                "PublicRecords = "+PublicRecords+", " +
                "DisputedAccounts = "+DisputedAccounts+", " +
                "CollectionAccounts = "+CollectionAccounts+"]";
    }
}
