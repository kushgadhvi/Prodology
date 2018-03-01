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

public class tech_quiz extends AppCompatActivity

{

    ViewPager viewPager;
    adapter6 adapterv;
    SlidingTabLayout slidingTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tech_quiz);
        setTitle("Technical Quiz");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        viewPager = (ViewPager) findViewById(R.id.view4);
        adapterv = new adapter6(getSupportFragmentManager());
        viewPager.setAdapter(adapterv);
        slidingTabLayout = (SlidingTabLayout) findViewById(R.id.tab4);
        slidingTabLayout.setDistributeEvenly(true);
        slidingTabLayout.setViewPager(viewPager);

        FloatingActionButton fab3 =(FloatingActionButton)findViewById(R.id.fab3);
        fab3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent3 = new Intent(tech_quiz.this,Register.class);
                intent3.putExtra("url","https://docs.google.com/forms/d/e/1FAIpQLScliiaHscuXN-GzasiAoMCDUCEZun7LSWmFjx8dqPQ9abF2UA/viewform");
                startActivity(intent3);
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
                    fragment = new tech_quiz1();
                    break;
                case 1:
                    fragment = new tech_quiz2();
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