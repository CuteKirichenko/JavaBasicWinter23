package operators;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Arithmetical operators.
 */
public class ArithmeticalOperators {
    public static void main(String[] args) {
        // +
        int a = 10;
        int b = 7;
        int c = a + b;  // 17
        int d = 4 + b;  // 11

        //-
        int aa = 10;
        int bb = 7;
        int cc = aa - bb;  // 3
        int dd = 4 - aa;  // -6

        // *
        int aaa = 10;
        int bbb = 7;
        int ccc = aaa * bbb;  // 70
        int ddd = bbb * 5;  // 35

        // /
        int aaaa = 20;
        int bbbb = 5;
        int cccc = aaaa / bbbb;  // 4
        double dddd = 22.5 / 4.5;  // 5.0

        System.out.println("---------DIVIDE INT NUMBERS INTO DOUBLE NOT CORRECT----------");
        /*При делении стоит учитывать,
        что если в операции участвуют два целых числа,
        то результат деления будет округляться до целого числа,
        даже если результат присваивается переменной float или double:
         */
        double k = 10 / 4;    // 2
        System.out.println(k);

        System.out.println("---------DIVIDE INT NUMBERS INTO DOUBLE CORRECT----------");
        //Чтобы результат представлял число с плавающей точкой,
        // один из операндов также должен представлять число с плавающей точкой:
        double kk = 10.0 / 4;    // 2.5
        System.out.println(kk);

        System.out.println("--------- % ----------");
        //%получение остатка от деления двух чисел:
        int ad = 33;
        int bd = 5;
        int cd = ad % bd;
        int da = 22 % 4;
        System.out.println(cd);  // 3
        System.out.println(da);  // 2 (22 - 4*5 = 2)

        /*Также есть две унарные арифметические операции,
        которые производятся над одним числом: ++ (инкремент) и -- (декремент).
        Каждая из операций имеет две разновидности: префиксная и постфиксная

        ++ (префиксный инкремент)
        Предполагает увеличение переменной на единицу,
        например, bpri=++apri (вначале значение переменной apri увеличивается на 1,
        а затем ее значение присваивается переменной bpri)*/
        System.out.println("--------- ++NUM ----------");
        int apri = 8;
        int bpri = ++apri;
        int epri = bpri + 2;
        System.out.println(apri);  // 9
        System.out.println(bpri);  // 9
        System.out.println(epri);  // 11

        /* ++ (постфиксный инкремент)
        Также представляет увеличение переменной на единицу,
        например, yposti=xposti++ (вначале значение переменной xposti присваивается переменной yposti,
        а потом значение переменной xposti увеличивается на 1)*/
        System.out.println("--------- NUM++ ----------");
        int xposti = 8;
        int yposti = xposti++;
        int r = yposti + 2;
        int s = xposti + 2;
        System.out.println(xposti); // 9
        System.out.println(yposti); // 8
        System.out.println(r); // 10
        System.out.println(s); // 11


        /*декремент
        уменьшение переменной на единицу,
        например, bprd=--aprd (вначале значение переменной aprd уменьшается на 1,
        а потом ее значение присваивается переменной bprd)*/
        System.out.println("--------- --NUM ----------");
        int aprd = 8;
        int bprd = --aprd;
        System.out.println(aprd);  // 7
        System.out.println(bprd);  // 7


        /* -- (постфиксный декремент)
        br=ad-- (сначала значение переменной ad присваивается переменной br,
        а затем значение переменной ad уменьшается на 1)*/
        System.out.println("--------- NUM-- ----------");
        int apostd = 8;
        int bpostd = apostd--;
        int t = bpostd + 2;
        System.out.println(apostd);  // 7
        System.out.println(bpostd);  // 8
        System.out.println(t);  // 10


        System.out.println("---------BIG DECIMAL----------");
        //Следует отметить, что числа с плавающей точкой не подходят для финансовых и других вычислений,
        // где ошибки при округлении могут быть критичными. Например:

        double doubleNum = 2.0 - 1.1;
        System.out.println("---------DOUBLE NOT CORRECT----------");
        System.out.println(doubleNum); // 0.8999999999999999

        BigDecimal number1 = BigDecimal.valueOf(2.0);
        BigDecimal number2 = BigDecimal.valueOf(1.1);
        System.out.println("---------BIG DECIMAL CORRECT----------");
        System.out.println(number1.subtract(number2)); //0.9

        System.out.println("---------BIG DECIMAL FROM STRING----------");
        BigDecimal numberFromString = new BigDecimal("2.0");
        System.out.println(numberFromString); //2.0

        System.out.println("----------ROUNDED-----------");
        BigDecimal num = new BigDecimal("3.145");
        BigDecimal roundedHalfUp = num.setScale(2, RoundingMode.HALF_UP); //3.15
        BigDecimal roundedHalfDown = num.setScale(2, RoundingMode.HALF_DOWN); //3.14
        BigDecimal roundedUp = num.setScale(2, RoundingMode.UP); //3.15
        BigDecimal roundedDown = num.setScale(2, RoundingMode.DOWN); //3.14
        System.out.println(roundedHalfUp);
        System.out.println(roundedHalfDown);
        System.out.println(roundedUp);
        System.out.println(roundedDown);

        System.out.println("---------------COMPARE--------------");
        BigDecimal num1 = new BigDecimal("5.6");
        BigDecimal num2 = new BigDecimal("5.6");

        int resultComparing = num1.compareTo(num2);
        System.out.println(resultComparing); // 1 - bigger, -1 smaller, 0 - equal

        System.out.println("---------------OTHER TYPES--------------");
        double doubleValue = num.doubleValue(); // d = 3.145
        int intValue = num.intValue(); // i = 3
        long longValue = num.longValue(); // l = 3

        System.out.println(doubleValue);
        System.out.println(intValue);
        System.out.println(longValue);
    }
}
