package lesson_02_homework;

public class Homework_02 {
    public static void main(String[] args) {

        System.out.println("Вывод задания №1:");
        if(checkSum(10,30)) {
           System.out.println("True");
       } else {
            System.out.println("False");
       }
        System.out.println();

        System.out.println("Вывод задания №2:");
        checkDigit(10);
        checkDigit(-7);
        System.out.println();

        System.out.println("Вывод задания №3:");
        if(checkDigitLog(10)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println();


        System.out.println("Вывод задания №4 (вариант 1):");
        stringMulti1("тестовая строка", 4);
        System.out.println();

        System.out.println("Вывод задания №4 (вариант 2):");
        stringMulti2("тестовая строка", 5);
        System.out.println();

        System.out.println("Вывод задания №5:");
        if(checkYear(400)) {
            System.out.println("Високосный");
        } else {
            System.out.println("Невисокосный");
        }
    }

    //1. Написать метод, принимающий на вход два целых числа и проверяющий,
    //что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    //в противном случае – false.

    public static boolean checkSum(int a,int b) {
        int sum = a + b;
        return sum>=10 && sum<=20;
    }

    //2. Написать метод, которому в качестве параметра передается целое число,
    //метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    //Замечание: ноль считаем положительным числом.

    public static void checkDigit(int a) {
        if(a < 0) {
            System.out.println("Отрицательное число");
        }
        else {
            System.out.println("Положительное число");
        }
    }

    //3. Написать метод, которому в качестве параметра передается целое число.
    //Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    public static boolean checkDigitLog(int a) {
        return a < 0;
    }


    //4. Написать метод, которому в качестве аргументов передается строка и число,
    //метод должен отпечатать в консоль указанную строку, указанное количество раз;

    public static void stringMulti1(String text , int a) {
        for (int i = 1; i<=a; i++ ) {
            System.out.println("" + text);
        }
    }

        //вариант 2 (потренироваться в выводе)

    public static void stringMulti2(String text , int a) {
        for (int i = 1; i<=a; i++ ) {
            System.out.println(+ i + ")" + text);
        }
    }

    //5.* Написать метод, который определяет, является ли год високосным,
    //и возвращает boolean (високосный - true, не високосный - false).
    //Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static boolean checkYear(int a) {
        return a % 4 == 0 && a % 100 != 0 || a % 400 == 0;
    }
}
