package com.udicity.shams.tourinsuez.CafeShops;

import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.udicity.shams.tourinsuez.R;

/**
 * Created by shams on 06/07/17.
 */

public class CafeShopViewHolder {

    private ImageView cafeImage;
    private TextView cafeName;
    private TextView cafeTotalReview;
    private TextView cafeOpenTime;
    private TextView cafeCloseTime;
    private TextView cafeAddress;
    private RatingBar mRatingBar;

    public CafeShopViewHolder(View view) {
        cafeImage = view.findViewById(R.id.cafe_shopping_restaurant_image_view_id);
        cafeName = view.findViewById(R.id.cafe_shopping_restaurant_name_text_view_id);
        cafeTotalReview = view.findViewById(R.id.cafe_shopping_restaurant_review_number_text_view_id);
        cafeOpenTime = view.findViewById(R.id.cafe_shopping_restaurant_open_time_text_view);
        cafeCloseTime = view.findViewById(R.id.cafe_shopping_restaurant_close_time_text_view);
        cafeAddress = view.findViewById(R.id.cafe_shopping_restaurant_address_text_view_id);
        mRatingBar = view.findViewById(R.id.cafe_shopping_restaurant_rating_review_id);
    }

    public ImageView getCafeImage() {
        return cafeImage;
    }

    public TextView getCafeName() {
        return cafeName;
    }

    public TextView getCafeTotalReview() {
        return cafeTotalReview;
    }

    public TextView getCafeOpenTime() {
        return cafeOpenTime;
    }

    public TextView getCafeCloseTime() {
        return cafeCloseTime;
    }

    public TextView getCafeAddress() {
        return cafeAddress;
    }

    public RatingBar getRatingBar() {
        return mRatingBar;
    }
}
