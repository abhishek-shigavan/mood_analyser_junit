package com.moodanalyser.test;

import com.moodanalyser.controller.MoodAnalyser;
import com.moodanalyser.controller.MoodAnalyserException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * TU_MoodAnalyser  -- Defining test cases for MoodAnalyser
 *                     methods to check it is giving correct result / not
 *
 * @author Abhishek Shigavan
 */
public class TU_MoodAnalyser {
    /**
     * This test case checks when message contains SAD
     * it return sad / not
     */
    @Test
    void whenMessageContainsSAD_ShouldReturnSAD() {

        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        try {
            //analyzing message
            String message = moodAnalyser.moodAnalysis();
            Assertions.assertEquals("SAD",message);
        }
        catch (MoodAnalyserException error) {
            error.printStackTrace();
        }
    }
    /**
     * This test case checks when message not contains SAD
     * it return HAPPY / not
     */
    @Test
    void whenMessageNotContainsSAD_ShouldReturnHAPPY() {

        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
        try {

            String message = moodAnalyser.moodAnalysis();
            Assertions.assertEquals("HAPPY",message);
        }
        catch (MoodAnalyserException error) {
            error.printStackTrace();
        }
    }
    /**
     * This method checks when null message exception
     * occurs it is returning NULL_MESSAGE error code / not
     */
    @Test
    void whenMessageIsNullItShouldGiveNULL_MESSAGE_ErrorCode() {

        MoodAnalyser moodAnalyser = new MoodAnalyser(null);

        try{
            //getting exception with NULL_MESSAGE error code
            moodAnalyser.moodAnalysis();
        }
        catch (MoodAnalyserException code){

            Assertions.assertEquals(MoodAnalyserException.ErrorCode.NULL_MESSAGE,code.error);
        }
    }
    /**
     * This method checks when Empty message exception
     * occurs it is returning EMPTY_MESSAGE error code / not
     */
    @Test
    void whenMessageIsEmptyItShouldGiveExceptionWith_EMPTY_MESSAGE_ErrorCode() {

        MoodAnalyser moodAnalyser = new MoodAnalyser("");

        try{
            //getting exception with EMPTY_MESSAGE error code
            moodAnalyser.moodAnalysis();
        }
        catch (MoodAnalyserException code){

            Assertions.assertEquals(MoodAnalyserException.ErrorCode.EMPTY_MESSAGE,code.error);
        }
    }
}
