package com.udicity.shams.tourinsuez.Hospital;

/**
 * Created by shams on 27/06/17.
 */

public class HospitalCategory {

    private String mCorporationName;
    private String mCorporationAddress;
    private String mCorporationPhone;
    private int mCorporationImageResource;
    private int mCorporationTotalReview;
    private double mCorporationLatMap;
    private double mCorporationLongMap;

    public HospitalCategory(int corporationImageResource, String corporationName, int corporationTotalReview, String corporationPhone, String corporationAddress) {
        mCorporationImageResource = corporationImageResource;
        mCorporationName = corporationName;
        mCorporationAddress = corporationAddress;
        mCorporationPhone = corporationPhone;
        mCorporationTotalReview = corporationTotalReview;
    }

    public HospitalCategory(int corporationImageResource, String corporationName, int corporationTotalReview, String corporationPhone, String corporationAddress, double corporationLatMap, double corporationLongMap) {
        mCorporationImageResource = corporationImageResource;
        mCorporationName = corporationName;
        mCorporationAddress = corporationAddress;
        mCorporationPhone = corporationPhone;
        mCorporationTotalReview = corporationTotalReview;
        mCorporationLatMap = corporationLatMap;
        mCorporationLongMap = corporationLongMap;
    }

    public String getmCorporationName() {
        return mCorporationName;
    }

    public void setmCorporationName(String mCorporationName) {
        this.mCorporationName = mCorporationName;
    }

    public String getmCorporationAddress() {
        return mCorporationAddress;
    }

    public void setmCorporationAddress(String mCorporationAddress) {
        this.mCorporationAddress = mCorporationAddress;
    }

    public String getmCorporationPhone() {
        return mCorporationPhone;
    }

    public void setmCorporationPhone(String mCorporationPhone) {
        this.mCorporationPhone = mCorporationPhone;
    }

    public int getmCorporationImageResource() {
        return mCorporationImageResource;
    }

    public void setmCorporationImageResource(int mCorporationImageResource) {
        this.mCorporationImageResource = mCorporationImageResource;
    }

    public int getmCorporationTotalReview() {
        return mCorporationTotalReview;
    }

    public void setmCorporationTotalReview(int mCorporationTotalReview) {
        this.mCorporationTotalReview = mCorporationTotalReview;
    }

    public double getmCorporationLatMap() {
        return mCorporationLatMap;
    }

    public void setmCorporationLatMap(double mCorporationLatMap) {
        this.mCorporationLatMap = mCorporationLatMap;
    }

    public double getmCorporationLongMap() {
        return mCorporationLongMap;
    }

    public void setmCorporationLongMap(double mCorporationLongMap) {
        this.mCorporationLongMap = mCorporationLongMap;
    }

}