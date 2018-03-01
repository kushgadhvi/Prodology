package com.example.gadhvi.prodology2017;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.icu.text.SimpleDateFormat;

import android.icu.util.GregorianCalendar;
import android.net.ParseException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import android.provider.CalendarContract;
import android.support.annotation.RequiresApi;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.CardView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Toast;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

import java.util.Calendar;
import java.util.Date;

import static android.R.attr.bitmap;
import static android.R.id.list;
import static java.util.Date.parse;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        final CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout)findViewById(R.id.toolbar_layout);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        ImageView icon = new ImageView(this);
        icon.setImageResource(R.drawable.icn_2);
        FloatingActionButton actionButton = (FloatingActionButton)findViewById(R.id.fab);
        SubActionButton.Builder itemBuilder = new SubActionButton.Builder(this);
        // repeat many times:
        ImageView itemIcon1 = new ImageView(this);
        itemIcon1.setImageResource(R.drawable.fb);

        ImageView itemIcon2 = new ImageView(this);
        itemIcon2.setImageResource(R.drawable.insta);

        ImageView itemIcon3 = new ImageView(this);
        itemIcon3.setImageResource(R.drawable.twitter);

     /*   ImageView itemIcon4 = new ImageView(this);
        itemIcon4.setImageResource(R.drawable.pro1);*/

        SubActionButton button1 = itemBuilder.setContentView(itemIcon1).build();
        SubActionButton button2 = itemBuilder.setContentView(itemIcon2).build();
        SubActionButton button3 = itemBuilder.setContentView(itemIcon3).build();
       /* SubActionButton button4 = itemBuilder.setContentView(itemIcon4).build();*/
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/profile.php?id=100010711423535"));
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/prodologyvjti/"));
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/prodologyvjti/"));
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://twitter.com/prodologyvjti"));
                startActivity(intent);
            }
        });
        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder(this)
                .addSubActionView(button1)
                .addSubActionView(button2)
                .addSubActionView(button3)
                .attachTo(actionButton)
                .build();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        CardView c1=(CardView)findViewById(R.id.card_view);
        c1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intr = new Intent(MainActivity.this, Events.class);
                startActivity(intr);
            }
        });
        CardView c2=(CardView)findViewById(R.id.card_view1);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intr1 = new Intent(MainActivity.this,Workshop.class);
                startActivity(intr1);
            }
        });
        CardView c313=(CardView)findViewById(R.id.card_view2);
        c313.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intr121 = new Intent(MainActivity.this,Register.class);
                intr121.putExtra("url","https://www.prodology.org/panel-discussion");
                intr121.putExtra("Title","Panel Discussion");
                startActivity(intr121);
            }
        });
        CardView c411=(CardView)findViewById(R.id.card_view21);
        c411.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intr1212 = new Intent(MainActivity.this,Register.class);
                intr1212.putExtra("url","https://www.prodology.org/lectures");
                intr1212.putExtra("Title","Lectures");
                startActivity(intr1212);
            }
        });
        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.app_poster);
        Palette.from(bitmap1).generate(new Palette.PaletteAsyncListener() {
            public void onGenerated(Palette palette) {
                int mutedColor = palette.getMutedColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
                int mutedDarkColor = palette.getDarkMutedColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimaryDark));
                collapsingToolbarLayout.setContentScrimColor(mutedColor);
                collapsingToolbarLayout.setStatusBarScrimColor(mutedDarkColor);
                collapsingToolbarLayout.setExpandedTitleColor(mutedColor);
                collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.collapsedappbar);
                collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.expandedappbar);


            }
        });

    }




    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
            finish();
        } else {
            super.onBackPressed();
            finish();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://www.prodology.org"));
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.Newsfeed) {
            Intent i8 = new Intent(MainActivity.this, Register.class);
            i8.putExtra("url", "https://www.prodology.org/newsfeed");
            i8.putExtra("Title","Newsfeed");
            startActivity(i8);

        } else if (id == R.id.nav_gallery) {

            Intent i81 = new Intent(MainActivity.this, Register.class);
            i81.putExtra("url", "https://www.prodology.org/gallery");
            i81.putExtra("Title","Gallery");
            startActivity(i81);
        } else if (id == R.id.SetReminder) {

            Intent calIntent = new Intent(Intent.ACTION_INSERT);
            calIntent.setData(CalendarContract.Events.CONTENT_URI);
            calIntent.putExtra(CalendarContract.Events.TITLE, "Prodology 2017");
            Calendar startTime = Calendar.getInstance();
            startTime.set(2017, 2, 17, 9, 0);
            Calendar endTime = Calendar.getInstance();
            endTime.set(2017, 2, 17, 2, 30);
            calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                    startTime.getTimeInMillis());
            calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                    endTime.getTimeInMillis());
            startActivity(calIntent);


        } else if (id == R.id.location) {
            String geoUri = "http://maps.google.com/maps?q=loc:" + 19.0218682 + "," + 72.8558173 + " (" + "VJTI,Matunga " + "Prodology 2017" + ")";
            Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(geoUri));
            startActivity(intent);
        }
        else if (id == R.id.contact) {
            Intent i6= new Intent(MainActivity.this,ContactUs.class);
            startActivity(i6);
        }

        else if (id == R.id.committee) {
            Intent i6= new Intent(MainActivity.this,Committee.class);
            startActivity(i6);
        }
        else if(id== R.id.about)
        {
            Intent i534 = new Intent(MainActivity.this,About.class);
            startActivity(i534);
        }
else if (id==R.id.spons)
        {
            Intent i81 = new Intent(MainActivity.this, Register.class);
            i81.putExtra("url", "https://www.prodology.org/sponsors");
            i81.putExtra("Title","Sponsors");
            startActivity(i81);
        }
else if (id==R.id.devp)
        {
            Intent i91 = new Intent(MainActivity.this,Developers.class);
            startActivity(i91);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}