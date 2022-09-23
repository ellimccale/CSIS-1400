public class HoppityHop
{
   public static void main(String[] args)
   {

      // Loop from 1 to 25
      for (int count = 1; count <= 25; count++)
      {
         // Is current number divisible by both 3 and 5?
         if ((count % 3 == 0) && (count % 5 == 0))
         {
            System.out.println("Hoppity Hop");
         }
         // Is current number divisible by 3?
         else if (count % 3 == 0)
         {
            System.out.println("Hoppity");
         }
         // Is current number divisible by 5?
         else if (count % 5 == 0)
         {
            System.out.println("Hop");
         }
         // No other conditions are true, print current number
         else
         {
            System.out.println(count);
         }
      }

   }
}