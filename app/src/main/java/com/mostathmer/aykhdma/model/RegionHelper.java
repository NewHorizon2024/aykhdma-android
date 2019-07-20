package com.mostathmer.aykhdma.model;

import android.content.Context;
import android.graphics.Movie;

import java.util.List;

import io.realm.Realm;

public class RegionHelper {

    private static RegionHelper mInstance;
    Context context;

    public RegionHelper(Context applicationContext) {
        this.context = applicationContext;
    }

    public static RegionHelper getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new RegionHelper(context);
        }
        return mInstance;
    }

    public boolean isRegionAvailable(int id, Realm realm) {
        if (realm.where(Region.class).equalTo("id", id).findFirst() != null) {
            return true;
        }
        return false;
    }

    public List<Region> getAllRegions(Realm realm) {
        return realm.where(Region.class).findAll();
    }

    public int getRegionIdByName(Realm realm, String name) {
        return realm.where(Region.class).equalTo("name", name).findFirst().getId();
    }

    public Region getRegionById(Realm realm, int id) {
        return realm.where(Region.class).equalTo("id", id).findFirst();
    }
}
