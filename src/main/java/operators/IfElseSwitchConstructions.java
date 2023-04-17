package operators;

/**
 * If-Else, switch-case.
 */
public class IfElseSwitchConstructions {
    public static void main(String[] args) {
        //if else
        int number = 7;

        if (number % 2 == 0) {
            if (number > 0) {
                System.out.println("number is positive");
            } else {
                System.out.println("number is negative");
            }
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

        System.out.println("------------------");
        //if else if
        int num = 3;

        if (num > 0) {
            System.out.println("The number is positive");
        } else if (num < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }

        //The ternary operator is a shorthand version of an if-else
        int num1 = 10;
        int num2 = 5;

        int maxNum = (num1 > num2) ? num1 : num2;

        int result;

        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }

        System.out.println("The maximum number is: " + result);
        System.out.println("The maximum number is: " + maxNum);

        //switch case

        //int
        int dayOfWeek = 1;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day of week");
                break;
        }

        //char
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Poor");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
                break;
        }

        //String
        String color = "red";
        switch (color) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Slow down");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid color");
                break;
        }
    }
}
