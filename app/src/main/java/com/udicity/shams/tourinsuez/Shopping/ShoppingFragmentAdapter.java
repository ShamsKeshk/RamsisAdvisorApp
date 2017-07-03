package com.udicity.shams.tourinsuez.Shopping;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.udicity.shams.tourinsuez.R;

/**
 * Created by shams on 27/06/17.
 */

public class ShoppingFragmentAdapter extends FragmentPagerAdapter {

    Context context;

    public ShoppingFragmentAdapter(FragmentManager fm,Context context)
    {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
        {
            return new ShoppingFragment();
        }else
        {
            return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.shopping_category);
        }else
        {
            return "No Title Found";
        }
    }

    @Override
    public int getCount() {
        return 1;
    }
}