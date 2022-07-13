package alena.propertyTask;

public class Square extends PropertyList{

    private double side;

    public Square(String name, double side) {
        super(name);
        setSide(side);
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "")+
                "area='" + area() + '\'' +
                '}';
    }
}
