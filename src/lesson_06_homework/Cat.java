package lesson_06_homework;

public class Cat extends Animal {

    public static int countCat = 0;
    public static String typeThisClass = "Кот";

    Cat(String name, int maxRun, int  maxSwim) {
        super(typeThisClass, name, maxRun, maxSwim);
        ++countCat;
    }

    @Override
    protected int swim(float distance) {
        return Animal.SWIM_NONE;
    }

}
