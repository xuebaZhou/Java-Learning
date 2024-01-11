package graph;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle1;
        rectangle1=new Rectangle(4.5,2.0);  // 对象的实例化
        double length= rectangle1.length;
        double width= rectangle1.width;
        double area= rectangle1.getArea();
        System.out.println("length="+length+" width="+width+" area="+area);
//        类类型的变量（对象引用）赋值：当你把一个类类型的变量赋值给另一个变量时，实际上是将引用指向同一块内存地址，它们指向同一个对象。
//        这意味着对其中一个引用所引用的对象做的改动，会影响到另一个引用
        Rectangle r1=new Rectangle(5.5,2.0);
        Rectangle r2=r1;
        r2.length=5.0;
        r2.width=3.5;
        System.out.println(r1.length);
    }
}
