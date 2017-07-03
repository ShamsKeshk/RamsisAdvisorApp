package com.udicity.shams.tourinsuez.TourismPlaces;

/**
 * Created by shams on 27/06/17.
 */

public class TourismCategory {

    private int mPlaceImageResource;
    private String mPlaceName;
    private String mPlaceType;
    private int mPlaceReviews;
    private String mPlaceAddress;
    private double mPlaceLatMap;
    private double mPlaceLongMap;

    public TourismCategory(int mPlaceImageResource,String mPlaceName,String mPlaceType,String mPlaceAddress,int mPlaceReviews)
    {
        this.mPlaceImageResource = mPlaceImageResource;
        this.mPlaceName = mPlaceName;
        this.mPlaceType = mPlaceType;
        this.mPlaceReviews = mPlaceReviews;
        this.mPlaceAddress = mPlaceAddress;
    }
    public TourismCategory(int mPlaceImageResource,String mPlaceName,String mPlaceType,String mPlaceAddress,int mPlaceReviews,double mPlaceLatMap,double mPlaceLongMap)
    {
        this.mPlaceImageResource = mPlaceImageResource;
        this.mPlaceName = mPlaceName;
        this.mPlaceType = mPlaceType;
        this.mPlaceReviews = mPlaceReviews;
        this.mPlaceAddress = mPlaceAddress;
        this.mPlaceLatMap = mPlaceLatMap;
        this.mPlaceLongMap = mPlaceLongMap;
    }

    public int getmPlaceImageResource() {
        return mPlaceImageResource;
    }

    public void setmPlaceImageResource(int mPlaceImageResource) {
        this.mPlaceImageResource = mPlaceImageResource;
    }

    public String getmPlaceName() {
        return mPlaceName;
    }

    public void setmPlaceName(String mPlaceName) {
        this.mPlaceName = mPlaceName;
    }

    public String getmPlaceType() {
        return mPlaceType;
    }

    public void setmPlaceType(String mPlaceType) {
        this.mPlaceType = mPlaceType;
    }

    public int getmPlaceReviews() {
        return mPlaceReviews;
    }

    public void setmPlaceReviews(int mPlaceReviews) {
        this.mPlaceReviews = mPlaceReviews;
    }

    public String getmPlaceAddress() {
        return mPlaceAddress;
    }

    public void setmPlaceAddress(String mPlaceAddress) {
        this.mPlaceAddress = mPlaceAddress;
    }

    public double getmPlaceLatMap() {
        return mPlaceLatMap;
    }

    public void setmPlaceLatMap(double mPlaceLatMap) {
        this.mPlaceLatMap = mPlaceLatMap;
    }

    public double getmPlaceLongMap() {
        return mPlaceLongMap;
    }

    public void setmPlaceLongMap(double mPlaceLongMap) {
        this.mPlaceLongMap = mPlaceLongMap;
    }
}