// Import the Scanner class
import java.util.Scanner;

public class TimesTable
{
   public static void main(String[] args)
   {

      // Create a new instance of Scanner
      Scanner input = new Scanner(System.in);

      // Local variables
      int number;

      // Request a number from the user
      System.out.println("Times Table:");
      System.out.print("Number (1 - 10): ");
      number = input.nextInt();

      // Empty spacing line
      System.out.println();

      // Loop through 1-10 and print a times table for the user's number
      for (int i = 1; i <= 10; i++)
      {
         System.out.printf("%2d * %d = %d%n",
            i, number, (i * number));
      }

   }
}