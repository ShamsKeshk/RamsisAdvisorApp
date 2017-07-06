package com.udicity.shams.tourinsuez.CafeShops;

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
 * Created by shams on 30/06/17.
 */

public class CafeCategoryAdapter extends ArrayAdapter<CafeCategory> {

    private Context context;

    public CafeCategoryAdapter(Activity activity, ArrayList<CafeCategory> cafeCategoryArrayList, Context context) {
        super(activity, 0, cafeCategoryArrayList);
        this.context = context;
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
        String cafeOpenText;
        if (currentCafeItem.getCafeTimeOpen() <= 12) {
            cafeOpenText = currentCafeItem.getCafeTimeOpen() + context.getString(R.string.am);
            shoppingOpenTime.setText(cafeOpenText);
        } else {
            cafeOpenText = currentCafeItem.getCafeTimeOpen() + context.getString(R.string.pm);
            shoppingOpenTime.setText(cafeOpenText);
        }
        TextView shoppingCloseTime = (TextView) cafeListItem.findViewById(R.id.cafe_shopping_restaurant_close_time_text_view);
        String cafeCloseText;
        if (currentCafeItem.getCafeTimeOpen() <= 12) {
            cafeCloseText = currentCafeItem.getCafeTimeClose() + context.getString(R.string.am);
            shoppingCloseTime.setText(cafeCloseText);
        } else {
            cafeCloseText = currentCafeItem.getCafeTimeClose() + context.getString(R.string.pm);
            shoppingCloseTime.setText(cafeCloseText);
        }
        TextView shoppingAddress = (TextView) cafeListItem.findViewById(R.id.cafe_shopping_restaurant_address_text_view_id);
        shoppingAddress.setText(currentCafeItem.getCafeAddress());

        return cafeListItem;
    }
}