package com.example.gadhvi.prodology2017;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by gadhvi on 06-02-2017.
 */

public class Twister extends AppCompatActivity {


    ViewPager viewPager;
    adapter6 adapterv;
    SlidingTabLayout slidingTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twister);
        setTitle("Twister");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        viewPager = (ViewPager) findViewById(R.id.view11);
        adapterv = new adapter6(getSupportFragmentManager());
        viewPager.setAdapter(adapterv);
        slidingTabLayout = (SlidingTabLayout) findViewById(R.id.tab11);
        slidingTabLayout.setDistributeEvenly(true);
        slidingTabLayout.setViewPager(viewPager);
        FloatingActionButton fab12 =(FloatingActionButton)findViewById(R.id.fab12);
        fab12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent1 = new Intent(Twister.this,Register.class);
                intent1.putExtra("url","https://docs.google.com/forms/d/e/1FAIpQLSdcupUPqwDOIOt7Vz5SVblzaRI1YqrbD86k00wLM15xtXgLCw/viewform");
                startActivity(intent1);
            }
        });


    }

    public boolean onOptionsItemSelected(MenuItem item) {
        Intent myIntent = new Intent(getApplicationContext(), Events.class);
        startActivityForResult(myIntent, 0);

        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);

    }


    static class adapter6 extends FragmentPagerAdapter {

        String[] TAB = {"Description", "Rules & Regulation"};

        public adapter6(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {


            Fragment fragment = null;
            switch (position) {
                case 0:
                    fragment = new Twister1();
                    break;
                case 1:
                    fragment = new Twister2();
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
