package com.udicity.shams.tourinsuez.Events;

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

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by shams on 30/06/17.
 */

public class EventsCategoryAdapter extends ArrayAdapter<EventsCategory> {

    public EventsCategoryAdapter(Activity activity, ArrayList<EventsCategory> eventsCategoryArrayList)
    {
        super(activity,0,eventsCategoryArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View eventsListView = convertView;
        if(eventsListView == null)
        {
            eventsListView = LayoutInflater.from(getContext()).inflate(R.layout.events_list_items,parent,false);
        }
        EventsCategory currentEvent = getItem(position);

        ImageView eventImageView = (ImageView)eventsListView.findViewById(R.id.event_image_view_id);
        eventImageView.setImageResource(currentEvent.getmEventImageResource());

        TextView eventNameTextView = (TextView)eventsListView.findViewById(R.id.event_name_text_view_id);
        eventNameTextView.setText(currentEvent.getmEventName());

        TextView eventStartDateTextView = (TextView)eventsListView.findViewById(R.id.event_start_date_info_text_view_id);
        eventStartDateTextView.setText(currentEvent.getmEventStartDate());

        TextView eventAddressTextView = (TextView)eventsListView.findViewById(R.id.event_address_text_view_id);
        eventAddressTextView.setText(currentEvent.getmEventAddress());

        return eventsListView;
    }
}
