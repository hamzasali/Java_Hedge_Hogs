package alena.propertyTask;

public class Rectangle extends PropertyList{

    private double side1, side2;

    public Rectangle(String name, double side1, double side2) {
        super(name);
        setSide1(side1);
        setSide2(side2);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    @Override
    public double area() {
        return side1*side2;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "")+
                "area='" + area() + '\'' +
                '}';
    }
}
