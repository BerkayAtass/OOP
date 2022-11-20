public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle(2);
        Circle circle2 = new Circle(10.546);
        Circle circle3 = new Circle(175.00);

        Circle[] circles = {circle1,circle2,circle3};

        for (Circle circle : circles) {
            System.out.println("Circle are is " + circle.computeArea());
        }
    }
}