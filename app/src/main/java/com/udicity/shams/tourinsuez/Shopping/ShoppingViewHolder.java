package com.udicity.shams.tourinsuez.Shopping;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.udicity.shams.tourinsuez.R;

/**
 * Created by shams on 06/07/17.
 */

public class ShoppingViewHolder {

    private ImageView shoppingImage;
    private TextView shoppingName;
    private TextView shoppingTotalReview;
    private TextView shoppingOpenTime;
    private TextView shoppingCloseTime;
    private TextView shoppingAddress;

    public ShoppingViewHolder(View view) {
        this.shoppingImage = view.findViewById(R.id.cafe_shopping_restaurant_image_view_id);
        this.shoppingName = view.findViewById(R.id.cafe_shopping_restaurant_name_text_view_id);
        this.shoppingTotalReview = view.findViewById(R.id.cafe_shopping_restaurant_review_number_text_view_id);
        this.shoppingOpenTime = view.findViewById(R.id.cafe_shopping_restaurant_open_time_text_view);
        this.shoppingCloseTime = view.findViewById(R.id.cafe_shopping_restaurant_close_time_text_view);
        this.shoppingAddress = view.findViewById(R.id.cafe_shopping_restaurant_address_text_view_id);
    }

    public ImageView getShoppingImage() {
        return shoppingImage;
    }

    public TextView getShoppingName() {
        return shoppingName;
    }

    public TextView getShoppingTotalReview() {
        return shoppingTotalReview;
    }

    public TextView getShoppingOpenTime() {
        return shoppingOpenTime;
    }

    public TextView getShoppingCloseTime() {
        return shoppingCloseTime;
    }

    public TextView getShoppingAddress() {
        return shoppingAddress;
    }
}
