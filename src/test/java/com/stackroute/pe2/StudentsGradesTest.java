//package com.stackroute.pe2;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class StudentsGradesTest {
//    @Before
//    public void setUp() {
//        studentsGrades = new StudentsGrades();
//    }
//
//    @After
//    public void tearDown() {
//        studentsGrades = null;
//    }
//
//    @Test
//    public void givenInputShouldReturnAverage() {
//        int[] testStudentGrades = {86, 65, 98, 77};
//        int AverageResult=studentsGrades.calculateAverage(testStudentGrades);
//        assertEquals("81.50",AverageResult);
//    }
//
//    @Test
//    public void givenInputShouldReturnMinimumGarde() {
//        int[] testStudentGrades = {86, 65, 98, 77};
//        int MinResult=studentsGrades.minimumGrade(testStudentGrades);
//        assertEquals("65",MinResult);
//    }
//
//    @Test
//    public void givenInputShouldReturnMaximumGarde() {
//        int[] testStudentGrades = {86, 65, 98, 77};
//        int MaxResult=studentsGrades.maximumGrade(testStudentGrades);
//        assertEquals("98",MaxResult);
//
//
//    }
//
//}