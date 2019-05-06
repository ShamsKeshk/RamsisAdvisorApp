package com.udicity.shams.tourinsuez.Events;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;
import com.udicity.shams.tourinsuez.R;

import java.util.ArrayList;

/**
 * Created by shams on 30/06/17.
 */

public class EventsCategoryAdapter extends ArrayAdapter<EventsCategory> {

    public EventsCategoryAdapter(Activity activity, ArrayList<EventsCategory> eventsCategoryArrayList) {
        super(activity, 0, eventsCategoryArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        EventsViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.events_list_items, parent, false);

            viewHolder = new EventsViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (EventsViewHolder) convertView.getTag();
        }

        EventsCategory currentEvent = getItem(position);
        assert currentEvent != null;

        Picasso.get()
                .load(currentEvent.getmEventImageResource())
                .into(viewHolder.getEventImage());
        viewHolder.getEventName().setText(currentEvent.getmEventName());

        viewHolder.getEventStartDate().setText(currentEvent.getmEventStartDate());

        viewHolder.getEventAddress().setText(currentEvent.getmEventAddress());

        return convertView;
    }
}