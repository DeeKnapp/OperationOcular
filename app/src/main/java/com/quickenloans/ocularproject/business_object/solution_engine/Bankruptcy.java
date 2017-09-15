package com.quickenloans.ocularproject.business_object.solution_engine;

public class Bankruptcy
{
    private boolean HasChapter13Bankruptcy;

    private boolean HasChapter7Bankruptcy;

    private boolean HasMultipleBankruptcies;

    private PrevChapter7Bankruptcy PrevChapter7Bankruptcy;

    private PrevChapter13Bankruptcy PrevChapter13Bankruptcy;

    private LastChapter13Bankruptcy LastChapter13Bankruptcy;

    private LastChapter7Bankruptcy LastChapter7Bankruptcy;

    private Bankruptcies[] Bankruptcies;

    public boolean getHasChapter13Bankruptcy ()
    {
        return HasChapter13Bankruptcy;
    }

    public void setHasChapter13Bankruptcy (boolean HasChapter13Bankruptcy)
    {
        this.HasChapter13Bankruptcy = HasChapter13Bankruptcy;
    }

    public boolean getHasChapter7Bankruptcy ()
    {
        return HasChapter7Bankruptcy;
    }

    public void setHasChapter7Bankruptcy (boolean HasChapter7Bankruptcy)
    {
        this.HasChapter7Bankruptcy = HasChapter7Bankruptcy;
    }

    public boolean getHasMultipleBankruptcies ()
    {
        return HasMultipleBankruptcies;
    }

    public void setHasMultipleBankruptcies (boolean HasMultipleBankruptcies)
    {
        this.HasMultipleBankruptcies = HasMultipleBankruptcies;
    }

    public PrevChapter7Bankruptcy getPrevChapter7Bankruptcy ()
    {
        return PrevChapter7Bankruptcy;
    }

    public void setPrevChapter7Bankruptcy (PrevChapter7Bankruptcy PrevChapter7Bankruptcy)
    {
        this.PrevChapter7Bankruptcy = PrevChapter7Bankruptcy;
    }

    public PrevChapter13Bankruptcy getPrevChapter13Bankruptcy ()
{
    return PrevChapter13Bankruptcy;
}

    public void setPrevChapter13Bankruptcy (PrevChapter13Bankruptcy PrevChapter13Bankruptcy)
    {
        this.PrevChapter13Bankruptcy = PrevChapter13Bankruptcy;
    }

    public LastChapter13Bankruptcy getLastChapter13Bankruptcy ()
{
    return LastChapter13Bankruptcy;
}

    public void setLastChapter13Bankruptcy (LastChapter13Bankruptcy LastChapter13Bankruptcy)
    {
        this.LastChapter13Bankruptcy = LastChapter13Bankruptcy;
    }

    public LastChapter7Bankruptcy getLastChapter7Bankruptcy ()
{
    return LastChapter7Bankruptcy;
}

    public void setLastChapter7Bankruptcy (LastChapter7Bankruptcy LastChapter7Bankruptcy)
    {
        this.LastChapter7Bankruptcy = LastChapter7Bankruptcy;
    }

    public Bankruptcies[] getBankruptcies ()
    {
        return Bankruptcies;
    }

    public void setBankruptcies (Bankruptcies[] Bankruptcies)
    {
        this.Bankruptcies = Bankruptcies;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [HasChapter13Bankruptcy = "+HasChapter13Bankruptcy+", " +
                "HasChapter7Bankruptcy = "+HasChapter7Bankruptcy+", " +
                "HasMultipleBankruptcies = "+HasMultipleBankruptcies+", " +
                "PrevChapter7Bankruptcy = "+PrevChapter7Bankruptcy+", " +
                "PrevChapter13Bankruptcy = "+PrevChapter13Bankruptcy+", " +
                "LastChapter13Bankruptcy = "+LastChapter13Bankruptcy+", " +
                "LastChapter7Bankruptcy = "+LastChapter7Bankruptcy+", " +
                "Bankruptcies = "+Bankruptcies+"]";
    }
}


