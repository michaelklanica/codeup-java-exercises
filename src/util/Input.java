package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {

        this.scanner = new Scanner(System.in);

    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("enter 'yes' or 'no'");
        String input = this.scanner.nextLine();
        return input.trim().toLowerCase().equals("no");
    }

    public int getInt(int min, int max, String prompt) {
        while (true) {
            System.out.printf(prompt);
            int num;
            try {
                String input = scanner.nextLine();
                num = Integer.parseInt(input);
            } catch (RuntimeException re) {
                System.out.println("Enter an integer");
                return getInt(min, max, prompt);
            }
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
