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
     * @param restaurantName
     * @param finalReview
     * @param restaurantTimeOpen
     * @param restaurantTimeClose
     * @auther shams keshk <shamskeshk@gmail.com>
     */
    public RestaurantCategory(int imageResource, String restaurantName, String mRestaurantPhone, int finalReview, int restaurantTimeOpen, int restaurantTimeClose, String mRestaurantAddress, double latMap, double longMap) {
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

    public RestaurantCategory(int imageResource, String Name, int finalReview, int TimeOpen, int TimeClose, double latMap, double longMap) {
        mRestaurantName = Name;
        mFinalReview = finalReview;
        mRestaurantTimeOpen = TimeOpen;
        mRestaurantTimeClose = TimeClose;
        mRestaurantImageResource = imageResource;
        mRestaurantLat = latMap;
        mRestaurantLong = longMap;
    }

    public String getmRestaurantName() {
        return mRestaurantName;
    }

    public void setmRestaurantName(String restaurantName) {
        mRestaurantName = restaurantName;
    }

    public int getmFinalReview() {
        return mFinalReview;
    }

    public void setmFinalReview(int finalReview) {
        mFinalReview = finalReview;
    }

    public int getmRestaurantTimeOpen() {
        return mRestaurantTimeOpen;
    }

    public void setmRestaurantTimeOpen(int timeOpen) {
        mRestaurantTimeOpen = timeOpen;
    }

    public int getmRestaurantTimeClose() {
        return mRestaurantTimeClose;
    }

    public void setmRestaurantTimeClose(int timeClose) {
        mRestaurantTimeClose = timeClose;
    }

    public int getmRestaurantImageResource() {
        return mRestaurantImageResource;
    }

    public void setmRestaurantImageResource(int imageResource) {
        mRestaurantImageResource = imageResource;
    }

    public double getmRestaurantLat() {
        return mRestaurantLat;
    }

    public void setmRestaurantLat(double restaurantLat) {
        mRestaurantLat = restaurantLat;
    }

    public double getmRestaurantLong() {
        return mRestaurantLong;
    }

    public void setmRestaurantLong(double restaurantLong) {
        mRestaurantLong = restaurantLong;
    }

    public String getmRestaurantAddress() {
        return mRestaurantAddress;
    }

    public void setmRestaurantAddress(String mRestaurantAddress) {
        this.mRestaurantAddress = mRestaurantAddress;
    }

    public String getmRestaurantPhone() {
        return mRestaurantPhone;
    }

    public void setmRestaurantPhone(String mRestaurantPhone) {
        this.mRestaurantPhone = mRestaurantPhone;
    }
}