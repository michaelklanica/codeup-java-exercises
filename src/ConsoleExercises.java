import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        // Exercise 1
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f\n", pi);

        // Exercise 2
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        int userInput = scanner.nextInt();
        System.out.printf("You entered %s.\n", userInput);

        // Exercise 3
        System.out.print("Enter three words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.printf("You entered %s %s %s\n", word1, word2, word3);
        scanner.nextLine();     // This 'nextLine' captures the ENTER key; 'next' will only look for the next token--by
                                // default the token is a space.

        // Exercise 4
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.printf("%s is interesting.\n", sentence);

        // Exercise 5
        System.out.println("enter a length");
        int length2 = Integer.parseInt(scanner.nextLine());
        System.out.println("enter a width");
        int width2 = Integer.parseInt(scanner.nextLine());
        int perimeter2 = (length2 * 2) + (width2 * 2);
        System.out.printf("The perimeter is %d", perimeter2);
    }
}
