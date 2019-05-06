package com.udicity.shams.tourinsuez.GoogleMap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.udicity.shams.tourinsuez.Hospital.HospitalCategory;
import com.udicity.shams.tourinsuez.NavigationDrawerPackage.ScrollingActivity;
import com.udicity.shams.tourinsuez.R;
import com.udicity.shams.tourinsuez.data.DataSourcer;
import com.udicity.shams.tourinsuez.hotel.HotelCategory;
import com.udicity.shams.tourinsuez.restaurant.RestaurantCategory;

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
        FloatingActionButton floatingActionButton = findViewById(R.id.fab_map);
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
        ArrayList<HotelCategory> hotelCategoryArrayList = DataSourcer.getHotel(getApplicationContext());
        ArrayList<RestaurantCategory> restaurantCategoryArrayList = DataSourcer.getRestaurant(getApplicationContext());
        ArrayList<HospitalCategory> hospitalCategoryArrayList = DataSourcer.getHospital(getApplicationContext());

        double hotelLat;
        double hotelLong;
        String hotelName;
        double restaurantLat;
        double restaurantLong;
        String restaurantName;
        double hospitalLat;
        double hospitalLong;
        String hospitalName;

        for (int i = 0; i < hotelCategoryArrayList.size(); i++) {
            hotelLat = hotelCategoryArrayList.get(i).getmHotelLat();
            hotelLong = hotelCategoryArrayList.get(i).getmHotelLong();
            hotelName = hotelCategoryArrayList.get(i).getmHotelName();
            marker = new MarkerOptions().position(new LatLng(hotelLat, hotelLong)).title(hotelName);
            marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.png_hotel_red_24px));

            mMap.addMarker(marker);
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(hotelLat, hotelLong)));
        }
        for (int i = 0; i < restaurantCategoryArrayList.size(); i++) {
            restaurantLat = restaurantCategoryArrayList.get(i).getmRestaurantLat();
            restaurantLong = restaurantCategoryArrayList.get(i).getmRestaurantLong();
            restaurantName = restaurantCategoryArrayList.get(i).getmRestaurantName();
            marker = new MarkerOptions().position(new LatLng(restaurantLat, restaurantLong)).title(restaurantName);
            marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.png_restaurant_green_24px));

            mMap.addMarker(marker);
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(restaurantLat, restaurantLong)));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(10f), 1500, null);
        }
        for (int i = 0; i < hospitalCategoryArrayList.size(); i++) {
            hospitalLat = hospitalCategoryArrayList.get(i).getmCorporationLatMap();
            hospitalLong = hospitalCategoryArrayList.get(i).getmCorporationLongMap();
            hospitalName = hospitalCategoryArrayList.get(i).getmCorporationName();
            marker = new MarkerOptions().position(new LatLng(hospitalLat, hospitalLong)).title(hospitalName);
            marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.png_local_hospital_blue_24px));

            mMap.addMarker(marker);
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(hospitalLat, hospitalLong)));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(10f), 1500, null);
        }
    }
}
