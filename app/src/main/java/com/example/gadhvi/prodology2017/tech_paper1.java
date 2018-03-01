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

public class tech_paper1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tech_paper1, container, false);
        TextView tpaper1 =(TextView)view.findViewById(R.id.techp1);
        tpaper1.setText("Innovative ideas, new theories, and presenting your views about them to people is what you like, then Paper Presentation is you what you should be looking for.\n" +
                "Prodology’17 is proud to announce TPP – a Technical Paper Presentation Competition for all the Engineering Students. It’s all in your Thinking and Creativity.");
        return view;
    }
}