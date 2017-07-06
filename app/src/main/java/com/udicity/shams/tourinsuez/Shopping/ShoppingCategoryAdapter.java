package com.udicity.shams.tourinsuez.Shopping;

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
 * Created by shams on 27/06/17.
 */

public class ShoppingCategoryAdapter extends ArrayAdapter<ShoppingCategory> {

    private Context context;


    public ShoppingCategoryAdapter(Activity activity, ArrayList<ShoppingCategory> shoppingCategoryArrayList, Context context) {
        super(activity, 0, shoppingCategoryArrayList);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ShoppingViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.cafe__shopping_restaurants_list_items, parent, false);

            viewHolder = new ShoppingViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ShoppingViewHolder) convertView.getTag();
        }

        ShoppingCategory currentShoppingItem = getItem(position);

        assert currentShoppingItem != null;

        viewHolder.getShoppingImage().setImageResource(currentShoppingItem.getShopImageResource());

        viewHolder.getShoppingName().setText(currentShoppingItem.getShopName());

        viewHolder.getShoppingTotalReview().setText(String.valueOf(currentShoppingItem.getShopTotalReview()));

        String openTime;
        if (currentShoppingItem.getShopTimeOpen() <= 12) {
            openTime = currentShoppingItem.getShopTimeOpen() + context.getString(R.string.am);
            viewHolder.getShoppingOpenTime().setText(openTime);
        } else {
            openTime = currentShoppingItem.getShopTimeOpen() + context.getString(R.string.pm);
            viewHolder.getShoppingOpenTime().setText(openTime);
        }

        String closeTime;
        if (currentShoppingItem.getShopTimeOpen() <= 12) {
            closeTime = currentShoppingItem.getShopTimeClose() + context.getString(R.string.am);
            viewHolder.getShoppingCloseTime().setText(closeTime);
        } else {
            closeTime = currentShoppingItem.getShopTimeClose() + context.getString(R.string.pm);
            viewHolder.getShoppingCloseTime().setText(closeTime);
        }

        viewHolder.getShoppingAddress().setText(currentShoppingItem.getShopAddress());

        return convertView;
    }
}