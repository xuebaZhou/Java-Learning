package geometry;

import java.lang.Math;

//public class Triangle {
//    private double sideA;
//    private double sideB;
//    private double sideC;
//
//    public Triangle(double sideA, double sideB, double sideC) {
//        this.sideA = sideA;
//        this.sideB = sideB;
//        this.sideC = sideC;
//    }
//
//    public boolean isValidTriangle() {
//        return sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
//    }
//
//    public void setSideA(double sideA) {
//        this.sideA = sideA;
//    }
//
//    public void setSideB(double sideB) {
//        this.sideB = sideB;
//    }
//
//    public void setSideC(double sideC) {
//        this.sideC = sideC;
//    }
//
//    public double getPerimeter() {
//        return sideA + sideB + sideC;
//    }
//
//    public double getArea() {
//        double semiPerimeter = getPerimeter() / 2;
//        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
//    }
//
//    public double getSideA() {
//        return sideA;
//    }
//
//    public double getSideB() {
//        return sideB;
//    }
//
//    public double getSideC() {
//        return sideC;
//    }
//}

class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private double perimeter;
    private double area;
    boolean isTriangle;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        isTriangle = isTriangle(sideA, sideB, sideC);
        if (isTriangle) {
            perimeter = sideA + sideB + sideC;
            double s = perimeter / 2;
            area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        }
    }

    public boolean isTriangle(double sideA, double sideB, double sideC) {
        return sideA + sideB > sideC && sideA + sideC >  sideB &&  sideB+ sideC > sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

}






