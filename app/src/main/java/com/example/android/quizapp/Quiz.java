package com.example.android.quizapp;

public class Quiz
{
    private String title;
    private String intro;
    private String question;
    private String hypothesis1;
    private String hypothesis2;
    private String hypothesis3;
    private String hypothesis4;
    private String answer;
    private String comment;

    Quiz(String title, String intro, String question, String hypothesis1, String hypothesis2,
         String hypothesis3, String hypothesis4, String answer, String comment)
    {
        this.title = title;
        this.intro = intro;
        this.question = question;
        this.hypothesis1 = hypothesis1;
        this.hypothesis2 = hypothesis2;
        this.hypothesis3 = hypothesis3;
        this.hypothesis4 = hypothesis4;
        this.answer = answer;
        this.comment = comment;
    }

    public String getTitle()
    {
        return title;
    }

    public String getIntro()
    {
        return intro;
    }

    public String getQuestion() { return question; }

    public String getHypothesis1()
    {
        return hypothesis1;
    }

    public String getHypothesis2()
    {
        return hypothesis2;
    }

    public String getHypothesis3()
    {
        return hypothesis3;
    }

    public String getHypothesis4()
    {
        return hypothesis4;
    }

    public String getAnswer()
    {
        return answer;
    }

    public String getComment()
    {
        return comment;
    }
}