package com.example.gadhvi.prodology2017;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;



public class GetFragment2 extends Fragment
{

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fun_events, container, false);
        CardView c8,c9,c10,c11,c12;
        c8=(CardView)view.findViewById(R.id.card_view10);
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intr18 = new Intent(getContext().getApplicationContext(),cs.class);
                startActivity(intr18);
            }
        });
        c9=(CardView)view.findViewById(R.id.card_view11);
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intr19 = new Intent(getContext().getApplicationContext(),Cube.class);
                startActivity(intr19);
            }
        });
        c10=(CardView)view.findViewById(R.id.card_view12);
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intr19 = new Intent(getContext().getApplicationContext(),RJ.class);
                startActivity(intr19);
            }
        });
        c11=(CardView)view.findViewById(R.id.card_view13);
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intr19 = new Intent(getContext().getApplicationContext(),Twister.class);
                startActivity(intr19);
            }
        });

        return view;


    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();


    }



    }







