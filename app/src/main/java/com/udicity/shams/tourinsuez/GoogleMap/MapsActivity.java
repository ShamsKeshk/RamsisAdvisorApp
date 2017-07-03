package com.udicity.shams.tourinsuez.GoogleMap;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.udicity.shams.tourinsuez.NavigationDrawerPackage.ScrollingActivity;
import com.udicity.shams.tourinsuez.R;
import com.udicity.shams.tourinsuez.data.DataSourcer;
import com.udicity.shams.tourinsuez.hotel.HotelCategory;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps_activity);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        FloatingActionButton floatingActionButton = (FloatingActionButton)findViewById(R.id.fab_map);
        floatingActionButton.setVisibility(View.VISIBLE);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MapsActivity.this, ScrollingActivity.class);
                startActivity(intent);
            }
        });
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Suez and move the camera

        MarkerOptions marker;


        /*
        LatLng sydney = new LatLng(29.962769, 32.543870);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        */
        ArrayList<HotelCategory> hotelCategoryArrayList = DataSourcer.getHotel();
        double lat;
        double lon;
        String hotelName;
        for (int i = 0; i < hotelCategoryArrayList.size();i++)
        {
            lat = hotelCategoryArrayList.get(i).getmHotelLat();
            lon = hotelCategoryArrayList.get(i).getmHotelLong();
            hotelName = hotelCategoryArrayList.get(i).getmHotelName();
            marker = new MarkerOptions().position(new LatLng(lat,lon)).title(hotelName);
            marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.png_hotel_red_24px));

            mMap.addMarker(marker);
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(lat,lon)));
        }
    }
}
