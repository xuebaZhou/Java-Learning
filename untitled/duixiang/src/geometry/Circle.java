package geometry;

//public class Circle {
//    private double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    public double getPerimeter() {
//        return 2 * Math.PI * radius;
//    }
//
//    public double getArea() {
//        return Math.PI * radius * radius;
//    }
//}
class Circle {
    private double radius;
    private double circumference;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
        circumference = 2 * Math.PI * radius;
        area = Math.PI * radius * radius;
    }

    public double getCircumference() {
        return circumference;
    }

    public double getArea() {
        return area;
    }
}
