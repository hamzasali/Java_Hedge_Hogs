package mizgin;

//define a class called as Circle for the purpose of simple geometrical calculations.
public class Circle {
    private double radius1, radius2;
    public static double pi = 3.14;
    static int numberOfCircle;

    public Circle(){ //default constructor should increase the number of object when a new object created.
        numberOfCircle++;
    }

    public Circle(double radius) { //parameterized constructor should increase the number of object when a new object created.
        this();
        if (radius > 0) {
            this.radius1 = radius; //and not allowed to initialize object with the radius value lower than Zero.
        }
    }

    //create getter and setter methods for radius.
    public double getRadius() { //getter
        return radius1;
    }

    public void setRadius(double radius) { //setter if the value of radius is lower than zero keep the previous value.
            this.radius1 = radius;
    }

    public double calcArea(){ //calculate area of Circle
        return radius1 * radius1 * pi;
    }

    public double calcPerimeter(){ //calculate perimeter of Circle
        return 2 * radius1 * pi;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius1 +
                ", PI=" + pi +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }

}
//define two fields radius(necessary for all calculations)
//and numberOfCircle(keep the info of how many object was created from this class).
//decide the type of your variables (static or instance)

//create default and parameterized constructors

//do not allow any object to change value of static variable just get the current
//value of numberOfCircle
