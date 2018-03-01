package com.example.gadhvi.prodology2017;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.MenuItem;

/**
 * Created by gadhvi on 28-12-2016.
 */

public class Events extends AppCompatActivity {
    ViewPager viewPager;
    adapter3 adapterv;
    SlidingTabLayout slidingTabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.events);
        setTitle("Events");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        //actionBar.startActivity(new Intent(Events.this, MainActivity.class));
        viewPager = (ViewPager) findViewById(R.id.viewpager1);
        adapterv = new adapter3(getSupportFragmentManager());
        viewPager.setAdapter(adapterv);
        slidingTabLayout = (SlidingTabLayout) findViewById(R.id.slidingwindow1);
        slidingTabLayout.setDistributeEvenly(true);
        slidingTabLayout.setViewPager(viewPager);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                //finish(); Intent int1 = new Intent(getApplicationContext(),MainActivity.class);
                Intent int1 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(int1);
                onBackPressed();
                break;
        }
        return true;
    }



    @Override
    public void onBackPressed() {
        //Execute your code here
        Intent int1 = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(int1);
        finish();

    }

    static class adapter3 extends FragmentPagerAdapter
    {

        String[] TAB = {"Technical Events", "Fun Events"};

        public adapter3(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {


            Fragment fragment =null;
            switch (position)
            {
                case 0:
                    fragment = new GetFragment();
                    break;
                case 1:
                    fragment = new GetFragment2();
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
            return 2;
        }
    }
}






