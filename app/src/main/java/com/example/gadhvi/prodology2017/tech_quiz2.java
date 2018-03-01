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

public class tech_quiz2 extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tech_quiz2 ,container, false);


        TextView techquiz2 =(TextView)view.findViewById(R.id.techquiztxt1);
        techquiz2.setText(" The technical quiz would be conducted in three rounds. Based on the scores of the various participants in the 1st round some participants will be eliminated before proceeding to subsequent rounds.\n                                                                                                                                                                                         \n" +
                "Stage 1: Written Round\n" +
                "The first round of the technical quiz would be a written round with questions pertaining to the various technical areas of mechanical, production and industrial engineering discipline. 10 teams from stage 1 based on their scores will participate in the subsequent round.\n" +
                "\nStage 2: Category Round\n" +
                "The selected teams would be allowed to select their category from a diverse range of topics. Teams would be questioned only pertaining to their selected categories. 6 teams from stage 2 will be selected for the final round of the quiz\n" +
                "\nStage 3: Question and Answer Session\n" +
                "The final round of the technical quiz would be a buzzer round. The team scoring the highest points would be declared as the winner.");

        return view;
    }
}
