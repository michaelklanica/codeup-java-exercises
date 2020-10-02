import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        System.out.println(addNums(3, 5));
        System.out.println(subNums(4, 6));
        System.out.println(multNums(3, 3));
        System.out.println(divNums(2, 1));
        System.out.println(modNums(2, 1));

        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.println("userInput: " + userInput);

    }

    public static long addNums(long num1, long num2) {
        return num1 + num2;
    }

    public static long subNums(long num1, long num2) {
        return num1 - num2;
    }

    public static long multNums(long num1, long num2) {
        return num1 * num2;
    }

    public static long divNums(long num1, long num2) {
        return num1 / num2;
    }

    public static long modNums(long num1, long num2) {
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if (input > max || input < min) {
            System.out.println("input: " + input);
            return getInteger(min, max);
        } else {
            System.out.println("input: " + input);
            return input;
        }
    }
}
