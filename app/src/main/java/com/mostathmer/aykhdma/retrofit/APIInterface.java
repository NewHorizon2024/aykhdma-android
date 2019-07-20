package com.mostathmer.aykhdma.retrofit;


import com.mostathmer.aykhdma.model.Region;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIInterface {

    @GET("region")
    Call<ArrayList<Region>> GetRegions(
            @Query("action") String action);

}
