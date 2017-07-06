package com.udicity.shams.tourinsuez.CafeShops;

import android.view.View;
import android.widget.ImageView;
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

    public CafeShopViewHolder(View view) {
        cafeImage = (ImageView) view.findViewById(R.id.cafe_shopping_restaurant_image_view_id);
        cafeName = (TextView) view.findViewById(R.id.cafe_shopping_restaurant_name_text_view_id);
        cafeTotalReview = (TextView) view.findViewById(R.id.cafe_shopping_restaurant_review_number_text_view_id);
        cafeOpenTime = (TextView) view.findViewById(R.id.cafe_shopping_restaurant_open_time_text_view);
        cafeCloseTime = (TextView) view.findViewById(R.id.cafe_shopping_restaurant_close_time_text_view);
        cafeAddress = (TextView) view.findViewById(R.id.cafe_shopping_restaurant_address_text_view_id);
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
}
