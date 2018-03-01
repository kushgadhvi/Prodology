package com.example.gadhvi.prodology2017;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gadhvi on 08-12-2016.
 */

public class Committee extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.commitee);
        setTitle("Committee");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        ListView lvItems = (ListView) findViewById(R.id.l1);
        ExpandableAdapter adapter = getAdapter();

        lvItems.setAdapter(adapter);
        lvItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ExpandableAdapter adapter = (ExpandableAdapter) parent.getAdapter();

                Item item = (Item) adapter.getItem(position);
                if (item != null) {
                    if (item.isExpanded) {
                        item.isExpanded = false;

                    } else {
                        item.isExpanded = true;
                    }
                }

                adapter.notifyDataSetChanged();
            }
        });
    }

    private ExpandableAdapter getAdapter() {

        List<Item> items = new ArrayList<>();

        for (int i = 0; i < 4; i++) {


            if (i == 0) {
                Item item = new Item();
                item.title = "General Secretaries";
                item.description = "General Secretary-   Revant Buch "+"\n"+"Joint General Secretary-Suraj Nayak " +"\n" +"Treasurer- Chinmay Dalwade";
                item.isExpanded = false;
                items.add(item);
            }
            if (i ==1 ) {
                Item item = new Item();
                item.title = "Chief Co-Ordinators";
                item.description = "Marketing Co-Ordinator-Omkar Kulkarni"+"\n"+"Technical Co-Ordinator-Anirudh Shankar "+"\n"+"Technical Co-Ordinator-Shahrukh Shaikh" +"\n" +"Alumni Co-Ordinator-Ayush Palrecha";
                item.isExpanded = false;
                items.add(item);
            }
            if (i ==2 ) {
                Item item = new Item();
                item.title = "Sector's Head";
                item.description = "Marketing Head- Vineet Gosrani\n" +
                        "Design Head- Dhaval Mistry\n" +
                        "Sponsorship Head- Kanhaiyaa Poddar\n" +
                        "Technical Head- Vivek Thore\n" +
                        "Technical Head- Ajinkya Patil\n" +
                        "Infra Head- Aniket Madhke\n"+
                        "Alumni Head-Jaydeep Kulkarni";
                item.isExpanded = false;
                items.add(item);
            }

            if (i ==3 ) {
                Item item = new Item();
                item.title = "Web and App Team";
                item.description = "1. Kush Gadhvi " +"\n"+
                "2. Ganesh Mishra\n";
                item.isExpanded = false;
                items.add(item);
            }

        }


        return new ExpandableAdapter(this, items);

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











