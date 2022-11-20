public class Circle {

    private final double PI = 3.141519;
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double computeArea(){
        return PI * Math.pow((radius / 2), 2);
    }

}
