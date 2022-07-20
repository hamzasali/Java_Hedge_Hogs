package week_13.houseTask;

import java.util.ArrayList;
import java.util.Arrays;

public class RealEstateApplication {

    public static void main(String[] args) {

        ArrayList<Properties> houses = new ArrayList<>(Arrays.asList(

                new SquareHouse("Square-1", 20),
                new SquareHouse("Square-2", 25),
                new SquareHouse("Square-3", 30),

                new RectangleHouse("Rectangle-1", 30, 20),
                new RectangleHouse("Rectangle-2", 25, 20),

                new CircleHouse("Circle-1", 15),
                new CircleHouse("Circle-2", 20),
                new CircleHouse("Circle-3", 10)));


        System.out.println(requestedProperties(600,houses));

    }


    public static ArrayList<Properties> requestedProperties(double minimumSquare, ArrayList<Properties> properties) {
        properties.removeIf(p -> p.getArea() < minimumSquare);
        return properties;
    }
}
