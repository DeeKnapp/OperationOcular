package com.quickenloans.ocularproject.business_object.solution_engine;

public class PublicRecords
{
    private Items[] Items;

    private boolean HasOpenPublicRecord;

    public Items[] getItems ()
    {
        return Items;
    }

    public void setItems (Items[] Items)
    {
        this.Items = Items;
    }

    public boolean getHasOpenPublicRecord ()
    {
        return HasOpenPublicRecord;
    }

    public void setHasOpenPublicRecord (boolean HasOpenPublicRecord)
    {
        this.HasOpenPublicRecord = HasOpenPublicRecord;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Items = "+Items+", " +
                "HasOpenPublicRecord = "+HasOpenPublicRecord+"]";
    }
}


