package com.udicity.shams.tourinsuez;

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

import com.udicity.shams.tourinsuez.CategoryPackage.Category;
import com.udicity.shams.tourinsuez.CategoryPackage.CategoryAdapter;

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
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        final ArrayList<Category> categoryArrayList = new ArrayList<Category>();
        categoryArrayList.add(new Category("About",R.drawable.icon_info_green_30px,1,this));
        categoryArrayList.add(new Category("Hotel",R.drawable.icon_hotel_green_30px,2,this));
        categoryArrayList.add(new Category("Restaurant",R.drawable.icon_restaurant_green_30px,3,this));
        categoryArrayList.add(new Category("Tourism",R.drawable.icon_tourism_green_30px,4,this));
        categoryArrayList.add(new Category("Events",R.drawable.icon_event_green_30px,5,this));
        categoryArrayList.add(new Category("Shopping",R.drawable.icon_shopping_cart_green_30px,6,this));
        categoryArrayList.add(new Category("Store",R.drawable.icon_store_green_36px,7,this));
        categoryArrayList.add(new Category("Hospital",R.drawable.icon_local_hospital_green_30px,8,this));
        categoryArrayList.add(new Category("Help",R.drawable.icon_help_green_30px,9,this));


        GridView gridView = (GridView)findViewById(R.id.grid_view_categories);
        CategoryAdapter categoryAdapter = new CategoryAdapter(this , categoryArrayList);
        gridView.setAdapter(categoryAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Category currentCategory = categoryArrayList.get(position);
                sendToIntent(currentCategory.getActivityReference());
            }
        });
    }

    public void sendToIntent(Class activity)
    {
        startActivity(new Intent(ScrollingActivity.this,activity));
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
