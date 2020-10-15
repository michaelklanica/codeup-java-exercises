package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        try {
            int num = input.getInt();

            System.out.println(num);
        } catch(NumberFormatException e) {
            System.out.println("Number format exception");
        }


    }

}
