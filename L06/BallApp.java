public class BallApp
{
   public static void main(String[] args)
   {

      // New instance of Ball
      Ball myBall = new Ball();

      // Set initial size of myBall to 5
      myBall.setSize(5);

      // Print the size of myBall
      System.out.printf("myBall size: %.0f%n", myBall.getSize());

      // Bounce myBall 14 times
      System.out.printf("myBall is %s%n", myBall.bounce(14));

      // New instance of Ball
      Ball myBall1 = new Ball(8);

      // Print the size of myBall1
      System.out.printf("myBall1 size: %.0f%n", myBall1.getSize());

      // New instance of Ball
      Ball myBall2 = new Ball(5, true);

      // Roll myBall2
      System.out.printf("myBall2 is %s%n", myBall2.roll(10));

      // Print the color of myBall2
      System.out.printf("myBall2 is black: %b", myBall2.getIsBlack());      

   }
}