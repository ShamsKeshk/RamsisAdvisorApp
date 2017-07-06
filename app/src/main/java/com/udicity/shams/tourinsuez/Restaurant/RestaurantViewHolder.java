package com.udicity.shams.tourinsuez.Restaurant;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.udicity.shams.tourinsuez.R;

/**
 * Created by shams on 06/07/17.
 */

public class RestaurantViewHolder {

    private ImageView restaurantImage;
    private TextView restaurantName;
    private TextView restaurantTotalReview;
    private TextView restaurantOpenTime;
    private TextView restaurantCloseTime;
    private TextView restaurantAddress;

    public RestaurantViewHolder(View view) {
        this.restaurantImage = (ImageView) view.findViewById(R.id.cafe_shopping_restaurant_image_view_id);
        this.restaurantName = (TextView) view.findViewById(R.id.cafe_shopping_restaurant_name_text_view_id);
        this.restaurantTotalReview = (TextView) view.findViewById(R.id.cafe_shopping_restaurant_review_number_text_view_id);
        this.restaurantOpenTime = (TextView) view.findViewById(R.id.cafe_shopping_restaurant_open_time_text_view);
        this.restaurantCloseTime = (TextView) view.findViewById(R.id.cafe_shopping_restaurant_close_time_text_view);
        this.restaurantAddress = (TextView) view.findViewById(R.id.cafe_shopping_restaurant_address_text_view_id);
    }

    public ImageView getRestaurantImage() {
        return restaurantImage;
    }

    public TextView getRestaurantName() {
        return restaurantName;
    }

    public TextView getRestaurantTotalReview() {
        return restaurantTotalReview;
    }

    public TextView getRestaurantOpenTime() {
        return restaurantOpenTime;
    }

    public TextView getRestaurantCloseTime() {
        return restaurantCloseTime;
    }

    public TextView getRestaurantAddress() {
        return restaurantAddress;
    }
}
