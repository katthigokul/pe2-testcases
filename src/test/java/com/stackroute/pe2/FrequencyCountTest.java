package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class FrequencyCountTest {

    FrequencyCount frequencyCount;

    @Before
    public void setUp() {
        frequencyCount = new FrequencyCount();
    }

    @After
    public void tearDown() {
        frequencyCount = null;
    }

    @Test
    public void testCalculateWordFrequencySuccessGivenFilePathShouldReturnWordCount() {
        HashMap<String, Integer> expectedWordCound = new HashMap<>();
        expectedWordCound.put("i", 3);
        expectedWordCound.put("am", 1);
        expectedWordCound.put("like", 1);
        expectedWordCound.put("have", 1);
        expectedWordCound.put("a", 2);
        assertEquals("testCalculateWordFrequencySuccessGivenFilePathShouldReturnWordCount: check calculateWordFrequency()",
                expectedWordCound, frequencyCount.calculateWordFrequency("test_files/FileDemo.txt"));
    }

    @Test
    public void testCalculateWordFrequencyFailureGivenFilePathShouldReturnNull() {
        assertNull("testCalculateWordFrequencyFailureGivenFilePathShouldReturnNull: check calculateWordFrequency(). Should return null.",
                frequencyCount.calculateWordFrequency("testFile.txt"));
    }
}