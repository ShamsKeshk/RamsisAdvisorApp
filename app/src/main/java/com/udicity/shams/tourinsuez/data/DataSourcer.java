package com.udicity.shams.tourinsuez.data;

import com.udicity.shams.tourinsuez.R;
import com.udicity.shams.tourinsuez.Restaurant.RestaurantCategory;
import com.udicity.shams.tourinsuez.hotel.HotelCategory;

import java.util.ArrayList;

/**
 * Created by shams on 26/06/17.
 */



public class DataSourcer {


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
        hotelCategoryArrayList.add(new HotelCategory("Green House", 1500, R.drawable.hotel_drawer));
        hotelCategoryArrayList.add(new HotelCategory("Ateia", 1500, R.drawable.hotel_drawer));
        hotelCategoryArrayList.add(new HotelCategory("Ateia", 1500, R.drawable.hotel_drawer));
        hotelCategoryArrayList.add(new HotelCategory("Ateia", 1500, R.drawable.hotel_drawer));
        hotelCategoryArrayList.add(new HotelCategory("Ateia", 1500, R.drawable.hotel_drawer));
        hotelCategoryArrayList.add(new HotelCategory("Ateia", 1500, R.drawable.hotel_drawer));
        hotelCategoryArrayList.add(new HotelCategory("Ateia", 1500, R.drawable.hotel_drawer));
        hotelCategoryArrayList.add(new HotelCategory("Ateia", 1500, R.drawable.hotel_drawer));
        hotelCategoryArrayList.add(new HotelCategory("Ateia", 1500, R.drawable.hotel_drawer));


        return hotelCategoryArrayList;
    }
}
