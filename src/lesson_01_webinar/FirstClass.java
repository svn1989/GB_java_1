package lesson_01_webinar;

public class FirstClass {
    public static void main(String[] args) {
//        System.out.print("Hello world!");
//        System.out.println("Hello world!");
//        System.out.print("Hello world 2!");

//        //целые числа
//        byte myByte = 32; //1 byte <-128..+127>
//        short myShort = 132; //2 byte <-32768..+32767>
//        int myInteger = 52000; //4 bytes <-2.1mlrd..+2.1mlrd> DEFAULT
//        long myLong = 300000000000L; //8 bytes <-2^63..+2^63>
//
//        //дробные числа
//        float myFloat = 15.867f; // 4 bytes <>.00000000
//        double myDouble = 15.867; //8 bytes <>.00000000000000 DEFAULT
//
//        //символы
//        char myChar = 'q'; //2 bytes, ASCII, UTF-..
//
//        //логический тип
//        boolean myBooleanTrue = true;
//        boolean myBooleanFalse = false;
//
//        String myString = "myString123";
//
//        System.out.println(myInteger);
//        System.out.println(myChar);
//        System.out.println(myBooleanTrue);
//
//        //конкатенация строк
//        System.out.println(myString + myBooleanFalse);
//        System.out.println(myShort + (myInteger + myString));
//        System.out.println("Result: " + (myShort + myInteger));

//        int abc = 210;

//        if (abc > 200) {
//            System.out.println("All OK! abc > 200");
//        } else {
//            System.out.println("Bad! abc < 200");
//        }

//        if (abc > 200) {
//            System.out.println("All OK! abc > 200");
//        }

//        if (abc > 200) {
//            System.out.println("All OK! abc > 200");
//        } else if (abc == 210) {
//            System.out.println("abc == 210");
//        } else {
//            System.out.println("Bad! abc < 200");
//        }

        //Простейщие матем.операции
        //+,-,/,*,^

//        int a = 10;
//        float b = 8;
//        System.out.println("Result " + (a / b));

//        goToShop1();
//        System.out.println("*************");
//        int a = goToShop2(); //800
//        System.out.println(a);
//        System.out.println("*************");
//        System.out.println(goToShop2());

        greetingUser("Hello","Alex", 45, "89000000000");
        greetingUser("Greetings","Boris", 25, "89000000001");

        int result1 = summa(45, 90);
        int result2 = summa(145, 55);


        System.out.println(result1);
        System.out.println(result2);

    }

    public static void doSomething() {
        System.out.println("hello");
    }

//    public static void goToShop1() {
//        System.out.println("Go out home");
//        System.out.println("Go to shop");
//        System.out.println("Choose something goods");
//        System.out.println("Buy this goods");
//        System.out.println("Go to home");
//        int a = 100;
//        int b = 140;
//        System.out.println(a+b);
//    }
//
//    public static int goToShop2() {
//        int cash = 1000;
//        System.out.println("Go out home");
//        System.out.println("Go to shop");
//        System.out.println("Choose something goods");
//        System.out.println("Buy this goods");
//        cash = cash - 200;
//        System.out.println("Go to home");
//        return cash;
//    }

    public static void greetingUser(String welcomeSms, String username, int age, String phone) {
        System.out.println(welcomeSms + " user, " + username + ". Your age is " + age + ". Your mobile is " + phone);
    }

    public static int summa(int a, int b) {
        return a + b;
    }

}
