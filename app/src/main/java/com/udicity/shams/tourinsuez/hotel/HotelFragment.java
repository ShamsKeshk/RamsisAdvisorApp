package com.udicity.shams.tourinsuez.hotel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.udicity.shams.tourinsuez.R;
import com.udicity.shams.tourinsuez.data.DataSourcer;

import java.util.ArrayList;


public class HotelFragment extends Fragment {

    public HotelFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.hotel_main_fragment, container, false);

        ArrayList<HotelCategory> hotelCategoryArrayList = DataSourcer.getHotel(getContext());
        ListView listView = rootView.findViewById(R.id.hotel_list_view);
        HotelCategoryAdapter categoryAdapter = new HotelCategoryAdapter(getActivity(), hotelCategoryArrayList, getContext());
        listView.setAdapter(categoryAdapter);
        Toast.makeText(getActivity(), R.string.hotel_category, Toast.LENGTH_SHORT).show();

        return rootView;
    }
}