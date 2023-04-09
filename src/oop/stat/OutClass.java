package oop.stat;

public class OutClass {
    int d;

    // вкладений статичний клас
    static class InClass {
        int d;

        // вкладений статичний клас у статичному охоплюючому класі InClass
        static class InClass2 {
            int d2;
        }
    }
}
