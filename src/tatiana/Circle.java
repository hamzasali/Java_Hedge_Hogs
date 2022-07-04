package tatiana;

//define a class called as Circle for the purpose of simple geometrical calculations.
public class Circle {

    //define two fields radius(necessary for all calculations)
    //and numberOfCircle(keep the info of how many object was created from this class).
    //decide the type of your variables (static or instance)

    private double radius;

    public static int numberOfCircle;
    public final static double pi;

    static {
        pi=3.14;
        numberOfCircle=0;
    }

    //create default and parameterized constructors
    //default constructor should increase the number of object when a new object created

    public Circle(){
        numberOfCircle++;

    }
    //parameterized constructor should increase the number of object when a new object created.
    public Circle(double radius) {
        this();
        setRadius(radius);
    }

    //and not allowed to initialize object with the radius value lower than Zero.

   //create getter and setter methods for radius.
    //getter

    //setter if the value of radius is lower than zero keep the previous value.



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<0){
            return;
        }
        this.radius = radius;
    }


    //do not allow any object to change value of static variable just get the current
    //value of numberOfCircle

    //calculate area of Circle

    public double area(){
        return pi * radius * radius;
    }



    //calculate perimeter of Circle

    public double perimeter(){
        return 2 * pi * radius;
    }


    public String toString() {
        return "Circle{" +
                ", radius=" + radius +
                ", area=" + area()+
                ", perimeter="+perimeter()+
                ", number of circle object="+numberOfCircle+
                ", pi=" +pi+
                '}';
    }
}
