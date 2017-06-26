package com.udicity.shams.tourinsuez.hotel;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.udicity.shams.tourinsuez.R;
import com.udicity.shams.tourinsuez.Restaurant.RestaurantMainFragment;

/**
 * Created by shams on 26/06/17.
 */

public class HotelFragmentAdapter extends FragmentPagerAdapter {

    Context context;

    public HotelFragmentAdapter(FragmentManager fm,Context contextP)
    {
        super(fm);
        context = contextP;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HotelFragment();
        }else return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
        {
            return context.getString(R.string.hotel_category);
        }else return "hhhhh" ;

    }

    @Override
    public int getCount() {
        return 1;
    }
}
