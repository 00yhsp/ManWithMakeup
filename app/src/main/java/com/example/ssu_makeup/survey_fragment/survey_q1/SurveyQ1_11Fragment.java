package com.example.ssu_makeup.survey_fragment.survey_q1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.ssu_makeup.R;
import com.example.ssu_makeup.Score;
import com.example.ssu_makeup.SurveyActivity;
import com.example.ssu_makeup.survey_fragment.survey_q2.SurveyQ2_1Fragment;

public class SurveyQ1_11Fragment extends Fragment implements View.OnClickListener{
    TextView question;
    Button answer1;
    Button answer2;
    Button answer3;
    Button answer4;
//    Button answer5;

    public static SurveyQ1_11Fragment newInstance() {
        return new SurveyQ1_11Fragment();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_survey_4_answers, container, false);
        question = root.findViewById(R.id.question);
        answer1 = root.findViewById(R.id.answer1);
        answer2 = root.findViewById(R.id.answer2);
        answer3 = root.findViewById(R.id.answer3);
        answer4 = root.findViewById(R.id.answer4);
//        answer5 = root.findViewById(R.id.answer5);

        question.setText(R.string.q1_11);
        answer1.setText(R.string.a1_11_1);
        answer2.setText(R.string.a1_11_2);
        answer3.setText(R.string.a1_11_3);
        answer4.setText(R.string.a1_11_4);
//        answer5.setText(R.string.a1_8_5);

        answer1.setOnClickListener(this);
        answer2.setOnClickListener(this);
        answer3.setOnClickListener(this);
        answer4.setOnClickListener(this);
//        answer5.setOnClickListener(this);

        return root;
    }

    @Override
    public void onClick(View view) {
        setButtons();
        view.setBackgroundResource(R.drawable.round_corners_selected);
        Score.addScore_4(view,1,11);
        ((SurveyActivity)getActivity()).replaceFragment(SurveyQ2_1Fragment.newInstance());
    }

    public void setButtons(){
        answer1.setBackgroundResource(R.drawable.round_corners);
        answer2.setBackgroundResource(R.drawable.round_corners);
        answer3.setBackgroundResource(R.drawable.round_corners);
        answer4.setBackgroundResource(R.drawable.round_corners);
//        answer5.setBackgroundResource(R.drawable.button_round_corners);
    }
}