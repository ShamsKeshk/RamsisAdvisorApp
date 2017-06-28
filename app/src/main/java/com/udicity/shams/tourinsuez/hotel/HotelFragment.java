package com.udicity.shams.tourinsuez.hotel;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

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

      /*  View root = inflater.inflate(R.layout.navigation_drawer_nav_header,container,false);
        LinearLayout linearLayout = (LinearLayout)root.findViewById(R.id.r);
        linearLayout.setBackgroundColor(ContextCompat.getColor(getActivity(),R.color.colorPrimary));
        */
        ArrayList<HotelCategory> hotelCategoryArrayList = DataSourcer.getHotel();
        ListView listView = (ListView)rootView.findViewById(R.id.hotel_list_view);
        HotelCategoryAdapter categoryAdapter= new HotelCategoryAdapter(getActivity(),hotelCategoryArrayList);
        listView.setAdapter(categoryAdapter);
        Toast.makeText(getActivity(),"Hello Hotel" , Toast.LENGTH_SHORT).show();

        return rootView;
    }

}
