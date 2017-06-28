package com.udicity.shams.tourinsuez.data;

import android.content.Context;

import com.udicity.shams.tourinsuez.AboutSuez.AboutSuezCategory;
import com.udicity.shams.tourinsuez.CategoryPackage.Category;
import com.udicity.shams.tourinsuez.R;
import com.udicity.shams.tourinsuez.Restaurant.RestaurantCategory;
import com.udicity.shams.tourinsuez.hotel.HotelCategory;

import java.util.ArrayList;

/**
 * Created by shams on 26/06/17.
 */



public class DataSourcer {
    static String h = "In the 7th century AD a town named \"Kolzum\" stood just\n" +
            "        north of the site of present-day Suez and served as eastern terminus of a canal built\n" +
            "        by Amr ibn al-\\'As\n" +
            "        linking the Nile River and the Red Sea. Kolzum\\'s trade fell following the\n" +
            "        closure of the canal in 770 by the second Abbasid caliph al-Mansur to prevent his\n" +
            "        enemies in Arabia from accessing supplies from Egypt and the lands north of it.\n" +
            "        Nonetheless, the town benefited from the trade that remained between Egypt and Arabia.\n" +
            "        By 780 al-Mansur\\'s successor al-Mahdi restored part of the canal.\n" +
            "        The Qarmatians led by Hasan ibn Ahmad defeated a Fatimid army headed by Gawhar\n" +
            "        al-Siqilli at Kolzum in 971 and thereby captured the town. Following his defeat\n" +
            "        in Cairo by al-Siqilli at the end of that year, Hasan and his forces retreated\n" +
            "        to Arabia via Kolzum. Suez was situated nearby and served as a source of drinking water\n" +
            "        for Kolzum according to Arab traveler al-Muqaddasi who visited in 986.\n" +
            "\n" +
            "The Ayyubid sultan of Egypt, Saladin, fortified both Kolzum and Suez in\n" +
            "        to defend Egypt's eastern frontier from Crusader raids by Raynald of\n" +
            "        Chatillon. Between 1183-84, Raynald had ships stationed in the Red Sea to\n" +
            "        prevent the Ayyubid garrison at Kolzum from accessing water. In response, Saladin's\n" +
            "        brother al-Adil had Husam ad-Din Lu'lu build a naval fleet which sailed to the southern\n" +
            "        port of Aidab to end Raynald's venture. By the 13th century it was\n" +
            "        recorded that Kolzum was in ruins as was Suez which had gradually replaced the former as a\n" +
            "        population center. According to Muslim historians al-Maqrizi and al-Idrisi, Kolzum had once\n" +
            "        been a prosperous town, until it was occupied and plundered by Bedouins. Arab geographer\n" +
            "        al-Dimashqi noted that Kolzum belonged to the Mamluk province of al-Karak at the time";



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

    public static ArrayList<AboutSuezCategory> getAboutSuez() {
        ArrayList<AboutSuezCategory> aboutSuezCategoryArrayList = new ArrayList<AboutSuezCategory>();
        aboutSuezCategoryArrayList.add(new AboutSuezCategory("History",h,R.drawable.sokhna_suez));
        aboutSuezCategoryArrayList.add(new AboutSuezCategory("Topic Two","I Want To Tell Moreeee"));
        aboutSuezCategoryArrayList.add(new AboutSuezCategory("Topic Three","I Want To Tell More",R.drawable.sokhna_suez,"Teftekr Momken"));
        aboutSuezCategoryArrayList.add(new AboutSuezCategory("Topic Four","I Want To Tell More",R.drawable.sokhna_suez,"hhhhhhhhhh",R.drawable.sokhna_suez));

        return aboutSuezCategoryArrayList ;
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