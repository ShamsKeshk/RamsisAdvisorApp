package com.udicity.shams.tourinsuez.Hospital;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.udicity.shams.tourinsuez.R;

/**
 * Created by shams on 27/06/17.
 * <p>
 * I Add Hospital In View Pager Cause I Will Add Another Two Fragments ,
 * One For Clinic And The Second For Pharmacy .
 * I Think This Will Make it easy To get What the User Want
 */

public class HospitalFragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public HospitalFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HospitalFragment();
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
            return mContext.getString(R.string.hospital_category);
        } else {
            return mContext.getString(R.string.no_title_found);
        }
    }
}