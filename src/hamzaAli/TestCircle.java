package hamzaAli;

public class TestCircle {
    public static void main(String[] args) {

        Circle circle1 = new Circle();

        circle1.setRadius(2);

        System.out.println(circle1.calcArea());

        Circle circle2 = new Circle(6);

        System.out.println(circle2.calcPerimeter());

    }
}
