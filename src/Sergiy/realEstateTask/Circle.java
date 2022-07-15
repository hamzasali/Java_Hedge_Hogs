package Sergiy.realEstateTask;

public class Circle extends Shape {

    private double radius;

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
    public double square() {
        return radius*radius*3.14;
    }


}
