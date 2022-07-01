package sabina;

//define a class called as Circle for the purpose of simple geometrical calculations.
public class Circle {

    private double radius;
    public static double pi;
    public static int numberOfCircle;


    static{
        numberOfCircle = 0;
        pi = 3.14;
    }

    public Circle(){
        numberOfCircle ++;
    }

    public Circle(double radius) {
        setRadius(radius);
        numberOfCircle ++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius < 0){
            radius = this.radius;

        }
        this.radius = radius;
    }


    public double calcArea(){
        return radius * radius * pi;
    }

    public double calcPerimeter(){
        return 2 * radius * pi;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public static int countCircle (){
        return numberOfCircle;

    }



    //testing:
    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 = new Circle(10.0);
        System.out.println(circle1);

        System.out.println(Circle.countCircle());  // 2



    }
    //define two fields radius(necessary for all calculations)
    //and numberOfCircle(keep the info of how many object was created from this class).
    //decide the type of your variables (static or instance)


    //create default and parameterized constructors
    //default constructor should increase the number of object when a new object created


    //parameterized constructor should increase the number of object when a new object created.
    //and not allowed to initialize object with the radius value lower than Zero.


    //create getter and setter methods for radius.
    //getter





    //setter if the value of radius is lower than zero keep the previous value.


    //do not allow any object to change value of static variable just get the current value of numberOfCircle





    //calculate area of Circle





    //calculate perimeter of Circle

}
