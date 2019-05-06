package com.udicity.shams.tourinsuez.CafeShops;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;
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

        CafeShopViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.cafe__shopping_restaurants_list_items, parent, false);

            viewHolder = new CafeShopViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (CafeShopViewHolder) convertView.getTag();
        }

        CafeCategory currentCafeItem = getItem(position);

        assert currentCafeItem != null;

        Picasso.get()
                .load(currentCafeItem.getCafeImageResource())
                .into(viewHolder.getCafeImage());

        viewHolder.getCafeName().setText(currentCafeItem.getCafeName());
        viewHolder.getCafeTotalReview().setText(String.valueOf(currentCafeItem.getCafeTotalReview()));

        String cafeOpenText;
        if (currentCafeItem.getCafeTimeOpen() <= 12) {
            cafeOpenText = currentCafeItem.getCafeTimeOpen() + context.getString(R.string.am);
            viewHolder.getCafeOpenTime().setText(cafeOpenText);
        } else {
            cafeOpenText = currentCafeItem.getCafeTimeOpen() + context.getString(R.string.pm);
            viewHolder.getCafeOpenTime().setText(cafeOpenText);
        }

        String cafeCloseText;
        if (currentCafeItem.getCafeTimeOpen() <= 12) {
            cafeCloseText = currentCafeItem.getCafeTimeClose() + context.getString(R.string.am);
            viewHolder.getCafeCloseTime().setText(cafeCloseText);
        } else {
            cafeCloseText = currentCafeItem.getCafeTimeClose() + context.getString(R.string.pm);
            viewHolder.getCafeCloseTime().setText(cafeCloseText);
        }

        viewHolder.getCafeAddress().setText(currentCafeItem.getCafeAddress());
        viewHolder.getRatingBar().setNumStars(6);
        viewHolder.getRatingBar().setRating(2.5f);

        return convertView;
    }
}