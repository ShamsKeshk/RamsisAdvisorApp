package com.udicity.shams.tourinsuez.AboutSuez;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.udicity.shams.tourinsuez.R;
import com.udicity.shams.tourinsuez.data.DataSourcer;

import java.util.ArrayList;


public class AboutSuezDistrictFragment extends Fragment {

    public AboutSuezDistrictFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.about_suez_district_fragment, container, false);


        ArrayList<AboutSuezCategory> aboutSuezDistrictArrayList = DataSourcer.getAboutSuezDistrictInfo(getContext());

        ListView listView = rootView.findViewById(R.id.about_suez_district_list_view);

        AboutSuezCategoryAdapter aboutSuezCategoryAdapter = new AboutSuezCategoryAdapter(getActivity(), aboutSuezDistrictArrayList);
        listView.setAdapter(aboutSuezCategoryAdapter);
        return rootView;
    }

}
