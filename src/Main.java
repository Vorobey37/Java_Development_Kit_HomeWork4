

/*Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри
коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавление нового сотрудника в справочник*/

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Generator generator = new Generator();

        EmployeeDirectory directory = new EmployeeDirectory(generator.createEmployeeDirectory(10));

        System.out.println(directory);
        System.out.println(directory.findEmployeeByExperience(2f, 4f));
        System.out.println(directory.findPhoneNumberByName("Иван"));
        System.out.println(directory.findEmployeeById(3));
        directory.addEmployee(generator.createEmployee(10));
        System.out.println(directory);

    }
}