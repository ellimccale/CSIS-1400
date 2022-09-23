/**********************************************
 * Author: Elli
 * Date:   3/14/2020
 * Assignment: A07 - Volumes
 *
 * Allows the user to select shapes from
 * a menu. Based on the user selection, the
 * corresponding volume is displayed.
 **********************************************/

// Import the Scanner class
import java.util.Scanner;

public class VolumesMenu
{
   public static void main(String[] args)
   {

      // Create a new instance of Scanner
      Scanner input = new Scanner(System.in);

      // Create a variable to store user selection
      int selection;

      /**
       * Show a menu with options 1 - 6, and 0 to exit. End the loop on 0.
       * Based on user selection, show the result of a volume calculation for
       * the specific shape.
       */
      do
      {
         // Show the menu prompt on each iteration
         menuPrompt();

         // Store the user input
         selection = input.nextInt();

         // Select based on user input
         switch (selection)
         {
            case 1:
               System.out.printf("cuboid(2, 4, 6): volume = %.1f%n%n",
                     Volumes.cuboid(2, 4, 6));
               break;
            case 2:
               System.out.printf("cuboid(4): volume = %.1f%n%n",
                     Volumes.cuboid(4));
               break;
            case 3:
               System.out.printf("ellipsoid(2, 4, 6): volume = %.1f%n%n",
                     Volumes.ellipsoid(2, 4, 6));
               break;
            case 4:
               System.out.printf("ellipsoid(4): volume = %.1f%n%n",
                     Volumes.ellipsoid(4));
               break;
            case 5:
               System.out.printf("cylinder(3, 4): volume = %.1f%n%n",
                     Volumes.cylinder(3, 4));
               break;
            case 6:
               System.out.printf("cone(6, 5): volume = %.1f%n%n",
                     Volumes.cone(6, 5));
               break;
            case 0:
               System.out.println("goodbye");
               break;
            default:
               System.out.printf("invalid input%n%n");
         }
      } while (selection != 0);

   }

   public static void menuPrompt()
   {

      System.out.printf("%-25s %s%n",
            "1 .. cuboid(2, 4, 6)", "2 .. cuboid(4)");
      System.out.printf("%-25s %s%n",
            "3 .. ellipsoid(2, 4, 6)", "4 .. ellipsoid(4)");
      System.out.printf("%-25s %s%n",
            "5 .. cylinder(3, 4)", "6 .. cone(6, 5)");
      System.out.println("0 .. exit");
      System.out.print("Your choice: ");

   }
}