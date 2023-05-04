/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
и возвращающий новый массив, каждый элемент которого равен разности элементов 
двух входящих массивов в той же ячейке. 
Если длины массивов не равны, необходимо как-то оповестить пользователя.
*/

package Seminar_1;

import java.util.Arrays;

public class Example_1 {

    public static void main(String[] args) {
        int[] arr1 = { 77, 66, 33, 44, 55 };
        int[] arr2 = { 7, 6, 3, 4 };
        int[] result = diffArrays(arr1, arr2);
        if( result == null) {
            System.out.println("Ошибка: Длины массивов не равны ");
        } else {
            System.out.println("Новый массив: " + Arrays.toString(result));
        }
    }

    public static int[] diffArrays(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length) {
            return null;
        }

        int[] result = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }
}