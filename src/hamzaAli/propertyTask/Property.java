package hamzaAli.propertyTask;

import java.util.ArrayList;

public abstract class Property {
    private String name;

    public Property() {
        setName(getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double area();

    @Override
    public String toString() {
        return "Property{" +
                "name='" + name + '\'' +
                ", area='" + area() +
                '}';
    }

}
