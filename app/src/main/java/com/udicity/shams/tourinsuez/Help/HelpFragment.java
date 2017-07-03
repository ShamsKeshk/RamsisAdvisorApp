package com.udicity.shams.tourinsuez.Help;


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

public class HelpFragment extends Fragment {

    public HelpFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.help_fragment, container, false);

        ArrayList<HelpCategory> helpCategoryArrayList = DataSourcer.getHelpList();
        HelpCategoryAdapter helpCategoryAdapter = new HelpCategoryAdapter(getActivity(),helpCategoryArrayList);
        ListView listView = (ListView)rootView.findViewById(R.id.help_list_view);
        listView.setAdapter(helpCategoryAdapter);
        Toast.makeText(getContext(),"Help !",Toast.LENGTH_SHORT).show();
        return rootView;
    }
}