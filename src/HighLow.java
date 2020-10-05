import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int range = 100 - 1 + 1;
        int numberToGuess  = (int) ((Math.random() * range) + 1);

        while(true) {
            System.out.println("guess a number between 1 and 100");
            short userInput = Short.parseShort(scan.nextLine());
            if (userInput > numberToGuess) {
                System.out.println("LOWER");
            } else if (userInput < numberToGuess) {
                System.out.println("HIGHER");
            } else {
                System.out.println("GOOD GUESS");
                break;
            }
        }
    }
}
