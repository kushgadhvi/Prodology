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

public class mech2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.mech_2, container, false);


        TextView mechnix2 =(TextView)view.findViewById(R.id.mechnixtxt1);
        mechnix2.setText("1.Teams will be provided with the assembly drawing of the machine component.\n" +
                "2.Usage of any external books/references/media will be strictly prohibited.\n" +
                "3.A stopwatch will be used to track the time taken by the teams to assemble the machine component. Once the team finishes assembling the component they need to notify the judges by means of a buzzer. The judges will then record the time and evaluate the assembled component.\n" +
                "4.The decisions taken by the judges would be final and participants must not argue/challenge the decision taken.\n" +
                "5.A team can be disqualified if it does not comply with the above rules.");
        return view;
    }
}
