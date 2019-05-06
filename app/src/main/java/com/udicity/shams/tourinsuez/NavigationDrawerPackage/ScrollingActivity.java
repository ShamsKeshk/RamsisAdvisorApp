package com.udicity.shams.tourinsuez.NavigationDrawerPackage;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.udicity.shams.tourinsuez.AboutSuez.AboutSuezActivity;
import com.udicity.shams.tourinsuez.CafeShops.CafeActivity;
import com.udicity.shams.tourinsuez.CategoryPackage.Category;
import com.udicity.shams.tourinsuez.CategoryPackage.CategoryAdapter;
import com.udicity.shams.tourinsuez.Events.EventsActivity;
import com.udicity.shams.tourinsuez.GoogleMap.MapsActivity;
import com.udicity.shams.tourinsuez.Help.HelpActivity;
import com.udicity.shams.tourinsuez.Hospital.HospitalActivity;
import com.udicity.shams.tourinsuez.R;
import com.udicity.shams.tourinsuez.Shopping.ShoppingActivity;
import com.udicity.shams.tourinsuez.TourismPlaces.TourismActivity;
import com.udicity.shams.tourinsuez.data.DataSourcer;
import com.udicity.shams.tourinsuez.hotel.HotelActivity;
import com.udicity.shams.tourinsuez.restaurant.RestaurantActivity;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ScrollingActivity extends AppCompatActivity {

    private static final String CATEGORY_ID = "categoryId";

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.fab)
    FloatingActionButton fab;

    @BindView(R.id.grid_view_categories)
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrolling_activity);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ScrollingActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });

        final ArrayList<Category> categoryArrayList = DataSourcer.getCategories(getApplicationContext());

        CategoryAdapter categoryAdapter = new CategoryAdapter(this, categoryArrayList);
        gridView.setAdapter(categoryAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Category currentCategory = categoryArrayList.get(position);
                openCategory(currentCategory);
            }
        });
    }

    public void openCategory(Category category) {
        int categoryId = category.getmCategoryId();

        switch (category.getmCategoryId()) {
            case 1:
                startCategoryActivity(NavigationDrawerActivity.class, categoryId);
                break;
            case 2:
                startCategoryActivity(HotelActivity.class, categoryId);
                break;
            case 3:
                startCategoryActivity(RestaurantActivity.class, categoryId);
                break;
            case 4:
                startCategoryActivity(TourismActivity.class, categoryId);
                break;
            case 5:
                startCategoryActivity(EventsActivity.class, categoryId);
                break;
            case 6:
                startCategoryActivity(ShoppingActivity.class, categoryId);
                break;
            case 7:
                startCategoryActivity(NavigationDrawerActivity.class, categoryId);
                break;
            case 8:
                startCategoryActivity(HospitalActivity.class, categoryId);
                break;
            case 9:
                startCategoryActivity(HelpActivity.class, categoryId);
                break;
            default:
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
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

    private void startCategoryActivity(Class activityClass, int categoryNumber) {
        Intent intent = new Intent(this, activityClass);
        intent.putExtra(CATEGORY_ID, categoryNumber);
        //intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

    }
}
