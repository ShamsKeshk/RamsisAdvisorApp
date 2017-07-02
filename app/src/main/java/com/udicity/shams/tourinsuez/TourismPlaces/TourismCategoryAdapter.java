package com.udicity.shams.tourinsuez.TourismPlaces;

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

public class TourismCategoryAdapter extends ArrayAdapter<TourismCategory> {

    public TourismCategoryAdapter(Activity activity, ArrayList<TourismCategory> tourismCategoryArrayList)
    {
        super(activity,0,tourismCategoryArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View tourismListItems = convertView;
        if (tourismListItems == null)
        {
            tourismListItems = LayoutInflater.from(getContext()).inflate(R.layout.tourism_list_items,parent,false);
        }
        TourismCategory currentTourismPlace = getItem(position);

        ImageView placeImageView = (ImageView)tourismListItems.findViewById(R.id.tourism_place_image_view);
        placeImageView.setImageResource(currentTourismPlace.getmPlaceImageResource());

        TextView placeName = (TextView)tourismListItems.findViewById(R.id.tourism_place_name_text_view_id);
        placeName.setText(currentTourismPlace.getmPlaceName());

        TextView placeReview = (TextView)tourismListItems.findViewById(R.id.tourism_place_review_number_text_view_id);
        placeReview.setText(String.valueOf(currentTourismPlace.getmPlaceReviews()));

        TextView placeType = (TextView)tourismListItems.findViewById(R.id.tourism_place_type_text_view);
        placeType.setText(currentTourismPlace.getmPlaceType());

        TextView placeAddress = (TextView)tourismListItems.findViewById(R.id.tourism_place_address_text_view);
        placeAddress.setText(currentTourismPlace.getmPlaceAddress());


        return tourismListItems;
    }
}
