package Seminar_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.zip.DataFormatException;

public class DataParser {
    private static final int REQUIRED_DATA_COUNT = 6; // сколько данных

    public static Person parseData(String inputData) throws DataFormatException {
        String[] data = inputData.split(" ");

        // Проверяем количество данных
        if (data.length != REQUIRED_DATA_COUNT) {
            throw new DataFormatException("Неверное количество данных");
        }

        try {
            String surname = data[0];
            String firstName = data[1];
            String middleName = data[2];
            String dateOfBirth = data[3];
            long phoneNumber = Long.parseLong(data[4]);
            char gender = data[5].charAt(0);

            // Проверка ДР
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate.parse(dateOfBirth, formatter);

            // Проверка пола
            if (gender != 'f' && gender != 'm') {
                throw new DataFormatException("Неверный формат пола");
            }

            return new Person(surname, firstName, middleName, dateOfBirth, phoneNumber, gender);
        } catch (NumberFormatException e) {
            throw new DataFormatException("Неверный формат номера телефона");
        } catch (Exception e) {
            throw new DataFormatException("Неверный формат данных");
        }
    }
}
