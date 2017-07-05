package com.udicity.shams.tourinsuez.Restaurant;

public class RestaurantCategory {

    private String mRestaurantName;
    private int mFinalReview;
    private String mRestaurantPhone;
    private int mRestaurantTimeOpen;
    private int mRestaurantTimeClose;
    private String mRestaurantAddress;
    private int mRestaurantImageResource;
    private double mRestaurantLat;
    private double mRestaurantLong;

    /**
     * @auther shams keshk <shamskeshk@gmail.com>
     *
     * @param restaurantName
     * @param finalReview
     * @param restaurantTimeOpen
     * @param restaurantTimeClose
     */
    public RestaurantCategory(int imageResource,String restaurantName,String mRestaurantPhone,int finalReview,int restaurantTimeOpen,int restaurantTimeClose,String mRestaurantAddress,double latMap,double longMap)
    {
        mRestaurantName = restaurantName;
        mFinalReview = finalReview;
        mRestaurantTimeOpen = restaurantTimeOpen;
        mRestaurantTimeClose = restaurantTimeClose;
        this.mRestaurantAddress = mRestaurantAddress;
        mRestaurantImageResource = imageResource;
        this.mRestaurantPhone = mRestaurantPhone;
        mRestaurantLat = latMap;
        mRestaurantLong = longMap;
    }
    public RestaurantCategory(int imageResource,String Name,int finalReview,int TimeOpen,int TimeClose,double latMap,double longMap)
    {
        mRestaurantName = Name;
        mFinalReview = finalReview;
        mRestaurantTimeOpen = TimeOpen;
        mRestaurantTimeClose = TimeClose;
        mRestaurantImageResource = imageResource;
        mRestaurantLat = latMap;
        mRestaurantLong = longMap;
    }
    public void setmRestaurantName(String restaurantName)
    {
     mRestaurantName = restaurantName;
    }
    public String getmRestaurantName()
    {
        return mRestaurantName;
    }
    public void setmFinalReview(int finalReview)
    {
        mFinalReview = finalReview;
    }
    public int getmFinalReview()
    {
        return mFinalReview;
    }
    public void setmRestaurantTimeOpen(int timeOpen)
    {
        mRestaurantTimeOpen = timeOpen;
    }
    public int getmRestaurantTimeOpen()
    {
        return mRestaurantTimeOpen;
    }
    public void setmRestaurantTimeClose(int timeClose)
    {
        mRestaurantTimeClose = timeClose;
    }
    public int getmRestaurantTimeClose()
    {
        return mRestaurantTimeClose;
    }
    public void setmRestaurantImageResource(int imageResource)
    {
        mRestaurantImageResource = imageResource;
    }
    public int getmRestaurantImageResource()
    {
        return mRestaurantImageResource;
    }
    public void setmRestaurantLat(double restaurantLat)
    {
        mRestaurantLat = restaurantLat;
    }
    public double getmRestaurantLat()
    {
        return mRestaurantLat;
    }
    public void setmRestaurantLong(double restaurantLong)
    {
        mRestaurantLong = restaurantLong;
    }
    public double getmRestaurantLong()
    {
        return mRestaurantLong;
    }

    public String getmRestaurantAddress() {
        return mRestaurantAddress;
    }

    public void setmRestaurantAddress(String mRestaurantAddress) {
        this.mRestaurantAddress = mRestaurantAddress;
    }
}