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

    public void setmCorporationName(String mCorporationName) {
        this.mCorporationName = mCorporationName;
    }

    public String getmCorporationName() {
        return mCorporationName;
    }

    public void setmCorporationAddress(String mCorporationAddress) {
        this.mCorporationAddress = mCorporationAddress;
    }

    public String getmCorporationAddress() {
        return mCorporationAddress;
    }

    public void setmCorporationPhone(String mCorporationPhone) {
        this.mCorporationPhone = mCorporationPhone;
    }

    public String getmCorporationPhone() {
        return mCorporationPhone;
    }

    public void setmCorporationImageResource(int mCorporationImageResource) {
        this.mCorporationImageResource = mCorporationImageResource;
    }

    public int getmCorporationImageResource() {
        return mCorporationImageResource;
    }

    public void setmCorporationTotalReview(int mCorporationTotalReview) {
        this.mCorporationTotalReview = mCorporationTotalReview;
    }

    public int getmCorporationTotalReview() {
        return mCorporationTotalReview;
    }


    public void setmCorporationLatMap(double mCorporationLatMap) {
        this.mCorporationLatMap = mCorporationLatMap;
    }

    public double getmCorporationLatMap() {
        return mCorporationLatMap;
    }

    public void setmCorporationLongMap(double mCorporationLongMap) {
        this.mCorporationLongMap = mCorporationLongMap;
    }

    public double getmCorporationLongMap() {
        return mCorporationLongMap;
    }

}