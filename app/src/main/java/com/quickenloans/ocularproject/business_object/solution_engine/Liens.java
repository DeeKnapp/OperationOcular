package com.quickenloans.ocularproject.business_object.solution_engine;

public class Liens
{
    private Number TotalSubordinatedBalance;

    private Number TotalBalanceUsedForHomePurchase;

    private Number TotalBalanceNotUsedForHomePurchase;

    private LienList[] LienList;

    private Number TotalBalance;

    private Number TotalSubordinatedBalanceUsedForHomePurchase;

    public Number getTotalSubordinatedBalance ()
    {
        return TotalSubordinatedBalance;
    }

    public void setTotalSubordinatedBalance (Number TotalSubordinatedBalance)
    {
        this.TotalSubordinatedBalance = TotalSubordinatedBalance;
    }

    public Number getTotalBalanceUsedForHomePurchase ()
    {
        return TotalBalanceUsedForHomePurchase;
    }

    public void setTotalBalanceUsedForHomePurchase (Number TotalBalanceUsedForHomePurchase)
    {
        this.TotalBalanceUsedForHomePurchase = TotalBalanceUsedForHomePurchase;
    }

    public LienList[] getLienList ()
    {
        return LienList;
    }

    public void setLienList (LienList[] LienList)
    {
        this.LienList = LienList;
    }

    public Number getTotalBalance ()
    {
        return TotalBalance;
    }

    public void setTotalBalance (Number TotalBalance)
    {
        this.TotalBalance = TotalBalance;
    }

    public Number getTotalSubordinatedBalanceUsedForHomePurchase ()
    {
        return TotalSubordinatedBalanceUsedForHomePurchase;
    }

    public void setTotalSubordinatedBalanceUsedForHomePurchase (Number TotalSubordinatedBalanceUsedForHomePurchase)
    {
        this.TotalSubordinatedBalanceUsedForHomePurchase = TotalSubordinatedBalanceUsedForHomePurchase;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [TotalSubordinatedBalance = "+TotalSubordinatedBalance+", " +
                "TotalBalanceUsedForHomePurchase = "+TotalBalanceUsedForHomePurchase+", " +
                "LienList = "+LienList+", " +
                "TotalBalance = "+TotalBalance+", " +
                "TotalSubordinatedBalanceUsedForHomePurchase = "+TotalSubordinatedBalanceUsedForHomePurchase+"]";
    }

    public Number getTotalBalanceNotUsedForHomePurchase() {
        return TotalBalanceNotUsedForHomePurchase;
    }

    public void setTotalBalanceNotUsedForHomePurchase(Number TotalBalanceNotUsedForHomePurchase) {
        this.TotalBalanceNotUsedForHomePurchase = TotalBalanceNotUsedForHomePurchase;
    }
}


