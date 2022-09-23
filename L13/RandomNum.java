// Import the Random class
import java.util.Random;

public class RandomNum
{
   public static void main(String[] args)
   {

      // Create a table of numbers [4, 7]
      generateNumTable(4, 1, 4);

      // Create a table of multiples of 10 [10, 90]
      generateNumTable(9, 10, 10);

      // Create a table of numbers [901, 999]
      generateNumTable(99, 1, 901);

   }

   public static void generateNumTable(int range, int multiple, int offset)
   {

      // Create a new instance of Random
      Random rand = new Random();

      // Local variables
      int number;

      // Loop to create 100 items
      for (int i = 1; i <= 100; i++)
      {
         // Generate a random number within range, with multiple and offset
         number = rand.nextInt(range) * multiple + offset;

         // Print that number, left-aligned 5 spaces
         System.out.printf("%-5d", number);

         // Wrap to a new line on the 10th column
         if (i % 10 == 0)
         {
            System.out.println();
         }
      }

      // Empty spacer line
      System.out.println();

   }
}