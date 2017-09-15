package com.quickenloans.ocularproject.business_object.solution_engine;

public class ClosingCosts
{
    private Details Details;

    private Number TotalAmount;

    public Details getDetails ()
    {
        return Details;
    }

    public void setDetails (Details Details)
    {
        this.Details = Details;
    }

    public Number getTotalAmount ()
    {
        return TotalAmount;
    }

    public void setTotalAmount (Number TotalAmount)
    {
        this.TotalAmount = TotalAmount;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Details = "+Details+", TotalAmount = "+TotalAmount+"]";
    }

    public class Details
    {
        private Number PointsAmount;

        private Number UFMIP;

        private Number VAFundingFee;

        private Number NetFees;

        public Number getPointsAmount ()
        {
            return PointsAmount;
        }

        public void setPointsAmount (Number PointsAmount)
        {
            this.PointsAmount = PointsAmount;
        }

        public Number getUFMIP ()
        {
            return UFMIP;
        }

        public void setUFMIP (Number UFMIP)
        {
            this.UFMIP = UFMIP;
        }

        public Number getVAFundingFee ()
        {
            return VAFundingFee;
        }

        public void setVAFundingFee (Number VAFundingFee)
        {
            this.VAFundingFee = VAFundingFee;
        }

        public Number getNetFees ()
        {
            return NetFees;
        }

        public void setNetFees (Number NetFees)
        {
            this.NetFees = NetFees;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [PointsAmount = "+PointsAmount+", " +
                    "UFMIP = "+UFMIP+", " +
                    "VAFundingFee = "+VAFundingFee+", " +
                    "NetFees = "+NetFees+"]";
        }
    }

}

