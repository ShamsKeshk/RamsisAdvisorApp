package com.udicity.shams.tourinsuez.Restaurant;

import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
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

public class RestaurantActivity extends NavigationDrawerActivity implements OnMapReadyCallback {

    ViewPager restViewPager;
    RestaurantFragmentAdapter restaurantFragmentAdapter;
    private GoogleMap mGoogleMap;

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mGoogleMap = googleMap;
        MarkerOptions marker;

        ArrayList<RestaurantCategory> restaurantCategoryArrayList = DataSourcer.getRestaurant();
        double lat;
        double lon;
        String restaurantName;
        for(int i = 0;i<restaurantCategoryArrayList.size();i++)
        {
            lat = restaurantCategoryArrayList.get(i).getmRestaurantLat();
            lon = restaurantCategoryArrayList.get(i).getmRestaurantLong();
            restaurantName = restaurantCategoryArrayList.get(i).getmRestaurantName();
            marker = new MarkerOptions().position(new LatLng(lat,lon)).title(restaurantName);
            marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_restaurant_red_24px));
            mGoogleMap.addMarker(marker);
            mGoogleMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(lat,lon)));
            mGoogleMap.animateCamera(CameraUpdateFactory.zoomTo(8.5f),1500,null);

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout frameLayout = (FrameLayout)findViewById(R.id.navigation_drawer_content_frame_layout_id);
        getLayoutInflater().inflate(R.layout.restaurant_activity , frameLayout);

        SupportMapFragment supportMapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        supportMapFragment.getMapAsync(this);

        FloatingActionButton floatingActionButton = (FloatingActionButton)findViewById(R.id.fab_map);
        floatingActionButton.setVisibility(View.GONE);

        restViewPager = (ViewPager)findViewById(R.id.rest_view_pager);
        restaurantFragmentAdapter = new RestaurantFragmentAdapter(getSupportFragmentManager(),this);
        restViewPager.setAdapter(restaurantFragmentAdapter);
        restViewPager.setVisibility(View.VISIBLE);
    }
}