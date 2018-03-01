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
public class cad_war2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.cad_war2, container, false);
        TextView cadwar2 =(TextView)view.findViewById(R.id.cadwartxt1);
        cadwar2.setText("1. All participants must bring their college ID cards.\n" +
                "2. Participants must be present by 09:00 AM on 17th March.\n" +
                "3. Participants can use CREO software for modelling and assembly. Computers with CREO would be provided by us. If a participant is selecting Solidworks or any other CAD software then he/she has to bring his/her own laptop.\n" +
                "4. Top 10 teams will qualify for round 2.\n" +
                "7. Use of Internet or any electronic gadget is restricted.\n" +
                "8. The decision of the committee will be final this will be judged on the basis of completeness and optimum time.\n" +
                "9. The Coordinator of  the event reserves the right to modify the contest rules without any prior notice.");
        return view;
    }
}
