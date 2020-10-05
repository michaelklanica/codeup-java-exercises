import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean repeat;

        System.out.println(addNums(3, 5));
        System.out.println(subNums(4, 6));
        System.out.println(multNums(3, 3));
        System.out.println(divNums(2, 1));
        System.out.println(modNums(2, 1));

        do {
            int userInput = getInteger(1, 10);
            long answer = factorial(userInput);

            System.out.printf("%d! = %d\n", userInput, answer);
            System.out.print("Would you like to continue? [y/n] ");
            String response = input.nextLine();
            repeat = response.equalsIgnoreCase("y");
        } while (repeat);

        rollDice(input);

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
        System.out.print("Enter a number between 1 and 10: ");
        int input = scan.nextInt();
        if (input > max || input < min) {
            System.out.println("input: " + input);
            return getInteger(min, max);
        } else {
            System.out.println("input: " + input);
            return input;
        }
    }

    public static long factorial(int number) {
        if (number == 0) {
            return 1L;
        }
        long total = 1;
        for (int i = number; i > 1; i--) {
            System.out.println("total = " + total + " * " + i);
            total *= i;
        }
        return total;
    }

    public static void randomize(short sides) {
        System.out.println( (int) Math.floor(Math.random() * sides));
    }

    public static void rollDice (Scanner input){
        while(true) {
            System.out.println("Number of sides: ");
            short sides = Short.parseShort(input.nextLine());
            randomize(sides);
            System.out.println("Do you want to continue [y/n]?");
            if (input.nextLine().equalsIgnoreCase("n")) {
                break;
            }


        }
    }

}


