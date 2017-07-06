package com.udicity.shams.tourinsuez.Events;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.udicity.shams.tourinsuez.R;

/**
 * Created by shams on 30/06/17.
 * <p>
 * I Add event Fragment To Pager Adapter To Make It Easy When Add Another Fragment !!
 * example : i will add another fragment ,So This Fragment Will Be For Events In This Day
 * And The Second Will Be Events In This Week Except This Day ...
 */

public class EventsFragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public EventsFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EventsFragment();
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
            return mContext.getString(R.string.events_category);
        } else
            return mContext.getString(R.string.no_title_found);
    }
}