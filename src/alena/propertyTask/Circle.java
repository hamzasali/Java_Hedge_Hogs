package alena.propertyTask;

public class Circle extends PropertyList {

    private double radius;
    private final static double Pi;

    static{
        Pi=3.14;
    }

    public Circle(String name, double radius) {
        super(name);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*Pi;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "")+
                "area='" + area() + '\'' +
                '}';
    }
}
