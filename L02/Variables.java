// Import Scanner class
import java.util.Scanner;

public class Variables
{
   public static void main(String[] args)
   {

      // Create a new Scanner object
      Scanner input = new Scanner(System.in);

      // Get favorite destination
      System.out.print("Enter your favorite destination: ");
      String destination = input.nextLine();

      System.out.printf("Welcome to %s!%n%n", destination);

      // Print peak elevations
      int kingsPeak = 4124;
      int timpanogos = 3581;

      System.out.printf("Elevation of Kings Peak: %d%n", kingsPeak);
      System.out.printf("Elevation of Timpanogos: %d", timpanogos);

   }
}