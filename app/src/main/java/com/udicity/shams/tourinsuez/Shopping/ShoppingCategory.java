package com.udicity.shams.tourinsuez.Shopping;

/**
 * Created by shams on 27/06/17.
 */

public class ShoppingCategory {

    private int shopImageResource;
    private String shopName;
    private int shopTotalReview;
    private int shopTimeOpen;
    private int shopTimeClose;
    private String shopAddress;
    private double shopLatMap;
    private double shopLongMap;

    public ShoppingCategory(int shopImageResource, String shopName, int shopTotalReview, int shopTimeOpen, int shopTimeClose, String shopAddress) {
        this.shopImageResource = shopImageResource;
        this.shopName = shopName;
        this.shopTotalReview = shopTotalReview;
        this.shopTimeOpen = shopTimeOpen;
        this.shopTimeClose = shopTimeClose;
        this.shopAddress = shopAddress;
    }

    public ShoppingCategory(int shopImageResource, String shopName, int shopTotalReview, int shopTimeOpen, int shopTimeClose, String shopAddress, double shopLatMap, double shopLongMap) {
        this.shopImageResource = shopImageResource;
        this.shopName = shopName;
        this.shopTotalReview = shopTotalReview;
        this.shopTimeOpen = shopTimeOpen;
        this.shopTimeClose = shopTimeClose;
        this.shopAddress = shopAddress;
        this.shopLatMap = shopLatMap;
        this.shopLongMap = shopLongMap;
    }

    public int getShopImageResource() {
        return shopImageResource;
    }

    public void setShopImageResource(int shopImageResource) {
        this.shopImageResource = shopImageResource;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getShopTotalReview() {
        return shopTotalReview;
    }

    public void setShopTotalReview(int shopTotalReview) {
        this.shopTotalReview = shopTotalReview;
    }

    public int getShopTimeOpen() {
        return shopTimeOpen;
    }

    public void setShopTimeOpen(int shopTimeOpen) {
        this.shopTimeOpen = shopTimeOpen;
    }

    public int getShopTimeClose() {
        return shopTimeClose;
    }

    public void setShopTimeClose(int shopTimeClose) {
        this.shopTimeClose = shopTimeClose;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public double getShopLatMap() {
        return shopLatMap;
    }

    public void setShopLatMap(double shopLatMap) {
        this.shopLatMap = shopLatMap;
    }

    public double getShopLongMap() {
        return shopLongMap;
    }

    public void setShopLongMap(double shopLongMap) {
        this.shopLongMap = shopLongMap;
    }
}