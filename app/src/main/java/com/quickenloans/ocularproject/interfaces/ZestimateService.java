package com.quickenloans.ocularproject.interfaces;

import com.quickenloans.ocularproject.business_object.zestimate.ZestimateResponse;

import retrofit2.http.GET;
import rx.Observable;

public interface ZestimateService {

    @GET("GetZestimate.htm?zws-id=X1-ZWz19479lxaj9n_2ox88&zpid=48749425")
    Observable<ZestimateResponse> getZillowEstimate();
}
