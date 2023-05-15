package Seminar_2;

/* Исправить код если есть ошибки

 public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}

 */


 //  Поменял порядок блоков catch, чтобы более конкретные исключения были указаны первыми
 //  В методе printSum удалил исключения FileNotFoundException
public class Example_5 {

    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {   
            System.out.println("Указатель не может указывать на null!");
         } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
         } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
         }
     }
     public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
     }
     
     
    
}
