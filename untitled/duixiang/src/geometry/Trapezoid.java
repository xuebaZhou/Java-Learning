package geometry;

//public class Trapezoid {
//    private double upperBase;
//    private double lowerBase;
//    private double height;
//
//    public Trapezoid(double upperBase, double lowerBase, double height) {
//        this.upperBase = upperBase;
//        this.lowerBase = lowerBase;
//        this.height = height;
//    }
//
//    public double getArea() {
//        return (upperBase + lowerBase) * height / 2;
//    }
//}
class Trapezoid {
    private double upperBase;
    private double lowerBase;
    private double height;
    private double area;

    public Trapezoid(double upperBase, double lowerBase, double height) {
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
        area = 0.5 * (upperBase + lowerBase) * height;
    }

    public double getArea() {
        return area;
    }
}