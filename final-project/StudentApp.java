/**********************************************************
 * Author: Jefson & Elli
 * Date:   4/25/2020
 * Assignment: Team Assignment - Student Management System
 *
 * Controls the menu and selection behavior of the main App
 **********************************************************/

// Import Java utilities
import java.util.Scanner;
import java.util.Arrays;

public class StudentApp
{

   // Fields
   public static Scanner input = new Scanner(System.in);
   public static Student[] newStudents;
   public static int currentStudent;

   // Enums
   public enum Menu {
      /**
       * Student selection menu
       */
      SELECT_STUDENT,

      /**
       * Edit student menu
       */
      EDIT_STUDENT,

      /**
       * Edit transcript menu
       */
      EDIT_TRANSCRIPT
   }

   public static void main(String[] args)
   {
      // Display welcome message and create new students
      System.out.printf("Welcome to the Student Management Portal.%n%n");
      createStudents();

      // Shortcut to avoid creating students everytime
      //newStudents = new Student[3];
      //newStudents[0] = new Student("Don", "Davis");
      //newStudents[1] = new Student("Kate", "Kinnon");
      //newStudents[2] = new Student("Maxwell", "Madden");

      // Set the initial menu state
      Menu currentMenu = Menu.SELECT_STUDENT;

      // Always return to a valid menu
      while (true)
      {
         switch (currentMenu)
         {
            case SELECT_STUDENT: // Display the menu of students to edit
               currentMenu = studentMenu();
               break;
            case EDIT_STUDENT: // Display the edit student menu
               currentMenu = editStudentMenu();
               break;
            case EDIT_TRANSCRIPT: // Display the edit transcript menu
               currentMenu = editTranscriptMenu();
               break;
            default:
               System.out.println("Invalid menu");
               System.exit(0);
         }
      }
   }

   /**
    * Populate the newStudents array
    */
   public static void createStudents()
   {
      System.out.print("Enter the number of new students to create: ");
      int numStudents = input.nextInt();
      input.nextLine(); // Consume newline
      System.out.println();

      // Create n number of new students
      newStudents = new Student[numStudents];

      // Enter the first and last names of each student
      for (int i = 0; i < newStudents.length; i++)
      {
         System.out.printf("Student %d first name: ", i + 1);
         String firstName = input.nextLine();
         System.out.printf("Student %d last name: ", i + 1);
         String lastName = input.nextLine();
         System.out.println();

         newStudents[i] = new Student(firstName, lastName);
      }
   }

   /**
    * Populate the student's transcript
    */
   public static void createCourses()
   {
      System.out.print("Enter the course name: ");
      String courseName = input.nextLine();
      System.out.print("Enter the course cost: ");
      int courseCost = input.nextInt();
      input.nextLine(); // Consume newline
      System.out.print("Enter the student's grade for this course (A-F): ");
      char courseGrade = input.next().charAt(0);
      System.out.println();

      newStudents[currentStudent].transcript.addCourse(courseName, courseCost, courseGrade);
      System.out.printf("Successfully added %s%n%n", courseName);
   }

   /**
    * Student selection menu
    */
   public static Menu studentMenu()
   {
      int userSelection;

      // Loop until the user enters a valid selection or exits
      do
      {
         System.out.printf("Select a student to edit, or enter 0 to quit the program:%n%n");

         // Display the name of each student as a selection choice
         for (int i = 0; i < newStudents.length; i++)
         {
            System.out.printf("%d - %s%n", i + 1, newStudents[i].getStudentName());
         }

         System.out.printf("0 - Exit program%n%n");
         System.out.print("Your choice: ");
         userSelection = input.nextInt();
         input.nextLine(); // Consume newline
         System.out.println();

         // User input is not one of the choices
         if (userSelection > newStudents.length)
         {
            System.out.println("Invalid input");
         }

         // Exit the program completely
         if (userSelection == 0)
         {
            System.out.println("Exiting...");
            System.exit(0);
         }
      } while (userSelection > newStudents.length);

      // Match the user's selection to the correct element in the array
      currentStudent = userSelection - 1;

      // Move on to the edit student menu
      return Menu.EDIT_STUDENT;
   }

   /**
    * Edit student menu
    */
   public static Menu editStudentMenu()
   {
      int userSelection;

      // Loop until the user enters a valid selection or exits
      while (true)
      {
         System.out.printf("----------------------------------------%n");
         System.out.printf("%-24s %-15s%n", "STUDENT NAME", "STUDENT ID");
         System.out.printf("----------------------------------------%n");
         System.out.printf("%-24s %-15d%n%n",
            newStudents[currentStudent].getStudentName(),
            newStudents[currentStudent].getStudentID());
         System.out.printf("Select an action to perform, or enter 0 to return to the student menu:%n%n");
         System.out.println("1 - Display transcript");
         System.out.println("2 - Edit transcript");
         System.out.println("3 - Display tuition balance");
         System.out.println("4 - Pay tuition");
         System.out.printf("0 - Return to the student menu%n%n");
         System.out.print("Your choice: ");
         userSelection = input.nextInt();
         input.nextLine(); // Consume newline
         System.out.println();

         switch (userSelection)
         {
            case 1: // Display transcript
               newStudents[currentStudent].printTranscript();
               break;
            case 2: // Edit transcript
               return Menu.EDIT_TRANSCRIPT;
            case 3: // Display tuition balance
               System.out.printf("Tuition balance: $%d%n%n",
                  newStudents[currentStudent].getTuitionBalance());
               break;
            case 4: // Pay tuition
               System.out.print("Enter the amount to pay off: ");
               int amount = input.nextInt();
               input.nextLine(); // Consume newline
               newStudents[currentStudent].payTuition(amount);
               System.out.printf("New tuition balance: $%d%n%n",
                  newStudents[currentStudent].getTuitionBalance());
               break;
            case 0: // Return to the student menu
               return Menu.SELECT_STUDENT;
            default: // User input is not one of the choices
               System.out.println("Invalid input");
         }
      }
   }

   /**
    * Edit transcript menu
    */
   public static Menu editTranscriptMenu() {
      int userSelection;

      // Loop until the user enters a valid selection or exits
      while (true) {
         System.out.printf("Add courses, or enter 0 to return to the previous menu:%n%n");
         System.out.println("1 - Add course");
         System.out.printf("0 - Return to the previous menu%n%n");
         System.out.print("Your choice: ");
         userSelection = input.nextInt();
         input.nextLine(); // Consume newline
         System.out.println();

         switch (userSelection)
         {
            case 1: // Add courses
               createCourses();
               break;
            case 0: // Return to the previous menu
               return Menu.EDIT_STUDENT;
            default: // User input is not one of the choices
               System.out.println("Invalid input");
         }
      }
   }

}
