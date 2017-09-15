package com.quickenloans.ocularproject.business_object.solution_engine;

public class NetPrePaids
{
    private Number Amount;

    private Details Details;

    public Number getAmount ()
    {
        return Amount;
    }

    public void setAmount (Number Amount)
    {
        this.Amount = Amount;
    }

    public Details getDetails ()
    {
        return Details;
    }

    public void setDetails (Details Details)
    {
        this.Details = Details;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Amount = "+Amount+", Details = "+Details+"]";
    }

    public class Details
    {
        private Number NetEscrows;

        private Number NetPerDiemInterest;

        public Number getNetEscrows ()
        {
            return NetEscrows;
        }

        public void setNetEscrows (Number NetEscrows)
        {
            this.NetEscrows = NetEscrows;
        }

        public Number getNetPerDiemInterest ()
        {
            return NetPerDiemInterest;
        }

        public void setNetPerDiemInterest (Number NetPerDiemInterest)
        {
            this.NetPerDiemInterest = NetPerDiemInterest;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [NetEscrows = "+NetEscrows+", " +
                    "NetPerDiemInterest = "+NetPerDiemInterest+"]";
        }
    }


}


