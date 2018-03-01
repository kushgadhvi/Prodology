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

public class face_off2 extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.face_off2, container, false);
        TextView gdtxt1 =(TextView)view.findViewById(R.id.gdtxt1);
        gdtxt1.setText("1.The students will be randomly assigned to groups.\n" +
                "2.The topics of discussion for each group will be released at the venue.\n" +
                "3.Each speaker is allowed a maximum of 3 minutes to put forward their points.\n" +
                "4.The moderators will ensure that every participant gets equal chance to speak.\n" +
                "5.Round 1 and Round 2 will last for 45 minutes each.\n" +
                "6.Practices such as interrupting another participant in the middle of the speech, passing condescending remarks etc. will be highly discouraged.\n" +
                "7.The group leader will be assigned after allocating members to groups.\n" +
                "8.Reading should be discussed (stay on topic) though not necessarily comprehensively as the group should go more in depth key points of its choosing.\n" +
                "9.10 minutes of preparation time will be given before the group discussion starts. During these 10 minutes, usage of internet, books, references is allowed.\n" +
                "10.After the group discussion starts, usage of internet, books, references is strictly prohibited.");
        return view;
    }
}
