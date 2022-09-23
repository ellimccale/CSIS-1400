public class Array
{
   /*******************************************************
    * Follow the instructions in main
    * the expected output is listed at the end of this file 
    *******************************************************/
   
   public static void main(String[] args)
   {
      // create int array named intArray of size 3
      int[] intArray = new int[3];
      
      // use the method printArray to print the array; pass as name "intArray"
      printArray(intArray, "intArray");
      
      // assign the value 2 to the first element
      intArray[0] = 2;
      
      // use the field length to assign the value 4 to the last element
      intArray[intArray.length - 1] = 4;
      
      // print all elements of intArray
      printArray(intArray, "intArray");
      
      // in a separate line print the length of intArray
      System.out.printf("Length of intArray: %d%n", intArray.length);
      
      // create an integer variable named number and assign it the value 3
      int number = 3;
      
      // assign number plus 4 (as an expression) to the second element of intArray
      intArray[1] = number + 4;
      
      // assign the value of the first element to the third element of intArray
      intArray[2] = intArray[0];
      
      // print all elements of intArray
      printArray(intArray, "intArray");

   }	

   private static void printArray(int[] integerArray, String name)
   {
      System.out.printf("%s: ", name);
      for (int i = 0; i < integerArray.length; i++)
      {
         System.out.printf("%d ", integerArray[i]);
      }
      System.out.println();
   }

   /******************************
    * Expected Output:
    *
    * intArray: 0 0 0 
    * intArray: 2 0 4 
    * length of intArray: 3
    * intArray: 2 7 2 
    ******************************/
}