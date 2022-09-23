/**********************************************************
 * Author: Jefson & Elli
 * Date:   4/25/2020
 * Assignment: Team Assignment - Student Management System
 *
 * Set student first and last name, generate studentID,
 * get tuition balance, and pay tuition.
 **********************************************************/

// Import the ArrayList class
import java.util.ArrayList;

public class Student
{

   // Fields
   public static int uuid = 10001;
   public String firstName;
   public String lastName;
   public int studentID;
   public int paidTuition = 0;
   public Transcript transcript = new Transcript();

   // Constructor
   public Student(String firstName, String lastName)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      generateStudentID();
   }

   // Methods

   /**
    * Generate a 5-digit number as the student ID
    */
   public void generateStudentID()
   {
      this.studentID = uuid;
      uuid++;
   }

   /**
    * Get the student's first and last name
    */
   public String getStudentName()
   {
      return firstName + " " + lastName;
   }

   /**
    * Get the student ID
    */
   public int getStudentID()
   {
      return studentID;
   }

   /**
    * Get student's tuition balance
    */
   public int getTuitionBalance()
   {
      int totalCourseCost = transcript.getTotalCost();
      return totalCourseCost -= paidTuition;
   }

   /**
    * Make a payment toward tuition balance
    */
   public int payTuition(int amount)
   {
      return paidTuition += amount;
   }

   /**
    * Print the student's transcript
    */
   public void printTranscript()
   {
      ArrayList<Course> courses = transcript.getTranscript();

      System.out.printf("Student: %s%n", getStudentName());
      System.out.printf("ID: %s%n", getStudentID());
      System.out.printf("Cumulative GPA: %.2f%n",
         (courses.size() == 0 ? 0.00 : transcript.getGPA()));
      System.out.println("----------------------------------------");

      if (courses.size() == 0)
      {
         System.out.println("No courses have been added for this student.");
      }
      else
      {
         System.out.printf("%-24s %15s%n", "COURSE", "GRADE EARNED");
         System.out.println("----------------------------------------");
   
         for (Course el : courses)
         {
            System.out.printf("%-24s %15c%n",
               el.getCourseName(), el.getCourseGrade());
         }
      }

      System.out.println();
   }

}