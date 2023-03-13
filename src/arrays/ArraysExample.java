package arrays;

import java.util.Arrays;

/**
 * Arrays examples, sorting examples
 */
public class ArraysExample {
    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4};
        System.out.println(intArray.length);
        System.out.println(Arrays.toString(intArray));
        System.out.println(intArray[2]);

        System.out.println("-------------------");
        int[] intArrayDuplicate = Arrays.copyOf(intArray, intArray.length);
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(intArrayDuplicate));
        System.out.println("-------------------");

        //Array copy
        int[] arraySource = {1, 2, 3, 4, 5, 6};
        System.out.println(arraySource.length);
        int[] arrayDestination = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.arraycopy(arraySource, 0, arrayDestination, 0, arraySource.length);
        System.out.println(Arrays.toString(arrayDestination));

        //Defaults
        System.out.println("-------------------");
        int[] array = new int[10];
        String[] strArr = new String[10];
        String[] strArrNullStr = new String[]{"nulljerfhl", "nullffefcef", "nullfec", "null", "null", "null", "null", "null", "null", "null"};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(strArrNullStr));
        char[] arrayChars = new char[5];
        System.out.println(Arrays.toString(arrayChars));
        boolean[] arrayBooleans = new boolean[5];
        System.out.println(Arrays.toString(arrayBooleans));

        //for
        System.out.println("-------------------");
        System.out.println("Код перед циклом");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Код после цикла");

        //for in other for
        for (int d = 1; d < 5; d++) {
            System.out.println("Внешний цикл итерация " + d + ": ");
            for (int g = 0; g < 5; g++) {
                System.out.println("Внутренний цикл итерация " + g + ": ");
            }
        }

        //foreach
        System.out.println("---------------------------");
        String[] names = {"Tetiana", "Anna", "Iryna", "Oleh", "Pavlo", "Artem"};
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("------------------");

        //while
        int v = 0;
        while (v < 10) {
            System.out.println(v);
            v += 5;
        }

        //do while
        System.out.println("---------");
        int f = 0;
        int b = 2;

        do {
            System.out.println("Привет!");
            f++;
        } while (f < b);

        //break
        System.out.println("--------");
        for (int d = 1; d < 4; d++) {
            System.out.println("Внешний цикл итерация " + d + ": ");
            for (int g = 0; g < 100; g++) {
                if (g == 5) {
                    break;
                } // выходим из цикла, если g равно 5
                System.out.println("Внутренний цикл итерация " + g + ": ");
            }
        }
        System.out.println("Циклы завершены");

        //continue
        System.out.println("-------");
        for (int x = 1; x <= 7; x++) {
            System.out.println(x + ": перед continue");
            if (x > 2) {
                continue;
            }
            System.out.println("     " + x + ": после continue");
        }
    }
}
