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

public class Twister1 extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.twister1, container, false);

        TextView twistxt =(TextView)view.findViewById(R.id.twitxt);
        twistxt.setText("Bored of routine work and wanna try something exciting? Get ready for the fun as Prodology presents the Twister Competition.");
        return view;
    }
}
