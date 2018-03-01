package com.example.gadhvi.prodology2017;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by gadhvi on 14-01-2017.
 */

public class adapter1 extends FragmentPagerAdapter
    {

        String[] TAB = {"CNC","3-D Printing","Data Analytics","CAD"};

        public adapter1(FragmentManager fm) {
        super(fm);
    }

        @Override
        public Fragment getItem(int position) {


        Fragment fragment =null;
        switch (position)
        {
            case 0:
                fragment = new GetFragment3();
                break;
            case 1:
                fragment = new GetFragment4();
                break;
            case 2:
                fragment = new GetFragment5();
                break;
            case 3:
                fragment = new GetFragment6();
                break;

        }

        return fragment;
    }


        @Override
        public CharSequence getPageTitle(int position) {
        return (TAB[position]);
    }

        @Override
        public int getCount() {
        return 4;
    }
    }
