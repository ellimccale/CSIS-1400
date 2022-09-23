// Import Scanner class
import java.util.Scanner;

public class Marbles
{
   public static void main(String[] args)
   {

      // Create a new Scanner object
      Scanner input = new Scanner(System.in);

      // Get first marble type
      System.out.print("color: ");
      String color1 = input.nextLine();

      System.out.printf("Number of %s marbles: ", color1);
      int number1 = input.nextInt();
      input.nextLine();  // Consume remaining newline from nextInt

      // Get second marble type
      System.out.print("color: ");
      String color2 = input.nextLine();

      System.out.printf("Number of %s marbles: ", color2);
      int number2 = input.nextInt();
      input.nextLine();  // Consume remaining newline from nextInt

      // Get third marble type
      System.out.print("color: ");
      String color3 = input.nextLine();

      System.out.printf("Number of %s marbles: ", color3);
      int number3 = input.nextInt();
      input.nextLine();  // Consume remaining newline from nextInt

      // Print table of data
      System.out.printf("%n%-12s %-17s%n", "Color", "Marbles");
      System.out.printf("------------ -----------------%n");
      System.out.printf("%-12s %-17s%n", color1, number1);
      System.out.printf("%-12s %-17s%n", color2, number2);
      System.out.printf("%-12s %-17s%n", color3, number3);

   }
}