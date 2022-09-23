/**********************************************************
 * Author: Elli
 * Date:   5/7/2020
 * Assignment: Final Code
 **********************************************************/

// Import ArrayList class
import java.util.ArrayList;

public class DemoArrayList
{
   public static void main(String[] args)
   {
      // Create an Integer ArrayList called numbers
      ArrayList<Integer> numbers = new ArrayList<Integer>();

      // Add elements
      numbers.add(4);
      numbers.add(8);
      numbers.add(14);

      // Print the ArrayList
      System.out.println("Numbers: " + numbers);

      // Number of elements
      System.out.println("Number of elements: " + numbers.size());

      // Remove the third element
      numbers.remove(2);

      // Add an element
      numbers.add(10);

      // Print the updated ArrayList
      System.out.println("Updated numbers: " + numbers);

      // Print all elements in reverse order
      System.out.print("Numbers in reverse order: ");
      for (int i = numbers.size() - 1; i >= 0; i--)
      {
         System.out.printf("%d ", numbers.get(i));
      }
   }
}