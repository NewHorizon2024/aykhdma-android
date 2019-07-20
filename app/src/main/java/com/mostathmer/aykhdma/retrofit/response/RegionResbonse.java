package com.mostathmer.aykhdma.retrofit.response;

import com.mostathmer.aykhdma.model.Region;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegionResbonse implements Callback<ArrayList<Region>> {
    private RegionResbonseListener listener;

    public RegionResbonse(RegionResbonseListener listener) {
        this.listener = listener;
    }

    @Override
    public void onResponse(Call<ArrayList<Region>> call, Response<ArrayList<Region>> response) {
        if(response.isSuccessful())
            listener.onGetRegionSuccessfuly(response.body());
        else
            listener.onGetRegionFailed(response.message());

    }

    @Override
    public void onFailure(Call<ArrayList<Region>> call, Throwable t) {
        listener.onGetRegionFailed(t.getLocalizedMessage());
    }

    public interface RegionResbonseListener {
        void onGetRegionSuccessfuly(ArrayList<Region> body);
        void onGetRegionFailed(String status_message);
    }
}
