package com.udicity.shams.tourinsuez.Restaurant;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.udicity.shams.tourinsuez.R;

import java.util.ArrayList;

/**
 * Created by shams on 25/06/17.
 * Done
 */

public class RestaurantCategoryAdapter extends ArrayAdapter<RestaurantCategory> {

    private Context context;

    public RestaurantCategoryAdapter(Activity activity, ArrayList<RestaurantCategory> restaurantCategoryArrayList,Context context) {
        super(activity, 0, restaurantCategoryArrayList);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listRestaurantView = convertView;
        if (listRestaurantView == null) {
            listRestaurantView = LayoutInflater.from(getContext()).inflate(R.layout.cafe__shopping_restaurants_list_items, parent, false);
        }
        RestaurantCategory currentRestaurant = getItem(position);
        ImageView restaurantImageView = (ImageView) listRestaurantView.findViewById(R.id.cafe_shopping_restaurant_image_view_id);
        restaurantImageView.setImageResource(currentRestaurant.getmRestaurantImageResource());
        TextView restaurantNameTextView = (TextView) listRestaurantView.findViewById(R.id.cafe_shopping_restaurant_name_text_view_id);
        restaurantNameTextView.setText(currentRestaurant.getmRestaurantName());
        TextView reviewTextView = (TextView) listRestaurantView.findViewById(R.id.cafe_shopping_restaurant_review_number_text_view_id);
        String restaurantReview = currentRestaurant.getmFinalReview() + "\t"+context.getString(R.string.reviews);
        reviewTextView.setText(restaurantReview);
        TextView timeOpen = (TextView) listRestaurantView.findViewById(R.id.cafe_shopping_restaurant_open_time_text_view);
        int openTime = currentRestaurant.getmRestaurantTimeOpen();
        String openTimeText;
        if (openTime < 12 && openTime >= 0) {
            openTimeText = String.valueOf(openTime) + context.getString(R.string.am);
            timeOpen.setText(openTimeText);
        } else {
            openTime = openTime - 12;
            openTimeText = String.valueOf(openTime) + context.getString(R.string.pm);
            timeOpen.setText(openTimeText);
        }
        TextView timeClose = (TextView) listRestaurantView.findViewById(R.id.cafe_shopping_restaurant_close_time_text_view);
        int closeTime = currentRestaurant.getmRestaurantTimeClose();
        String closeTimeText;
        if (closeTime < 12 && closeTime >= 0) {
            closeTimeText = String.valueOf(closeTime) + context.getString(R.string.am);
            timeClose.setText(closeTimeText);
        } else {
            closeTime = closeTime - 12;
            closeTimeText = String.valueOf(closeTime) + context.getString(R.string.pm);
            timeClose.setText(closeTimeText);
        }
        TextView restaurantAddress = (TextView) listRestaurantView.findViewById(R.id.cafe_shopping_restaurant_address_text_view_id);
        restaurantAddress.setText(currentRestaurant.getmRestaurantAddress());

        return listRestaurantView;
    }
}