/*****************************************
 * Author: Elli
 * Date:   2/20/2020
 * Assignment: A04 - Conveyor
 *****************************************/

public class Conveyor
{

   // Fields
   private String type;
   private double speed; // Measured in meters per second

   // Constructors
   public Conveyor()
   {
      this("None", 0.0);
   }

   // Overloading constructor
   public Conveyor(String type, double speed)
   {
      this.type = type;
      this.setSpeed(speed);
   }

   // Methods
   public String getType()
   {
      return type;
   }

   public double getSpeed()
   {
      return speed;
   }

   public void setSpeed(double speed)
   {
      if (speed >= 0)
      {
         this.speed = speed;
      }
   }

   // Basic calculation using time = distance/speed
   // Output only in seconds, not accounting for minutes or hours
   public double timeToTransport(double distance)
   {
      return distance / speed;
   }

}