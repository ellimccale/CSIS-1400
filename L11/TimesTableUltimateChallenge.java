public class TimesTableUltimateChallenge
{
   public static void main(String[] args)
   {
      // Loop through 1-10 and print a times table for each number
      for (int i = 1; i <= 10; i += 2)
      {
         int next = i + 1;

         for (int j = 1; j <= 10; j++)
         {
            System.out.printf("%2d * %d = %-10d %2d * %d = %d%n",
               j, i, (j * i),
               j, next, (j * next)
            );
         }

         System.out.println();
      }

   }
}