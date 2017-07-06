package com.udicity.shams.tourinsuez.Restaurant;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.udicity.shams.tourinsuez.R;

import java.util.ArrayList;

/**
 * Created by shams on 25/06/17.
 * Done
 */

public class RestaurantCategoryAdapter extends ArrayAdapter<RestaurantCategory> {

    private Context context;

    public RestaurantCategoryAdapter(Activity activity, ArrayList<RestaurantCategory> restaurantCategoryArrayList, Context context) {
        super(activity, 0, restaurantCategoryArrayList);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        RestaurantViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.cafe__shopping_restaurants_list_items, parent, false);

            viewHolder = new RestaurantViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (RestaurantViewHolder) convertView.getTag();
        }

        RestaurantCategory currentRestaurant = getItem(position);

        assert currentRestaurant != null;

        viewHolder.getRestaurantImage().setImageResource(currentRestaurant.getmRestaurantImageResource());

        viewHolder.getRestaurantName().setText(currentRestaurant.getmRestaurantName());

        String restaurantReview = currentRestaurant.getmFinalReview() + "\t" + context.getString(R.string.reviews);
        viewHolder.getRestaurantTotalReview().setText(restaurantReview);

        int openTime = currentRestaurant.getmRestaurantTimeOpen();
        String openTimeText;
        if (openTime < 12 && openTime >= 0) {
            openTimeText = String.valueOf(openTime) + context.getString(R.string.am);
            viewHolder.getRestaurantOpenTime().setText(openTimeText);
        } else {
            openTime = openTime - 12;
            openTimeText = String.valueOf(openTime) + context.getString(R.string.pm);
            viewHolder.getRestaurantOpenTime().setText(openTimeText);
        }

        int closeTime = currentRestaurant.getmRestaurantTimeClose();
        String closeTimeText;
        if (closeTime < 12 && closeTime >= 0) {
            closeTimeText = String.valueOf(closeTime) + context.getString(R.string.am);
            viewHolder.getRestaurantCloseTime().setText(closeTimeText);
        } else {
            closeTime = closeTime - 12;
            closeTimeText = String.valueOf(closeTime) + context.getString(R.string.pm);
            viewHolder.getRestaurantCloseTime().setText(closeTimeText);
        }

        viewHolder.getRestaurantAddress().setText(currentRestaurant.getmRestaurantAddress());

        return convertView;
    }
}