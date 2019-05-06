package com.udicity.shams.tourinsuez.NavigationDrawerPackage;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.navigation.NavigationView;
import com.udicity.shams.tourinsuez.AboutSuez.AboutSuezActivity;
import com.udicity.shams.tourinsuez.AboutSuez.MainAboutFragment;
import com.udicity.shams.tourinsuez.CafeShops.CafeActivity;
import com.udicity.shams.tourinsuez.CafeShops.CafeFragment;
import com.udicity.shams.tourinsuez.CafeShops.MainCafeFragment;
import com.udicity.shams.tourinsuez.Events.EventsActivity;
import com.udicity.shams.tourinsuez.Help.HelpActivity;
import com.udicity.shams.tourinsuez.Hospital.HospitalActivity;
import com.udicity.shams.tourinsuez.R;
import com.udicity.shams.tourinsuez.Shopping.ShoppingActivity;
import com.udicity.shams.tourinsuez.TourismPlaces.TourismActivity;
import com.udicity.shams.tourinsuez.hotel.HotelActivity;
import com.udicity.shams.tourinsuez.restaurant.RestaurantActivity;

import butterknife.BindView;
import butterknife.ButterKnife;


public class NavigationDrawerActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener , MainAboutFragment.OnFragmentInteractionListener {

    private static final String CATEGORY_ID = "categoryId";
    @BindView(R.id.drawer_layout)
    DrawerLayout drawer;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.nav_view)
    NavigationView navigationView;
    private int selectedCategoryId;

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer_activity);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        selectedCategoryId = getIntent().getIntExtra(CATEGORY_ID, 7);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);

        fragmentManager = getSupportFragmentManager();

        Toast.makeText(getApplicationContext(),"Id : " + selectedCategoryId,Toast.LENGTH_LONG).show();

        startFragment(selectedCategoryId);
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
            finish();
        } else {
            finish();
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

    private void startFragment(int catId){
        switch (catId){
            case 1:
                replaceFrame(new MainAboutFragment());
                break;
            case 7:
                replaceFrame(new MainCafeFragment());
                break;
            default:
                replaceFrame(new MainAboutFragment());
        }
    }

    private void replaceFrame(Fragment fragment){
        fragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
        fragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.navigation_drawer_content_frame_layout_id,fragment).commit();
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.


        int itemId = item.getItemId();

        switch (itemId) {
            case R.id.about_suez_tab:
                if (selectedCategoryId == 1) {
                    drawer.closeDrawer(GravityCompat.START);
                } else {
                   // startActivity(AboutSuezActivity.class, 1);
                    replaceFrame(new MainAboutFragment());
                    selectedCategoryId = 1;
                }
                break;
            case R.id.hotel_tab:
                if (selectedCategoryId == 2) {
                    drawer.closeDrawer(GravityCompat.START);
                } else {
                    startActivity(HotelActivity.class, 2);
                }
                break;
            case R.id.restaurant_tab:
                if (selectedCategoryId == 3) {
                    drawer.closeDrawer(GravityCompat.START);
                } else {
                    startActivity(RestaurantActivity.class, 3);
                }
                break;
            case R.id.tourism_tab:
                if (selectedCategoryId == 4) {
                    drawer.closeDrawer(GravityCompat.START);
                } else {
                    startActivity(TourismActivity.class, 4);
                }
                break;
            case R.id.event_tab:
                if (selectedCategoryId == 5) {
                    drawer.closeDrawer(GravityCompat.START);
                } else {
                    startActivity(EventsActivity.class, 5);
                }
                break;
            case R.id.shopping_tab:
                if (selectedCategoryId == 6) {
                    drawer.closeDrawer(GravityCompat.START);
                } else {
                    startActivity(ShoppingActivity.class, 6);
                }
                break;
            case R.id.cafe_tab:
                if (selectedCategoryId == 7) {
                    drawer.closeDrawer(GravityCompat.START);
                } else {
                  //  startActivity(CafeActivity.class, 7);
                    replaceFrame(new MainCafeFragment());
                    selectedCategoryId = 7;
                }
                break;
            case R.id.hospital_tab:
                if (selectedCategoryId == 8) {
                    drawer.closeDrawer(GravityCompat.START);
                } else {
                    startActivity(HospitalActivity.class, 8);
                }
                break;
            case R.id.help_tab:
                if (selectedCategoryId == 9) {
                    drawer.closeDrawer(GravityCompat.START);
                } else {
                    startActivity(HelpActivity.class, 9);
                }
                break;
            default:
                return true;

        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void startActivity(Class activityClass, int categoryNumber) {
        Intent intent = new Intent(this, activityClass);
        intent.putExtra(CATEGORY_ID, categoryNumber);
        drawer.closeDrawer(GravityCompat.START);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();

    }


}