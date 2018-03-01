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

public class case_study1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.case_study1, container, false);

TextView tcase1 =(TextView)view.findViewById(R.id.casetxt);
tcase1.setText("For all those Engineers out there with amazing analysing skills, an unquenchable thirst for challenges and a can-do problem solving attitude Prodology brings to you the Case Study Competition.\n" +
        "Perfect platform to unleash the Multifaceted Engineer within you!");
        return view;
    }
}