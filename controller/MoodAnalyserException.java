package com.moodanalyser.controller;

/**
 * MoodAnalyserException -- Creating Custom exception to handle
 *                          exception cause by methods of MoodAnalyser
 *
 * @author Abhishek Shigavan
 */
public class MoodAnalyserException extends Exception {

    public ErrorCode error;

    //defining Error Code for exception
    public enum ErrorCode {
        NULL_MESSAGE, EMPTY_MESSAGE
    }

    public MoodAnalyserException(String message, ErrorCode error) {
        super(message);
        this.error = error;
    }
}
