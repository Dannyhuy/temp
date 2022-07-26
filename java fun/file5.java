import java.util.*;;
class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(){
        this.radius = 1.0;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area = 0;
        area = Math.PI*(this.radius*this.radius);
        return area;
    }

    public double getCircumference(){
        double cir = 0;
        cir = 2*Math.PI*this.radius;
        return cir;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
    
    
    
}
public class file5 {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.1);
        System.out.println(c1);
        Circle c2 = new Circle();
        System.out.println(c2);

        c1.setRadius(2.2);
        System.out.println(c1);
        System.out.println("Radius is: " + c1.getRadius());

        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());
    }
}
