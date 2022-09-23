// Import Scanner class
import java.util.Scanner;

public class ParrotTest
{
   public static void main(String[] args)
   {

      // Create a new instance of Scanner
      Scanner input = new Scanner(System.in);

      // Create a new instance of Parrot
      Parrot myParrot = new Parrot();

      // Initialize a String variable
      String text;

      // Prompt the user for what they're like the parrot to repeat
      // Assign user input back to the `text` String variable
      System.out.print("What would you like to say to the parrot? ");
      text = input.nextLine();

      // Call the `speak` method on the `myParrot` instance of Parrot
      myParrot.speak(text);

   }
}