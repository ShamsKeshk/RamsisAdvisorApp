package com.udicity.shams.tourinsuez.Restaurant;

public class RestaurantCategory {

    private String mRestaurantName;
    private int mFinalReview;
    private int mRestaurantTimeOpen;
    private int mRestaurantTimeClose;
    private String mRestaurantAddress;
    private int mRestaurantImageResource;
    private float mRestaurantLat;
    private float mRestaurantLong;

    /**
     * @auther shams keshk <shamskeshk@gmail.com>
     *
     * @param restaurantName
     * @param finalReview
     * @param restaurantTimeOpen
     * @param restaurantTimeClose
     */
    public RestaurantCategory(String restaurantName,int finalReview,int restaurantTimeOpen,int restaurantTimeClose,String mRestaurantAddress)
    {
        mRestaurantName = restaurantName;
        mFinalReview = finalReview;
        mRestaurantTimeOpen = restaurantTimeOpen;
        mRestaurantTimeClose = restaurantTimeClose;
        this.mRestaurantAddress = mRestaurantAddress;
    }
    public RestaurantCategory(String Name,int finalReview,int TimeOpen,int TimeClose,int imageResource,float latMap,float longMap)
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
    public void setmRestaurantLat(float restaurantLat)
    {
        mRestaurantLat = restaurantLat;
    }
    public float getmRestaurantLat()
    {
        return mRestaurantLat;
    }
    public void setmRestaurantLong(float restaurantLong)
    {
        mRestaurantLong = restaurantLong;
    }
    public float getmRestaurantLong()
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