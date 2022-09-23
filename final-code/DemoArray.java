/**********************************************************
 * Author: Elli
 * Date:   5/7/2020
 * Assignment: Final Code
 **********************************************************/

// Import the Arrays class
import java.util.Arrays;

public class DemoArray
{
   public static void main(String[] args)
   {
      // Create a String array called words
      String[] words = {"one", "two", "thre", "four", "five", "four", "thre", "two", "one"};

      // Print the array with a label
      System.out.println("Words: " + Arrays.toString(words));

      // Print label for updated array
      System.out.print("Words: ");

      // Fix misspelled word and print updated array
      // One loop for efficiency
      for (String el : words)
      {
         if (el == "thre")
         {
            el = "three";
         }

         System.out.printf("%s ", el);
      }
   }
}