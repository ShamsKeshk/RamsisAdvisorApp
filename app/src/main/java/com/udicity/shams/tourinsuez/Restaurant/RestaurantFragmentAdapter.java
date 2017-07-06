package com.udicity.shams.tourinsuez.Restaurant;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.udicity.shams.tourinsuez.R;

/**
 * Created by shams on 26/06/17.
 * <p>
 * I Add Restaurant To View Pager Cause I Will Add Another Two Or Three Fragments
 * Explain : I Will Add One For Seafood Restaurant , Another For Another Type Of Food ..
 */

public class RestaurantFragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public RestaurantFragmentAdapter(FragmentManager fragmentManager, Context context) {
        super(fragmentManager);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantMainFragment();
        } else return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.restaurant_category);
        } else return mContext.getString(R.string.no_title_found);

    }

    @Override
    public int getCount() {
        return 1;
    }
}