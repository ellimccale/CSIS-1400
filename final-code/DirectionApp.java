/**********************************************************
 * Author: Elli
 * Date:   5/7/2020
 * Assignment: Final Code
 **********************************************************/

public class DirectionApp
{
   public static void main(String[] args)
   {
      // Variables
      Direction currentDirection = Direction.RIGHT;
      Direction nextDirection = currentDirection;

      // Print the variables
      System.out.println("currentDirection: " + currentDirection);
      System.out.println("nextDirection: " + nextDirection);

      // Print the enum values
      // Start by storing the values in a new array
      Direction[] directions = Direction.values();

      // Iterate over that array
      for (int i = 0; i < directions.length; i++)
      {
         // Print each item, only add a dash in between if current index is not the last item
         System.out.printf("%s%s", directions[i],
            (i != (directions.length - 1) ? " - " : ""));
      }
   }
}