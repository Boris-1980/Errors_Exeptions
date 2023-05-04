/*
 Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
 и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. 
 Если длины массивов не равны, необходимо как-то оповестить пользователя. 
 Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
 */

package Seminar_1;

import java.util.Arrays;

public class Example_2 {
    public static int[] divideArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }

        int[] result = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] / arr2[i];
    }
    return result;
}
    public static void main(String[] args) {
        int[] arr1 = { 77, 66, 33, 44, 55 };
        int[] arr2 = { 7, 6, 3, 4, 5};
        try {
            int[] result = divideArrays(arr1, arr2);
            System.out.println(Arrays.toString(result));
        } catch(RuntimeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
