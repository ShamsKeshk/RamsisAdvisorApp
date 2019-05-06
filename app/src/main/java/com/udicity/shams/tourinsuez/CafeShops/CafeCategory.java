package com.udicity.shams.tourinsuez.CafeShops;

/**
 * Created by shams on 30/06/17.
 */

public class CafeCategory {

    private int cafeImageResource;
    private String cafeName;
    private int cafeTotalReview;
    private int cafeTimeOpen;
    private int cafeTimeClose;
    private String cafeAddress;
    private double cafeLatMap;
    private double cafeLongMap;

    public CafeCategory(int cafeImageResource, String cafeName, int cafeTotalReview, int cafeTimeOpen, int cafeTimeClose, String cafeAddress) {
        this.cafeImageResource = cafeImageResource;
        this.cafeName = cafeName;
        this.cafeTotalReview = cafeTotalReview;
        this.cafeTimeOpen = cafeTimeOpen;
        this.cafeTimeClose = cafeTimeClose;
        this.cafeAddress = cafeAddress;
    }

    public CafeCategory(int cafeImageResource, String cafeName, int cafeTotalReview, int cafeTimeOpen, int cafeTimeClose, String cafeAddress, double cafeLatMap, double cafeLongMap) {
        this.cafeImageResource = cafeImageResource;
        this.cafeName = cafeName;
        this.cafeTotalReview = cafeTotalReview;
        this.cafeTimeOpen = cafeTimeOpen;
        this.cafeTimeClose = cafeTimeClose;
        this.cafeAddress = cafeAddress;
        this.cafeLatMap = cafeLatMap;
        this.cafeLongMap = cafeLongMap;
    }

    public int getCafeImageResource() {
        return cafeImageResource;
    }

    public void setCafeImageResource(int cafeImageResource) {
        this.cafeImageResource = cafeImageResource;
    }

    public String getCafeName() {
        return cafeName;
    }

    public void setCafeName(String cafeName) {
        this.cafeName = cafeName;
    }

    public int getCafeTotalReview() {
        return cafeTotalReview;
    }

    public void setCafeTotalReview(int cafeTotalReview) {
        this.cafeTotalReview = cafeTotalReview;
    }

    public int getCafeTimeOpen() {
        return cafeTimeOpen;
    }

    public void setCafeTimeOpen(int cafeTimeOpen) {
        this.cafeTimeOpen = cafeTimeOpen;
    }

    public int getCafeTimeClose() {
        return cafeTimeClose;
    }

    public void setCafeTimeClose(int cafeTimeClose) {
        this.cafeTimeClose = cafeTimeClose;
    }

    public String getCafeAddress() {
        return cafeAddress;
    }

    public void setCafeAddress(String cafeAddress) {
        this.cafeAddress = cafeAddress;
    }

    public double getCafeLatMap() {
        return cafeLatMap;
    }

    public void setCafeLatMap(double cafeLatMap) {
        this.cafeLatMap = cafeLatMap;
    }

    public double getCafeLongMap() {
        return cafeLongMap;
    }

    public void setCafeLongMap(double cafeLongMap) {
        this.cafeLongMap = cafeLongMap;
    }
}