package com.udicity.shams.tourinsuez.data;

import com.udicity.shams.tourinsuez.CategoryPackage.Category;
import com.udicity.shams.tourinsuez.R;
import com.udicity.shams.tourinsuez.Restaurant.RestaurantCategory;
import com.udicity.shams.tourinsuez.hotel.HotelCategory;

import java.util.ArrayList;

/**
 * Created by shams on 26/06/17.
 */



public class DataSourcer {

    public static ArrayList<Category> getCategories() {

        ArrayList<Category> categoryArrayList = new ArrayList<Category>();
        categoryArrayList.add(new Category("About",R.drawable.icon_info_green_30px,1));
        categoryArrayList.add(new Category("Hotel",R.drawable.icon_hotel_green_30px,2));
        categoryArrayList.add(new Category("Restaurant",R.drawable.icon_restaurant_green_30px,3));
        categoryArrayList.add(new Category("Tourism",R.drawable.icon_tourism_green_30px,4));
        categoryArrayList.add(new Category("Events",R.drawable.icon_event_green_30px,5));
        categoryArrayList.add(new Category("Shopping",R.drawable.icon_shopping_cart_green_30px,6));
        categoryArrayList.add(new Category("Store",R.drawable.icon_store_green_36px,7));
        categoryArrayList.add(new Category("Hospital",R.drawable.icon_local_hospital_green_30px,8));
        categoryArrayList.add(new Category("Help",R.drawable.icon_help_green_30px,9));

        return categoryArrayList;
    }

    public static ArrayList<RestaurantCategory> getRestaurant() {

        ArrayList<RestaurantCategory> restaurantCategoryArrayList = new ArrayList<RestaurantCategory>();
        restaurantCategoryArrayList.add(new RestaurantCategory("Ateia", 1422, 9, 13));
        restaurantCategoryArrayList.add(new RestaurantCategory("Ateia", 1220, 9, 13));
        restaurantCategoryArrayList.add(new RestaurantCategory("Ateia", 1422, 9, 13));
        restaurantCategoryArrayList.add(new RestaurantCategory("Ateia", 1422, 9, 13));
        restaurantCategoryArrayList.add(new RestaurantCategory("Ateia", 1422, 9, 13));
        restaurantCategoryArrayList.add(new RestaurantCategory("Ateia", 1422, 9, 13));
        restaurantCategoryArrayList.add(new RestaurantCategory("Ateia", 1422, 9, 13));
        restaurantCategoryArrayList.add(new RestaurantCategory("Ateia", 1422, 9, 13));
        restaurantCategoryArrayList.add(new RestaurantCategory("Ateia", 1422, 9, 13));
        restaurantCategoryArrayList.add(new RestaurantCategory("Ateia", 1422, 9, 13));
        restaurantCategoryArrayList.add(new RestaurantCategory("Ateia", 1422, 9, 13));
        restaurantCategoryArrayList.add(new RestaurantCategory("Ateia", 1422, 9, 13));

        return restaurantCategoryArrayList;
    }
    public static ArrayList<HotelCategory> getHotel() {

        ArrayList<HotelCategory> hotelCategoryArrayList = new ArrayList<HotelCategory>();
        hotelCategoryArrayList.add(new HotelCategory("Green House", 1500, R.drawable.hotel_try_up));
        hotelCategoryArrayList.add(new HotelCategory("Ateia", 1500, R.drawable.hotel_try_up));
        hotelCategoryArrayList.add(new HotelCategory("Ateia", 1500, R.drawable.hotel_try_up));
        hotelCategoryArrayList.add(new HotelCategory("Ateia", 1500, R.drawable.hotel_try_up));
        hotelCategoryArrayList.add(new HotelCategory("Ateia", 1500, R.drawable.hotel_try_up));
        hotelCategoryArrayList.add(new HotelCategory("Ateia", 1500, R.drawable.hotel_try_up));
        hotelCategoryArrayList.add(new HotelCategory("Ateia", 1500, R.drawable.hotel_try_up));
        hotelCategoryArrayList.add(new HotelCategory("Ateia", 1500, R.drawable.hotel_try_up));
        hotelCategoryArrayList.add(new HotelCategory("Ateia", 1500, R.drawable.hotel_try_up));

        return hotelCategoryArrayList;
    }
}