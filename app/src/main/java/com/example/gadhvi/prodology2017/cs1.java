package com.example.gadhvi.prodology2017;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by gadhvi on 16-01-2017.
 */

public class cs1 extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.cs1, container, false);
        TextView cstxt =(TextView)view.findViewById(R.id.cstxt);
        cstxt.setText("If you know every nook and corner of Dust, Inferno and Office, but don’t remember where the salt in your kitchen is? Then put on those Kevlar and load those magazines as Prodology brings to you the all famous Counter Strike Tournament.");
        return view;
    }
}
