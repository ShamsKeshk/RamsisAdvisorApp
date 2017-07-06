package com.udicity.shams.tourinsuez.CategoryPackage;

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
 * Created by shams on 25/06/17.
 */

public class CategoryAdapter extends ArrayAdapter<Category> {

    public CategoryAdapter(Activity activity, ArrayList<Category> categoryArrayList) {
        super(activity, 0, categoryArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View categoriesListItemView = convertView;
        if (categoriesListItemView == null) {
            categoriesListItemView = LayoutInflater.from(getContext()).inflate(R.layout.scrolling_categories_list_items, parent, false);
        }
        Category currentCategory = getItem(position);

        TextView categoryTextView = (TextView) categoriesListItemView.findViewById(R.id.category_text_view);
        categoryTextView.setText(currentCategory.getmCategoryName());
        ImageView categoryImageView = (ImageView) categoriesListItemView.findViewById(R.id.category_image_icon_view);
        categoryImageView.setImageResource(currentCategory.getmCategoryImageResource());

        return categoriesListItemView;
    }
}