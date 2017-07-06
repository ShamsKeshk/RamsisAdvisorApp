package com.udicity.shams.tourinsuez.hotel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.FrameLayout;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.udicity.shams.tourinsuez.NavigationDrawerPackage.NavigationDrawerActivity;
import com.udicity.shams.tourinsuez.R;
import com.udicity.shams.tourinsuez.data.DataSourcer;

import java.util.ArrayList;

public class HotelActivity extends NavigationDrawerActivity implements OnMapReadyCallback {

    private ViewPager hotelViewPager;
    private HotelFragmentAdapter hotelFragmentAdapter;
    private GoogleMap googleMap;

    @Override
    public void onMapReady(GoogleMap googleMap) {
        this.googleMap = googleMap;

        MarkerOptions marker;

        ArrayList<HotelCategory> hotelCategoryArrayList = DataSourcer.getHotel(getApplicationContext());
        double lat;
        double lon;
        String hotelName;
        for (int i = 0; i < hotelCategoryArrayList.size(); i++) {
            lat = hotelCategoryArrayList.get(i).getmHotelLat();
            lon = hotelCategoryArrayList.get(i).getmHotelLong();
            hotelName = hotelCategoryArrayList.get(i).getmHotelName();
            marker = new MarkerOptions().position(new LatLng(lat, lon)).title(hotelName);
            marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.png_hotel_red_24px));

            this.googleMap.addMarker(marker);
            this.googleMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(lat, lon)));
            this.googleMap.animateCamera(CameraUpdateFactory.zoomTo(8.5f), 1500, null);

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.navigation_drawer_content_frame_layout_id);
        getLayoutInflater().inflate(R.layout.hotel_activity, frameLayout);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.fab_map);
        floatingActionButton.setVisibility(View.GONE);

        // Add a marker in Suez and move the camera


        hotelViewPager = (ViewPager) findViewById(R.id.hotel_view_pager);
        hotelFragmentAdapter = new HotelFragmentAdapter(getSupportFragmentManager(), this);

        hotelViewPager.setAdapter(hotelFragmentAdapter);
        hotelViewPager.setVisibility(View.VISIBLE);
    }
}