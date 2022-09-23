public class Ball
{

   // Fields
   private double size;
   private boolean isBlack;

   // Constructors
   public Ball() {
      this(6.0, false);
   }

   // Constructor overloading with only size
   public Ball(double size)
   {
      this(size, true);
   }

   // Constructor overloading with both size and isBlack
   public Ball(double size, boolean isBlack)
   {
      this.size = size;
      this.isBlack = isBlack;
   }

   // Methods
   // Public getter to get the size of the Ball
   public double getSize()
   {
      return size;
   }

   // Public getter to get whether or not the Ball is black
   public boolean getIsBlack()
   {
      return isBlack;
   }

   // Public setter to set the size of the Ball
   public void setSize(double size)
   {
      if (size >= 0)
      {
         this.size = size;
      }
   }

   // Public method to roll the Ball
   public String roll()
   {
      return "rolling...";
   }

   // Public method with overloading to roll the Ball a number of times
   public String roll(int howManyTimes)
   {
      return "rolling " + howManyTimes + " time" + (howManyTimes == 1 ? "" : "s");
   }

   // Public method to bounce the Ball
   public String bounce(int numberOfBounces)
   {
      return "bouncing " + numberOfBounces + " time" + (numberOfBounces == 1 ? "" : "s");
   }

}