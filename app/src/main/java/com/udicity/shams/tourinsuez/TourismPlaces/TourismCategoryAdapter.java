package com.udicity.shams.tourinsuez.TourismPlaces;

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

public class TourismCategoryAdapter extends ArrayAdapter<TourismCategory> {

    public TourismCategoryAdapter(Activity activity, ArrayList<TourismCategory> tourismCategoryArrayList) {
        super(activity, 0, tourismCategoryArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        TourismViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.tourism_list_items, parent, false);

            viewHolder = new TourismViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (TourismViewHolder) convertView.getTag();
        }
        TourismCategory currentTourismPlace = getItem(position);

        assert currentTourismPlace != null;


        viewHolder.getPlaceImage().setImageResource(currentTourismPlace.getmPlaceImageResource());

        viewHolder.getPlaceName().setText(currentTourismPlace.getmPlaceName());

        viewHolder.getPlaceReview().setText(String.valueOf(currentTourismPlace.getmPlaceReviews()));

        viewHolder.getPlaceType().setText(currentTourismPlace.getmPlaceType());

        viewHolder.getPlaceAddress().setText(currentTourismPlace.getmPlaceAddress());

        return convertView;
    }
}