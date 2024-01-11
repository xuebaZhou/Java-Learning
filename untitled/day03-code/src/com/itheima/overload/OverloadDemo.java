package com.itheima.overload;

public class OverloadDemo {

    /*
        方法重载关系的要求

            1.在同一个类中，定义了多个同名的方法，但每个方法具有不同的参数类型或参数个数，这些同名的方法，就构成了
            重载关系

            2.简单记: 同一个类中，方法名相同，参数不同的方法
                 参数不同 : 1.类型不同  2. 个数不同 3.顺序不同

             注意 : 识别方法之间是否是重载关系，只要方法名和参数，与返回值无关。

       方法重载(Overload) : 方法与方法之间的一种关系

       目标1: 能够独立识别出方法与方法之间，是否是正确重载

                - 在同一个类中，方法名相同，参数不同，与返回值无关
                参数不同 : 1.类型不同  2. 个数不同 3.顺序不同

       目标2 :能够理解方法重载带来的好处

                - 不需要记忆过多繁琐的方法名字了
     */
    public static void main(String[] args) {
        System.out.println(10);
        System.out.println(12.3);
        System.out.println("sudgesiugfie");
        System.out.println("水大师");
        //往println中随便输入各种类型的数据，它会自己进行匹配的。
    }
}
