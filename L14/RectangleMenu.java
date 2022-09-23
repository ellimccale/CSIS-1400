import java.util.Scanner;

public class RectangleMenu
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      Rectangle newRectangle = new Rectangle(5, 4);
      
      int selection;
      
      do
      {
         menuPrompt();
         selection = input.nextInt();

         switch (selection)
         {
            case 1:
               System.out.printf("The area is %d%n", newRectangle.area());
               break;
            case 2:
               System.out.printf("The perimeter is %d%n", newRectangle.perimeter());
               break;
            case 3:
               System.out.printf("The length is %d and the width is %d%n",
                  newRectangle.getLength(),
                  newRectangle.getWidth());
               break;
            case 0:
               System.out.println("goodbye");
               break;
            default:
               System.out.println("invalid input");
         }

         System.out.println();
      } while (selection != 0);
   }

   private static void menuPrompt()
   {
      System.out.println("1 .. area");
      System.out.println("2 .. perimeter");
      System.out.println("3 .. length and width");
      System.out.println("0 .. exit");
      System.out.print("Your choice: ");
   }
}