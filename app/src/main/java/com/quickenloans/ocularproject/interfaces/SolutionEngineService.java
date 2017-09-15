package com.quickenloans.ocularproject.interfaces;

import com.quickenloans.ocularproject.business_object.solution_engine.SolutionEngineResponse;

import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by ctan on 8/31/17.
 */

public interface SolutionEngineService {

    @GET("purchase?")
    Observable<SolutionEngineResponse> getSolutionResults(
            @Header("Authorization") String authString,
            @Query("PurchasePrice") String purchasePrice,
            @Query("Zip") String zip,
            @Query("AnnualTaxAmount") String annualTaxAmount,
            @Query("PropertyType") String propertyType,
            @Query("NumberOfUnits") String NumberOfUnits
    );

}
