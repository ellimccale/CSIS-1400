/*****************************************
 * Author: Elli
 * Date:   3/7/2020
 * Assignment: A04 - Roman Numerals
 *****************************************/

public class Roman
{
   public static void summary()
   {
      System.out.printf("%s%n", "I = 1");
      System.out.printf("%-15s %s%n", "V = 5", "IV = 4");
      System.out.printf("%-15s %s%n", "X = 10", "IX = 9");
      System.out.printf("%-15s %s%n", "L = 50", "XL = 40");
      System.out.printf("%-15s %s%n", "C = 100", "XC = 90");
      System.out.printf("%-15s %s%n", "D = 500", "CD = 400");
      System.out.printf("%-15s %s%n%n", "M = 1000", "CM = 900");
   }

   public static void printNumeral(int number)
   {
      if (number > 0 && number < 40)
      {
         String roman = "";
         int remainder = number;

         while (remainder >= 10)
         {
            roman += "X";
            remainder -= 10;
         }

         if (remainder == 9)
         {
            roman += "IX";
            remainder -= 9;
         }
         else if (remainder == 4)
         {
            roman += "IV";
            remainder -= 4;
         }
         else if (remainder > 4 && remainder < 9)
         {
            roman += "V";
            remainder %= 5;
         }

         for (int i = 0; i < remainder; i++)
         {
            roman += "I";
         }

         System.out.println(roman);
      }
      else
      {
         System.out.println("Valid number range: 1 - 39");
      }
   }
}