package com.quickenloans.ocularproject.business_object.solution_engine;

/**
 * Created by ctan on 8/30/17.
 */

public class GiftFunds {

    private Items[] Items;

    private Number Total;

    public Items[] getItems() {
        return Items;
    }

    public void setItems(Items[] Items) {
        this.Items = Items;
    }

    public Number getTotal() {
        return Total;
    }

    public void setTotal(Number Total) {
        this.Total = Total;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Items = "+Items+", " +
                "Total = "+Total+"]";
    }
}
