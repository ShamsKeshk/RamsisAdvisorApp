package com.udicity.shams.tourinsuez.Help;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.udicity.shams.tourinsuez.R;

/**
 * Created by shams on 27/06/17.
 * <p>
 * I Added Help Fragment In Pager Adapter ,Because I Will add Another fragment To
 * Let Tourist Share
 * His Help Request With
 * All People In Same City ....
 */

public class HelpFragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public HelpFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HelpFragment();
        } else {
            return null;
        }
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.help_category);
        } else {
            return mContext.getString(R.string.no_title_found);
        }
    }
}