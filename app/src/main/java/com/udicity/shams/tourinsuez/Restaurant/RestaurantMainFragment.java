package com.udicity.shams.tourinsuez.Restaurant;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.udicity.shams.tourinsuez.R;
import com.udicity.shams.tourinsuez.data.DataSourcer;

import java.util.ArrayList;

public class RestaurantMainFragment extends Fragment {

    public RestaurantMainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.restaurant_main_fragment, container, false);

        ArrayList<RestaurantCategory> restaurantCategoryArrayList = DataSourcer.getRestaurant(getContext());

        ListView listView = (ListView) rootView.findViewById(R.id.restaurant_food_filter_list_view);
        RestaurantCategoryAdapter restaurantCategoryAdapter = new RestaurantCategoryAdapter(getActivity(), restaurantCategoryArrayList, getContext());
        listView.setAdapter(restaurantCategoryAdapter);
        return rootView;
    }
}