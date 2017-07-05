package com.udicity.shams.tourinsuez.Hospital;

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

public class HospitalCategoryAdapter extends ArrayAdapter<HospitalCategory> {

    public HospitalCategoryAdapter(Activity activity,ArrayList<HospitalCategory> hospitalCategoryArrayList)
    {
        super(activity,0,hospitalCategoryArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View hospitalListItems = convertView;
        if (hospitalListItems == null)
        {
            hospitalListItems = LayoutInflater.from(getContext()).inflate(R.layout.hotel_hospital_list_items,parent,false);
        }
        HospitalCategory currentHospital = getItem(position);

        ImageView hospitalImageView = (ImageView)hospitalListItems.findViewById(R.id.hotel_hospital_image_view_id);
        hospitalImageView.setImageResource(currentHospital.getmCorporationImageResource());

        TextView hospitalNameTextView = (TextView)hospitalListItems.findViewById(R.id.hotel_hospital_name_text_view_id);
        hospitalNameTextView.setText(currentHospital.getmCorporationName());

        TextView hospitalReviewTextView = (TextView)hospitalListItems.findViewById(R.id.hotel_hospital_number_review_text_view_id);
        hospitalReviewTextView.setText(String.valueOf(currentHospital.getmCorporationTotalReview()));

        TextView hospitalPhoneTextView = (TextView)hospitalListItems.findViewById(R.id.hotel_hospital_phone_number_text_view_id);
        hospitalPhoneTextView.setText(currentHospital.getmCorporationPhone());

        TextView hospitalAddressTextView = (TextView)hospitalListItems.findViewById(R.id.hotel_hospital_address_text_view_id);
        hospitalAddressTextView.setText(currentHospital.getmCorporationAddress());

        return hospitalListItems;
    }
}