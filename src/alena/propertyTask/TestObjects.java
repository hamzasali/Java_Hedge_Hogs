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

        int budgetAmount=600;

        System.out.println(request(properties, budgetAmount));

    }

    public static ArrayList<PropertyList> request(ArrayList<PropertyList> properties, int budgetAmount){

        ArrayList<PropertyList> result=new ArrayList<>();

        for (PropertyList each : properties) {
            if(each.area()>=budgetAmount){
                result.add(each);
            }
        }
        return result;
    }
}
