/*****************************************
 * Author: Elli
 * Date:   2/20/2020
 * Assignment: A04 - Conveyor
 *****************************************/

public class ConveyorApp
{
   public static void main(String[] args)
   {
   
      // Create two new instances of type Conveyor with initialized values
      Conveyor conveyor1 = new Conveyor("Flat Belt", 0.9);
      Conveyor conveyor2 = new Conveyor("Roller", -0.5);

      // Print Conveyor 1 data
      System.out.printf("Conveyor 1: %s conveyor with a speed of %.1f m/s%n", conveyor1.getType(), conveyor1.getSpeed());
      System.out.printf("Time to transport an item 50 meters: %.1f seconds%n%n", conveyor1.timeToTransport(50));

      // Print Conveyor 2 data
      // Speed should print as the default `0.0` since the initialized speed is not valid (negative)
      System.out.printf("Conveyor 2: %s conveyor with a speed of %.1f m/s%n", conveyor2.getType(), conveyor2.getSpeed());
      System.out.printf("Time to transport an item 50 meters: %.1f seconds%n%n", conveyor2.timeToTransport(50));

      // Test the use of the speed setter
      // Conveyor 1 speed should remain unchanged because the new value is not valid (negative)
      System.out.printf("... Updating speed%n%n");
      conveyor1.setSpeed(-3);
      conveyor2.setSpeed(0.4);

      // Print Conveyor 1 data again
      System.out.printf("Conveyor 1: %s conveyor with a speed of %.1f m/s%n", conveyor1.getType(), conveyor1.getSpeed());
      System.out.printf("Time to transport an item 50 meters: %.1f seconds%n%n", conveyor1.timeToTransport(50));

      // Print Conveyor 2 data again
      System.out.printf("Conveyor 2: %s conveyor with a speed of %.1f m/s%n", conveyor2.getType(), conveyor2.getSpeed());
      System.out.printf("Time to transport an item 50 meters: %.1f seconds", conveyor2.timeToTransport(50));
   
   }
}