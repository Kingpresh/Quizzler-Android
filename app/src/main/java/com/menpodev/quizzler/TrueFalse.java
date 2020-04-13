package com.menpodev.quizzler;

/**
 * Created by menpo on 4/11/2020.
 */

public class TrueFalse {
    private int mQuestionID;
    private boolean mAnswer;

    public TrueFalse(int questionResourceID, boolean trueOrFalse){
        mQuestionID = questionResourceID;
        mAnswer = trueOrFalse;
    }


    public int getQuestionID() {
        return mQuestionID;
    }

    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
