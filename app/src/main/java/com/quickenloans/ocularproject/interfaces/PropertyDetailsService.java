package com.quickenloans.ocularproject.interfaces;

import com.quickenloans.ocularproject.business_object.property_details.UpdatedPropertyDetails;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface PropertyDetailsService {

    @GET("GetUpdatedPropertyDetails.htm?zws-id=X1-ZWz19479lxaj9n_2ox88")
    Observable<UpdatedPropertyDetails> getPropertyDetails(
            @Query("zpid") String zpid);

}
