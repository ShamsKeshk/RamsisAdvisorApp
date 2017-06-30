package com.udicity.shams.tourinsuez.AboutSuez;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;
import com.udicity.shams.tourinsuez.R;
import com.udicity.shams.tourinsuez.data.DataSourcer;
import java.util.ArrayList;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class AboutSuezFragment extends Fragment {

    public static boolean aboutSuezSelected;

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

    @Override
    public void onPause() {
        super.onPause();
    }
}
