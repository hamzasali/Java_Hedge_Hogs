package hamzaAli;

//define a class called as Circle for the purpose of simple geometrical calculations.
public class Circle {

    //define two fields radius(necessary for all calculations)
    //and numberOfCircle(keep the info of how many object was created from this class).
    //decide the type of your variables (static or instance)

    private double radius;
    private int numberOfCircles;

    private static double pi = 3.14;

    //create default and parameterized constructors
    //default constructor should increase the number of object when a new object created

    public Circle() {
    }


    //parameterized constructor should increase the number of object when a new object created.
    //and not allowed to initialize object with the radius value lower than Zero.

    public Circle(double radius) {
        setRadius(radius);
    }


    //create getter and setter methods for radius.
    //getter

    public double getRadius() {
        return radius;
    }


    //setter if the value of radius is lower than zero keep the previous value.

    public void setRadius(double radius) {
        if (radius < 0) {
            radius = this.radius;
        }
        this.radius = radius;
    }


    //do not allow any object to change value of static variable just get the current
    //value of numberOfCircle


    //calculate area of Circle

    public double calcArea() {
        return pi * (radius * radius);
    }

    //calculate perimeter of Circle

    public double calcPerimeter() {
        return 2 * pi * radius;
    }

}
