package com.quickenloans.ocularproject.business_object.solution_engine;

public class QualifyingEligibilityFactors
{
    private ShortSale ShortSale;

    private Foreclosure Foreclosure;

    private Bankruptcy Bankruptcy;

    private DisputedAccounts DisputedAccounts;

    private MortgageLate MortgageLate;

    private PublicRecords PublicRecords;

    private CollectionAccounts CollectionAccounts;

    private boolean HasIncompleteData;

    public ShortSale getShortSale ()
    {
        return ShortSale;
    }

    public void setShortSale (ShortSale ShortSale)
    {
        this.ShortSale = ShortSale;
    }

    public Foreclosure getForeclosure ()
    {
        return Foreclosure;
    }

    public void setForeclosure (Foreclosure Foreclosure)
    {
        this.Foreclosure = Foreclosure;
    }

    public Bankruptcy getBankruptcy ()
    {
        return Bankruptcy;
    }

    public void setBankruptcy (Bankruptcy Bankruptcy)
    {
        this.Bankruptcy = Bankruptcy;
    }

    public DisputedAccounts getDisputedAccounts ()
{
    return DisputedAccounts;
}

    public void setDisputedAccounts (DisputedAccounts DisputedAccounts)
    {
        this.DisputedAccounts = DisputedAccounts;
    }

    public MortgageLate getMortgageLate ()
    {
        return MortgageLate;
    }

    public void setMortgageLate (MortgageLate MortgageLate)
    {
        this.MortgageLate = MortgageLate;
    }

    public PublicRecords getPublicRecords ()
    {
        return PublicRecords;
    }

    public void setPublicRecords (PublicRecords PublicRecords)
    {
        this.PublicRecords = PublicRecords;
    }

    public CollectionAccounts getCollectionAccounts ()
{
    return CollectionAccounts;
}

    public void setCollectionAccounts (CollectionAccounts CollectionAccounts)
    {
        this.CollectionAccounts = CollectionAccounts;
    }

    public boolean getHasIncompleteData ()
    {
        return HasIncompleteData;
    }

    public void setHasIncompleteData (boolean HasIncompleteData)
    {
        this.HasIncompleteData = HasIncompleteData;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ShortSale = "+ShortSale+", " +
                "Foreclosure = "+Foreclosure+", " +
                "Bankruptcy = "+Bankruptcy+", " +
                "DisputedAccounts = "+DisputedAccounts+", " +
                "MortgageLate = "+MortgageLate+", " +
                "PublicRecords = "+PublicRecords+", " +
                "CollectionAccounts = "+CollectionAccounts+", " +
                "HasIncompleteData = "+HasIncompleteData+"]";
    }
}


