package shapes;

public class Square extends Rectangle{

    protected double side;

    public Square(double aSide) {
        super(aSide, aSide);
        this.side = aSide;
    }

    public double getArea(){
        return this.side * this.side;
    }

    public double getPerimeter() {
        return this.side * 4;
    }



}
