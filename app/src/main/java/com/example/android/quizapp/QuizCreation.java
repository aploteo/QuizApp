package com.example.android.quizapp;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class QuizCreation
{
    private static final QuizCreation instanceOfQuizCreation = new QuizCreation();
    private static List<Quiz> quizList;

    private QuizCreation()
    {
        Context context = QuizActivity.getContext();
        quizList = new ArrayList<>(10);

        quizList.add(new Quiz(
                context.getString(R.string.q1_title),
                context.getString(R.string.q1_intro),
                context.getString(R.string.q1_question),
                context.getString(R.string.q1_hyp1),
                context.getString(R.string.q1_hyp2),
                context.getString(R.string.q1_hyp3),
                context.getString(R.string.q1_hyp4),
                "1", ""));
        quizList.add(new Quiz(
                context.getString(R.string.q2_title),
                context.getString(R.string.q2_intro),
                context.getString(R.string.q2_question),
                context.getString(R.string.q2_hyp1),
                context.getString(R.string.q2_hyp2),
                context.getString(R.string.q2_hyp3),
                context.getString(R.string.q2_hyp4),
                "2",
                context.getString(R.string.q2_comment)));
        quizList.add(new Quiz(
                context.getString(R.string.q3_title),
                context.getString(R.string.q3_intro),
                context.getString(R.string.q3_question),
                context.getString(R.string.q3_hyp1),
                context.getString(R.string.q3_hyp2),
                context.getString(R.string.q3_hyp3),
                context.getString(R.string.q3_hyp4),
                "24",""));
        quizList.add(new Quiz(
                context.getString(R.string.q4_title),
                context.getString(R.string.q4_intro),
                context.getString(R.string.q4_question),
                context.getString(R.string.q4_hyp1),
                context.getString(R.string.q4_hyp2),
                context.getString(R.string.q4_hyp3),
                context.getString(R.string.q4_hyp4),
                "3",
                context.getString(R.string.q4_comment)));
        quizList.add(new Quiz(
                context.getString(R.string.q5_title),
                context.getString(R.string.q5_intro),
                context.getString(R.string.q5_question),
                context.getString(R.string.q5_hyp1),
                context.getString(R.string.q5_hyp2),
                context.getString(R.string.q5_hyp3),
                context.getString(R.string.q5_hyp4),
                "3",
                context.getString(R.string.q5_comment)));
        quizList.add(new Quiz(
                context.getString(R.string.q6_title),
                context.getString(R.string.q6_intro),
                context.getString(R.string.q6_question),
                context.getString(R.string.q6_hyp1),
                context.getString(R.string.q6_hyp2),
                context.getString(R.string.q6_hyp3),
                context.getString(R.string.q6_hyp4),
                "1",
                context.getString(R.string.q6_comment)));
        quizList.add(new Quiz(
                context.getString(R.string.q7_title),
                context.getString(R.string.q7_intro),
                context.getString(R.string.q7_question),
                context.getString(R.string.q7_hyp1),
                context.getString(R.string.q7_hyp2),
                context.getString(R.string.q7_hyp3),
                context.getString(R.string.q7_hyp4),
                "2", ""));
        quizList.add(new Quiz(
                context.getString(R.string.q8_title),
                context.getString(R.string.q8_intro),
                context.getString(R.string.q8_question),
                context.getString(R.string.q8_hyp1),
                context.getString(R.string.q8_hyp2),
                context.getString(R.string.q8_hyp3),
                context.getString(R.string.q8_hyp4),
                "2",
                context.getString(R.string.q8_comment)));
        quizList.add(new Quiz(
                context.getString(R.string.q9_title),
                context.getString(R.string.q9_intro),
                context.getString(R.string.q9_question),
                context.getString(R.string.q9_hyp1),
                context.getString(R.string.q9_hyp2),
                context.getString(R.string.q9_hyp3),
                context.getString(R.string.q9_hyp4),
                "1",
                context.getString(R.string.q9_comment)));
        quizList.add(new Quiz(
                context.getString(R.string.q10_title),
                context.getString(R.string.q10_intro),
                context.getString(R.string.q10_question),
                context.getString(R.string.q10_hyp1),
                context.getString(R.string.q10_hyp2),
                context.getString(R.string.q10_hyp3),
                context.getString(R.string.q10_hyp4),
                "3",
                ""));
    }

    public static List<Quiz> getQuizList()
    {
        return quizList;
    }
}