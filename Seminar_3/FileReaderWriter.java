package Seminar_3;

import java.io.*;

public class FileReaderWriter {
    public static void writeDataToFile(Person person) {
        String filename = person.getSurname() + ".txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            String dataLine = person.getSurname() + " " + person.getFirstName() + " " + person.getMiddleName() +
                    " " + person.getDateOfBirth() + " " + person.getPhoneNumber() + " " + person.getGender();

            writer.write(dataLine);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    public static void readDataFromFile(String surname) {
        String filename = surname + ".txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
