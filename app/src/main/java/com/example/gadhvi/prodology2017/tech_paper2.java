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

public class tech_paper2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tech_paper2, container, false);
        TextView tpaper2 =(TextView)view.findViewById(R.id.techp2);
        tpaper2.setText("1. Maximum 2 participants per team\n" +
                "2. Use standard font  Times New Roman and font size of 12 for the entire solution document.\n" +
                "3. If you are using any references/links/books for answering a particular question, specify it at the end of your answer to the same question.\n" +
                "4. You may represent your answers using diagrams or statistics wherever required.\n" +
                "5. Answer for a question may range anywhere between 1-3 pages including the supplementary diagrams & data representations.\n" +
                "6. Solve any 2 questions from Technical Section and any 1 question from Non-Technical Section.\n" +
                "7. Prepare your final solution document in PDF format and e-mail it on animee11@gmail.com on or before 10th March, 2017.\n" +
                "8. Evaluation will be based upon the most practicable & innovative solution.\n" +
                "9. If you are selected for the final round, you will be notified 15 days before the final presentation.\n" +
                "10. For the final round you need to present your solution in front of veterans from various industries.\n" +
                "11. The final round consists of presenting your solution (Power Point Presentation) followed by a question-answer session");
        return view;
    }
}

