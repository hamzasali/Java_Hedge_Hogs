package hamzaAli.propertyTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        ArrayList<Property> list = new ArrayList<>();

        // using loop to add the property to list
        /*Scanner input = new Scanner(System.in);
        System.out.println("Add 3 circle properties");
        for (int i = 0; i < 3; i++) {
            System.out.println(i + 1 + ".");
            CircleHouse circle = new CircleHouse(input.nextDouble());
            list.add(circle);
        }
        System.out.println("Add 3 Square properties");
        for (int i = 0; i < 3; i++) {
            System.out.println(i + 1 + ".");
            SquareHouse square = new SquareHouse(input.nextDouble());
            list.add(square);
        }
        System.out.println("Add 3 Rectangle properties");
        for (int i = 0; i < 3; i++) {
            System.out.println(i + 1 + ".");
            RectangleHouse rectangle = new RectangleHouse(input.nextDouble(), input.nextDouble());
            list.add(rectangle);
        }*/

        // creating the objs and then add them into list
        /*SquareHouse squareHouse1 = new SquareHouse(5);
        SquareHouse squareHouse2 = new SquareHouse(15);
        SquareHouse squareHouse3 = new SquareHouse(52);

        CircleHouse circleHouse1 = new CircleHouse(10);
        CircleHouse circleHouse2 = new CircleHouse(15);
        CircleHouse circleHouse3 = new CircleHouse(20);

        RectangleHouse rectangleHouse1 = new RectangleHouse(10, 15);
        RectangleHouse rectangleHouse2 = new RectangleHouse(13, 25);
        RectangleHouse rectangleHouse3 = new RectangleHouse(19, 5);

        list.addAll(Arrays.asList(squareHouse1, squareHouse2, squareHouse3,
                circleHouse1, circleHouse2, circleHouse3,
                rectangleHouse1, rectangleHouse2, rectangleHouse3));

        System.out.println(matching(list));*/

        // created Array with all the objs inside then converting into ArrayList
        Property[] properties = {new SquareHouse(5), new SquareHouse(15), new SquareHouse(52),
                new CircleHouse(10), new CircleHouse(15), new CircleHouse(20),
                new RectangleHouse(10, 15), new RectangleHouse(13, 25),
                new RectangleHouse(19, 5)};

        System.out.println(Arrays.toString(properties));

        list.addAll(Arrays.asList(properties));

        System.out.println(matching(list));

    }

    public static ArrayList<Property> matching(ArrayList<Property> list) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the requested space");
        double request = scanner.nextDouble();

        ArrayList<Property> match = new ArrayList<>();
        for (Property each : list) {
            if (each.area() >= request) {
                match.add(each);
            }
        }
        return match;
    }


}
