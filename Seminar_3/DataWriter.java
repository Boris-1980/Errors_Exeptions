package Seminar_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DataWriter {
    public static void writeDataToFile(Person person) throws IOException {
        String filename = person.getSurname() + ".txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            String dataLine = person.getSurname() + " " + person.getFirstName() + " " + person.getMiddleName() +
                    " " + person.getDateOfBirth() + " " + person.getPhoneNumber() + " " + person.getGender();

            writer.write(dataLine);
            writer.newLine();
        } catch (IOException e) {
            throw new IOException("Ошибка при записи в файл", e);
        }
    }
}
