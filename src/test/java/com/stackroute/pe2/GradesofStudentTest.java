package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradesofStudentTest {

    private GradesofStudent gradesofStudent;
    @Before
    public void setUp() {
        gradesofStudent = new GradesofStudent();
    }

    @After
    public void tearDown() {
        gradesofStudent = null;
    }

    @Test
    public void testCalculateAverageGivenStudentGradesShouldReturnAverage() {
        int[] testStudentGrades = {86, 65, 98, 77};
        gradesofStudent.addStudentGrades(testStudentGrades);
        assertEquals("testCalculateAverageGivenStudentGradesShouldReturnAverage: Check calculateAverage()",
                81.50,
                gradesofStudent.calculateAverage(),
                0.0);
    }

    @Test
    public void testMaximumGradeGivenStudentGradesShouldReturnMaximumGrade() {
        int[] testStudentGrades = {86, 65, 98, 77};
        gradesofStudent.addStudentGrades(testStudentGrades);
        assertEquals("testMaximumGradeGivenStudentGradesShouldReturnMaximumGrade: check maximumGrade()",
                98, gradesofStudent.maximumGrade());
    }

    @Test
    public void testMinimumGradeGivenStudentGradesShouldReturnMinimumGrade() {
        int[] testStudentGrades = {86, 65, 98, 77};
        gradesofStudent.addStudentGrades(testStudentGrades);
        assertEquals("testMinimumGradeGivenStudentGradesShouldReturnMinimumGrade: check minimumGrade()",
                65, gradesofStudent.minimumGrade());
    }

}