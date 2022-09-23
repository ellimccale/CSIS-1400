// Import the Random class
import java.util.Random;

public class Dice
{
   public static void main(String[] args)
   {
      // Variables
      Random rand = new Random();
      int[] rolls = new int[11];
      int rollAmount = 36000;

      // Roll two dice and store the sum of both rolls
      for (int i = 0; i < rollAmount; i++)
      {
         int diceOne = rand.nextInt(6) + 1; // [1, 6]
         int diceTwo = rand.nextInt(6) + 1; // [1, 6]
         int sum = diceOne + diceTwo;

         rolls[sum - 2] += 1;
      }

      // Print the results of all rolls
      System.out.printf("%3s %10s %12s%n",
         "Sum", "Frequency", "Percentage");

      for (int i = 0; i < rolls.length; i++)
      {
         double percentage = (rolls[i] / (double) rollAmount) * 100;

         System.out.printf("%3d %10d %11.1f%%%n",
            (i + 2), rolls[i], percentage);
      }
   }
}