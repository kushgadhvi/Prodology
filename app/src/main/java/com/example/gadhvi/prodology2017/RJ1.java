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

public class RJ1 extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.rj_1, container, false);
        TextView rjtxt  =(TextView)view.findViewById(R.id.rjtxt);
        rjtxt.setText("Polish your vocabulary and use your anchoring skills as you show your talent to become a radio jockey in Prodology’s RJ Hunt.");
        return view;
    }
}
