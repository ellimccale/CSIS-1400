// Import util classes
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class PartyGuests
{
   public static void main(String[] args)
   {
      // Variables
      int numberOfGuests = 4;
      Scanner input = new Scanner(System.in);
      Random rand = new Random();
      ArrayList<String> guestList = new ArrayList<String>();

      // Inform user that we'll be entering X guests
      System.out.printf("Please enter %d guests:%n", numberOfGuests);

      // Add user's guests to the guest list
      for (int i = 1; i <= numberOfGuests; i++)
      {
         System.out.print("guest" + i + ": ");
         guestList.add(input.nextLine());
      }

      // Display the guest list
      System.out.printf("%nGuest list: %s%n", guestList.toString());

      // Select a random guest to remove from the list
      int guestNumber = rand.nextInt(numberOfGuests);

      // Inform the user that X guest can't come and update the list
      System.out.printf("%s can't come%n", guestList.get(guestNumber));
      guestList.remove(guestNumber);

      // Display the updated guest list
      System.out.printf("Updated guest list: %s", guestList.toString());
   }
}