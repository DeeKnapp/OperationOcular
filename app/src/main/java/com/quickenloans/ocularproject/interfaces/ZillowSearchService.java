package com.quickenloans.ocularproject.interfaces;

import com.quickenloans.ocularproject.business_object.zillow.SearchResults;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by ctan on 8/23/17.
 */

public interface ZillowSearchService {

    @GET("GetSearchResults.htm?zws-id=X1-ZWz19479lxaj9n_2ox88")
    Observable<SearchResults> getZillowResults(
            @Query("address") String address,
            @Query("citystatezip") String citystatezip);

}
