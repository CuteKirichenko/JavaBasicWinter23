package operators;


/**
 * Logical operators.
 */
public class LogicalOperators {
    public static void main(String[] args) {

        //AND
        System.out.println("---------------------------");
        int a = -5;
        int b = 7;
        if (a > 0 && b > 0) {
            System.out.println("Both a and b are positive numbers");
        }

        //OR
        System.out.println("---------------------------");
        int c = -5, d = -7;
        if (c > 0 || d > 0) {
            System.out.println("At least one of c and d is a positive number");
        }

        //NOT
        System.out.println("---------------------------");
        int k = 5, l = -7;
        if (!(k > 0 && l > 0)) {
            System.out.println("Either k or l or both are not positive numbers");
        }

        if (!true) {
            System.out.println("Print sth");
        }

        System.out.println("---------------------------");
        boolean isStudent = true;
        int age = 16;

        System.out.println("isStudent && age > 18: " + (isStudent && age > 18));
        System.out.println("isStudent || age > 18: " + (isStudent || age > 18));
        System.out.println("!isStudent: " + (!isStudent));
    }
}
