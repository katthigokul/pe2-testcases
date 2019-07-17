//package com.stackroute.pe2;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.io.FileNotFoundException;
//
//import static org.junit.Assert.*;
//
//public class ReadcontextOfFileTest {
//    private ReadcontextOfFile readcontextOfFile;
//
//    @Before
//    public void setUp() {
//        readcontextOfFile = new ReadcontextOfFile();
//    }
//
//    @After
//    public void tearDown() {
//        readcontextOfFile = null;
//    }
//
//    /* Test cases for Success*/
//    @Test
//    public void givenFileNameAndExtensionShouldReturnByteArray() {
//        String testString = "Hello. This is a test string";
//        byte[] testByteArray = testString.getBytes();
//        //Asserts
//        assertArrayEquals("successGivenFileNameAndExtensionShouldReturnByteArray: check readFile()",
//                testByteArray, readcontextOfFile.readFile("sample", "txt"));
//    }
//
///* Test cases for failures*/
//
//    @Test(expected = FileNotFoundException.class)
//    public void givenFileNameAndExtensionShouldReturnFileNotFoundException() {
//        readcontextOfFile.readFile("sample", "txt");
//    }
//
//}