package Sergiy.realEstateTask;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomerRequest {
    public static void main(String[] args) throws NoSuchFieldException {

        Shape square1 = new Square("SquareHouse-1", 20);
        Shape square2 = new Square("SquareHouse-2",25);
        Shape square3 = new Square("SquareHouse-3",30);
        Shape rectangle1 = new Rectangle("RectangleHouse-1",20, 30);
        Shape rectangle2 = new Rectangle("RectangleHouse-2",20, 25);
        Shape circle1 = new Circle("CircleHouse-1",15);
        Shape circle2 = new Circle("CircleHouse-2",20);
        Shape circle3 = new Circle("CircleHouse-3",10);

        ArrayList<Shape> shapes1 = new ArrayList<>(Arrays.asList(square1, square2, square3, rectangle1, rectangle2, circle1, circle2, circle3));

        System.out.println(list(shapes1));

    }
    public static ArrayList<String> list(ArrayList<Shape> shapes){
        ArrayList<String> propertyList = new ArrayList<>();

        for (Shape shape : shapes) {
            if(shape.square() >= 600){
                propertyList.add(shape.getName());
            }
        }
        return propertyList;
    }

}
