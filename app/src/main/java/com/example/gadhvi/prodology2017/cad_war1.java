package com.example.gadhvi.prodology2017;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by gadhvi on 15-01-2017.
 */

public class cad_war1 extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cad_war1, container, false);
        TextView cadwar1 =(TextView)view.findViewById(R.id.cadwartxt);
        cadwar1.setText("World of designing is running more than the speed of light .Now it’s time to express your imagination power. Get armed up with all your design weapons and tricks in this war of designing as Prodology brings to you CAD Wars.");


        return view;
    }
}
