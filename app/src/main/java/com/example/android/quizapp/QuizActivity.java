package com.example.android.quizapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

import java.util.List;

public class QuizActivity extends AppCompatActivity
{
    public static final String EXTRA_MESSAGE = "com.example.android.MESSAGE";
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
    CheckBox checkBoxQ3Hyp1;
    CheckBox checkBoxQ3Hyp2;
    CheckBox checkBoxQ3Hyp3;
    CheckBox checkBoxQ3Hyp4;
    RadioButton radioButtonQ4Hyp1;
    RadioButton radioButtonQ5Hyp3;
    RadioButton radioButtonQ6Hyp1;
    RadioButton radioButtonQ7Hyp2;
    RadioButton radioButtonQ8Hyp2;
    EditText editTextQ9;
    RadioButton radioButtonQ10Hyp3;
    int correctAnswers;

    private static Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mContext = this;

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
        radioButtonQ2Hyp2 = findViewById(R.id.radio_q2_h2);
        checkBoxQ3Hyp1 = findViewById((R.id.check_q3_h1));
        checkBoxQ3Hyp2 = findViewById((R.id.check_q3_h2));
        checkBoxQ3Hyp3 = findViewById((R.id.check_q3_h3));
        checkBoxQ3Hyp4 = findViewById((R.id.check_q3_h4));
        radioButtonQ4Hyp1 = findViewById(R.id.radio_q4_h1);
        radioButtonQ5Hyp3 = findViewById(R.id.radio_q5_h3);
        radioButtonQ6Hyp1 = findViewById(R.id.radio_q6_h1);
        radioButtonQ7Hyp2 = findViewById(R.id.radio_q7_h2);
        radioButtonQ8Hyp2 = findViewById(R.id.radio_q8_h2);
        editTextQ9 = findViewById(R.id.edit_q9_h);
        radioButtonQ10Hyp3 = findViewById(R.id.radio_q10_h3);
        //Log.v("MainActivity", "EditText: " + userQuizAnswer[0]);
    }

    public void gradeQuiz(View view)
    {
        List<Quiz> quizList = QuizCreation.getQuizList();
        correctAnswers = 0;

        // Identify the correct answers
        if (radioButtonQ1Hyp1.isChecked()) correctAnswers++;
        if (radioButtonQ2Hyp2.isChecked()) correctAnswers++;
        if ((checkBoxQ3Hyp2.isChecked() && checkBoxQ3Hyp4.isChecked()) && (!checkBoxQ3Hyp1.isChecked() && !checkBoxQ3Hyp3.isChecked())) correctAnswers++;
        if (radioButtonQ4Hyp1.isChecked()) correctAnswers++;
        if (radioButtonQ5Hyp3.isChecked()) correctAnswers++;
        if (radioButtonQ6Hyp1.isChecked()) correctAnswers++;
        if (radioButtonQ7Hyp2.isChecked()) correctAnswers++;
        if (radioButtonQ8Hyp2.isChecked()) correctAnswers++;
        if (editTextQ9.getText().toString().equals("8")) correctAnswers++;
        if (radioButtonQ10Hyp3.isChecked()) correctAnswers++;

        String message = "You've got " + correctAnswers + " out of 10 correct answers";
        if (correctAnswers != 10) message += "\nYou've got " + (10 - correctAnswers) + " wrong answer(s) or unanswered question(s)";
        displayToast(message);
    }

    /*public void shareQuiz(View view)
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
    }*/

    public void resetQuiz(View view)
    {
        radioGroupQ1.clearCheck();
        radioGroupQ2.clearCheck();
        radioGroupQ4.clearCheck();
        radioGroupQ5.clearCheck();
        radioGroupQ6.clearCheck();
        radioGroupQ7.clearCheck();
        radioGroupQ8.clearCheck();
        radioGroupQ10.clearCheck();
        checkBoxQ3Hyp1.setChecked(false);
        checkBoxQ3Hyp2.setChecked(false);
        checkBoxQ3Hyp3.setChecked(false);
        checkBoxQ3Hyp4.setChecked(false);
        editTextQ9.setText("");
        scrollView.fullScroll(ScrollView.FOCUS_UP);
        editTextQ9.clearFocus();
        //correctAnswers = 0;
    }

    public void goToResults(View view)
    {
        Intent intent = new Intent(this, ResultActivity.class);
        //EditText editText = (EditText) findViewById(R.id.edit_text);
        String message = "olá";//editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    /*public void quitQuiz(View view)
    {
        finish();
    }*/

    public void displayToast(String message)
    {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }

    public static Context getContext()
    {
        return mContext;
    }
}