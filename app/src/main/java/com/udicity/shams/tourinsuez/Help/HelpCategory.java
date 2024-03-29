package com.udicity.shams.tourinsuez.Help;

/**
 * Created by shams on 27/06/17.
 */

public class HelpCategory {
    private String mHelpProviderName;
    private String mHelpProviderPhoneNumber;
    private int mHelpProviderImageResource;
    private double mHelpProviderMapLat;
    private double mHelpProviderMapLong;
    private String mHelpProviderAddress;

    public HelpCategory(String helpProviderName, String helpProviderPhoneNumber, int helpProviderImageResource, String mHelpProviderAddress, double helpProviderMapLat, double helpProviderMapLong) {
        mHelpProviderName = helpProviderName;
        mHelpProviderPhoneNumber = helpProviderPhoneNumber;
        mHelpProviderImageResource = helpProviderImageResource;
        mHelpProviderMapLat = helpProviderMapLat;
        mHelpProviderMapLong = helpProviderMapLong;
        this.mHelpProviderAddress = mHelpProviderAddress;
    }

    public HelpCategory(String helpProviderName, String helpProviderPhoneNumber, double helpProviderMapLat, double helpProviderMapLong) {
        mHelpProviderName = helpProviderName;
        mHelpProviderPhoneNumber = helpProviderPhoneNumber;
        mHelpProviderMapLat = helpProviderMapLat;
        mHelpProviderMapLong = helpProviderMapLong;
    }

    public String getmHelpProviderName() {
        return mHelpProviderName;
    }

    public void setmHelpProviderName(String helpProviderName) {
        mHelpProviderName = helpProviderName;
    }

    public String getmHelpProviderPhoneNumber() {
        return mHelpProviderPhoneNumber;
    }

    public void setmHelpProviderPhoneNumber(String helpProviderPhoneNumber) {
        mHelpProviderPhoneNumber = helpProviderPhoneNumber;
    }

    public int getmHelpProviderImageResource() {
        return mHelpProviderImageResource;
    }

    public void setmHelpProviderImageResource(int helpProviderImageResource) {
        mHelpProviderImageResource = helpProviderImageResource;
    }

    public double getmHelpProviderMapLat() {
        return mHelpProviderMapLat;
    }

    public void setmHelpProviderMapLat(double helpProviderMapLat) {
        mHelpProviderMapLat = helpProviderMapLat;
    }

    public double getmHelpProviderMapLong() {
        return mHelpProviderMapLong;
    }

    public void setmHelpProviderMapLong(double helpProviderMapLong) {
        mHelpProviderMapLong = helpProviderMapLong;
    }

    public String getmHelpProviderAddress() {
        return mHelpProviderAddress;
    }

    public void setmHelpProviderAddress(String mHelpProviderAddress) {
        this.mHelpProviderAddress = mHelpProviderAddress;
    }
}
