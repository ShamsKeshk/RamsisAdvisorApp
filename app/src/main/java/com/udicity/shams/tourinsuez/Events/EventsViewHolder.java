package com.udicity.shams.tourinsuez.Events;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.udicity.shams.tourinsuez.R;

/**
 * Created by shams on 06/07/17.
 */

public class EventsViewHolder {

    private ImageView eventImage;
    private TextView eventName;
    private TextView eventStartDate;
    private TextView eventAddress;

    public EventsViewHolder(View view) {
        this.eventImage = (ImageView) view.findViewById(R.id.event_image_view_id);
        this.eventName = (TextView) view.findViewById(R.id.event_name_text_view_id);
        this.eventStartDate = (TextView) view.findViewById(R.id.event_start_date_info_text_view_id);
        this.eventAddress = (TextView) view.findViewById(R.id.event_address_text_view_id);
    }

    public ImageView getEventImage() {
        return eventImage;
    }

    public TextView getEventName() {
        return eventName;
    }

    public TextView getEventStartDate() {
        return eventStartDate;
    }

    public TextView getEventAddress() {
        return eventAddress;
    }
}
