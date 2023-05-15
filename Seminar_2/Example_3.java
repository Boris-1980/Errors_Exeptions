/* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */


package Seminar_2;

import java.util.Scanner;

public class Example_3 {

    public static void main(String[] args) {
        float number = getFloatUser();
        System.out.println("Введено число: " + number);
    }

    public static float getFloatUser() {
        final Scanner scan = new Scanner(System.in);
        float number;

        while(true) {
            System.out.println("Введите дробное число: ");
            String input = scan.nextLine();

            try {
                number = Float.parseFloat(input);
                break; // если ввели направильно прекращаем цикл
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода ");
            }
        }

        return number;
    }
}



