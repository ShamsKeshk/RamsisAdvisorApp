package com.udicity.shams.tourinsuez.AboutSuez;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.udicity.shams.tourinsuez.R;

/**
 * Created by shams on 27/06/17.
 */

public class AboutSuezFragmentAdapter extends FragmentPagerAdapter {

    private Context context;

    public AboutSuezFragmentAdapter(FragmentManager fragmentManager, Context context) {
        super(fragmentManager);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AboutSuezFragment();
            case 1:
                return new AboutSuezDistrictFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return context.getString(R.string.about_suez_category);
            case 1:
                return context.getString(R.string.district_fragment_title);
            default:
                return context.getString(R.string.no_title_found);
        }
    }
}