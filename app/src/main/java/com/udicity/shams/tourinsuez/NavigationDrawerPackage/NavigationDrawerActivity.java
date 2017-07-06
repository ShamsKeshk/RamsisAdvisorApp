package com.udicity.shams.tourinsuez.NavigationDrawerPackage;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.udicity.shams.tourinsuez.AboutSuez.AboutSuezActivity;
import com.udicity.shams.tourinsuez.CafeShops.CafeActivity;
import com.udicity.shams.tourinsuez.CategoryPackage.Category;
import com.udicity.shams.tourinsuez.Events.EventsActivity;
import com.udicity.shams.tourinsuez.Help.HelpActivity;
import com.udicity.shams.tourinsuez.Hospital.HospitalActivity;
import com.udicity.shams.tourinsuez.R;
import com.udicity.shams.tourinsuez.Restaurant.RestaurantActivity;
import com.udicity.shams.tourinsuez.Shopping.ShoppingActivity;
import com.udicity.shams.tourinsuez.TourismPlaces.TourismActivity;
import com.udicity.shams.tourinsuez.hotel.HotelActivity;


public class NavigationDrawerActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private String CATEGORY_ID;
    private int selectedCategoryId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        CATEGORY_ID = getString(R.string.category_id);
        String selected_cat = getIntent().getStringExtra(CATEGORY_ID);
        selectedCategoryId = Integer.valueOf(selected_cat);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation_drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        Intent intent;
        Category category = new Category();

        int itemId = item.getItemId();

        if (itemId == R.id.about_suez_tab) {
            if (selectedCategoryId == 1) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                intent = new Intent(this, AboutSuezActivity.class);
                category.setmCategoryId(1);
                intent.putExtra(CATEGORY_ID, String.valueOf(category.getmCategoryId()));
                startActivity(intent);
            }
        } else if (itemId == R.id.hotel_tab) {
            if (selectedCategoryId == 2) {
                drawer.closeDrawer(GravityCompat.START);

            } else {
                intent = new Intent(this, HotelActivity.class);
                category.setmCategoryId(2);
                intent.putExtra(CATEGORY_ID, String.valueOf(category.getmCategoryId()));
                startActivity(intent);
            }

        } else if (itemId == R.id.restaurant_tab) {
            if (selectedCategoryId == 3) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                intent = new Intent(this, RestaurantActivity.class);
                category.setmCategoryId(3);
                intent.putExtra(CATEGORY_ID, String.valueOf(category.getmCategoryId()));
                startActivity(intent);
            }
        } else if (itemId == R.id.tourism_tab) {
            if (selectedCategoryId == 4) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                intent = new Intent(this, TourismActivity.class);
                category.setmCategoryId(4);
                intent.putExtra(CATEGORY_ID, String.valueOf(category.getmCategoryId()));
                startActivity(intent);
            }
        } else if (itemId == R.id.event_tab) {
            if (selectedCategoryId == 5) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                intent = new Intent(this, EventsActivity.class);
                category.setmCategoryId(5);
                intent.putExtra(CATEGORY_ID, String.valueOf(category.getmCategoryId()));
                startActivity(intent);
            }
        } else if (itemId == R.id.shopping_tab) {
            if (selectedCategoryId == 6) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                intent = new Intent(this, ShoppingActivity.class);
                category.setmCategoryId(6);
                intent.putExtra(CATEGORY_ID, String.valueOf(category.getmCategoryId()));
                startActivity(intent);
            }
        } else if (itemId == R.id.cafe_tab) {
            if (selectedCategoryId == 7) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                intent = new Intent(this, CafeActivity.class);
                category.setmCategoryId(7);
                intent.putExtra(CATEGORY_ID, String.valueOf(category.getmCategoryId()));
                startActivity(intent);
            }
        } else if (itemId == R.id.hospital_tab) {
            if (selectedCategoryId == 8) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                intent = new Intent(this, HospitalActivity.class);
                category.setmCategoryId(8);
                intent.putExtra(CATEGORY_ID, String.valueOf(category.getmCategoryId()));
                startActivity(intent);
            }
        } else if (itemId == R.id.help_tab) {
            if (selectedCategoryId == 9) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                intent = new Intent(this, HelpActivity.class);
                category.setmCategoryId(9);
                intent.putExtra(CATEGORY_ID, String.valueOf(category.getmCategoryId()));
                startActivity(intent);
            }
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}