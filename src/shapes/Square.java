package shapes;

public class Square extends Quadrilateral {

    public Square(double aSide) {
        super(aSide, aSide);
    }

    @Override
    public void setLength(double aLength) {
        this.length = aLength;
        this.width = aLength;
    }

    @Override
    public void setWidth(double aWidth) {
        this.width = aWidth;
        this.length = aWidth;
    }

    @Override
    public double getPerimeter() {
        return this.getLength() * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(this.getLength(), 2);
    }

}
