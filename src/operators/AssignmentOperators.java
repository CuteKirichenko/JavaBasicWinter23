package operators;

/**
 * Assignment operators.
 */
public class AssignmentOperators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int sum = 0;

        sum += num1; // equivalent to sum = sum + num1;
        System.out.println("sum after adding num1: " + sum);

        sum -= num2; // equivalent to sum = sum - num2;
        System.out.println("sum after subtracting num2: " + sum);

        sum *= num1; // equivalent to sum = sum * num1;
        System.out.println("sum after multiplying with num1: " + sum);

        sum /= num2; // equivalent to sum = sum / num2;
        System.out.println("sum after dividing by num2: " + sum);

        sum %= num1; // equivalent to sum = sum % num1;
        System.out.println("sum after finding remainder with num1: " + sum);
    }
}
