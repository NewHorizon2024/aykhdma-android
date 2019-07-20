package com.mostathmer.aykhdma.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.mostathmer.aykhdma.PrefUtils;
import com.mostathmer.aykhdma.R;
import com.mostathmer.aykhdma.model.Region;
import com.mostathmer.aykhdma.model.RegionHelper;
import com.mostathmer.aykhdma.retrofit.NetworkService;
import com.mostathmer.aykhdma.retrofit.response.RegionResbonse;

import java.util.ArrayList;

import io.realm.Realm;

public class SplashActivity extends AppCompatActivity implements RegionResbonse.RegionResbonseListener {
    Realm mRealm;
    RegionHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mRealm = Realm.getDefaultInstance();
        helper = RegionHelper.getInstance(this);
        if (PrefUtils.getPrefUserRegion(this)==-1) {
            NetworkService.getInstance().GetRegions(this);
        }else{
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }

    }

    @Override
    public void onGetRegionSuccessfuly(final ArrayList<Region> body) {
        mRealm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                for(int i=0;i<body.size();i++){
                    Region region;
                    if(!helper.isRegionAvailable(body.get(i).getId(),realm)){
                        region = realm.createObject(Region.class, body.get(i).getId());
                    }else{
                        region = realm.where(Region.class).equalTo("id",body.get(i).getId()).findFirst();
                    }
                    region.setName(body.get(i).getName());
                    region.setName_en(body.get(i).getName_en());
                }
            }
        }, new Realm.Transaction.OnSuccess() {
            @Override
            public void onSuccess() {
                startActivity(new Intent(SplashActivity.this, RegionActivity.class));
                finish();
            }
        });

    }

    @Override
    public void onGetRegionFailed(String status_message) {
        Toast.makeText(this, status_message, Toast.LENGTH_LONG).show();
    }
}
