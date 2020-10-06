package util;


import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        if (input.yesNo()) {
            System.out.println("This is true");
        } else {
            System.out.println("Thios is false");
        }

        System.out.println(input.getInt(120, 350));

    }
}
