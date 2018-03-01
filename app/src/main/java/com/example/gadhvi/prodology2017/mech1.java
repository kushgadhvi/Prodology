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

public class mech1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.mech_1, container, false);
        TextView mechnix1 =(TextView)view.findViewById(R.id.mechnixtxt);
        mechnix1.setText("Interested to know the mechanism behind various machines and how they work, look out for the upcoming event Mechanics, where you will get to assemble various machines in a race against other teams.\n" +
                "Learn It, Know It and Build It.\n" +
                "This event deals with the spot assembly of machine components. Participants are required to use their engineering skills to interpret technical drawings and successfully assemble machine components.    ");

        return view;
    }
}