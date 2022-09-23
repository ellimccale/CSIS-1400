/*****************************************
 * Author: Elli
 * Date:   2/29/2020
 * Assignment: Midterm 1 - Triangle
 *****************************************/

public class Triangle
{

   // Fields

   private double side1;
   private double side2;
   private double side3;

   // Constructors

   public Triangle(double side1, double side2, double side3)
   {
      if (isTriangle(side1, side2, side3))
      {
         this.side1 = side1;
         this.side2 = side2;
         this.side3 = side3;
      } else {
         this.side1 = 1d;
         this.side2 = 1d;
         this.side3 = 1d;
      }
   }

   // Methods

   public double getSide1()
   {
      return side1;
   }

   public double getSide2()
   {
      return side2;
   }

   public double getSide3()
   {
      return side3;
   }

   public boolean isTriangle(double side1, double side2, double side3)
   {

      /**
       * A triangle is valid given any three values greater than zero, where
       * the sum of two sides is greater than the third side.
       *
       * I realize that I can combine these, but I feel like nesting is easier
       * to read in this case.
       */
      if ((side1 > 0) && (side2 > 0) && (side3 > 0))
      {
         // Using Double.compare() to be precise
         if ((Double.compare((side1 + side2), side3) > 0) &&
             (Double.compare((side2 + side3), side1) > 0) &&
             (Double.compare((side3 + side1), side2) > 0))
         {
            return true;
         }
      }

      return false;
   }

   public boolean isEquilateral()
   {
      /**
       * Equilateral triangle = triangle with three equal sides
       *
       * Only need to compare twice because if side1 = size2, then side1
       * should also = side3.
       */
      if ((Double.compare(side1, side2) == 0) &&
          (Double.compare(side2, side3) == 0))
      {
         return true;
      }

      return false;
   }

   public boolean isRight()
   {
      // Creating local variables to avoid repetition
      double a2 = side1 * side1;
      double b2 = side2 * side2;
      double c2 = side3 * side3;

      /**
       * Right triangle = triangle with one right angle
       *
       * Uses the Pythagorean theorem.
       */
      if ((Double.compare((a2 + b2), c2) == 0) ||
          (Double.compare((b2 + c2), a2) == 0) ||
          (Double.compare((c2 + a2), b2) == 0))
      {
         return true;
      }

      return false;
   }

}