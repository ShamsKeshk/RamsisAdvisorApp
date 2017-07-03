package com.udicity.shams.tourinsuez.CafeShops;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
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

        ArrayList<CafeCategory> cafeCategoryArrayList = DataSourcer.getCafePlaces();
        CafeCategoryAdapter cafeCategoryAdapter = new CafeCategoryAdapter(getActivity(),cafeCategoryArrayList);
        ListView listView = (ListView)rootView.findViewById(R.id.cafe_list_view);
        listView.setAdapter(cafeCategoryAdapter);
        return rootView;
    }
}