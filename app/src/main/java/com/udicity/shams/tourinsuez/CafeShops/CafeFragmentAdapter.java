package com.udicity.shams.tourinsuez.CafeShops;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.udicity.shams.tourinsuez.R;

/**
 * Created by shams on 30/06/17.
 */

public class CafeFragmentAdapter extends FragmentPagerAdapter {

    Context context;

    public CafeFragmentAdapter(FragmentManager fm, Context context)
    {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
        {
            return new CafeFragment();
        }else
        {
            return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0)
        {
            return context.getString(R.string.cafe_category);
        }else
            return "No Title Found" ;
    }

    @Override
    public int getCount() {
        return 1;
    }
}