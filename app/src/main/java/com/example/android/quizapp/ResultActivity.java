package com.example.android.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity
{
    ScrollView scrollView;
    RadioGroup radioGroupQ1;
    RadioGroup radioGroupQ2;
    RadioGroup radioGroupQ4;
    RadioGroup radioGroupQ5;
    RadioGroup radioGroupQ6;
    RadioGroup radioGroupQ7;
    RadioGroup radioGroupQ8;
    RadioGroup radioGroupQ10;
    RadioButton radioButtonQ1Hyp1;
    RadioButton radioButtonQ2Hyp2;
    TextView q2Comments;
    CheckBox checkBoxQ3Hyp1;
    CheckBox checkBoxQ3Hyp2;
    CheckBox checkBoxQ3Hyp3;
    CheckBox checkBoxQ3Hyp4;
    RadioButton radioButtonQ4Hyp1;
    TextView q4Comments;
    RadioButton radioButtonQ5Hyp3;
    TextView q5Comments;
    RadioButton radioButtonQ6Hyp1;
    TextView q6Comments;
    RadioButton radioButtonQ7Hyp2;
    RadioButton radioButtonQ8Hyp2;
    TextView q8Comments;
    EditText editTextQ9;
    TextView q9Comments;
    RadioButton radioButtonQ10Hyp3;
    int correctAnswers;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        scrollView = findViewById(R.id.scroll_view);
        radioGroupQ1 = findViewById(R.id.radio_group_q1);
        radioGroupQ2 = findViewById(R.id.radio_group_q2);
        q2Comments = findViewById(R.id.q2_comments);
        radioGroupQ4 = findViewById(R.id.radio_group_q4);
        q4Comments = findViewById(R.id.q4_comments);
        radioGroupQ5 = findViewById(R.id.radio_group_q5);
        q5Comments = findViewById(R.id.q5_comments);
        radioGroupQ6 = findViewById(R.id.radio_group_q6);
        radioGroupQ7 = findViewById(R.id.radio_group_q7);
        radioGroupQ8 = findViewById(R.id.radio_group_q8);
        radioGroupQ10 = findViewById(R.id.radio_group_q10);
        radioButtonQ1Hyp1 = findViewById(R.id.radio_q1_h1);
        radioButtonQ2Hyp2 = findViewById(R.id.radio_q2_h2);
        checkBoxQ3Hyp1 = findViewById((R.id.check_q3_h1));
        checkBoxQ3Hyp2 = findViewById((R.id.check_q3_h2));
        checkBoxQ3Hyp3 = findViewById((R.id.check_q3_h3));
        checkBoxQ3Hyp4 = findViewById((R.id.check_q3_h4));
        radioButtonQ4Hyp1 = findViewById(R.id.radio_q4_h1);
        radioButtonQ5Hyp3 = findViewById(R.id.radio_q5_h3);
        radioButtonQ6Hyp1 = findViewById(R.id.radio_q6_h1);
        q6Comments = findViewById(R.id.q6_comments);
        radioButtonQ7Hyp2 = findViewById(R.id.radio_q7_h2);
        radioButtonQ8Hyp2 = findViewById(R.id.radio_q8_h2);
        q8Comments = findViewById(R.id.q8_comments);
        editTextQ9 = findViewById(R.id.edit_q9_h);
        q9Comments = findViewById(R.id.q9_comments);
        radioButtonQ10Hyp3 = findViewById(R.id.radio_q10_h3);

        // Turn the comments visible
        q2Comments.setVisibility(View.VISIBLE);
        q4Comments.setVisibility(View.VISIBLE);
        q5Comments.setVisibility(View.VISIBLE);
        q6Comments.setVisibility(View.VISIBLE);
        q8Comments.setVisibility(View.VISIBLE);
        q2Comments.setVisibility(View.VISIBLE);
    }

    public void emailQuizResults(View view)
    {
        String message = "You've got " + correctAnswers + " out of 10 correct answers";
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Quiz results");
        intent.putExtra(Intent.EXTRA_TEXT, message);
        if (intent.resolveActivity(getPackageManager()) != null)
        {
            startActivity(intent);
        }
    }
}
