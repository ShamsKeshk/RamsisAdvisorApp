package com.udicity.shams.tourinsuez.TourismPlaces;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.udicity.shams.tourinsuez.R;
import com.udicity.shams.tourinsuez.data.DataSourcer;

import java.util.ArrayList;

public class TourismFragment extends Fragment {

    public TourismFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.tourism_fragment, container, false);

        ArrayList<TourismCategory> tourismCategoryArrayList = DataSourcer.getTourismPlaces(getContext());
        TourismCategoryAdapter tourismCategoryAdapter = new TourismCategoryAdapter(getActivity(), tourismCategoryArrayList);

        ListView listView = (ListView) rootView.findViewById(R.id.tourism_list_view);
        listView.setAdapter(tourismCategoryAdapter);

        return rootView;
    }
}