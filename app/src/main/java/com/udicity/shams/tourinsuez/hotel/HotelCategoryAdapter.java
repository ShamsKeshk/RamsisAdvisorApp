package com.udicity.shams.tourinsuez.hotel;

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
 * Created by shams on 26/06/17.
 */

public class HotelCategoryAdapter extends ArrayAdapter<HotelCategory>{

    public HotelCategoryAdapter(Activity activity, ArrayList<HotelCategory> hotelCategoryArrayList)
    {
        super(activity,0,hotelCategoryArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View hotelListItemView = convertView;
        if (hotelListItemView == null)
        {
            hotelListItemView = LayoutInflater.from(getContext()).inflate(R.layout.hotel_list_items,parent,false);
        }
        HotelCategory currentHotel = getItem(position);
        TextView hotelNameTextView = (TextView) hotelListItemView.findViewById(R.id.hotel_name_text_view_id);
        hotelNameTextView.setText(currentHotel.getmHotelName());
        TextView reviewTextView = (TextView)hotelListItemView.findViewById(R.id.hotel_number_review_text_view_id);
        reviewTextView.setText(currentHotel.getmFinalReview()+" Review");
        ImageView imageView = (ImageView)hotelListItemView.findViewById(R.id.hotel_filter_image_view);
        imageView.setImageResource(currentHotel.getmHotelImageResource());
        return hotelListItemView;
    }
}
