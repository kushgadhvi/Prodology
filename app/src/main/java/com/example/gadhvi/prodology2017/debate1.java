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

public class debate1 extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.debate1, container, false);
        TextView dbtxt =(TextView)view.findViewById(R.id.dbxt);
        dbtxt.setText("Debate is contention in argument strife, dissension, quarrelling, controversy especially a formal discussion of subjects before a public assembly. Participants here would have an opportunity to debate on a wide range of social, cultural and technical issues.\n" +
                "This event deals with the spot assembly of machine components. Participants are required to use their engineering skills to interpret technical drawings and successfully assemble machine components. ");
        return view;
    }
}