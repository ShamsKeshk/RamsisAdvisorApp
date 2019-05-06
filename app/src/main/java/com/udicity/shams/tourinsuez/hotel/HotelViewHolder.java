package com.udicity.shams.tourinsuez.hotel;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.udicity.shams.tourinsuez.R;

/**
 * Created by shams on 06/07/17.
 */

public class HotelViewHolder {

    private ImageView hotelImage;
    private TextView hotelName;
    private TextView hotelReview;
    private TextView hotelPhone;
    private TextView hotelAddress;

    public HotelViewHolder(View view) {
        this.hotelImage = view.findViewById(R.id.hotel_hospital_image_view_id);
        this.hotelName = view.findViewById(R.id.hotel_hospital_name_text_view_id);
        this.hotelReview = view.findViewById(R.id.hotel_hospital_number_review_text_view_id);
        this.hotelPhone = view.findViewById(R.id.hotel_hospital_phone_number_text_view_id);
        this.hotelAddress = view.findViewById(R.id.hotel_hospital_address_text_view_id);
    }

    public ImageView getHotelImage() {
        return hotelImage;
    }

    public TextView getHotelName() {
        return hotelName;
    }

    public TextView getHotelReview() {
        return hotelReview;
    }

    public TextView getHotelPhone() {
        return hotelPhone;
    }

    public TextView getHotelAddress() {
        return hotelAddress;
    }
}
