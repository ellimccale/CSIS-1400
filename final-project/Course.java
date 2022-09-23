/**********************************************************
 * Author: Jefson & Elli
 * Date:   4/25/2020
 * Assignment: Team Assignment - Student Management System
 *
 * Enter course name, the price of the course, and
 * student grade.
 **********************************************************/

public class Course
{

   // Fields
   public String courseName;
   public int courseCost;
   public char courseGrade;

   // Constructor
   public Course(String courseName, int courseCost, char courseGrade) {
      this.courseName = courseName;
      this.courseCost = courseCost;
      this.courseGrade = courseGrade;
   }

   // Methods

   /**
    * Get the course name
    */
   public String getCourseName()
   {
      return courseName;
   }

   /**
    * Get the cost of the course
    */
   public int getCourseCost()
   {
      return courseCost;
   }

   /**
    * Get the letter grade for the course
    */
   public char getCourseGrade()
   {
      return courseGrade;
   }

}