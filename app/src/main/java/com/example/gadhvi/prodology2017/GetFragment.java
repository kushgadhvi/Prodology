package com.example.gadhvi.prodology2017;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class GetFragment extends Fragment
{


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tech_events, container, false);
        CardView c1,c2,c3,c4,c5,c6,c7,c8;
        c1=(CardView)view.findViewById(R.id.card_view3);
        c1.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intr11 = new Intent(getContext().getApplicationContext(),case_study.class);
                startActivity(intr11);
            }
        });
        c2=(CardView)view.findViewById(R.id.card_view4);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intr12 = new Intent(getContext().getApplicationContext(),tech_paper.class);
                startActivity(intr12);
            }
        });
        c3=(CardView)view.findViewById(R.id.card_view6);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intr13 = new Intent(getContext().getApplicationContext(),cad_war.class);
                startActivity(intr13);
            }
        });
        c4=(CardView)view.findViewById(R.id.card_view5);
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intr14 = new Intent(getContext().getApplicationContext(),tech_quiz.class);
                startActivity(intr14);
            }
        });
        c5=(CardView)view.findViewById(R.id.card_view7);
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intr15 = new Intent(getContext().getApplicationContext(),mech.class);
                startActivity(intr15);
            }
        });
        c6=(CardView)view.findViewById(R.id.card_view8);
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intr16 = new Intent(getContext().getApplicationContext(),debate.class);
                startActivity(intr16);
            }
        });
        c7=(CardView)view.findViewById(R.id.card_view9);
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intr17 = new Intent(getContext().getApplicationContext(),face_off.class);
                startActivity(intr17);
            }
        });
        c8=(CardView)view.findViewById(R.id.card_view91);
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intr18 = new Intent(getContext().getApplicationContext(),Deminsio.class);
                startActivity(intr18);
            }
        });


        return view;



    }
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
