package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double aLength, double aWidth) {
        super(aLength, aWidth);
    }

    @Override
    public void setLength(double aLength) {
        this.length = aLength;
    }

    @Override
    public void setWidth(double aWidth) {
        this.width = aWidth;
    }

    @Override
    public double getArea() {
        return this.getLength() * this.getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2 * this.getLength() + 2 * this.getWidth();
    }

}
