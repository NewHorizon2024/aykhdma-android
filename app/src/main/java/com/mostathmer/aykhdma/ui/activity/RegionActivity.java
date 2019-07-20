package com.mostathmer.aykhdma.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.mostathmer.aykhdma.PrefUtils;
import com.mostathmer.aykhdma.R;
import com.mostathmer.aykhdma.model.Region;
import com.mostathmer.aykhdma.model.RegionHelper;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;

public class RegionActivity extends AppCompatActivity {

    private Spinner SP_region;
    ArrayList<String> regionsName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region);
        SP_region = findViewById(R.id.region_spinner);
        regionsName = new ArrayList<String>();
        regionsName.add("اختر مدينتك");
        List<Region> regions =RegionHelper.getInstance(this).getAllRegions(Realm.getDefaultInstance());
        for (Region reg : regions){
            regionsName.add(reg.getName());
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, regionsName);
        SP_region.setAdapter(adapter);

        SP_region.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position != 0) {
                    PrefUtils.setPrefUserRegion(getApplicationContext(), position);
                    startActivity(new Intent(RegionActivity.this, MainActivity.class));
                    finish();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
