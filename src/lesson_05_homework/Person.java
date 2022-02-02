package lesson_05_homework;

//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.

public class Person {

    private static int CURRENT_YEAR = 2021;

    private String surname_secondname_name;
    private String position;
    private String mail;
    private String phone;
    private int salary;
    private int birthYear;

    // 2.	Конструктор класса должен заполнять эти поля при создании объекта;

    public Person(String surname_secondname_name, String phone, String position, String mail, int salary, int birthYear) {
        this.birthYear = birthYear;
        this.surname_secondname_name = surname_secondname_name;
        this.position = position;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        }

        // 3.Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;

        int getAge() {
            return CURRENT_YEAR - birthYear;
            }

        int getSalary() {
            return salary;
            }

        String getFullInfo() {
            return " Сотрудник: " + this.surname_secondname_name + ". " + "Возраст: " + this.getAge() + ", должность: " + this.position + ", номер телефона: " + this.phone + ", E-mail: " + this.mail + ". Зарплата: " + this.getSalary() + " Рублей";
        }




}




