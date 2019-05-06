package com.udicity.shams.tourinsuez.CategoryPackage;

/**
 * Created by shams on 25/06/17.
 */

public class Category {

    public static int numberOfCategories = 0;
    private String mCategoryName;
    private int mCategoryImageResource;
    private int mCategoryId;

    public Category(String categoryName, int categoryImageResource, int categoryId) {
        mCategoryName = categoryName;
        mCategoryImageResource = categoryImageResource;
        mCategoryId = categoryId;
        numberOfCategories = numberOfCategories + 1;
    }

    public Category() {

    }

    public String getmCategoryName() {
        return mCategoryName;
    }

    public void setmCategoryName(String categoryName) {
        mCategoryName = categoryName;
    }

    public int getmCategoryImageResource() {
        return mCategoryImageResource;
    }

    public void setmCategoryImageResource(int categoryImageResource) {
        mCategoryImageResource = categoryImageResource;
    }

    public int getmCategoryId() {
        return mCategoryId;
    }

    public void setmCategoryId(int categoryId) {
        mCategoryId = categoryId;
    }
}
