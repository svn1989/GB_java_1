package lesson_05_homework;

public class homework_5 {

    public static void main(String[] args) {
        // 4. Создать массив из 5 сотрудников.
        // Пример:
        // Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        // persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan Ivanovich", "89212223344", "Director", "ivivan@mailbox.com", 99999, 1963);
        persArray[1] = new Person("Petrov Petr Petrovich", "89213334455", "Manager", "petrpetrov@mailbox.com", 88888, 1990);
        persArray[2] = new Person("Sidorova Svetlana Petrovna", "89214445566", "Courier", "sidorova@mailbox.com", 33333, 2002);
        persArray[3] = new Person("Alexandov Alex Alexandovich", "89215556677", "Engeneer", "alex@mailbox.com", 55555, 1981);
        persArray[4] = new Person("Coder Code Codovich", "89216667788", "Programmer", "code@mailbox.com", 77777, 1989);


        System.out.println("Вывод задания 4:");
        getAllPersonsInOffice(persArray);
        System.out.println();

        //5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        System.out.println("Вывод задания 5:");
        getOldPerson(persArray, 40);

    }

    private static void getOldPerson(Person[] office, int year) {
        for (int i = 0; i < office.length; i++)
            if (office[i].getAge() > year) {
                System.out.println("Старше 40 лет: " + office[i].getFullInfo());
            }
    }

    private static void getAllPersonsInOffice(Person[] office) {
        System.out.println("Все сотрудники: ");
        for (int i = 0; i < office.length; i++)
            System.out.println((i + 1) + " " + office[i].getFullInfo());
    }













}
