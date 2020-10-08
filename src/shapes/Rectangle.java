package shapes;

public class Rectangle {

    protected double length;
    protected double width;

    public Rectangle(double aLength, double aWidth) {
        this.length = aLength;
        this.width = aWidth;
    }

    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }



}
