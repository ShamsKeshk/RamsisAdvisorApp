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

    public static ArrayList<Category> getCategories(Context context) {

        ArrayList<Category> categoryArrayList = new ArrayList<Category>();
        categoryArrayList.add(new Category(context.getString(R.string.about_tab_category), R.drawable.icon_info_green_30px, 1));
        categoryArrayList.add(new Category(context.getString(R.string.hotel_category), R.drawable.icon_hotel_green_30px, 2));
        categoryArrayList.add(new Category(context.getString(R.string.restaurant_category), R.drawable.icon_restaurant_green_30px, 3));
        categoryArrayList.add(new Category(context.getString(R.string.tourism_category), R.drawable.icon_tourism_green_30px, 4));
        categoryArrayList.add(new Category(context.getString(R.string.events_category), R.drawable.icon_event_green_30px, 5));
        categoryArrayList.add(new Category(context.getString(R.string.shopping_category), R.drawable.icon_shopping_cart_green_30px, 6));
        categoryArrayList.add(new Category(context.getString(R.string.cafe_category), R.drawable.icon_local_cafe_green_30px, 7));
        categoryArrayList.add(new Category(context.getString(R.string.hospital_category), R.drawable.icon_local_hospital_green_30px, 8));
        categoryArrayList.add(new Category(context.getString(R.string.help_category), R.drawable.icon_help_green_30px, 9));

        return categoryArrayList;
    }

    public static ArrayList<AboutSuezCategory> getAboutSuez(Context context) {

        ArrayList<AboutSuezCategory> aboutSuezCategoryArrayList = new ArrayList<AboutSuezCategory>();
        aboutSuezCategoryArrayList.add(new AboutSuezCategory(context.getString(R.string.topic_one_header), context.getString(R.string.topic_one_explain), R.drawable.about_suez_topic_one));
        aboutSuezCategoryArrayList.add(new AboutSuezCategory(context.getString(R.string.topic_two_header), context.getString(R.string.topic_two_explain), R.drawable.about_suez_topic_two));
        aboutSuezCategoryArrayList.add(new AboutSuezCategory(context.getString(R.string.topic_three_header), context.getString(R.string.topic_three_explain), R.drawable.about_suez_topic_three));
        aboutSuezCategoryArrayList.add(new AboutSuezCategory(context.getString(R.string.topic_four_header), R.drawable.about_suez_topic_four_part_one, context.getString(R.string.topic_four_explain), R.drawable.about_suez_topic_four_part_two));

        return aboutSuezCategoryArrayList;
    }

    public static ArrayList<AboutSuezCategory> getAboutSuezDistrictInfo(Context context) {

        ArrayList<AboutSuezCategory> aboutSuezDistrictInfoArrayList = new ArrayList<AboutSuezCategory>();
        aboutSuezDistrictInfoArrayList.add(new AboutSuezCategory(context.getString(R.string.city_district), context.getString(R.string.about_suez_city_district_explain)));
        aboutSuezDistrictInfoArrayList.add(new AboutSuezCategory(context.getString(R.string.arbaeen_district), context.getString(R.string.about_suez_district_one_explain)));
        aboutSuezDistrictInfoArrayList.add(new AboutSuezCategory(context.getString(R.string.suez_district), context.getString(R.string.about_suez_district_two_explain)));
        aboutSuezDistrictInfoArrayList.add(new AboutSuezCategory(context.getString(R.string.ganayen_district), context.getString(R.string.about_suez_district_three_explain)));
        aboutSuezDistrictInfoArrayList.add(new AboutSuezCategory(context.getString(R.string.faisal_district), context.getString(R.string.about_suez_district_four_explain)));
        aboutSuezDistrictInfoArrayList.add(new AboutSuezCategory(context.getString(R.string.attaka_district), context.getString(R.string.about_suez_district_five_explain)));

        return aboutSuezDistrictInfoArrayList;
    }

    public static ArrayList<HotelCategory> getHotel(Context context) {

        ArrayList<HotelCategory> hotelCategoryArrayList = new ArrayList<HotelCategory>();

        hotelCategoryArrayList.add(new HotelCategory(context.getString(R.string.summer_palace_hotel), 1500, R.drawable.hotel_try_up, context.getString(R.string.summer_palace_phone_number), context.getString(R.string.summer_palace_address), 29.946409, 32.565380));
        hotelCategoryArrayList.add(new HotelCategory(context.getString(R.string.red_sea), 1500, R.drawable.hotel_try_up, context.getString(R.string.red_sea_phone_number), context.getString(R.string.red_sea_hotel_address), 29.947334, 32.570883));
        hotelCategoryArrayList.add(new HotelCategory(context.getString(R.string.green_house), 1500, R.drawable.hotel_try_up, context.getString(R.string.green_house_phone_number), context.getString(R.string.green_house_address), 29.960441, 32.560020));
        hotelCategoryArrayList.add(new HotelCategory(context.getString(R.string.bonita_hotel), 1500, R.drawable.hotel_try_up, context.getString(R.string.bonita_hotel_phone_number), context.getString(R.string.bonita_hotel_address), 29.966706, 32.549742));
        hotelCategoryArrayList.add(new HotelCategory(context.getString(R.string.victory_hotel), 1500, R.drawable.hotel_try_up, context.getString(R.string.victory_hotel_phone_number), context.getString(R.string.victory_hotel_address), 29.977887, 32.542414));
        hotelCategoryArrayList.add(new HotelCategory(context.getString(R.string.le_printemps_el_sokhna), 1500, R.drawable.hotel_try_up, context.getString(R.string.le_printemps_el_sokhna_phone_number), context.getString(R.string.le_printemps_el_sokhna_address), 29.905610, 32.455479));
        hotelCategoryArrayList.add(new HotelCategory(context.getString(R.string.horizon_el_wady_hotel), 1500, R.drawable.hotel_try_up, context.getString(R.string.horizon_el_wady_hotel_phone_number), context.getString(R.string.horizon_el_wady_hotel_address), 29.667351, 32.356301));

        return hotelCategoryArrayList;
    }

    public static ArrayList<RestaurantCategory> getRestaurant(Context context) {

        ArrayList<RestaurantCategory> restaurantCategoryArrayList = new ArrayList<RestaurantCategory>();
        restaurantCategoryArrayList.add(new RestaurantCategory(R.drawable.restaurant_img, context.getString(R.string.el_masry_restaurant_name), context.getString(R.string.el_masry_phone_number), 1422, 9, 22, context.getString(R.string.el_masry_address), 29.965445, 32.553419));
        restaurantCategoryArrayList.add(new RestaurantCategory(R.drawable.restaurant_img, context.getString(R.string.new_dolphin), context.getString(R.string.new_dolphin_phone_number), 1220, 9, 23, context.getString(R.string.new_dolphin_address), 29.961058, 32.547325));
        restaurantCategoryArrayList.add(new RestaurantCategory(R.drawable.restaurant_img, context.getString(R.string.career_builder_pizza), context.getString(R.string.career_builder_pizaa_phone_number), 1422, 9, 21, context.getString(R.string.career_builder_pizaa_address), 30.000076, 32.490196));
        restaurantCategoryArrayList.add(new RestaurantCategory(R.drawable.restaurant_img, context.getString(R.string.fares_seafood), context.getString(R.string.fares_seefood), 1422, 9, 1, context.getString(R.string.fares_seefood_address), 29.960793, 32.545023));
        restaurantCategoryArrayList.add(new RestaurantCategory(R.drawable.restaurant_img, context.getString(R.string.sea_side), context.getString(R.string.sea_side_phone_number), 1422, 9, 23, context.getString(R.string.sea_side_address), 29.956671, 32.544100));
        restaurantCategoryArrayList.add(new RestaurantCategory(R.drawable.restaurant_img, context.getString(R.string.el_haty), context.getString(R.string.el_haty_phone_number), 1422, 9, 2, context.getString(R.string.el_haty_address), 29.961924, 32.549155));
        restaurantCategoryArrayList.add(new RestaurantCategory(R.drawable.restaurant_img, context.getString(R.string.cook_door), context.getString(R.string.cook_door_phone_number), 1422, 9, 21, context.getString(R.string.cook_door_address), 29.966407, 32.554101));
        restaurantCategoryArrayList.add(new RestaurantCategory(R.drawable.restaurant_img, context.getString(R.string.castello), context.getString(R.string.castello_phone_number), 1422, 9, 1, context.getString(R.string.castello_address), 29.966575, 32.554290));
        restaurantCategoryArrayList.add(new RestaurantCategory(R.drawable.restaurant_img, context.getString(R.string.el_gaser_sea_food), context.getString(R.string.el_gaser_sea_food_phone_number), 1422, 9, 22, context.getString(R.string.el_gaser_sea_food_address), 29.964299, 32.557682));
        restaurantCategoryArrayList.add(new RestaurantCategory(R.drawable.restaurant_img, context.getString(R.string.awlad_wares), context.getString(R.string.awlad_wares_phone_number), 1422, 9, 3, context.getString(R.string.awlad_wares_address), 29.965966, 32.554887));
        restaurantCategoryArrayList.add(new RestaurantCategory(R.drawable.restaurant_img, context.getString(R.string.le_gusto_restaurant), context.getString(R.string.le_gusto_phone_number), 1422, 9, 22, context.getString(R.string.le_gusto_address), 29.964283, 32.534114));
        restaurantCategoryArrayList.add(new RestaurantCategory(R.drawable.restaurant_img, context.getString(R.string.shakshook_restaurant), context.getString(R.string.shakshook_phone_number), 1422, 9, 1, context.getString(R.string.shakshook_address), 29.964745, 32.557194));

        return restaurantCategoryArrayList;
    }

    public static ArrayList<TourismCategory> getTourismPlaces(Context context) {

        ArrayList<TourismCategory> tourismCategoryArrayList = new ArrayList<TourismCategory>();

        tourismCategoryArrayList.add(new TourismCategory(R.drawable.hotel_try_up, context.getString(R.string.el_sokhna), context.getString(R.string.muesum), context.getString(R.string.address_of_sokhna), 8764));
        tourismCategoryArrayList.add(new TourismCategory(R.drawable.hotel_try_up, context.getString(R.string.el_sokhna), context.getString(R.string.muesum), context.getString(R.string.address_of_sokhna), 8764));
        tourismCategoryArrayList.add(new TourismCategory(R.drawable.hotel_try_up, context.getString(R.string.el_sokhna), context.getString(R.string.muesum), context.getString(R.string.address_of_sokhna), 8764));
        tourismCategoryArrayList.add(new TourismCategory(R.drawable.hotel_try_up, context.getString(R.string.el_sokhna), context.getString(R.string.muesum), context.getString(R.string.address_of_sokhna), 8764));
        tourismCategoryArrayList.add(new TourismCategory(R.drawable.hotel_try_up, context.getString(R.string.el_sokhna), context.getString(R.string.muesum), context.getString(R.string.address_of_sokhna), 8764));
        tourismCategoryArrayList.add(new TourismCategory(R.drawable.hotel_try_up, context.getString(R.string.el_sokhna), context.getString(R.string.muesum), context.getString(R.string.address_of_sokhna), 8764));
        tourismCategoryArrayList.add(new TourismCategory(R.drawable.hotel_try_up, context.getString(R.string.el_sokhna), context.getString(R.string.muesum), context.getString(R.string.address_of_sokhna), 8764));
        tourismCategoryArrayList.add(new TourismCategory(R.drawable.hotel_try_up, context.getString(R.string.el_sokhna), context.getString(R.string.muesum), context.getString(R.string.address_of_sokhna), 8764));
        tourismCategoryArrayList.add(new TourismCategory(R.drawable.hotel_try_up, context.getString(R.string.el_sokhna), context.getString(R.string.muesum), context.getString(R.string.address_of_sokhna), 8764));
        tourismCategoryArrayList.add(new TourismCategory(R.drawable.hotel_try_up, context.getString(R.string.el_sokhna), context.getString(R.string.muesum), context.getString(R.string.address_of_sokhna), 8764));

        return tourismCategoryArrayList;
    }

    public static ArrayList<EventsCategory> getEvents(Context context) {

        ArrayList<EventsCategory> eventsCategoryArrayList = new ArrayList<EventsCategory>();
        eventsCategoryArrayList.add(new EventsCategory(R.drawable.hotel_try_up, context.getString(R.string.google_i_o), context.getString(R.string.google_event_date), context.getString(R.string.google_event_address)));
        eventsCategoryArrayList.add(new EventsCategory(R.drawable.hotel_try_up, context.getString(R.string.google_i_o), context.getString(R.string.google_event_date), context.getString(R.string.google_event_address)));
        eventsCategoryArrayList.add(new EventsCategory(R.drawable.hotel_try_up, context.getString(R.string.google_i_o), context.getString(R.string.google_event_date), context.getString(R.string.google_event_address)));
        eventsCategoryArrayList.add(new EventsCategory(R.drawable.hotel_try_up, context.getString(R.string.google_i_o), context.getString(R.string.google_event_date), context.getString(R.string.google_event_address)));
        eventsCategoryArrayList.add(new EventsCategory(R.drawable.hotel_try_up, context.getString(R.string.google_i_o), context.getString(R.string.google_event_date), context.getString(R.string.google_event_address)));
        eventsCategoryArrayList.add(new EventsCategory(R.drawable.hotel_try_up, context.getString(R.string.google_i_o), context.getString(R.string.google_event_date), context.getString(R.string.google_event_address)));
        eventsCategoryArrayList.add(new EventsCategory(R.drawable.hotel_try_up, context.getString(R.string.google_i_o), context.getString(R.string.google_event_date), context.getString(R.string.google_event_address)));
        eventsCategoryArrayList.add(new EventsCategory(R.drawable.hotel_try_up, context.getString(R.string.google_i_o), context.getString(R.string.google_event_date), context.getString(R.string.google_event_address)));

        return eventsCategoryArrayList;

    }

    public static ArrayList<ShoppingCategory> getShoppingPlaces(Context context) {

        ArrayList<ShoppingCategory> shoppingCategoryArrayList = new ArrayList<ShoppingCategory>();

        shoppingCategoryArrayList.add(new ShoppingCategory(R.drawable.hotel_try_up, context.getString(R.string.awlad_ragab), 678, 10, 2, context.getString(R.string.awlad_ragab_address)));
        shoppingCategoryArrayList.add(new ShoppingCategory(R.drawable.hotel_try_up, context.getString(R.string.awlad_ragab), 678, 10, 2, context.getString(R.string.awlad_ragab_address)));
        shoppingCategoryArrayList.add(new ShoppingCategory(R.drawable.hotel_try_up, context.getString(R.string.awlad_ragab), 678, 10, 2, context.getString(R.string.awlad_ragab_address)));
        shoppingCategoryArrayList.add(new ShoppingCategory(R.drawable.hotel_try_up, context.getString(R.string.awlad_ragab), 678, 10, 2, context.getString(R.string.awlad_ragab_address)));
        shoppingCategoryArrayList.add(new ShoppingCategory(R.drawable.hotel_try_up, context.getString(R.string.awlad_ragab), 678, 10, 2, context.getString(R.string.awlad_ragab_address)));
        shoppingCategoryArrayList.add(new ShoppingCategory(R.drawable.hotel_try_up, context.getString(R.string.awlad_ragab), 678, 10, 2, context.getString(R.string.awlad_ragab_address)));
        shoppingCategoryArrayList.add(new ShoppingCategory(R.drawable.hotel_try_up, context.getString(R.string.awlad_ragab), 678, 10, 2, context.getString(R.string.awlad_ragab_address)));
        shoppingCategoryArrayList.add(new ShoppingCategory(R.drawable.hotel_try_up, context.getString(R.string.awlad_ragab), 678, 10, 2, context.getString(R.string.awlad_ragab_address)));


        return shoppingCategoryArrayList;
    }

    public static ArrayList<CafeCategory> getCafePlaces(Context context) {

        ArrayList<CafeCategory> cafeCategoryArrayList = new ArrayList<CafeCategory>();

        cafeCategoryArrayList.add(new CafeCategory(R.drawable.hotel_try_up, context.getString(R.string.awlad_ragab), 678, 10, 2, context.getString(R.string.awlad_ragab_address)));
        cafeCategoryArrayList.add(new CafeCategory(R.drawable.hotel_try_up, context.getString(R.string.awlad_ragab), 678, 10, 2, context.getString(R.string.awlad_ragab_address)));
        cafeCategoryArrayList.add(new CafeCategory(R.drawable.hotel_try_up, context.getString(R.string.awlad_ragab), 678, 10, 2, context.getString(R.string.awlad_ragab_address)));
        cafeCategoryArrayList.add(new CafeCategory(R.drawable.hotel_try_up, context.getString(R.string.awlad_ragab), 678, 10, 2, context.getString(R.string.awlad_ragab_address)));
        cafeCategoryArrayList.add(new CafeCategory(R.drawable.hotel_try_up, context.getString(R.string.awlad_ragab), 678, 10, 2, context.getString(R.string.awlad_ragab_address)));
        cafeCategoryArrayList.add(new CafeCategory(R.drawable.hotel_try_up, context.getString(R.string.awlad_ragab), 678, 10, 2, context.getString(R.string.awlad_ragab_address)));
        cafeCategoryArrayList.add(new CafeCategory(R.drawable.hotel_try_up, context.getString(R.string.awlad_ragab), 678, 10, 2, context.getString(R.string.awlad_ragab_address)));
        cafeCategoryArrayList.add(new CafeCategory(R.drawable.hotel_try_up, context.getString(R.string.awlad_ragab), 678, 10, 2, context.getString(R.string.awlad_ragab_address)));

        return cafeCategoryArrayList;
    }

    public static ArrayList<HospitalCategory> getHospital(Context context) {

        ArrayList<HospitalCategory> hospitalCategoryArrayList = new ArrayList<HospitalCategory>();

        hospitalCategoryArrayList.add(new HospitalCategory(R.drawable.hospital, context.getString(R.string.suez_military_hospital), 9561, context.getString(R.string.suez_military_hospital_phone), context.getString(R.string.suez_military_hospital_address), 29.998252, 32.488599));
        hospitalCategoryArrayList.add(new HospitalCategory(R.drawable.hospital, context.getString(R.string.general_suez_hospital), 9561, context.getString(R.string.general_suez_hospital_phone), context.getString(R.string.general_suez_hospital_address), 29.968206, 32.547674));
        hospitalCategoryArrayList.add(new HospitalCategory(R.drawable.hospital, context.getString(R.string.suez_hospital_for_health_insurance), 9561, context.getString(R.string.suez_hospital_for_health_insurance_phone), context.getString(R.string.suez_hospital_for_health_insurance_address), 29.956762, 32.566829));
        hospitalCategoryArrayList.add(new HospitalCategory(R.drawable.hospital, context.getString(R.string.al_amal), 9561, context.getString(R.string.al_amal_phone), context.getString(R.string.al_amal_address), 29.968355, 32.549737));
        hospitalCategoryArrayList.add(new HospitalCategory(R.drawable.hospital, context.getString(R.string.al_obour), 9561, context.getString(R.string.al_obour_phone), context.getString(R.string.al_obour_address), 29.970926, 32.531277));


        return hospitalCategoryArrayList;
    }

    public static ArrayList<HelpCategory> getHelpList(Context context) {

        ArrayList<HelpCategory> helpCategoryArrayList = new ArrayList<HelpCategory>();
        helpCategoryArrayList.add(new HelpCategory(context.getString(R.string.ambulance), context.getString(R.string.ambulance_phone), R.drawable.ambulance, context.getString(R.string.hospitel_address), -20.2541, 20.254));
        helpCategoryArrayList.add(new HelpCategory(context.getString(R.string.suez_ambulance_facility), context.getString(R.string.suez_ambulance_facility_phone), R.drawable.ambulance, context.getString(R.string.hospitel_address), -20.2541, 20.254));
        helpCategoryArrayList.add(new HelpCategory(context.getString(R.string.fire_station), context.getString(R.string.fire_station_phone), R.drawable.fire_station, context.getString(R.string.hospitel_address), -20.2541, 20.254));
        helpCategoryArrayList.add(new HelpCategory(context.getString(R.string.suez_civil_protection), context.getString(R.string.suez_civil_protection_phone), R.drawable.fire_station, context.getString(R.string.hospitel_address), -33.2541, -87.254));
        helpCategoryArrayList.add(new HelpCategory(context.getString(R.string.tourism_police), context.getString(R.string.tourism_police_phone), R.drawable.police, context.getString(R.string.hospitel_address), -33.2541, -87.254));
        helpCategoryArrayList.add(new HelpCategory(context.getString(R.string.suez_sos_police), context.getString(R.string.suez_sos_police_phone), R.drawable.police, context.getString(R.string.hospitel_address), -33.2541, -87.254));
        helpCategoryArrayList.add(new HelpCategory(context.getString(R.string.suez_police), context.getString(R.string.suez_police_phone), R.drawable.police, context.getString(R.string.hospitel_address), -33.2541, -87.254));
        helpCategoryArrayList.add(new HelpCategory(context.getString(R.string.suez_police_station), context.getString(R.string.suez_police_station_phone), R.drawable.police, context.getString(R.string.hospitel_address), -33.2541, -87.254));
        helpCategoryArrayList.add(new HelpCategory(context.getString(R.string.arbaeen_police_station), context.getString(R.string.arbaeen_police_station_phone), R.drawable.police, context.getString(R.string.hospitel_address), -33.2541, -87.254));
        helpCategoryArrayList.add(new HelpCategory(context.getString(R.string.faisal_police_station), context.getString(R.string.faisal_police_station_phone), R.drawable.police, context.getString(R.string.hospitel_address), -33.2541, -87.254));
        helpCategoryArrayList.add(new HelpCategory(context.getString(R.string.attaka_police_station), context.getString(R.string.attaka_police_station_phone), R.drawable.police, context.getString(R.string.hospitel_address), -33.2541, -87.254));
        helpCategoryArrayList.add(new HelpCategory(context.getString(R.string.ganayen_police_station), context.getString(R.string.ganayen_police_station_phone), R.drawable.police, context.getString(R.string.hospitel_address), -33.2541, -87.254));
        helpCategoryArrayList.add(new HelpCategory(context.getString(R.string.suez_police_directorate), context.getString(R.string.suez_police_directorate_address), R.drawable.police, context.getString(R.string.hospitel_address), -33.2541, -87.254));
        helpCategoryArrayList.add(new HelpCategory(context.getString(R.string.suez_police_supply_investigation), context.getString(R.string.suez_police_supply_investigation_address), R.drawable.police, context.getString(R.string.hospitel_address), -20.2541, 20.254));
        helpCategoryArrayList.add(new HelpCategory(context.getString(R.string.suez_traffic_management), context.getString(R.string.suez_traffic_management_address), R.drawable.police, context.getString(R.string.hospitel_address), -33.2541, -87.254));

        return helpCategoryArrayList;
    }
}