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
 * Created by gadhvi on 15-01-2017.
 */

public class cad_war extends AppCompatActivity

    {

        ViewPager viewPager;
        adapter5 adapterv;
        SlidingTabLayout slidingTabLayout;

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cad_war);
            setTitle("CAD War");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        viewPager = (ViewPager) findViewById(R.id.view3);
        adapterv = new adapter5(getSupportFragmentManager());
        viewPager.setAdapter(adapterv);
        slidingTabLayout = (SlidingTabLayout) findViewById(R.id.tab3);
        slidingTabLayout.setDistributeEvenly(true);
        slidingTabLayout.setViewPager(viewPager);
            FloatingActionButton fab4 =(FloatingActionButton)findViewById(R.id.fab4);
            fab4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Intent intent4 = new Intent(cad_war.this,Register.class);
                    intent4.putExtra("url","https://docs.google.com/forms/d/e/1FAIpQLScu-oJcchh4xZsxakypJ42Kr4xNHEvhYlYCV6Y4ylBILc4xbA/viewform");
                    startActivity(intent4);
                }
            });
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
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


    static class adapter5 extends FragmentPagerAdapter {

        String[] TAB = {"Description", "Rules & Regulation"};

        public adapter5(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {


            Fragment fragment = null;
            switch (position) {
                case 0:
                    fragment = new cad_war1();
                    break;
                case 1:
                    fragment = new cad_war2();
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