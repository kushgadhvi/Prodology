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

public class face_off1 extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.face_off1, container, false);
        TextView gdtxt =(TextView)view.findViewById(R.id.gdtxt);
        gdtxt.setText("Want to test your skills in a discussion? Assemble a team and watch out for Prodology’s upcoming event, Group Discussion, where you get to enhance your communication, leadership, motivational, team building, analytical/logical skills, reasoning ability and creative thinking. ");
        return view;
    }
}

