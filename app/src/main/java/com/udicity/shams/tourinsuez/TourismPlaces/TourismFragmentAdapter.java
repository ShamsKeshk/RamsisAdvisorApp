package com.udicity.shams.tourinsuez.TourismPlaces;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.udicity.shams.tourinsuez.R;

/**
 * Created by shams on 27/06/17.
 */

public class TourismFragmentAdapter extends FragmentPagerAdapter{

    Context context;

    public TourismFragmentAdapter(FragmentManager fm, Context context)
    {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
       if(position == 0)
       {
           return new TourismFragment();
       }else {
           return null;
       }
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return context.getString(R.string.tourism_category);
    }
}
