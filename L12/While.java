// Import the Scanner class
import java.util.Scanner;

public class While
{
   public static void main(String[] args)
   {
      multiplyNumbers();
   }

   public static void multiplyNumbers()
   {
      // Create a new instance of Scanner
      Scanner input = new Scanner(System.in);

      // Local variables
      int product = 1;

      // Request a number from the user (possibly sentinel)
      System.out.print("Enter an integer or 0 to quit: ");
      int number = input.nextInt();

      // Loop until the user quits
      while (number != 0)
      {
         product *= number;
         System.out.print("Enter an integer or 0 to quit: ");
         number = input.nextInt();
      }

      // Print the final product
      System.out.printf("The product is: %d%n", product);
   }
}