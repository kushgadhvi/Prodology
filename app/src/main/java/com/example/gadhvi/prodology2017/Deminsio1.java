package com.example.gadhvi.prodology2017;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by gadhvi on 06-02-2017.
 */

public class Deminsio1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.dimensio1, container, false);
        TextView demitxt =(TextView)view.findViewById(R.id.demitxt);
        demitxt.setText("For all those computer geniuses out there, Prodology brings to you the Dimensio, where you will get to test your coding skills against other participants.");
        return view;
    }
}