/**********************************************
 * Author: Elli
 * Date:   3/14/2020
 * Assignment: A07 - Volumes
 *
 * Calculates the volumes of various shapes.
 **********************************************/

public class Volumes
{
   // Volume of a cuboid: V = abc
   public static double cuboid(double sideA, double sideB, double sideC)
   {
      return sideA * sideB * sideC;
   }

   // Volume of a cube: V = a^3
   public static double cuboid(double side)
   {
      return cuboid(side, side, side);
   }

   // Volume of an ellipsoid: V = (4/3)PIabc
   public static double ellipsoid(double sideA, double sideB, double sideC)
   {
      return (4.0 / 3) * Math.PI * sideA * sideB * sideC;
   }

   // Volume of an ellipse: V = (4/3)PIa^3
   public static double ellipsoid(double side)
   {
      return ellipsoid(side, side, side);
   }

   // Volume of a cylinder: V = PIr^2h
   public static double cylinder(double radius, double height)
   {
      return Math.PI * Math.pow(radius, 2) * height;
   }

   /**
    * Volume of a cone is usually: V = (1/3)PIr^2h
    * For this method, only diameter and side are provided.
    * Assume "side" must be the hypotenuse.
    */
   public static double cone(double diameter, double side)
   {
      // Get the radius of the base of the cone by dividing diameter by 2
      double coneRadius = diameter / 2.0;

      /**
       * Get the height of the cone by finding the square root
       * of side^2 - coneRadius^2
       *
       * a^2 + b^2 = c^2
       * Sub coneRadius for a and side for c
       * ---------------------------------------
       * coneRadius^2 + h^2 = side^2
       * - coneRadius^2       - coneRadius^2
       * ---------------------------------------
       * h^2 = side^2 - coneRadius^2
       * ---------------------------------------
       * sqrt(h^2) = sqrt(side^2 - coneRadius^2)
       */
      double coneHeight = Math.sqrt(Math.pow(side, 2) - Math.pow(coneRadius, 2));

      // Return the standard formula using the new values
      return (1.0 / 3) * Math.PI * Math.pow(coneRadius, 2) * coneHeight;
   }
}