import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a grade from 0 to 100: ");
            int grade = sc.nextInt();
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid Grade");
            } else if (grade <= 100 && grade >= 88) {
                System.out.println("A");
            } else if (grade <= 87 && grade >= 80) {
                System.out.println("B");
            } else if (grade <= 79 && grade >= 67) {
                System.out.println("C");
            } else if (grade <= 66 && grade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
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
