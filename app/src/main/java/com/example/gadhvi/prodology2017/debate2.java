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

public class debate2  extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.debate2, container, false);
        TextView dbtxt1 =(TextView)view.findViewById(R.id.dbxt1);
        dbtxt1.setText("1.Each group must have two members participate in each debate.\n" +
                "2.The judge must base his decision entirely on the material presented, without regard for other material which he may happen to possess.\n" +
                "3.Any gains made outside of the established procedure are disallowed.\n" +
                "4.Each team would have a minimum preparation time of 5 minutes and a maximum of 30 minutes. The time allotted to a team would depend on the bid made by the team.\n" +
                "5.In case both teams end up giving up equal time the final decision of sides would be decided by a toss.\n" +
                "6.The team winning the toss can choose sides while the team losing the toss would be given the opportunity to choose the order of speaking i.e the team can decide to be the first or second speaker.\n" +
                "7.The affirmative must advocate everything required by the topic itself. No revision of position of a team is permitted during the debate.");
        return view;
    }
}
