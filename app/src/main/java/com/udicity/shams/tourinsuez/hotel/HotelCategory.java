package com.udicity.shams.tourinsuez.hotel;

/**
 * Created by shams on 26/06/17.
 */

public class HotelCategory {

    private String mHotelName;
    private int mFinalReview;
    private int mHotelImageResource;
    private String mHotelPhoneNumber;
    private String mHotelAddress;
    private double mHotelLat;
    private double mHotelLong;

    public HotelCategory(String Name,int finalReview,int imageResource)
    {
        mHotelName = Name;
        mFinalReview = finalReview;
        mHotelImageResource = imageResource;
    }

    public HotelCategory(String Name,int finalReview,int imageResource,String mHotelPhoneNumber,String mHotelAddress)
    {
        mHotelName = Name;
        mFinalReview = finalReview;
        mHotelImageResource = imageResource;
        this.mHotelPhoneNumber = mHotelPhoneNumber;
        this.mHotelAddress = mHotelAddress;
    }
    public HotelCategory(String Name,int finalReview,int imageResource,String mHotelPhoneNumber,String mHotelAddress,double latMap,double longMap)
    {
        mHotelName = Name;
        mFinalReview = finalReview;
        mHotelImageResource = imageResource;
        this.mHotelPhoneNumber = mHotelPhoneNumber;
        this.mHotelAddress = mHotelAddress;
        mHotelLat = latMap;
        mHotelLong = longMap;
    }


    public HotelCategory(String Name,int finalReview,int imageResource,double latMap,double longMap)
    {
        mHotelName = Name;
        mFinalReview = finalReview;
        mHotelImageResource = imageResource;
        mHotelLat = latMap;
        mHotelLong = longMap;
    }
    public HotelCategory(double latMap,double longMap)
    {
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
    public void setmHotelLat(double hotelLat)
    {
        mHotelLat = hotelLat;
    }
    public double getmHotelLat()
    {
        return mHotelLat;
    }
    public void setmHotelLong(double hotelLong)
    {
        mHotelLong = hotelLong;
    }
    public double getmHotelLong()
    {
        return mHotelLong;
    }

    public String getmHotelPhoneNumber() {
        return mHotelPhoneNumber;
    }

    public void setmHotelPhoneNumber(String mHotelPhoneNumber) {
        this.mHotelPhoneNumber = mHotelPhoneNumber;
    }

    public String getmHotelAddress() {
        return mHotelAddress;
    }

    public void setmHotelAddress(String mHotelAddress) {
        this.mHotelAddress = mHotelAddress;
    }
}