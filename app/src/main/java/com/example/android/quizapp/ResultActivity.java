package com.example.android.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity
{
    TextView q2Comments;
    TextView q4Comments;
    TextView q5Comments;
    TextView q6Comments;
    TextView q8Comments;
    TextView q9Comments;

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
    RadioButton radioButtonQ1Hyp2;
    RadioButton radioButtonQ1Hyp3;
    RadioButton radioButtonQ1Hyp4;
    RadioButton radioButtonQ2Hyp1;
    RadioButton radioButtonQ2Hyp2;
    RadioButton radioButtonQ2Hyp3;
    RadioButton radioButtonQ2Hyp4;
    CheckBox checkBoxQ3Hyp1;
    CheckBox checkBoxQ3Hyp2;
    CheckBox checkBoxQ3Hyp3;
    CheckBox checkBoxQ3Hyp4;
    RadioButton radioButtonQ4Hyp1;
    RadioButton radioButtonQ4Hyp2;
    RadioButton radioButtonQ4Hyp3;
    RadioButton radioButtonQ4Hyp4;
    RadioButton radioButtonQ5Hyp1;
    RadioButton radioButtonQ5Hyp2;
    RadioButton radioButtonQ5Hyp3;
    RadioButton radioButtonQ5Hyp4;
    RadioButton radioButtonQ6Hyp1;
    RadioButton radioButtonQ6Hyp2;
    RadioButton radioButtonQ6Hyp3;
    RadioButton radioButtonQ6Hyp4;
    RadioButton radioButtonQ7Hyp1;
    RadioButton radioButtonQ7Hyp2;
    RadioButton radioButtonQ7Hyp3;
    RadioButton radioButtonQ7Hyp4;
    RadioButton radioButtonQ8Hyp1;
    RadioButton radioButtonQ8Hyp2;
    RadioButton radioButtonQ8Hyp3;
    RadioButton radioButtonQ8Hyp4;
    TextView editTextQ9;
    RadioButton radioButtonQ10Hyp1;
    RadioButton radioButtonQ10Hyp2;
    RadioButton radioButtonQ10Hyp3;
    RadioButton radioButtonQ10Hyp4;
    String message;
    int[] arrayOfAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        message = getIntent().getStringExtra("message");
        Log.v("ResultActivity", message);

        q2Comments = findViewById(R.id.q2_comments);
        q4Comments = findViewById(R.id.q4_comments);
        q5Comments = findViewById(R.id.q5_comments);
        q6Comments = findViewById(R.id.q6_comments);
        q8Comments = findViewById(R.id.q8_comments);
        q9Comments = findViewById(R.id.q9_comments);

        scrollView = findViewById(R.id.scroll_view);
        radioGroupQ1 = findViewById(R.id.radio_group_q1);
        radioGroupQ2 = findViewById(R.id.radio_group_q2);
        radioGroupQ4 = findViewById(R.id.radio_group_q4);
        radioGroupQ5 = findViewById(R.id.radio_group_q5);
        radioGroupQ6 = findViewById(R.id.radio_group_q6);
        radioGroupQ7 = findViewById(R.id.radio_group_q7);
        radioGroupQ8 = findViewById(R.id.radio_group_q8);
        radioGroupQ10 = findViewById(R.id.radio_group_q10);
        radioButtonQ1Hyp1 = findViewById(R.id.radio_q1_h1);
        radioButtonQ1Hyp2 = findViewById(R.id.radio_q1_h2);
        radioButtonQ1Hyp3 = findViewById(R.id.radio_q1_h3);
        radioButtonQ1Hyp4 = findViewById(R.id.radio_q1_h4);
        radioButtonQ2Hyp1 = findViewById(R.id.radio_q2_h1);
        radioButtonQ2Hyp2 = findViewById(R.id.radio_q2_h2);
        radioButtonQ2Hyp3 = findViewById(R.id.radio_q2_h3);
        radioButtonQ2Hyp4 = findViewById(R.id.radio_q2_h4);
        checkBoxQ3Hyp1 = findViewById((R.id.check_q3_h1));
        checkBoxQ3Hyp2 = findViewById((R.id.check_q3_h2));
        checkBoxQ3Hyp3 = findViewById((R.id.check_q3_h3));
        checkBoxQ3Hyp4 = findViewById((R.id.check_q3_h4));
        radioButtonQ4Hyp1 = findViewById(R.id.radio_q4_h1);
        radioButtonQ4Hyp2 = findViewById(R.id.radio_q4_h2);
        radioButtonQ4Hyp3 = findViewById(R.id.radio_q4_h3);
        radioButtonQ4Hyp4 = findViewById(R.id.radio_q4_h4);
        radioButtonQ5Hyp1 = findViewById(R.id.radio_q5_h1);
        radioButtonQ5Hyp2 = findViewById(R.id.radio_q5_h2);
        radioButtonQ5Hyp3 = findViewById(R.id.radio_q5_h3);
        radioButtonQ5Hyp4 = findViewById(R.id.radio_q5_h4);
        radioButtonQ6Hyp1 = findViewById(R.id.radio_q6_h1);
        radioButtonQ6Hyp2 = findViewById(R.id.radio_q6_h2);
        radioButtonQ6Hyp3 = findViewById(R.id.radio_q6_h3);
        radioButtonQ6Hyp4 = findViewById(R.id.radio_q6_h4);
        radioButtonQ7Hyp1 = findViewById(R.id.radio_q7_h1);
        radioButtonQ7Hyp2 = findViewById(R.id.radio_q7_h2);
        radioButtonQ7Hyp3 = findViewById(R.id.radio_q7_h3);
        radioButtonQ7Hyp4 = findViewById(R.id.radio_q7_h4);
        radioButtonQ8Hyp1 = findViewById(R.id.radio_q8_h1);
        radioButtonQ8Hyp2 = findViewById(R.id.radio_q8_h2);
        radioButtonQ8Hyp3 = findViewById(R.id.radio_q8_h3);
        radioButtonQ8Hyp4 = findViewById(R.id.radio_q8_h4);
        editTextQ9 = findViewById(R.id.edit_q9_h);
        radioButtonQ10Hyp1 = findViewById(R.id.radio_q10_h1);
        radioButtonQ10Hyp2 = findViewById(R.id.radio_q10_h2);
        radioButtonQ10Hyp3 = findViewById(R.id.radio_q10_h3);
        radioButtonQ10Hyp4 = findViewById(R.id.radio_q10_h4);

        // Turn comments visible
        q2Comments.setVisibility(View.VISIBLE);
        q4Comments.setVisibility(View.VISIBLE);
        q5Comments.setVisibility(View.VISIBLE);
        q6Comments.setVisibility(View.VISIBLE);
        q8Comments.setVisibility(View.VISIBLE);
        q2Comments.setVisibility(View.VISIBLE);

        arrayOfAnswers = getIntent().getIntArrayExtra("array");

        // Show selected options
        if (arrayOfAnswers[0] != -1)
        {
            radioGroupQ1.check(arrayOfAnswers[0]);
        }
        if (arrayOfAnswers[1] != -1)
        {
            radioGroupQ2.check(arrayOfAnswers[1]);
        }
        if (arrayOfAnswers[2] != 0) checkBoxQ3Hyp1.setChecked(true);
        if (arrayOfAnswers[3] != 0) checkBoxQ3Hyp2.setChecked(true);
        if (arrayOfAnswers[4] != 0) checkBoxQ3Hyp3.setChecked(true);
        if (arrayOfAnswers[5] != 0) checkBoxQ3Hyp4.setChecked(true);
        if (arrayOfAnswers[6] != -1)
        {
            radioGroupQ4.check(arrayOfAnswers[6]);
        }
        if (arrayOfAnswers[7] != -1)
        {
            radioGroupQ5.check(arrayOfAnswers[7]);
        }
        if (arrayOfAnswers[8] != -1)
        {
            radioGroupQ6.check(arrayOfAnswers[8]);
        }
        if (arrayOfAnswers[9] != -1)
        {
            radioGroupQ7.check(arrayOfAnswers[9]);
        }
        if (arrayOfAnswers[10] != -1)
        {
            radioGroupQ8.check(arrayOfAnswers[10]);
        }
        if (arrayOfAnswers[11] != 0)
        {
            if (arrayOfAnswers[11] == 8)
            {
                editTextQ9.setTextColor(Color.parseColor("#4CAF50"));
                editTextQ9.setText(String.valueOf(arrayOfAnswers[11]) + " is the right answer.");
            }
            else
            {
                editTextQ9.setTextColor(Color.RED);
                editTextQ9.setText(String.valueOf(arrayOfAnswers[11]) + ". The right answer is 8.");
            }
        }
        else
        {
            editTextQ9.setTextColor(Color.parseColor("#4CAF50"));
            editTextQ9.setText("8 is the right answer.");
        }
        if (arrayOfAnswers[12] != -1)
        {
            radioGroupQ10.check(arrayOfAnswers[12]);
        }

        // Disable all radio buttons, check boxes and edit texts.
        for (int i = 0; i < 4; i++)
        {
            radioGroupQ1.getChildAt(i).setEnabled(false);
            radioGroupQ2.getChildAt(i).setEnabled(false);
            radioGroupQ4.getChildAt(i).setEnabled(false);
            radioGroupQ5.getChildAt(i).setEnabled(false);
            radioGroupQ6.getChildAt(i).setEnabled(false);
            radioGroupQ7.getChildAt(i).setEnabled(false);
            radioGroupQ8.getChildAt(i).setEnabled(false);
            radioGroupQ10.getChildAt(i).setEnabled(false);
        }

        checkBoxQ3Hyp1.setEnabled(false);
        checkBoxQ3Hyp2.setEnabled(false);
        checkBoxQ3Hyp3.setEnabled(false);
        checkBoxQ3Hyp4.setEnabled(false);

        // Show the correct answers
        radioButtonQ1Hyp1.setTextColor(Color.parseColor("#4CAF50"));
        radioButtonQ2Hyp2.setTextColor(Color.parseColor("#4CAF50"));
        checkBoxQ3Hyp2.setTextColor(Color.parseColor("#4CAF50"));
        checkBoxQ3Hyp4.setTextColor(Color.parseColor("#4CAF50"));
        radioButtonQ4Hyp1.setTextColor(Color.parseColor("#4CAF50"));
        radioButtonQ5Hyp3.setTextColor(Color.parseColor("#4CAF50"));
        radioButtonQ6Hyp1.setTextColor(Color.parseColor("#4CAF50"));
        radioButtonQ7Hyp2.setTextColor(Color.parseColor("#4CAF50"));
        radioButtonQ8Hyp2.setTextColor(Color.parseColor("#4CAF50"));
        radioButtonQ10Hyp3.setTextColor(Color.parseColor("#4CAF50"));
    }

    public void emailQuizResults(View view)
    {
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
