package com.udicity.shams.tourinsuez.TourismPlaces;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.udicity.shams.tourinsuez.R;

/**
 * Created by shams on 06/07/17.
 */

public class TourismViewHolder {

    private ImageView placeImage;
    private TextView placeName;
    private TextView placeReview;
    private TextView placeType;
    private TextView placeAddress;

    public TourismViewHolder(View view) {
        this.placeImage = (ImageView) view.findViewById(R.id.tourism_place_image_view);
        this.placeName = (TextView) view.findViewById(R.id.tourism_place_name_text_view_id);
        this.placeReview = (TextView) view.findViewById(R.id.tourism_place_review_number_text_view_id);
        this.placeType = (TextView) view.findViewById(R.id.tourism_place_type_text_view);
        this.placeAddress = (TextView) view.findViewById(R.id.tourism_place_address_text_view);
    }

    public ImageView getPlaceImage() {
        return placeImage;
    }

    public TextView getPlaceName() {
        return placeName;
    }

    public TextView getPlaceReview() {
        return placeReview;
    }

    public TextView getPlaceType() {
        return placeType;
    }

    public TextView getPlaceAddress() {
        return placeAddress;
    }
}
