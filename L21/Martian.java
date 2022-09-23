// Import the Random class
import java.util.Random;

public class Martian
{

   // Fields
   public String name;
   public static int count;
   public Random rand = new Random();

   // Constructor
   public Martian()
   {
      this.name = getRandomName();
      count++;
   }

   // Methods
   public String getRandomName()
   {
      // Generate a random letter and number
      char letter = (char) (rand.nextInt(26) + 'A');
      int number = rand.nextInt(90) + 10; // [10, 99]

      // Return letter and number as a string
      return String.valueOf(letter) + String.valueOf(number);
   }

   public void doSomething()
   {
      if (count < 5)
      {
         System.out.printf("%s is hiding%n", this);
      }
      else
      {
         System.out.println("ATTACK!");
      }
   }

   public static Martian[] invade(int num)
   {
      Martian[] martians = new Martian[num];

      for (int i = 0; i < martians.length; i++)
      {
         martians[i] = new Martian();
      }

      return martians;
   }

   public static Martian[] invade()
   {
      Random rand = new Random();
      int randomMartians = rand.nextInt(9) + 2; // [2, 10]

      return invade(randomMartians);
   }

   @Override
   public String toString()
   {
      return String.format("%s\\%d", name, count);
   }

}