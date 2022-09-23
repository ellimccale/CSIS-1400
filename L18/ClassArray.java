// Import the Arrays class
import java.util.Arrays;

public class ClassArray 
{
   public static void main(String[] args)
   {
      int[] iArray1 = {6, 12, 3, 9};
      int[] iArray2 = new int[5];

      // fill iArray2 with 7
      Arrays.fill(iArray2, 7);

      // print iArray1 and iArray2 (toString)
      System.out.println("iArray1: " + Arrays.toString(iArray1));
      System.out.println("iArray2: " + Arrays.toString(iArray2));

      // search for number 9 in iArray1 and print the value returned
      System.out.println("9 in iArray1: " + Arrays.binarySearch(iArray1, 9));

      // sort iArray1 and print it
      Arrays.sort(iArray1);
      System.out.println("iArray1 sorted: " + Arrays.toString(iArray1));

      // search for number 9 in iArray1 and print the value returned
      System.out.println("9 in iArray1: " + Arrays.binarySearch(iArray1, 9));

      // create iArray3 and assign it the first 3 elements of iArray1; print it
      int[] iArray3 = Arrays.copyOf(iArray1, 3);
      System.out.println("iArray3: " + Arrays.toString(iArray3));

      // test equality of new int[] {3, 6, 9} and iArray3; print result
      int[] tempArr = {3, 6, 9};
      boolean arrMatch = Arrays.equals(tempArr, iArray3);
      System.out.println("iArray3 equals [3, 6, 9]: " + arrMatch);

      // reason why the search for 9 yielded two different results
      System.out.println();
      System.out.println("Reason:");
      System.out.println("Before the first search, iArray1 had not yet been sorted, so the result of 9 was undefined (-2).");
   }
}