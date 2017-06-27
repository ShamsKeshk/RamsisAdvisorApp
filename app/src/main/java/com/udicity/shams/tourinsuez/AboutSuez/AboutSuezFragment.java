package com.udicity.shams.tourinsuez.AboutSuez;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.udicity.shams.tourinsuez.R;

public class AboutSuezFragment extends Fragment {

    public AboutSuezFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.about_suez_fragment, container, false);
    }

}
