package com.udicity.shams.tourinsuez.AboutSuez;

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

public class AboutSuezCategoryAdapter extends ArrayAdapter<AboutSuezCategory> {

    public AboutSuezCategoryAdapter(Activity activity, ArrayList<AboutSuezCategory> aboutSuezCategoryArrayList)
    {
        super(activity,0,aboutSuezCategoryArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItems = convertView;
        if(listItems == null)
        {
            listItems = LayoutInflater.from(getContext()).inflate(R.layout.about_suez_list_items,parent,false);
        }
        AboutSuezCategory currentItem = getItem(position);
        TextView topicTextView = (TextView)listItems.findViewById(R.id.topic_id);
        topicTextView.setText(currentItem.getmTopicHeader());
        TextView textViewOne = (TextView)listItems.findViewById(R.id.topic_one_explain_id);
        if(currentItem.hasTextOne())
        {
            textViewOne.setText(currentItem.getmTopicExplainPartOne());
            textViewOne.setVisibility(View.VISIBLE);
        }else
        {
            textViewOne.setVisibility(View.GONE);
        }
        ImageView imageViewOne = (ImageView) listItems.findViewById(R.id.topic_one_image_view_id);
        if(currentItem.hasImageOne())
        {
            imageViewOne.setImageResource(currentItem.getmTopicImageResourcePartOne());
            imageViewOne.setVisibility(View.VISIBLE);
        }else
        {
            imageViewOne.setVisibility(View.GONE);
        }
        TextView textViewTwo = (TextView)listItems.findViewById(R.id.topic_two_explain_id);
        if(currentItem.hasTextTwo())
        {
            textViewTwo.setText(currentItem.getmTopicExplainPartTwo());
            textViewTwo.setVisibility(View.VISIBLE);
        }else
        {
            textViewTwo.setVisibility(View.GONE);
        }
        ImageView imageViewTwo = (ImageView) listItems.findViewById(R.id.topic_two_image_view_id);
        if(currentItem.hasImageTwo())
        {
            imageViewTwo.setImageResource(currentItem.getmTopicImageResourcePartTwo());
            imageViewTwo.setVisibility(View.VISIBLE);
        }else
        {
            imageViewTwo.setVisibility(View.GONE);
        }

        return listItems;
    }
}