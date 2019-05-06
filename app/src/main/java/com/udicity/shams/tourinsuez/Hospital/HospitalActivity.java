package com.udicity.shams.tourinsuez.Hospital;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import androidx.viewpager.widget.ViewPager;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.udicity.shams.tourinsuez.NavigationDrawerPackage.NavigationDrawerActivity;
import com.udicity.shams.tourinsuez.R;
import com.udicity.shams.tourinsuez.data.DataSourcer;

import java.util.ArrayList;

public class HospitalActivity extends NavigationDrawerActivity implements OnMapReadyCallback {

    private ViewPager hospitalViewPager;
    private HospitalFragmentAdapter hospitalFragmentAdapter;
    private GoogleMap mGoogleMap;

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mGoogleMap = googleMap;

        MarkerOptions marker;

        ArrayList<HospitalCategory> hospitalCategoryArrayList = DataSourcer.getHospital(getApplicationContext());
        double lat;
        double lon;
        String hospitalName;
        for (int i = 0; i < hospitalCategoryArrayList.size(); i++) {
            lat = hospitalCategoryArrayList.get(i).getmCorporationLatMap();
            lon = hospitalCategoryArrayList.get(i).getmCorporationLongMap();
            hospitalName = hospitalCategoryArrayList.get(i).getmCorporationName();
            marker = new MarkerOptions().position(new LatLng(lat, lon)).title(hospitalName);
            marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.png_local_hospital_blue_24px));

            mGoogleMap.addMarker(marker);
            mGoogleMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(lat, lon)));
            mGoogleMap.animateCamera(CameraUpdateFactory.zoomTo(8.5f), 1500, null);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout frameLayout = findViewById(R.id.navigation_drawer_content_frame_layout_id);
        getLayoutInflater().inflate(R.layout.hospital_activity, frameLayout);

        SupportMapFragment supportMapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        supportMapFragment.getMapAsync(this);

        FloatingActionButton floatingActionButton = findViewById(R.id.fab_map);
        floatingActionButton.setVisibility(View.GONE);

        hospitalFragmentAdapter = new HospitalFragmentAdapter(getSupportFragmentManager(), getApplicationContext());
        hospitalViewPager = findViewById(R.id.hospital_view_pager);
        hospitalViewPager.setAdapter(hospitalFragmentAdapter);
        hospitalViewPager.setVisibility(View.VISIBLE);
    }
}