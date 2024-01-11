package geometry;

//public class Test {
//    public static void main(String[] args) {
//        Triangle triangle = new Triangle(3, 4, 5);
//        if (triangle.isValidTriangle()) {
//            System.out.println("Triangle perimeter: " + triangle.getPerimeter());
//            System.out.println("Triangle area: " + triangle.getArea());
//        } else {
//            System.out.println("Invalid triangle!");
//        }
//
//        Trapezoid trapezoid = new Trapezoid(4, 6, 3);
//        System.out.println("Trapezoid area: " + trapezoid.getArea());
//
//        Circle circle = new Circle(5);
//        System.out.println("Circle perimeter: " + circle.getPerimeter());
//        System.out.println("Circle area: " + circle.getArea());
//
//        // 获取Triangle的边长
//        System.out.println("Triangle side A: " + triangle.getSideA());
//        System.out.println("Triangle side B: " + triangle.getSideB());
//        System.out.println("Triangle side C: " + triangle.getSideC());
//    }
//}

public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        Trapezoid trapezoid = new Trapezoid(6.0, 8.0, 5.0);
        Circle circle = new Circle(4.0);

        if (triangle.isTriangle) {
            System.out.println("Triangle:");
            System.out.println("Side A: " + triangle.getSideA());
            System.out.println("Side B: " + triangle.getSideB());
            System.out.println("Side C: " + triangle.getSideC());
            System.out.println("Perimeter: " + triangle.getPerimeter());
            System.out.println("Area: " + triangle.getArea());
        } else {
            System.out.println("Invalid triangle!");
        }

        System.out.println("Trapezoid:");
        System.out.println("Area: " + trapezoid.getArea());

        System.out.println("Circle:");
        System.out.println("Circumference: " + circle.getCircumference());
        System.out.println("Area: " + circle.getArea());
    }
}
