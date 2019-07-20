package com.mostathmer.aykhdma;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefUtils {

    private static final String PREF_FILE = "com.mostathmer.aykhdma.PREFS";
    private static final String PREF_USER_REGION = "PREF_USER_REGION";


    private static SharedPreferences getSharedPrefs(Context context) {
        return context.getSharedPreferences(PREF_FILE, Context.MODE_PRIVATE);
    }

    public static void setPrefUserRegion(Context context, int regionId){
        getSharedPrefs(context).edit().putInt(PREF_USER_REGION, regionId).apply();
    }

    public static int getPrefUserRegion(Context context) {
        return getSharedPrefs(context).getInt(PREF_USER_REGION, -1);
    }

}
