package com.moodanalyser.controller;

/**
 * MoodAnalyser --  Reads the message and according to mood containing
 *                  in the message return mood i.e SAD / HAPPY
 *
 * @author Abhishek Shigavan
 */
public class MoodAnalyser {

    private String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {

        this.message = message;
    }

    /**
     * This method checks for mood in the message & return
     * result according to it.
     *
     * @return HAPPY / SAD
     * @throws MoodAnalyserException
     */
    public String moodAnalysis() throws MoodAnalyserException {

        try {
            if(message.length() == 0) {

                throw new MoodAnalyserException("Entered Message is Empty", MoodAnalyserException.ErrorCode.EMPTY_MESSAGE);
            }
            else if(message.contains("sad")) {
                return "SAD";
            }
            else {
                return "HAPPY";
            }
        }
        catch (NullPointerException e) {

            throw new MoodAnalyserException("Entered Message is Null", MoodAnalyserException.ErrorCode.NULL_MESSAGE);
        }
    }
}
