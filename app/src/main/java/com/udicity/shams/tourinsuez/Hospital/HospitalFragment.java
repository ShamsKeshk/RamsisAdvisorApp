package com.udicity.shams.tourinsuez.Hospital;

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

public class HospitalFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.hospital_fragment, container, false);

        ArrayList<HospitalCategory> hospitalCategoryArrayList = DataSourcer.getHospital(getContext());

        HospitalCategoryAdapter hospitalCategoryAdapter = new HospitalCategoryAdapter(getActivity(), hospitalCategoryArrayList);
        ListView listView = rootView.findViewById(R.id.hospital_list_view_id);
        listView.setAdapter(hospitalCategoryAdapter);
        Toast.makeText(getContext(), R.string.hospital_category, Toast.LENGTH_SHORT).show();
        return rootView;
    }
}