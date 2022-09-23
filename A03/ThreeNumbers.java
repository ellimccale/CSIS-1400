/*****************************************
 * Author: Elli
 * Date:   2/6/2020
 * Assignment: A03 - Sorting Three Numbers
 *****************************************/

// Import Scanner class
import java.util.Scanner;

public class ThreeNumbers
{
   public static void main(String[] args)
   {

      // Create a new instance of Scanner
      Scanner input = new Scanner(System.in);

      // Initialize three integer variables
      int n1, n2, n3;

      // Request three numbers from the user
      System.out.print("Enter three numbers separated by a space: ");

      // Assign user input back to integer variables
      n1 = input.nextInt();
      n2 = input.nextInt();
      n3 = input.nextInt();

      // Sort integers by size
      // Start by finding the smallest of n1 and n2
      if (n1 >= n2)
      {

         // n1 is larger; store it temporarily
         int temp = n1;

         // Since n2 is the smaller number, make it first in line as the new n1
         n1 = n2;

         // Assign temp (previously n1) as the new n2 (next largest number)
         n2 = temp;

      }

      // Now find the smallest of n2 and n3
      if (n2 >= n3)
      {

         // n2 is larger; store it temporarily
         int temp = n2;

         // Since n3 is the smaller number, make it next in line as the new n2
         n2 = n3;

         // Assign temp (previously n2) as the new n3 (next largest number)
         n3 = temp;

      }

      // If either of the previous two conditions ran, n1 and n2 will need to be compared again
      if (n1 >= n2)
      {
         int temp = n1;
         n1 = n2;
         n2 = temp;
      }

      // Print sorted numbers
      System.out.printf("Sorted numbers: %d %d %d", n1, n2, n3);

   }
}