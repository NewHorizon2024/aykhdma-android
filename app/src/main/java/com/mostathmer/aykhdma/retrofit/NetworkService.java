package com.mostathmer.aykhdma.retrofit;


import com.mostathmer.aykhdma.model.Region;
import com.mostathmer.aykhdma.retrofit.response.RegionResbonse;

import java.util.ArrayList;

import okhttp3.ResponseBody;
import retrofit2.Call;

public class NetworkService {


    private static NetworkService INSTANCE = null;

    private NetworkService(){}

    public static NetworkService getInstance() {
        if (INSTANCE == null)
            INSTANCE = new NetworkService();
        return INSTANCE;
    }

    public void GetRegions(RegionResbonse.RegionResbonseListener listener){
        RestClient restClient = new RestClient();
        APIInterface apiInterface = restClient.createService();
        Call<ArrayList<Region>> call = apiInterface.GetRegions("getall");
        call.enqueue(new RegionResbonse(listener));
    }
}
