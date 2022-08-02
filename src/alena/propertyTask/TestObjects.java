package alena.propertyTask;

import java.util.ArrayList;

public class TestObjects {
    public static void main(String[] args) {

        ArrayList<PropertyList> properties=new ArrayList<>();
        properties.add(new Square("SquareHouse1", 20));
        properties.add(new Square("SquareHouse2", 25));
        properties.add(new Square("SquareHouse3", 30));

        properties.add(new Rectangle("RectangleHouse1", 20, 30));
        properties.add(new Rectangle("RectangleHouse2", 20, 25));

        properties.add(new Circle("CircleHouse1", 15));
        properties.add(new Circle("CircleHouse1", 20));
        properties.add(new Circle("CircleHouse1", 10));

        System.out.println("--------------------------------");

        int minSquare=600;

        System.out.println(request(properties, minSquare));

    }

    public static ArrayList<String> request(ArrayList<PropertyList> properties, int minSquare){
/*
        ArrayList<PropertyList> result=new ArrayList<>();

        for (PropertyList each : properties) {
            if(each.area()>=minSquare){
                result.add(each);
            }
        }

 */

        properties.removeIf(each->each.area()<minSquare);

        ArrayList<String> names=new ArrayList<>();

        for (PropertyList each : properties) {
            names.add(each.getName());
        }

        return names;
    }


}
