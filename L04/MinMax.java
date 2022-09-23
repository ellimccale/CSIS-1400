// Import Scanner class
import java.util.Scanner;

public class MinMax
{
   public static void main(String[] args)
   {

      // Create a new Scanner object
      Scanner input = new Scanner(System.in);

      // Initialize two integer variables
      int number1;
      int number2;

      // Request two numbers from the user
      // Assign user input back to int variables
      System.out.print("Enter the first number: ");
      number1 = input.nextInt();

      System.out.print("Enter the second number: ");
      number2 = input.nextInt();

      // Compare two numbers
      if (number1 == number2)
      {
         System.out.printf("%d is equal to %d", number1, number2);
      }

      if (number1 > number2)
      {
         System.out.printf("%d is greater than %d", number1, number2);
      }

      if (number1 < number2)
      {
         System.out.printf("%d is less than %d", number1, number2);
      }

   }
}