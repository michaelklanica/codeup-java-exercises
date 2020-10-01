import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Say something to Bob.");
        String tellBob = sc.nextLine();
        if (tellBob.isEmpty()) {
            System.out.println("Bob says, \"Fine. Be that way!\"");
        } else if (tellBob.endsWith("?")) {
            System.out.println("Bob says, \"Sure.\"");
        } else if (tellBob.endsWith("!")) {
            System.out.println("Bob says, \"Whoa, chill out!\"");
        } else {
            System.out.println("Bob says, \"Whatever.\"");
        }
    }
}
