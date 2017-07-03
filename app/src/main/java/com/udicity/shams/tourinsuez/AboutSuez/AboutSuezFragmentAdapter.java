package com.udicity.shams.tourinsuez.AboutSuez;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.udicity.shams.tourinsuez.R;

/**
 * Created by shams on 27/06/17.
 */

public class AboutSuezFragmentAdapter extends FragmentPagerAdapter{

    Context context;

    public AboutSuezFragmentAdapter(FragmentManager fm, Context context)
    {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
        {
            return new  AboutSuezFragment();
        }else if( position == 1){
            return new AboutSuezDistrictFragment();
        }else {
            return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0) {
          return   context.getString(R.string.about_suez_category);
        }else if(position == 1){
            return "District";
        }else {
            return "No Title Found";
        }
    }
}