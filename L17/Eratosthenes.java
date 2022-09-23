// Import the Scanner class
import java.util.Scanner;

public class Eratosthenes
{
   public static void main(String[] args)
   {
      // Create a new instance of Scanner
      Scanner input = new Scanner(System.in);
      // Get an integer from the user
      System.out.print("Enter an integer to search within: ");
      int num = input.nextInt();
      System.out.println();

      // Print all prime numbers within the user's number
      printPrimes(num);
   }

   public static void printPrimes(int n)
   {
      /**
       * Initialize a new array with one more element than n.
       * This ensures that if n itself is prime, it will be included in
       * the list. Then assume that all elements are prime to begin with.
       */
      boolean[] primes = new boolean[n + 1];
      for (int i = 2; i <= n; i++)
      {
         primes[i] = true;
      }

      /**
       * It's sufficient to stop at the square root of n because all factors
       * will appear before that point.
       */
      for (int i = 2; i <= Math.sqrt(n); i++)
      {
         if (primes[i])
         {
            // Any product of the current index cannot be prime
            for (int j = (i * i); j <= n; j += i)
            {
               primes[j] = false;
            }
         }
      }

      // Print all prime numbers as the index of true values
      System.out.printf("All prime numbers through %d are:%n", n);
      for (int i = 2; i <= n; i++)
      {
         if (primes[i])
         {
            System.out.println(i);
         }
      }
   }
}