package com.example.android.quizapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
    public static final String EXTRA_NAME = "name";
    public static final String EXTRA_ARRAY = "array";
    String name;
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
    EditText editTextQ9;
    RadioButton radioButtonQ10Hyp1;
    RadioButton radioButtonQ10Hyp2;
    RadioButton radioButtonQ10Hyp3;
    RadioButton radioButtonQ10Hyp4;
    int correctAnswers;
    int[] arrayOfAnswers;

    private static Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mContext = this;

        Intent i = getIntent();
        name = i.getStringExtra("name");
        Log.v("QuizActivity", "Name received: " + name);

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
        createArrayOfAnswers();
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra(EXTRA_NAME, name);
        intent.putExtra(EXTRA_ARRAY, arrayOfAnswers);
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

    public void createArrayOfAnswers()
    {
        arrayOfAnswers = new int[36];
        if (radioButtonQ1Hyp1.isChecked()) arrayOfAnswers[0] = 1;
        if (radioButtonQ1Hyp2.isChecked()) arrayOfAnswers[1] = 1;
        if (radioButtonQ1Hyp3.isChecked()) arrayOfAnswers[2] = 1;
        if (radioButtonQ1Hyp4.isChecked()) arrayOfAnswers[3] = 1;
        if (radioButtonQ2Hyp1.isChecked()) arrayOfAnswers[4] = 1;
        if (radioButtonQ2Hyp2.isChecked()) arrayOfAnswers[5] = 1;
        if (radioButtonQ2Hyp3.isChecked()) arrayOfAnswers[6] = 1;
        if (radioButtonQ2Hyp4.isChecked()) arrayOfAnswers[7] = 1;
        if (checkBoxQ3Hyp1.isChecked()) arrayOfAnswers[8] = 1;
        if (checkBoxQ3Hyp2.isChecked()) arrayOfAnswers[9] = 1;
        if (checkBoxQ3Hyp3.isChecked()) arrayOfAnswers[10] = 1;
        if (checkBoxQ3Hyp4.isChecked()) arrayOfAnswers[11] = 1;
        if (radioButtonQ4Hyp1.isChecked()) arrayOfAnswers[12] = 1;
        if (radioButtonQ4Hyp2.isChecked()) arrayOfAnswers[13] = 1;
        if (radioButtonQ4Hyp3.isChecked()) arrayOfAnswers[14] = 1;
        if (radioButtonQ4Hyp4.isChecked()) arrayOfAnswers[15] = 1;
        if (radioButtonQ5Hyp1.isChecked()) arrayOfAnswers[16] = 1;
        if (radioButtonQ5Hyp2.isChecked()) arrayOfAnswers[17] = 1;
        if (radioButtonQ5Hyp3.isChecked()) arrayOfAnswers[18] = 1;
        if (radioButtonQ5Hyp4.isChecked()) arrayOfAnswers[19] = 1;
        if (radioButtonQ6Hyp1.isChecked()) arrayOfAnswers[20] = 1;
        if (radioButtonQ6Hyp2.isChecked()) arrayOfAnswers[21] = 1;
        if (radioButtonQ6Hyp3.isChecked()) arrayOfAnswers[22] = 1;
        if (radioButtonQ6Hyp4.isChecked()) arrayOfAnswers[23] = 1;
        if (radioButtonQ7Hyp1.isChecked()) arrayOfAnswers[24] = 1;
        if (radioButtonQ7Hyp2.isChecked()) arrayOfAnswers[25] = 1;
        if (radioButtonQ7Hyp3.isChecked()) arrayOfAnswers[26] = 1;
        if (radioButtonQ7Hyp4.isChecked()) arrayOfAnswers[27] = 1;
        if (radioButtonQ8Hyp1.isChecked()) arrayOfAnswers[28] = 1;
        if (radioButtonQ8Hyp2.isChecked()) arrayOfAnswers[29] = 1;
        if (radioButtonQ8Hyp3.isChecked()) arrayOfAnswers[30] = 1;
        if (radioButtonQ8Hyp4.isChecked()) arrayOfAnswers[31] = 1;
        try
        {
            arrayOfAnswers[32] = Integer.parseInt(editTextQ9.getText().toString());
        } catch (NumberFormatException e)
        {
            Log.v("QuizActivity", "NumberFormatExcption");
        }
        if (radioButtonQ10Hyp1.isChecked()) arrayOfAnswers[33] = 1;
        if (radioButtonQ10Hyp2.isChecked()) arrayOfAnswers[34] = 1;
        if (radioButtonQ10Hyp3.isChecked()) arrayOfAnswers[35] = 1;
        if (radioButtonQ10Hyp4.isChecked()) arrayOfAnswers[36] = 1;

    }
}