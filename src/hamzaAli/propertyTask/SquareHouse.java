package hamzaAli.propertyTask;

public class SquareHouse extends Property {
    private double side;

    public SquareHouse(double side) {

        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double area() {
        return side * side;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", side=" + side +
                '}';
    }


}
