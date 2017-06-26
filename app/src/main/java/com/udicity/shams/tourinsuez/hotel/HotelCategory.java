package com.udicity.shams.tourinsuez.hotel;

/**
 * Created by shams on 26/06/17.
 */

public class HotelCategory {

    private String mHotelName;
    private int mFinalReview;
    private int mHotelImageResource;
    private float mHotelLat;
    private float mHotelLong;

    public HotelCategory(String Name,int finalReview,int imageResource)
    {
        mHotelName = Name;
        mFinalReview = finalReview;
        mHotelImageResource = imageResource;
    }

    public HotelCategory(String Name,int finalReview,int imageResource,float latMap,float longMap)
    {
        mHotelName = Name;
        mFinalReview = finalReview;
        mHotelImageResource = imageResource;
        mHotelLat = latMap;
        mHotelLong = longMap;
    }
    public void setmHotelName(String hotelName)
    {
        mHotelName = hotelName;
    }
    public String getmHotelName()
    {
        return mHotelName;
    }
    public void setmFinalReview(int finalReview)
    {
        mFinalReview = finalReview;
    }
    public int getmFinalReview()
    {
        return mFinalReview;
    }

    public void setmHotelImageResource(int imageResource)
    {
        mHotelImageResource = imageResource;
    }
    public int getmHotelImageResource()
    {
        return mHotelImageResource;
    }
    public void setmHotelLat(float hotelLat)
    {
        mHotelLat = hotelLat;
    }
    public float getmHotelLat()
    {
        return mHotelLat;
    }
    public void setmHotelLong(float hotelLong)
    {
        mHotelLong = hotelLong;
    }
    public float getmHotelLong()
    {
        return mHotelLong;
    }
}
