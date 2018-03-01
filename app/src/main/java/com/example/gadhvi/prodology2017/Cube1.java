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

public class Cube1 extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.cude1, container, false);

        TextView cubetxt =(TextView)view.findViewById(R.id.cubetxt);
        cubetxt.setText("Are you fast enough to solve the cube? Wait for it…,Prodology brings to you the Rubik’s Cube Competition.");
        return view;
    }
}
