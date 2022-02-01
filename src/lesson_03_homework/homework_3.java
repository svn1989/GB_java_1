package lesson_03_homework;

public class homework_3 {

    public static void main(String[] args) {

        //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        //С помощью цикла и условия заменить 0 на 1, 1 на 0;

        System.out.println("Вывод задания №1:");
        int[] arr1 = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0};
        System.out.print("Массив до:    ");
        arrExport(arr1);
        System.out.println();
        System.out.print("Массив после: ");
        task1(arr1);
        System.out.println();
        System.out.println();

        //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        System.out.println("Вывод задания №2:");
        int[] arr2 = new int[100];
        task2(arr2);
        arrExport(arr2);
        System.out.println();
        System.out.println();

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2 в массиве;
        System.out.println("Вывод задания №3:");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Массив до:    ");
        arrExport(arr3);
        System.out.println();
        task3(arr3);
        System.out.print("Массив после: ");
        arrExport(arr3);
        System.out.println();
        System.out.println();

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        //и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
        //Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        System.out.println("Вывод задания №4:");
        int[][] arr4 = new int[5][5];
        task4(arr4);
        arrExport2(arr4);
        System.out.println();

        //5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
        System.out.println("Вывод задания №5:");
        arrExport(task5(10,7));
        System.out.println();
        System.out.println();

        //6. * Задать одномерный массив и найти в нем минимальный и максимальный значения элементов;
        System.out.println("Вывод задания №6:");
        int[] arr6 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        arrExport(arr6);
        System.out.println();
        System.out.println("\t Минимальное значение: " + task6Min(arr6));
        System.out.println("\t ММаксимальное значение: " + task6Max(arr6));
    }

    //    Вывод одномерного массива
    public static void arrExport(int[] Arr1) {
        for (int i = 0; i < Arr1.length; i++)
            System.out.print("\t" + Arr1[i] + " ");
    }

    //    Вывод двумерного массива
    public static void arrExport2(int[][] Arr1) {
        for (int i = 0; i < Arr1.length; i++) {
            for (int j = 0; j < Arr1.length; j++) {
                System.out.print("\t" + Arr1[i][j] + " ");
            }
            System.out.println();
        }
    }

    //    Для задания №1
    public static void task1(int[] Arr2) {
        for (int i = 0; i < Arr2.length; i++)
            if (Arr2[i] == 1) {
                Arr2[i] = 0;
            } else {
                Arr2[i] = 1;
            }
        for (int i = 0; i < Arr2.length; i++)
            System.out.print("\t" + Arr2[i] + " ");
    }

    //    Для задания №2
    public static void task2(int[] Arr3) {
        for (int i = 0; i < Arr3.length; i++)
            Arr3[i] = i + 1;
    }

    //    Для задания №3
    public static void task3(int[] array3) {
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6)
                array3[i] *= 2;
        }
    }

    //    Для задания №4
    public static void task4(int[][] array4) {
        int diag = array4.length -1;
        for (int i = 0; i < array4.length; i++) {
            array4[i][i] = 1;
            array4[i][diag - i] =1;
        }
    }

    //    Для задания №5
    public static int[] task5(int len,  int initialValue) {
        int[] arr5 = new int[len];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = initialValue;
        }
        return arr5;
    }

    //    Для задания №6
    public static int task6Min(int[] arr6) {
        int min = arr6[0];
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] < min) {
                min = arr6[i];
            }
        }
        return min;
    }

    public static int task6Max(int[] arr6) {
        int max = arr6[0];
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] > max) {
                max = arr6[i];
            }
        }
        return max;
    }

}
