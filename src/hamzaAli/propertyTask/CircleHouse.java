package hamzaAli.propertyTask;

public class CircleHouse extends Property {
    private double radius;

    private final static double PI = 3.14;

    public CircleHouse(String name, double radius) {
        super(name);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double getPI() {
        return PI;
    }

    public double area() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", radius=" + radius +
                '}';
    }
}
