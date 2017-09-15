
package com.quickenloans.ocularproject.business_object.property_details;

import org.simpleframework.xml.Element;

public class Ocular {

    @Element
    private UpdatedPropertyDetails updatedPropertyDetails;

    public UpdatedPropertyDetails getUpdatedPropertyDetails() {
        return updatedPropertyDetails;
    }

    public void setUpdatedPropertyDetails(UpdatedPropertyDetails updatedPropertyDetails) {
        this.updatedPropertyDetails = updatedPropertyDetails;
    }

}
