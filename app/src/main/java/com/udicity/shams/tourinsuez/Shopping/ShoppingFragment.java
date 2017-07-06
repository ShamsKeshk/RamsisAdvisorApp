package com.udicity.shams.tourinsuez.Shopping;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.udicity.shams.tourinsuez.R;
import com.udicity.shams.tourinsuez.data.DataSourcer;

import java.util.ArrayList;

public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.shopping_fragment, container, false);

        ArrayList<ShoppingCategory> shoppingCategoryArrayList = DataSourcer.getShoppingPlaces(getContext());
        ShoppingCategoryAdapter shoppingCategoryAdapter = new ShoppingCategoryAdapter(getActivity(), shoppingCategoryArrayList, getContext());
        ListView listView = (ListView) rootView.findViewById(R.id.shopping_list_view);
        listView.setAdapter(shoppingCategoryAdapter);

        return rootView;
    }
}