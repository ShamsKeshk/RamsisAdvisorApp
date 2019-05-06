package com.udicity.shams.tourinsuez.CafeShops;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.udicity.shams.tourinsuez.R;
import com.udicity.shams.tourinsuez.data.DataSourcer;

import java.util.ArrayList;

public class CafeFragment extends Fragment {

    public CafeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.cafe_fragment, container, false);

        ArrayList<CafeCategory> cafeCategoryArrayList = DataSourcer.getCafePlaces(getContext());
        CafeCategoryAdapter cafeCategoryAdapter = new CafeCategoryAdapter(getActivity(), cafeCategoryArrayList, getContext());
        ListView listView = rootView.findViewById(R.id.cafe_list_view);
        listView.setAdapter(cafeCategoryAdapter);
        return rootView;
    }
}