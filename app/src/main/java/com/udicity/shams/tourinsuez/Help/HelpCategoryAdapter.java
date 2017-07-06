package com.udicity.shams.tourinsuez.Help;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

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

        HelpViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.help_item_list, parent, false);

            viewHolder = new HelpViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (HelpViewHolder) convertView.getTag();
        }

        HelpCategory currentView = getItem(position);

        assert currentView != null;

        viewHolder.getHelpProviderImage().setImageResource(currentView.getmHelpProviderImageResource());

        viewHolder.getHelpProviderName().setText(currentView.getmHelpProviderName());

        viewHolder.getHelpProviderPhone().setText(currentView.getmHelpProviderPhoneNumber());

        viewHolder.getHelpProviderAddress().setText(currentView.getmHelpProviderAddress());

        return convertView;
    }
}