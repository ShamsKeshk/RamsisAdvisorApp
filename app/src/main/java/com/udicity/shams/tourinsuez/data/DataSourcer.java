package com.udicity.shams.tourinsuez.data;

import android.content.Context;
import com.udicity.shams.tourinsuez.AboutSuez.AboutSuezCategory;
import com.udicity.shams.tourinsuez.CafeShops.CafeCategory;
import com.udicity.shams.tourinsuez.CategoryPackage.Category;
import com.udicity.shams.tourinsuez.Events.EventsCategory;
import com.udicity.shams.tourinsuez.Help.HelpCategory;
import com.udicity.shams.tourinsuez.Hospital.HospitalCategory;
import com.udicity.shams.tourinsuez.R;
import com.udicity.shams.tourinsuez.Restaurant.RestaurantCategory;
import com.udicity.shams.tourinsuez.Shopping.ShoppingCategory;
import com.udicity.shams.tourinsuez.TourismPlaces.TourismCategory;
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
        categoryArrayList.add(new Category("Cafe",R.drawable.icon_local_cafe_green_30px,7));
        categoryArrayList.add(new Category("Hospital",R.drawable.icon_local_hospital_green_30px,8));
        categoryArrayList.add(new Category("Help",R.drawable.icon_help_green_30px,9));

        return categoryArrayList;
    }

    public static ArrayList<AboutSuezCategory> getAboutSuez(Context c) {

        ArrayList<AboutSuezCategory> aboutSuezCategoryArrayList = new ArrayList<AboutSuezCategory>();
        aboutSuezCategoryArrayList.add(new AboutSuezCategory(c.getString(R.string.topic_one_header),c.getString(R.string.topic_one_explain),R.drawable.about_suez_topic_one));
        aboutSuezCategoryArrayList.add(new AboutSuezCategory(c.getString(R.string.topic_two_header),c.getString(R.string.topic_two_explain),R.drawable.about_suez_topic_two));
        aboutSuezCategoryArrayList.add(new AboutSuezCategory(c.getString(R.string.topic_three_header),c.getString(R.string.topic_three_explain),R.drawable.about_suez_topic_three));
        aboutSuezCategoryArrayList.add(new AboutSuezCategory(c.getString(R.string.topic_four_header),R.drawable.about_suez_topic_four_part_one,c.getString(R.string.topic_four_explain),R.drawable.about_suez_topic_four_part_two));

        return aboutSuezCategoryArrayList ;
    }

    public static ArrayList<AboutSuezCategory> getAboutSuezDistrictInfo(Context c) {

        ArrayList<AboutSuezCategory> aboutSuezDistrictInfoArrayList = new ArrayList<AboutSuezCategory>();
        aboutSuezDistrictInfoArrayList.add(new AboutSuezCategory("City District",c.getString(R.string.about_suez_city_district_explain)));
        aboutSuezDistrictInfoArrayList.add(new AboutSuezCategory("Arbaeen District",c.getString(R.string.about_suez_district_one_explain)));
        aboutSuezDistrictInfoArrayList.add(new AboutSuezCategory("Suez District",c.getString(R.string.about_suez_district_two_explain)));
        aboutSuezDistrictInfoArrayList.add(new AboutSuezCategory("Ganayen District",c.getString(R.string.about_suez_district_three_explain)));
        aboutSuezDistrictInfoArrayList.add(new AboutSuezCategory("Faisal District",c.getString(R.string.about_suez_district_four_explain)));
        aboutSuezDistrictInfoArrayList.add(new AboutSuezCategory("Attaka District",c.getString(R.string.about_suez_district_five_explain)));

        return aboutSuezDistrictInfoArrayList ;
    }

    public static ArrayList<HotelCategory> getHotel() {

        ArrayList<HotelCategory> hotelCategoryArrayList = new ArrayList<HotelCategory>();

        hotelCategoryArrayList.add(new HotelCategory("Summer Palace Hotel", 1500, R.drawable.hotel_try_up,"062 3221287","behind free zone suez ,El Giesh Street, PortTawfik,Suez",29.946409, 32.565380));
        hotelCategoryArrayList.add(new HotelCategory("Red Sea", 1500, R.drawable.hotel_try_up,"062 3190192","behind The third army clup,El Giesh Street, PortTawfik,Suez",29.947334, 32.570883));
        hotelCategoryArrayList.add(new HotelCategory("Green House", 1500, R.drawable.hotel_try_up,"062 3191554","El Giesh Street,next to cornish of suez,Suez",29.960441, 32.560020));
        hotelCategoryArrayList.add(new HotelCategory("Bonita Hotel", 1500, R.drawable.hotel_try_up,"062 7845321","KABRIT, Suez Governorate 43717",29.966706, 32.549742));
        hotelCategoryArrayList.add(new HotelCategory("Victory Hotel", 1500, R.drawable.hotel_try_up,"not available","elsayed hashim,Al-arbaen,Suez",29.977887, 32.542414));
        hotelCategoryArrayList.add(new HotelCategory("Le Printemps el-Sokhna", 1500, R.drawable.hotel_try_up,"062 3348216","24 El ma3mal,Attaka,Suez",29.905610, 32.455479));
        hotelCategoryArrayList.add(new HotelCategory("Horizon El-wadi", 1500, R.drawable.hotel_try_up,"0111 311 5585","El-sokhna,Ataqah, Suez",29.667351, 32.356301));

        return hotelCategoryArrayList;
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

    public static ArrayList<TourismCategory> getTourismPlaces()
    {
        ArrayList<TourismCategory> tourismCategoryArrayList = new ArrayList<TourismCategory>();

        tourismCategoryArrayList.add(new TourismCategory(R.drawable.hotel_try_up,"El Sokhna","Museum","24 Abas El3qad,Etaqa ,Suez",8764));
        tourismCategoryArrayList.add(new TourismCategory(R.drawable.hotel_try_up,"El Sokhna","Museum","24 Abas El3qad,Etaqa ,Suez",8764));
        tourismCategoryArrayList.add(new TourismCategory(R.drawable.hotel_try_up,"El Sokhna","Museum","24 Abas El3qad,Etaqa ,Suez",8764));
        tourismCategoryArrayList.add(new TourismCategory(R.drawable.hotel_try_up,"El Sokhna","Museum","24 Abas El3qad,Etaqa ,Suez",8764));
        tourismCategoryArrayList.add(new TourismCategory(R.drawable.hotel_try_up,"El Sokhna","Museum","24 Abas El3qad,Etaqa ,Suez",8764));
        tourismCategoryArrayList.add(new TourismCategory(R.drawable.hotel_try_up,"El Sokhna","Museum","24 Abas El3qad,Etaqa ,Suez",8764));
        tourismCategoryArrayList.add(new TourismCategory(R.drawable.hotel_try_up,"El Sokhna","Museum","24 Abas El3qad,Etaqa ,Suez",8764));
        tourismCategoryArrayList.add(new TourismCategory(R.drawable.hotel_try_up,"El Sokhna","Museum","24 Abas El3qad,Etaqa ,Suez",8764));
        tourismCategoryArrayList.add(new TourismCategory(R.drawable.hotel_try_up,"El Sokhna","Museum","24 Abas El3qad,Etaqa ,Suez",8764));
        tourismCategoryArrayList.add(new TourismCategory(R.drawable.hotel_try_up,"El Sokhna","Museum","24 Abas El3qad,Etaqa ,Suez",8764));
        tourismCategoryArrayList.add(new TourismCategory(R.drawable.hotel_try_up,"El Sokhna","Museum","24 Abas El3qad,Etaqa ,Suez",8764));
        tourismCategoryArrayList.add(new TourismCategory(R.drawable.hotel_try_up,"El Sokhna","Museum","24 Abas El3qad,Etaqa ,Suez",8764));

        return tourismCategoryArrayList;
    }

    public static ArrayList<EventsCategory> getEvents() {

        ArrayList<EventsCategory> eventsCategoryArrayList = new ArrayList<EventsCategory>();
        eventsCategoryArrayList.add(new EventsCategory(R.drawable.hotel_try_up,"Google I/O","Start At 12 AM , 24/10/2017","24 Talat-Harb Street,Port Tawfik ,Suez"));
        eventsCategoryArrayList.add(new EventsCategory(R.drawable.hotel_try_up,"Google I/O","Start At 12 AM , 24/10/2017","24 Talat-Harb Street,Port Tawfik ,Suez"));
        eventsCategoryArrayList.add(new EventsCategory(R.drawable.hotel_try_up,"Google I/O","Start At 12 AM , 24/10/2017","24 Talat-Harb Street,Port Tawfik ,Suez"));
        eventsCategoryArrayList.add(new EventsCategory(R.drawable.hotel_try_up,"Google I/O","Start At 12 AM , 24/10/2017","24 Talat-Harb Street,Port Tawfik ,Suez"));
        eventsCategoryArrayList.add(new EventsCategory(R.drawable.hotel_try_up,"Google I/O","Start At 12 AM , 24/10/2017","24 Talat-Harb Street,Port Tawfik ,Suez"));
        eventsCategoryArrayList.add(new EventsCategory(R.drawable.hotel_try_up,"Google I/O","Start At 12 AM , 24/10/2017","24 Talat-Harb Street,Port Tawfik ,Suez"));
        eventsCategoryArrayList.add(new EventsCategory(R.drawable.hotel_try_up,"Google I/O","Start At 12 AM , 24/10/2017","24 Talat-Harb Street,Port Tawfik ,Suez"));
        eventsCategoryArrayList.add(new EventsCategory(R.drawable.hotel_try_up,"Google I/O","Start At 12 AM , 24/10/2017","24 Talat-Harb Street,Port Tawfik ,Suez"));

        return eventsCategoryArrayList;

    }

    public static ArrayList<ShoppingCategory> getShoppingPlaces() {

        ArrayList<ShoppingCategory> shoppingCategoryArrayList = new ArrayList<ShoppingCategory>();

        shoppingCategoryArrayList.add(new ShoppingCategory(R.drawable.hotel_try_up,"Awlad Ragab",678,10,2,"45 El manial ,Fysal ,Suez"));
        shoppingCategoryArrayList.add(new ShoppingCategory(R.drawable.hotel_try_up,"Awlad Ragab",678,10,2,"45 El manial ,Fysal ,Suez"));
        shoppingCategoryArrayList.add(new ShoppingCategory(R.drawable.hotel_try_up,"Awlad Ragab",678,10,2,"45 El manial ,Fysal ,Suez"));
        shoppingCategoryArrayList.add(new ShoppingCategory(R.drawable.hotel_try_up,"Awlad Ragab",678,10,2,"45 El manial ,Fysal ,Suez"));
        shoppingCategoryArrayList.add(new ShoppingCategory(R.drawable.hotel_try_up,"Awlad Ragab",678,10,2,"45 El manial ,Fysal ,Suez"));
        shoppingCategoryArrayList.add(new ShoppingCategory(R.drawable.hotel_try_up,"Awlad Ragab",678,10,2,"45 El manial ,Fysal ,Suez"));
        shoppingCategoryArrayList.add(new ShoppingCategory(R.drawable.hotel_try_up,"Awlad Ragab",678,10,2,"45 El manial ,Fysal ,Suez"));
        shoppingCategoryArrayList.add(new ShoppingCategory(R.drawable.hotel_try_up,"Awlad Ragab",678,10,2,"45 El manial ,Fysal ,Suez"));
        shoppingCategoryArrayList.add(new ShoppingCategory(R.drawable.hotel_try_up,"Awlad Ragab",678,10,2,"45 El manial ,Fysal ,Suez"));
        shoppingCategoryArrayList.add(new ShoppingCategory(R.drawable.hotel_try_up,"Awlad Ragab",678,10,2,"45 El manial ,Fysal ,Suez"));

        return shoppingCategoryArrayList;
    }

    public static ArrayList<CafeCategory> getCafePlaces() {

        ArrayList<CafeCategory> cafeCategoryArrayList = new ArrayList<CafeCategory>();

        cafeCategoryArrayList.add(new CafeCategory(R.drawable.hotel_try_up,"Awlad Ragab",678,10,2,"45 El manial ,Fysal ,Suez"));
        cafeCategoryArrayList.add(new CafeCategory(R.drawable.hotel_try_up,"Awlad Ragab",678,10,2,"45 El manial ,Fysal ,Suez"));
        cafeCategoryArrayList.add(new CafeCategory(R.drawable.hotel_try_up,"Awlad Ragab",678,10,2,"45 El manial ,Fysal ,Suez"));
        cafeCategoryArrayList.add(new CafeCategory(R.drawable.hotel_try_up,"Awlad Ragab",678,10,2,"45 El manial ,Fysal ,Suez"));
        cafeCategoryArrayList.add(new CafeCategory(R.drawable.hotel_try_up,"Awlad Ragab",678,10,2,"45 El manial ,Fysal ,Suez"));
        cafeCategoryArrayList.add(new CafeCategory(R.drawable.hotel_try_up,"Awlad Ragab",678,10,2,"45 El manial ,Fysal ,Suez"));
        cafeCategoryArrayList.add(new CafeCategory(R.drawable.hotel_try_up,"Awlad Ragab",678,10,2,"45 El manial ,Fysal ,Suez"));
        cafeCategoryArrayList.add(new CafeCategory(R.drawable.hotel_try_up,"Awlad Ragab",678,10,2,"45 El manial ,Fysal ,Suez"));
        cafeCategoryArrayList.add(new CafeCategory(R.drawable.hotel_try_up,"Awlad Ragab",678,10,2,"45 El manial ,Fysal ,Suez"));
        cafeCategoryArrayList.add(new CafeCategory(R.drawable.hotel_try_up,"Awlad Ragab",678,10,2,"45 El manial ,Fysal ,Suez"));

        return cafeCategoryArrayList;
    }

    public static ArrayList<HospitalCategory> getHospital() {

        ArrayList<HospitalCategory> hospitalCategoryArrayList = new ArrayList<HospitalCategory>();

        hospitalCategoryArrayList.add(new HospitalCategory(R.drawable.sokhna_suez,"Al Amal",9561,"010 2010 3384","3 Al-Amal,Fysal ,Suez"));
        hospitalCategoryArrayList.add(new HospitalCategory(R.drawable.sokhna_suez,"Al Amal",9561,"010 2010 3384","3 Al-Amal,Fysal ,Suez"));
        hospitalCategoryArrayList.add(new HospitalCategory(R.drawable.sokhna_suez,"Al Amal",9561,"010 2010 3384","3 Al-Amal,Fysal ,Suez"));
        hospitalCategoryArrayList.add(new HospitalCategory(R.drawable.sokhna_suez,"Al Amal",9561,"010 2010 3384","3 Al-Amal,Fysal ,Suez"));
        hospitalCategoryArrayList.add(new HospitalCategory(R.drawable.sokhna_suez,"Al Amal",9561,"010 2010 3384","3 Al-Amal,Fysal ,Suez"));
        hospitalCategoryArrayList.add(new HospitalCategory(R.drawable.sokhna_suez,"Al Amal",9561,"010 2010 3384","3 Al-Amal,Fysal ,Suez"));
        hospitalCategoryArrayList.add(new HospitalCategory(R.drawable.sokhna_suez,"Al Amal",9561,"010 2010 3384","3 Al-Amal,Fysal ,Suez"));
        hospitalCategoryArrayList.add(new HospitalCategory(R.drawable.sokhna_suez,"Al Amal",9561,"010 2010 3384","3 Al-Amal,Fysal ,Suez"));
        hospitalCategoryArrayList.add(new HospitalCategory(R.drawable.sokhna_suez,"Al Amal",9561,"010 2010 3384","3 Al-Amal,Fysal ,Suez"));
        hospitalCategoryArrayList.add(new HospitalCategory(R.drawable.sokhna_suez,"Al Amal",9561,"010 2010 3384","3 Al-Amal,Fysal ,Suez"));

        return hospitalCategoryArrayList;
    }

    public static ArrayList<HelpCategory> getHelpList() {

        ArrayList<HelpCategory> helpCategoryArrayList = new ArrayList<HelpCategory>();
        helpCategoryArrayList.add(new HelpCategory("Tourism Police","122",R.drawable.icon_help_green_30px,-33.2541,-87.254));
        helpCategoryArrayList.add(new HelpCategory("Ambulance","123",R.drawable.icon_help_green_30px,-20.2541,20.254));
        helpCategoryArrayList.add(new HelpCategory("Fire Police","122",R.drawable.icon_help_green_30px,-33.2541,-87.254));
        helpCategoryArrayList.add(new HelpCategory("Police","122",R.drawable.icon_help_green_30px,-33.2541,-87.254));
        helpCategoryArrayList.add(new HelpCategory("Tourism Police","122",R.drawable.icon_help_green_30px,-33.2541,-87.254));
        helpCategoryArrayList.add(new HelpCategory("Tourism Police","122",R.drawable.icon_help_green_30px,-33.2541,-87.254));
        helpCategoryArrayList.add(new HelpCategory("Ambulance","123",R.drawable.icon_help_green_30px,-20.2541,20.254));
        helpCategoryArrayList.add(new HelpCategory("Fire Police","122",R.drawable.icon_help_green_30px,-33.2541,-87.254));
        helpCategoryArrayList.add(new HelpCategory("Police","122",R.drawable.icon_help_green_30px,-33.2541,-87.254));
        helpCategoryArrayList.add(new HelpCategory("Tourism Police","122",R.drawable.icon_help_green_30px,-33.2541,-87.254));
        helpCategoryArrayList.add(new HelpCategory("Tourism Police","122",R.drawable.icon_help_green_30px,-33.2541,-87.254));
        helpCategoryArrayList.add(new HelpCategory("Ambulance","123",R.drawable.icon_help_green_30px,-20.2541,20.254));
        helpCategoryArrayList.add(new HelpCategory("Fire Police","122",R.drawable.icon_help_green_30px,-33.2541,-87.254));
        helpCategoryArrayList.add(new HelpCategory("Police","122",R.drawable.icon_help_green_30px,-33.2541,-87.254));
        helpCategoryArrayList.add(new HelpCategory("Tourism Police","122",R.drawable.icon_help_green_30px,-33.2541,-87.254));

        return helpCategoryArrayList;
    }
}