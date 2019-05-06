package com.udicity.shams.tourinsuez.Hospital;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.udicity.shams.tourinsuez.R;

/**
 * Created by shams on 06/07/17.
 */

public class HospitalViewHolder {

    private ImageView hospitalImage;
    private TextView hospitalName;
    private TextView hospitalReview;
    private TextView hospitalPhone;
    private TextView hospitalAddress;

    public HospitalViewHolder(View view) {
        this.hospitalImage = view.findViewById(R.id.hotel_hospital_image_view_id);
        this.hospitalName = view.findViewById(R.id.hotel_hospital_name_text_view_id);
        this.hospitalReview = view.findViewById(R.id.hotel_hospital_number_review_text_view_id);
        this.hospitalPhone = view.findViewById(R.id.hotel_hospital_phone_number_text_view_id);
        this.hospitalAddress = view.findViewById(R.id.hotel_hospital_address_text_view_id);
    }

    public ImageView getHospitalImage() {
        return hospitalImage;
    }

    public TextView getHospitalName() {
        return hospitalName;
    }

    public TextView getHospitalReview() {
        return hospitalReview;
    }

    public TextView getHospitalPhone() {
        return hospitalPhone;
    }

    public TextView getHospitalAddress() {
        return hospitalAddress;
    }
}
