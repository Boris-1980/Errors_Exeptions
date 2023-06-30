package Seminar_3;

import java.io.IOException;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("Выберите действие:");
            System.out.println("1. Запись нового пользователя");
            System.out.println("2. Чтение файла по фамилии");
            System.out.println("3. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очищаем буфер после считывания числа

            switch (choice) {
                case 1:
                    processNewUser(scanner);
                    break;
                case 2:
                    readDataFromFile(scanner);
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    private static void processNewUser(Scanner scanner) {
        System.out.println("Введите данные (фамилия имя отчество датарождения номертелефона пол):");
        String inputData = scanner.nextLine();

        try {
            Person person = DataParser.parseData(inputData);
            FileReaderWriter.writeDataToFile(person);
            System.out.println("Данные успешно записаны в файл.");
        } catch (DataFormatException e) {
            System.out.println("Ошибка формата данных: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }

    private static void readDataFromFile(Scanner scanner) {
        System.out.println("Введите фамилию для чтения данных:");
        String surname = scanner.nextLine();
        FileReaderWriter.readDataFromFile(surname);
    }
}


// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         boolean running = true;
//         while (running) {
//             System.out.println("Выберите действие:");
//             System.out.println("1. Запись нового пользователя");
//             System.out.println("2. Выход");

//             int choice = scanner.nextInt();
//             scanner.nextLine(); // Очищаем буфер после считывания числа

//             switch (choice) {
//                 case 1:
//                     processNewUser(scanner);
//                     break;
//                 case 2:
//                     running = false;
//                     break;
//                 default:
//                     System.out.println("Неверный выбор. Попробуйте снова.");
//             }
//         }
//     }

//     private static void processNewUser(Scanner scanner) {
//         System.out.println("Введите данные через пробел (Фамилия Имя Отчество Дата_рождения Номер_телефона пол(m или f)):");
//         String inputData = scanner.nextLine();

//         try {
//             Person person = DataParser.parseData(inputData);
//             DataWriter.writeDataToFile(person);
//             System.out.println("Данные успешно записаны в файл.");
//         } catch (DataFormatException e) {
//             System.out.println("Ошибка формата данных: " + e.getMessage());
//         } catch (IOException e) {
//             System.out.println("Ошибка записи в файл: " + e.getMessage());
//         }
//     }
// }

