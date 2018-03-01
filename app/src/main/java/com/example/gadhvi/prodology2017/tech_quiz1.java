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

public class tech_quiz1 extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tech_quiz1, container, false);
        TextView techquiz1 =(TextView)view.findViewById(R.id.techquiztxt);
        techquiz1.setText("Test your knowledge among various individuals pertaining to the technical areas of mechanical, production, industrial engineering and management science in the Quiz.");

        return view;
    }
}
