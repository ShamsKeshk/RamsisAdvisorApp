package com.udicity.shams.tourinsuez.Help;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.udicity.shams.tourinsuez.R;

import java.util.ArrayList;

/**
 * Created by shams on 27/06/17.
 */

public class HelpCategoryAdapter extends ArrayAdapter<HelpCategory> {

    public HelpCategoryAdapter(Activity activity, ArrayList<HelpCategory> helpCategoryArrayList) {
        super(activity, 0, helpCategoryArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View helpListItems = convertView;
        if (helpListItems == null) {
            helpListItems = LayoutInflater.from(getContext()).inflate(R.layout.help_item_list, parent, false);
        }
        HelpCategory currentView = getItem(position);
        ImageView helpProviderImageView = (ImageView) helpListItems.findViewById(R.id.help_provider_image_view);
        helpProviderImageView.setImageResource(currentView.getmHelpProviderImageResource());
        TextView nameTextView = (TextView) helpListItems.findViewById(R.id.help_provider_name_text_view);
        nameTextView.setText(currentView.getmHelpProviderName());
        TextView numberTextView = (TextView) helpListItems.findViewById(R.id.help_provider_phone_number_text_view);
        numberTextView.setText(currentView.getmHelpProviderPhoneNumber());
        TextView addressTextView = (TextView) helpListItems.findViewById(R.id.help_provider_address_text_view);
        addressTextView.setText(currentView.getmHelpProviderAddress());

        return helpListItems;
    }
}