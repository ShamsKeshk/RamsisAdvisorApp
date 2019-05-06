package com.udicity.shams.tourinsuez.hotel;

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
 * Created by shams on 26/06/17.
 */

public class HotelCategoryAdapter extends ArrayAdapter<HotelCategory> {

    private Context context;

    public HotelCategoryAdapter(Activity activity, ArrayList<HotelCategory> hotelCategoryArrayList, Context context) {
        super(activity, 0, hotelCategoryArrayList);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        HotelViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.hotel_hospital_list_items, parent, false);

            viewHolder = new HotelViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (HotelViewHolder) convertView.getTag();
        }

        HotelCategory currentHotel = getItem(position);

        assert currentHotel != null;

        viewHolder.getHotelName().setText(currentHotel.getmHotelName());

        String hotelReview = currentHotel.getmFinalReview() + "\t" + context.getString(R.string.reviews);
        viewHolder.getHotelReview().setText(hotelReview);

        Picasso.get()
                .load(currentHotel.getmHotelImageResource())
                .into(viewHolder.getHotelImage());

        viewHolder.getHotelPhone().setText(currentHotel.getmHotelPhoneNumber());

        viewHolder.getHotelAddress().setText(currentHotel.getmHotelAddress());

        return convertView;
    }
}