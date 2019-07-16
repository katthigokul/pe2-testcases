package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class ReadcontextOfFileTest {
    private ReadcontextOfFile readcontextOfFile;

    @Before
    public void setUp() {
        readcontextOfFile = new ReadcontextOfFile();
    }

    @After
    public void tearDown() {
        readcontextOfFile = null;
    }

    @Test
    public void testReadFileSuccessGivenFileNameAndExtensionShouldReturnByteArray() {
        String testString = "Hello. This is a test string";
        byte[] testByteArray = testString.getBytes();
        assertArrayEquals("testReadFileSuccessGivenFileNameAndExtensionShouldReturnByteArray: check readFile()",
                testByteArray, readcontextOfFile.readFile("test", "txt"));
    }


    /**
     * Test for readFile() to throw FileNotFoundException
     * when the wrong(non-existent) file path is given.
     */
    @Test(expected = FileNotFoundException.class)
    public void testReadFileFailureGivenFileNameAndExtensionShouldReturnFileNotFoundException() {
        readcontextOfFile.readFile("test1", "txt");
    }

}