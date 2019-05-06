package com.udicity.shams.tourinsuez.Hospital;

import android.app.Activity;
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
 * Created by shams on 27/06/17.
 */

public class HospitalCategoryAdapter extends ArrayAdapter<HospitalCategory> {

    public HospitalCategoryAdapter(Activity activity, ArrayList<HospitalCategory> hospitalCategoryArrayList) {
        super(activity, 0, hospitalCategoryArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        HospitalViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.hotel_hospital_list_items, parent, false);

            viewHolder = new HospitalViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (HospitalViewHolder) convertView.getTag();
        }

        HospitalCategory currentHospital = getItem(position);

        assert currentHospital != null;

        Picasso.get()
                .load(currentHospital.getmCorporationImageResource())
                .into(viewHolder.getHospitalImage());

        viewHolder.getHospitalName().setText(currentHospital.getmCorporationName());

        viewHolder.getHospitalReview().setText(String.valueOf(currentHospital.getmCorporationTotalReview()));

        viewHolder.getHospitalPhone().setText(currentHospital.getmCorporationPhone());

        viewHolder.getHospitalAddress().setText(currentHospital.getmCorporationAddress());

        return convertView;
    }
}