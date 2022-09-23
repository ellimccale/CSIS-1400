/**********************************************************
 * Author: Jefson & Elli
 * Date:   4/25/2020
 * Assignment: Team Assignment - Student Management System
 *
 * Stores course list, calculates GPA, calculates total
 * cost of all courses, and returns complete transcript
 * for Student.
 **********************************************************/

// Import the ArrayList class
import java.util.ArrayList;

public class Transcript
{

   // Fields
   ArrayList<Course> courses = new ArrayList<Course>();

   // Methods

   /**
    * Adds each new Course to the courses ArrayList
    */
   public void addCourse(String courseName, int courseCost, char courseGrade)
   {
      Course newCourse = new Course(courseName, courseCost, courseGrade);
      courses.add(newCourse);
   }

   /**
    * Calculates GPA based on letter grades
    */
   public double getGPA()
   {
      double total = 0.00;
      
      for (Course el: courses) {
         char grade = el.getCourseGrade();
      
         if (grade == 'A') {
            total += 4.00;
         }
         else if (grade == 'B') {
            total += 3.00;
         }
         else if (grade == 'C') {
            total += 2.00;
         }
         else if (grade == 'D') {
            total += 1.00;
         }
         else if (grade == 'F') {
            total += 0.00;
         }
      }
      
      return total / courses.size();
   }

   /**
    * Calculates total cost of all courses (tuition)
    */
   public int getTotalCost()
   {
      int total = 0;
      
      for (Course el : courses)
      {
         int cost = el.getCourseCost();
         total += cost;
      }
      
      return total;
   }

   /**
    * Returns the list of courses
    */
   public ArrayList<Course> getTranscript()
   {
      return courses;
   }

}
