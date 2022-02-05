package lesson_06_homework;

public class Dog extends Animal {

    public static int countDog = 0;
    public static String typeThisClass = "Пес";

    Dog(String name, int  maxRun, int  maxSwim) {
        super(typeThisClass, name, maxRun, maxSwim);
        ++countDog;
    }



}
