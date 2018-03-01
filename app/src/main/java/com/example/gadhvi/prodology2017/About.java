package com.example.gadhvi.prodology2017;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by gadhvi on 27-12-2016.
 */

public class About extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        TextView t1 =(TextView)findViewById(R.id.textView2);
        TextView t2 =(TextView)findViewById(R.id.textView3);
        t1.setText("Prodology by  PESA  VJTI  having legacy of 56 years, has been the platform for young talents to showcase their innovative ideas.\n" +
                "We here, in Prodology, conduct multitudinous competitions, industrial visits, guest lectures by eminent personalities and interactive workshops to nourish technical as well as managerial skills and unleash the potential within individuals.\n" +
                "Prodology has  a  footfall  of  1200 people including all  the  branches of  VJTI, engineers  from  colleges  all  over  Mumbai and our ALUMNI whom we invite to learn from their experience and expertise .\n" +
                "Through this event we inculcate qualities  like  leadership,  team  work,  self expression and visionary thinking.");
        t2.setText("We, in Prodology, aim to create engineers  for  tomorrow’s  better  and  safe world.");
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
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
}
