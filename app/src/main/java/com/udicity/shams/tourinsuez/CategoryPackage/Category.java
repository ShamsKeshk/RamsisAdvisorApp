package com.udicity.shams.tourinsuez.CategoryPackage;

import android.content.Context;
import android.widget.Toast;

import com.udicity.shams.tourinsuez.NavigationDrawerActivity;
import com.udicity.shams.tourinsuez.R;

/**
 * Created by shams on 25/06/17.
 */

public class Category {
    Context context;

    private String mCategoryName;
    private int mCategoryImageResource;
    private int mCategoryId;

    public Category(String categoryName, int categoryImageResource, int categoryId ,Context context) {
        mCategoryName = categoryName;
        mCategoryImageResource = categoryImageResource;
        mCategoryId = categoryId;
        this.context = context;
    }

    public void setmCategoryName(String categoryName) {
        mCategoryName = categoryName;
    }

    public String getmCategoryName() {
        return mCategoryName;
    }

    public void setmCategoryImageResource(int categoryImageResource) {
        mCategoryImageResource = categoryImageResource;
    }

    public int getmCategoryImageResource() {
        return mCategoryImageResource;
    }

    public void setmCategoryId(int categoryId) {
        mCategoryId = categoryId;
    }

    public int getmCategoryId() {
        return mCategoryId;
    }

    public Class getActivityReference() {
        switch (mCategoryId) {
            case 1:
                Toast.makeText(context, R.string.about_suez_category,Toast.LENGTH_SHORT).show();
                    return NavigationDrawerActivity.class ;
            case 2:
                Toast.makeText(context, R.string.hotel_category,Toast.LENGTH_SHORT).show();
                return NavigationDrawerActivity.class;
            case 3:
                Toast.makeText(context, R.string.restaurant_category,Toast.LENGTH_SHORT).show();
                return NavigationDrawerActivity.class;
            case 4:
                Toast.makeText(context, R.string.tourism_category,Toast.LENGTH_SHORT).show();
                return NavigationDrawerActivity.class;
            case 5:
                Toast.makeText(context, R.string.events_category,Toast.LENGTH_SHORT).show();
                return NavigationDrawerActivity.class;
            case 6:
                Toast.makeText(context, R.string.shopping_category,Toast.LENGTH_SHORT).show();
                return NavigationDrawerActivity.class;
            case 7:
                Toast.makeText(context, R.string.store_category,Toast.LENGTH_SHORT).show();
                return NavigationDrawerActivity.class;
            case 8:
                Toast.makeText(context, R.string.hospital_category,Toast.LENGTH_SHORT).show();
                return NavigationDrawerActivity.class;
            case 9:
                Toast.makeText(context, R.string.help_category,Toast.LENGTH_SHORT).show();
                return NavigationDrawerActivity.class;
            default:
                return null;
        }
    }
}
