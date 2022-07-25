package week_13.houseTask;

public class SquareHouse extends Properties{

    private double side;

    public SquareHouse(String name, double side) {
        super(name);
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {

        if (side<0){
            throw new IllegalArgumentException("Side can not be " + side);
        }
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }
}
