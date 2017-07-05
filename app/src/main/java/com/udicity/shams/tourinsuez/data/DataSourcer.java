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
        restaurantCategoryArrayList.add(new RestaurantCategory(R.drawable.restaurant_img,"Kababgy Mohamed El Masry","062 3324160", 1422, 9, 22,"30 Off El Tahrir St. SUEZ DISTRICT، Suez",29.965445, 32.553419));
        restaurantCategoryArrayList.add(new RestaurantCategory(R.drawable.restaurant_img,"New Dolphin","062 3304830", 1220, 9, 23,"22 El Galaa St.، SUEZ DISTRICT، Suez",29.961058, 32.547325));
        restaurantCategoryArrayList.add(new RestaurantCategory(R.drawable.restaurant_img,"CareerBuilder Pizza ","0106 465 9457", 1422, 9, 21,"Suez Rd, Suez",30.000076, 32.490196));
        restaurantCategoryArrayList.add(new RestaurantCategory(R.drawable.restaurant_img,"Fares Seafood","0102 234 3448", 1422, 9, 1," Ain El Sokhna Rd, Suez,",29.960793, 32.545023));
        restaurantCategoryArrayList.add(new RestaurantCategory(R.drawable.restaurant_img,"Sea Side", "062 3333397",1422, 9, 23,"Suez, Suez Governorate",29.956671, 32.544100));
        restaurantCategoryArrayList.add(new RestaurantCategory(R.drawable.restaurant_img,"El haty","Not Provided", 1422, 9, 2,"Suez Governorate",29.961924, 32.549155));
        restaurantCategoryArrayList.add(new RestaurantCategory(R.drawable.restaurant_img,"Cook Door","16999", 1422, 9, 21,"Suez, Suez Governorate",29.966407, 32.554101));
        restaurantCategoryArrayList.add(new RestaurantCategory(R.drawable.restaurant_img,"Castello","0100 688 8033", 1422, 9, 1,"23-Jul, Suez Governorate",29.966575, 32.554290));
        restaurantCategoryArrayList.add(new RestaurantCategory(R.drawable.restaurant_img,"El Gaser Sea Food","0122 222 4862", 1422, 9, 22,"Suez, Suez Governorate",29.964299, 32.557682));
        restaurantCategoryArrayList.add(new RestaurantCategory(R.drawable.restaurant_img,"Awlad Wares","0101 384 4402", 1422, 9, 3,"Nemsa Square ,Suez Governorate",29.965966, 32.554887));
        restaurantCategoryArrayList.add(new RestaurantCategory(R.drawable.restaurant_img,"IL Gusto Restauranti Italiano","0102 345 6007", 1422, 9, 22,"Suez, Suez Governorate",29.964283, 32.534114));
        restaurantCategoryArrayList.add(new RestaurantCategory(R.drawable.restaurant_img,"Pizza Shakshook","0100 335 3350", 1422, 9, 1,"Suez, Al Khassah, Suez",29.964745, 32.557194));

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

        hospitalCategoryArrayList.add(new HospitalCategory(R.drawable.hospital,"Suez Military Hospital",9561,"0102 278 4166","Suez Rd, Suez, Suez Governorate",29.998252, 32.488599));
        hospitalCategoryArrayList.add(new HospitalCategory(R.drawable.hospital,"General Suez Hospital",9561,"062 3331190","Salah Uddin St، Suez, Suez Governorate",29.968206, 32.547674));
        hospitalCategoryArrayList.add(new HospitalCategory(R.drawable.hospital,"Suez Hospital For Health Insurance",9561,"062 3191381","SUEZ, PORT TAWFIK",29.956762, 32.566829));
        hospitalCategoryArrayList.add(new HospitalCategory(R.drawable.hospital,"Al Amal",9561,"010 2010 3384","Suez Governorate",29.968355, 32.549737));
        hospitalCategoryArrayList.add(new HospitalCategory(R.drawable.hospital,"Al Obour",9561,"010 2010 3384","Suez, Suez Governorate",29.970926, 32.531277));


        return hospitalCategoryArrayList;
    }

    public static ArrayList<HelpCategory> getHelpList() {

        ArrayList<HelpCategory> helpCategoryArrayList = new ArrayList<HelpCategory>();
        helpCategoryArrayList.add(new HelpCategory("Ambulance","123",R.drawable.ambulance,"Address Not Provided",-20.2541,20.254));
        helpCategoryArrayList.add(new HelpCategory("Suez Ambulance facility","0623347363",R.drawable.ambulance,"Address Not Provided",-20.2541,20.254));
        helpCategoryArrayList.add(new HelpCategory("Fire Station","180",R.drawable.fire_station,"Address Not Provided",-20.2541,20.254));
        helpCategoryArrayList.add(new HelpCategory("Suez Civil Protection","0623331049",R.drawable.fire_station,"Address Not Provided",-33.2541,-87.254));
        helpCategoryArrayList.add(new HelpCategory("Tourism Police","0623331140",R.drawable.police,"Address Not Provided",-33.2541,-87.254));
        helpCategoryArrayList.add(new HelpCategory("Suez SOS Police","0623331078",R.drawable.police,"Address Not Provided",-33.2541,-87.254));
        helpCategoryArrayList.add(new HelpCategory("Suez Police","122",R.drawable.police,"Address Not Provided",-33.2541,-87.254));
        helpCategoryArrayList.add(new HelpCategory("Suez Police Station","0623331075",R.drawable.police,"Address Not Provided",-33.2541,-87.254));
        helpCategoryArrayList.add(new HelpCategory("Arbaeen Police Station","0623331074",R.drawable.police,"Address Not Provided",-33.2541,-87.254));
        helpCategoryArrayList.add(new HelpCategory("Faisal Police Station","0623670375",R.drawable.police,"Address Not Provided",-33.2541,-87.254));
        helpCategoryArrayList.add(new HelpCategory("Attaka Police Station","0623360324",R.drawable.police,"Address Not Provided",-33.2541,-87.254));
        helpCategoryArrayList.add(new HelpCategory("Ganayen Police Station","0623500051",R.drawable.police,"Address Not Provided",-33.2541,-87.254));
        helpCategoryArrayList.add(new HelpCategory("Suez Police Directorate","0623331077",R.drawable.police,"Address Not Provided",-33.2541,-87.254));
        helpCategoryArrayList.add(new HelpCategory("Suez Police Supply Investigation","0623331070",R.drawable.police,"Address Not Provided",-20.2541,20.254));
        helpCategoryArrayList.add(new HelpCategory("Suez Traffic management","0623331082",R.drawable.police,"Address Not Provided",-33.2541,-87.254));

        return helpCategoryArrayList;
    }
}