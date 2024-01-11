package graph;

import element.Fibonacci;
import java.util.ResourceBundle;

public class Rectangle {
    double length;
    double width;
//    带参数构造方法
    public Rectangle(double a,double b){
        length=a;
        width=b;
    }
    public Rectangle(){}
    public double getArea(){
        double area=length*width;
        return area;
    }
}
