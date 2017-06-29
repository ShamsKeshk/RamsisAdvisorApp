package com.udicity.shams.tourinsuez.AboutSuez;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.udicity.shams.tourinsuez.R;
import com.udicity.shams.tourinsuez.data.DataSourcer;

import java.util.ArrayList;

public class AboutSuezFragment extends Fragment {


    public AboutSuezFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.about_suez_fragment, container, false);


        ArrayList<AboutSuezCategory> aboutSuezCategoryArrayList = DataSourcer.getAboutSuez(getContext());
        ListView listView = (ListView)rootView.findViewById(R.id.about_suez_list_view);
        AboutSuezCategoryAdapter aboutSuezCategoryAdapter = new AboutSuezCategoryAdapter(getActivity(),aboutSuezCategoryArrayList);
        listView.setAdapter(aboutSuezCategoryAdapter);
        Toast.makeText(getActivity(),"About Suez" , Toast.LENGTH_SHORT).show();
        return rootView;
    }

}
