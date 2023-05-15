package Seminar_2;

import java.io.EOFException;
import java.util.Scanner;

public class Example_6 {

    public static void main(String[] args) {
        try{
            String input = getStringUser();
            System.out.println("Введено: " + input );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getStringUser() throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = scan.nextLine();

        if (input.isEmpty()) {
            throw new Exception("Пустые сроки вводить нельзя");
        }
        return input;
    }
    
}
