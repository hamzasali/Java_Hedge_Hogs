package week_13.houseTask;

public class RectangleHouse extends Properties {

    private double length;
    private double width;


    public RectangleHouse(String name, double length, double width) {
        super(name);
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {

        if (length < 0) {
            throw new IllegalArgumentException("Length can not be " + length);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            throw new IllegalArgumentException("Width can not be " + width);
        }
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * length;
    }
}
