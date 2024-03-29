package com.udicity.shams.tourinsuez.Events;

/**
 * Created by shams on 30/06/17.
 */

public class EventsCategory {

    private int mEventImageResource;
    private String mEventName;
    private String mEventAddress;
    private String mEventStartDate;
    private String mEventEndDate;
    private String mEventDescription;
    private double mEventLatMap;
    private double mEventLongMap;

    public EventsCategory(int eventImageResource, String eventName, String eventStartDate, String eventAddress) {
        mEventImageResource = eventImageResource;
        mEventName = eventName;
        mEventAddress = eventAddress;
        mEventStartDate = eventStartDate;
    }

    public EventsCategory(int eventImageResource, String eventName, String eventAddress, String eventStartDate, String eventDescription) {
        mEventImageResource = eventImageResource;
        mEventName = eventName;
        mEventAddress = eventAddress;
        mEventStartDate = eventStartDate;
        mEventDescription = eventDescription;
    }

    public EventsCategory(String eventName, String eventAddress, String eventStartDate, String eventEndDate, String eventDescription) {
        mEventName = eventName;
        mEventAddress = eventAddress;
        mEventStartDate = eventStartDate;
        mEventEndDate = eventEndDate;
        mEventDescription = eventDescription;
    }

    public EventsCategory(String eventName, String eventAddress, String eventStartDate, String eventEndDate, String eventDescription, double eventLatMap, double eventLongMap) {
        mEventName = eventName;
        mEventAddress = eventAddress;
        mEventStartDate = eventStartDate;
        mEventEndDate = eventEndDate;
        mEventDescription = eventDescription;
        mEventLatMap = eventLatMap;
        mEventLongMap = eventLongMap;
    }

    public String getmEventName() {
        return mEventName;
    }

    public void setmEventName(String eventName) {
        mEventName = eventName;
    }

    public String getmEventAddress() {
        return mEventAddress;
    }

    public void setmEventAddress(String eventAddress) {
        mEventAddress = eventAddress;
    }

    public String getmEventStartDate() {
        return mEventStartDate;
    }

    public void setmEventStartDate(String eventStartDate) {
        mEventStartDate = eventStartDate;
    }

    public String getmEventEndDate() {
        return mEventEndDate;
    }

    public void setmEventEndDate(String eventEndDate) {
        mEventEndDate = eventEndDate;
    }

    public String getmEventDescription() {
        return mEventDescription;
    }

    public void setmEventDescription(String eventDescription) {
        mEventDescription = eventDescription;
    }

    public double getmEventLatMap() {
        return mEventLatMap;
    }

    public void setmEventLatMap(double eventLatMap) {
        mEventLatMap = eventLatMap;
    }

    public double getmEventLongMap() {
        return mEventLongMap;
    }

    public void setmEventLongMap(double eventLongMap) {
        mEventLongMap = eventLongMap;
    }

    public int getmEventImageResource() {
        return mEventImageResource;
    }

    public void setmEventImageResource(int eventImageResource) {
        mEventImageResource = eventImageResource;
    }
}