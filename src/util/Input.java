package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.print("Enter a string: ");
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Enter yes or no");
        String input = this.scanner.nextLine();
        return input.trim().toLowerCase().equals("yes");
    }

    public int getInt(int min, int max) {
        while (true) {
            System.out.printf("Enter a number between %d and %d: ", min, max);
            String input = scanner.nextLine();
            int num = Integer.parseInt(input);
            if (num >= min && num <= max) {
                return num;
            }
        }
    }

    public int getInt() {
        String input = scanner.nextLine();
        return Integer.parseInt(input);
    }

    public double getDouble(double min, double max) {
        while (true) {
            System.out.printf("Enter and double between %f and %f", min, max);
            String input = scanner.nextLine();
            double num = Double.parseDouble(input);
            if (num >= min && num <= max) {
                return num;
            }
        }
    }

    public double getDouble() {
        String input = scanner.nextLine();
        return Double.parseDouble(input);
    }


}
