package com.udicity.shams.tourinsuez.NavigationDrawerPackage;

/**
 * this is me 
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.GridView;

import com.udicity.shams.tourinsuez.AboutSuez.AboutSuezActivity;
import com.udicity.shams.tourinsuez.CafeShops.CafeActivity;
import com.udicity.shams.tourinsuez.CategoryPackage.Category;
import com.udicity.shams.tourinsuez.CategoryPackage.CategoryAdapter;
import com.udicity.shams.tourinsuez.Events.EventsActivity;
import com.udicity.shams.tourinsuez.GoogleMap.MapsActivity;
import com.udicity.shams.tourinsuez.Help.HelpActivity;
import com.udicity.shams.tourinsuez.Hospital.HospitalActivity;
import com.udicity.shams.tourinsuez.R;
import com.udicity.shams.tourinsuez.Restaurant.RestaurantActivity;
import com.udicity.shams.tourinsuez.Shopping.ShoppingActivity;
import com.udicity.shams.tourinsuez.TourismPlaces.TourismActivity;
import com.udicity.shams.tourinsuez.data.DataSourcer;
import com.udicity.shams.tourinsuez.hotel.HotelActivity;

import java.util.ArrayList;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrolling_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ScrollingActivity.this, MapsActivity.class);
                startActivity(intent);

               /* Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                        */
            }
        });

        final ArrayList<Category> categoryArrayList = DataSourcer.getCategories();

        GridView gridView = (GridView)findViewById(R.id.grid_view_categories);
        CategoryAdapter categoryAdapter = new CategoryAdapter(this , categoryArrayList);
        gridView.setAdapter(categoryAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Category currentCategory = categoryArrayList.get(position);
                sendToIntent(currentCategory);
            }
        });
    }

    public void sendToIntent(Category category)
    {
        Intent intent;
        switch(category.getmCategoryId())
        {
            case 1 :
                intent = new Intent(ScrollingActivity.this,AboutSuezActivity.class);
                intent.putExtra("categoryId", String.valueOf(category.getmCategoryId()));
                startActivity(intent);
                break;
            case 2 :
                intent = new Intent(ScrollingActivity.this,HotelActivity.class);
                intent.putExtra("categoryId", String.valueOf(category.getmCategoryId()));
                startActivity(intent);
                break;
            case 3 :
                intent = new Intent(ScrollingActivity.this,RestaurantActivity.class);
                intent.putExtra("categoryId", String.valueOf(category.getmCategoryId()));
                startActivity(intent);
                break;
            case 4 :
                intent = new  Intent(ScrollingActivity.this,TourismActivity.class);
                intent.putExtra("categoryId", String.valueOf(category.getmCategoryId()));
                startActivity(intent);
                break;
            case 5 :
                intent = new Intent(ScrollingActivity.this, EventsActivity.class);
                intent.putExtra("categoryId", String.valueOf(category.getmCategoryId()));
                startActivity(intent);
                break;
            case 6 :
                intent = new Intent(ScrollingActivity.this, ShoppingActivity.class);
                intent.putExtra("categoryId", String.valueOf(category.getmCategoryId()));
                startActivity(intent);
                break;
            case 7 :
                intent = new Intent(ScrollingActivity.this, CafeActivity.class);
                intent.putExtra("categoryId", String.valueOf(category.getmCategoryId()));
                startActivity(intent);
                break;
            case 8 :
                intent = new Intent(ScrollingActivity.this, HospitalActivity.class);
                intent.putExtra("categoryId", String.valueOf(category.getmCategoryId()));
                startActivity(intent);
                break;
            case 9 :
                intent = new Intent(ScrollingActivity.this,HelpActivity.class);
                intent.putExtra("categoryId", String.valueOf(category.getmCategoryId()));
                startActivity(intent);
                break;
            default:
                return;
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
}
