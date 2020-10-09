package shapes;

public class Square extends Rectangle{

    public Square(double aSide) {
        super(aSide, aSide);
    }

    @Override
    public double getArea(){
        System.out.println("square");
        // use 'length' because all sides are same, and aSide is associated with length and width.
        return Math.pow(this.length, 2);
    }

    @Override
    public double getPerimeter() {
        System.out.println("square");
        return this.width * 4;
    }



}
