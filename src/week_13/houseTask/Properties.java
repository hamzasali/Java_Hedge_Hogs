package week_13.houseTask;

public abstract class Properties {

    private String name;

    public Properties(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                "area='" + getArea() + '\'' +
                '}';
    }
}
