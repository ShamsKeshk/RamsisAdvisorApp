package com.udicity.shams.tourinsuez.CafeShops;

import android.app.Activity;
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
 * Created by shams on 30/06/17.
 */

public class CafeCategoryAdapter extends ArrayAdapter<CafeCategory> {

    public CafeCategoryAdapter(Activity activity, ArrayList<CafeCategory> cafeCategoryArrayList)
    {
        super(activity,0,cafeCategoryArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View cafeListItem = convertView;
        if (cafeListItem == null) {
            cafeListItem = LayoutInflater.from(getContext()).inflate(R.layout.cafe__shopping_restaurants_list_items, parent, false);
        }
        CafeCategory currentCafeItem = getItem(position);

        ImageView shoppingImageView = (ImageView) cafeListItem.findViewById(R.id.cafe_shopping_restaurant_image_view_id);
        shoppingImageView.setImageResource(currentCafeItem.getCafeImageResource());

        TextView shoppingName = (TextView) cafeListItem.findViewById(R.id.cafe_shopping_restaurant_name_text_view_id);
        shoppingName.setText(currentCafeItem.getCafeName());

        TextView shoppingTotalReview = (TextView) cafeListItem.findViewById(R.id.cafe_shopping_restaurant_review_number_text_view_id);
        shoppingTotalReview.setText(String.valueOf(currentCafeItem.getCafeTotalReview()));

        TextView shoppingOpenTime = (TextView) cafeListItem.findViewById(R.id.cafe_shopping_restaurant_open_time_text_view);
        if (currentCafeItem.getCafeTimeOpen() <= 12) {
            shoppingOpenTime.setText(currentCafeItem.getCafeTimeOpen() + " AM");
        } else {
            shoppingOpenTime.setText(currentCafeItem.getCafeTimeOpen() + " PM");
        }
        TextView shoppingCloseTime = (TextView) cafeListItem.findViewById(R.id.cafe_shopping_restaurant_close_time_text_view);
        if (currentCafeItem.getCafeTimeOpen() <= 12) {
            shoppingCloseTime.setText(currentCafeItem.getCafeTimeClose() + " AM");
        } else {
            shoppingCloseTime.setText(currentCafeItem.getCafeTimeClose() + " PM");
        }
        TextView shoppingAddress = (TextView) cafeListItem.findViewById(R.id.cafe_shopping_restaurant_address_text_view_id);
        shoppingAddress.setText(currentCafeItem.getCafeAddress());

        return cafeListItem;
    }
}