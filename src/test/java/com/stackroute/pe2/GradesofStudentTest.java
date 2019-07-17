//package com.stackroute.pe2;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//
//public class GradesofStudentTest {
//
//    private GradesofStudent gradesofStudent;
//    @Before
//   public void setUp() {
//       gradesofStudent = new GradesofStudent();
//   }
//
//   @After
//   public void tearDown() {
//       gradesofStudent = null;
//   }
//
//   @Test
//   public void givenInputShouldReturnAverage() {
//       int[] testStudentGrades = {86, 65, 98, 77};
//       int AverageResult=gradesofStudent.calculateAverage(testStudentGrades);
//       assertEquals("81.50",AverageResult);
//   }
//
//   @Test
//   public void givenInputShouldReturnMinimumGarde() {
//       int[] testStudentGrades = {86, 65, 98, 77};
//       int MinResult=gradesofStudent.minimumGrade(testStudentGrades);
//       assertEquals("65",MinResult);
//   }
//
//   @Test
//   public void givenInputShouldReturnMaximumGarde() {
//       int[] testStudentGrades = {86, 65, 98, 77};
//       int MaxResult=gradesofStudent.maximumGrade(testStudentGrades);
//       assertEquals("98",MaxResult);
//
//
//   }
//
//
//}
