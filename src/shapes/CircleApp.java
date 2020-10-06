package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        double rad = input.getDouble(0, 10000);
        Circle circle = new Circle(rad);
        System.out.println("Circumference: " + circle.getCircumference());
        System.out.println("Area: " + circle.getArea());
    }
}
