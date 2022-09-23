// Import the Scanner class
import java.util.Scanner;

public class TimesTableChallenge
{
   public static void main(String[] args)
   {

      // Create a new instance of Scanner
      Scanner input = new Scanner(System.in);

      // Local variables
      int number;
      int nextNumber;

      // Request a number from the user
      System.out.println("Times Table:");
      System.out.print("Number (1 - 10): ");
      number = input.nextInt();
      nextNumber = number + 1;

      // Empty spacing line
      System.out.println();

      // Loop through 1-10 and print two times table based on the user's number
      for (int i = 1; i <= 10; i++)
      {
         System.out.printf("%2d * %d = %-10d %2d * %d = %d%n",
            i, number, (i * number),
            i, nextNumber, (i * nextNumber)
         );
      }

   }
}