package com.udicity.shams.tourinsuez.Shopping;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.udicity.shams.tourinsuez.R;

/**
 * Created by shams on 27/06/17.
 */

public class ShoppingFragmentAdapter extends FragmentPagerAdapter {

    private Context context;

    public ShoppingFragmentAdapter(FragmentManager fragmentManager, Context context) {
        super(fragmentManager);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ShoppingFragment();
        } else {
            return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.shopping_category);
        } else {
            return context.getString(R.string.no_title_found);
        }
    }

    @Override
    public int getCount() {
        return 1;
    }
}