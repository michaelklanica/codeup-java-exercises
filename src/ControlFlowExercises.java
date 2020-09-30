import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("What number would you like to go up to? ");
            int number = sc.nextInt();
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int i = 1; i <= number; i++) {
                int square = (int) Math.pow(i, 2);
                int cube = (int) Math.pow(i, 3);
                System.out.format("%-7d| %-8d| %d\n", i, square, cube);
            }
            System.out.print("Would you like to continue? [y/n]");
            String response = sc.next();
            boolean confirm = response.equals("y");
            if (!confirm) {
                break;
            }
        }
    }
}
