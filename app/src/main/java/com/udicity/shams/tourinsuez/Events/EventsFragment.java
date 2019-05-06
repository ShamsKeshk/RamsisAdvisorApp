package com.udicity.shams.tourinsuez.Events;


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

public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.events_fragment, container, false);
        ArrayList<EventsCategory> eventsCategoryArrayList = DataSourcer.getEvents(getContext());
        EventsCategoryAdapter eventsCategoryAdapter = new EventsCategoryAdapter(getActivity(), eventsCategoryArrayList);
        ListView listView = rootView.findViewById(R.id.events_list_view);
        listView.setAdapter(eventsCategoryAdapter);
        Toast.makeText(getContext(), R.string.events_category, Toast.LENGTH_SHORT).show();
        return rootView;
    }
}