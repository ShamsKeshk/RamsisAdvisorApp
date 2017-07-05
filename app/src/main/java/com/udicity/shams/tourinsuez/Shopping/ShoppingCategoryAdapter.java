package com.udicity.shams.tourinsuez.Shopping;

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
 * Created by shams on 27/06/17.
 */

public class ShoppingCategoryAdapter extends ArrayAdapter<ShoppingCategory> {

    public ShoppingCategoryAdapter(Activity activity, ArrayList<ShoppingCategory> shoppingCategoryArrayList)
    {
        super(activity,0,shoppingCategoryArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View shoppingListItem = convertView;
        if(shoppingListItem == null)
        {
            shoppingListItem = LayoutInflater.from(getContext()).inflate(R.layout.cafe__shopping_restaurants_list_items,parent,false);
        }
        ShoppingCategory currentShoppingItem = getItem(position);

        ImageView shoppingImageView = (ImageView)shoppingListItem.findViewById(R.id.cafe_shopping_restaurant_image_view_id);
        shoppingImageView.setImageResource(currentShoppingItem.getShopImageResource());

        TextView shoppingName = (TextView)shoppingListItem.findViewById(R.id.cafe_shopping_restaurant_name_text_view_id);
        shoppingName.setText(currentShoppingItem.getShopName());

        TextView shoppingTotalReview = (TextView)shoppingListItem.findViewById(R.id.cafe_shopping_restaurant_review_number_text_view_id);
        shoppingTotalReview.setText(String.valueOf(currentShoppingItem.getShopTotalReview()));

        TextView shoppingOpenTime = (TextView)shoppingListItem.findViewById(R.id.cafe_shopping_restaurant_open_time_text_view);
        if (currentShoppingItem.getShopTimeOpen() <= 12)
        {
            shoppingOpenTime.setText(currentShoppingItem.getShopTimeOpen()+" AM");
        }else
        {
            shoppingOpenTime.setText(currentShoppingItem.getShopTimeOpen()+" PM");
        }
        TextView shoppingCloseTime = (TextView)shoppingListItem.findViewById(R.id.cafe_shopping_restaurant_close_time_text_view);
        if (currentShoppingItem.getShopTimeOpen() <= 12)
        {
            shoppingCloseTime.setText(currentShoppingItem.getShopTimeClose()+" AM");
        }else
        {
            shoppingCloseTime.setText(currentShoppingItem.getShopTimeClose()+" PM");
        }
        TextView shoppingAddress = (TextView)shoppingListItem.findViewById(R.id.cafe_shopping_restaurant_address_text_view_id);
        shoppingAddress.setText(currentShoppingItem.getShopAddress());

        return shoppingListItem;
    }
}