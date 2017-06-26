package com.udicity.shams.tourinsuez.Restaurant;

import android.app.Activity;
import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.icu.text.TimeZoneFormat;
import android.icu.util.Calendar;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.udicity.shams.tourinsuez.R;

import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by shams on 25/06/17.
 */

public class RestaurantCategoryAdapter extends ArrayAdapter<RestaurantCategory> {

    public RestaurantCategoryAdapter(Activity activity,ArrayList<RestaurantCategory> restaurantCategoryArrayList)
    {
        super(activity,0,restaurantCategoryArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listRestaurantView = convertView;
        if (listRestaurantView == null)
        {
         listRestaurantView = LayoutInflater.from(getContext()).inflate(R.layout.restaurant_food_filter_items,parent,false);
        }
        RestaurantCategory currentRestaurant = getItem(position);
        TextView restaurantNameTextView = (TextView) listRestaurantView.findViewById(R.id.restaurant_name_text_view_id);
        restaurantNameTextView.setText(currentRestaurant.getmRestaurantName());
        TextView reviewTextView = (TextView)listRestaurantView.findViewById(R.id.restaurant_number_review_text_view_id);
        reviewTextView.setText(currentRestaurant.getmFinalReview()+" Review");
        TextView timeOpen = (TextView)listRestaurantView.findViewById(R.id.restaurant_open_time_text_view);
        int openTime = currentRestaurant.getmRestaurantTimeOpen();
        if(openTime < 12 &&openTime >= 0)
        {
            timeOpen.setText(String.valueOf(openTime)+" AM");
        }else
        {
            timeOpen.setText(String.valueOf(openTime)+" PM");
        }
        TextView timeClose = (TextView)listRestaurantView.findViewById(R.id.restaurant_close_time_text_view);
        int closeTime = currentRestaurant.getmRestaurantTimeClose();
        if(closeTime < 12 &&closeTime >= 0)
        {
            timeClose.setText(String.valueOf(closeTime)+" AM");
        }else
        {
            timeClose.setText(String.valueOf(closeTime)+" PM");
        }

        return listRestaurantView;
    }
}
