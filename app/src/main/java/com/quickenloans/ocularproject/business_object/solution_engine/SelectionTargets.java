package com.quickenloans.ocularproject.business_object.solution_engine;

/**
 * Created by ctan on 8/31/17.
 */

public class SelectionTargets {

    private ProductTargets ProductTargets;

    private PricingOptionTargets PricingOptionTargets;


    public ProductTargets getProductTargets() {
        return ProductTargets;
    }

    public void setProductTargets(ProductTargets ProductTargets) {
        this.ProductTargets = ProductTargets;
    }

    public PricingOptionTargets getPricingOptionTargets() {
        return PricingOptionTargets;
    }

    public void setPricingOptionTargets(PricingOptionTargets PricingOptionTargets) {
        this.PricingOptionTargets = PricingOptionTargets;
    }
}
