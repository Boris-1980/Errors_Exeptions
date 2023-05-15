/*
Исправить код если надо:

try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}

*/
package Seminar_2;

public class  Example_4 {
   public static void main(String[] args) {
      int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Объявление и инициализация массива intArray

      try {
         int d = 0;
         if (d != 0) {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } else {
            System.out.println("На ноль делить нельзя");
         }
      } catch (ArithmeticException e) {
         System.out.println("Catching exception: " + e);
      }
  }
   
}
