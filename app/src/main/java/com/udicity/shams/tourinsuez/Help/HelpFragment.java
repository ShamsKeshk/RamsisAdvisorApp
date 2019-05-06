package com.udicity.shams.tourinsuez.Help;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.udicity.shams.tourinsuez.R;
import com.udicity.shams.tourinsuez.data.DataSourcer;

import java.util.ArrayList;

public class HelpFragment extends Fragment {

    public HelpFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.help_fragment, container, false);

        final ArrayList<HelpCategory> helpCategoryArrayList = DataSourcer.getHelpList(getContext());
        HelpCategoryAdapter helpCategoryAdapter = new HelpCategoryAdapter(getActivity(), helpCategoryArrayList);
        ListView listView = rootView.findViewById(R.id.help_list_view);
        listView.setAdapter(helpCategoryAdapter);
        Toast.makeText(getContext(), R.string.help_category, Toast.LENGTH_SHORT).show();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                HelpCategory currentHelpItem = helpCategoryArrayList.get(position);
                String phoneNumber = currentHelpItem.getmHelpProviderPhoneNumber();
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                startActivity(intent);
            }
        });
        return rootView;
    }
}