package week_11;

public class Car {
    public static void main(String[] args) {

        Car car = new Car();

        Car.numberOfCars = 10;

    }

    public String made;
    public static int numberOfCars;
    public String color;


    public void printModifiedCar(){

        String color = "White";

        System.out.println(this.made + " is using " + color);
    }









}
