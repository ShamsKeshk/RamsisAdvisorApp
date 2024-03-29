package com.udicity.shams.tourinsuez.CafeShops;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.udicity.shams.tourinsuez.R;

/**
 * Created by shams on 30/06/17.
 * <p>
 * i create this Fragment To make It easy To Add another fragment , Like Local Cafe plus this Fragment
 */

public class CafeFragmentAdapter extends FragmentPagerAdapter {

    private Context context;

    public CafeFragmentAdapter(FragmentManager fragmentManager, Context context) {
        super(fragmentManager);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new CafeFragment();
        } else {
            return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.cafe_category);
        } else
            return context.getString(R.string.no_title_found);
    }

    @Override
    public int getCount() {
        return 1;
    }
}