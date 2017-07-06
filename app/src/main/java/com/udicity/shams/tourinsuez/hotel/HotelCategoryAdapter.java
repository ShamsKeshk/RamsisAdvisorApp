package com.udicity.shams.tourinsuez.hotel;

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
 * Created by shams on 26/06/17.
 */

public class HotelCategoryAdapter extends ArrayAdapter<HotelCategory> {

    private Context context;

    public HotelCategoryAdapter(Activity activity, ArrayList<HotelCategory> hotelCategoryArrayList,Context context) {
        super(activity, 0, hotelCategoryArrayList);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View hotelListItemView = convertView;
        if (hotelListItemView == null) {
            hotelListItemView = LayoutInflater.from(getContext()).inflate(R.layout.hotel_hospital_list_items, parent, false);
        }
        HotelCategory currentHotel = getItem(position);
        TextView hotelNameTextView = (TextView) hotelListItemView.findViewById(R.id.hotel_hospital_name_text_view_id);
        hotelNameTextView.setText(currentHotel.getmHotelName());
        TextView reviewTextView = (TextView) hotelListItemView.findViewById(R.id.hotel_hospital_number_review_text_view_id);
        String hotelReview = currentHotel.getmFinalReview() + "\t"+context.getString(R.string.reviews);
        reviewTextView.setText(hotelReview);
        ImageView imageView = (ImageView) hotelListItemView.findViewById(R.id.hotel_hospital_image_view_id);
        imageView.setImageResource(currentHotel.getmHotelImageResource());

        TextView hotelPhoneTextView = (TextView) hotelListItemView.findViewById(R.id.hotel_hospital_phone_number_text_view_id);
        hotelPhoneTextView.setText(currentHotel.getmHotelPhoneNumber());
        TextView hotelAddressTextView = (TextView) hotelListItemView.findViewById(R.id.hotel_hospital_address_text_view_id);
        hotelAddressTextView.setText(currentHotel.getmHotelAddress());

        return hotelListItemView;
    }
}