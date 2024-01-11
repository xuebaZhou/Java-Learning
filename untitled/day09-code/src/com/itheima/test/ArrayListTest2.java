package com.itheima.test;

import com.itheima.domain.Student;

import java.util.ArrayList;

public class ArrayListTest2 {
    /*
            创建一个存储学生对象的集合，存储3个学生对象，

                    在控制台，展示出年龄低于18岁的学生信息
     */
    public static void main(String[] args) {


        Student stu1 = new Student("张三", 23);
        Student stu2 = new Student("李四", 14);
        Student stu3 = new Student("王五", 15);

        ArrayList<Student> list = new ArrayList<>();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

//        for (int i = 0; i < list.size(); i++) {
//            Student stu = list.get(i); // 从集合里面调用get方法，把每一个对象调取出来，要打印里面的数据，就找对象要数据
//            System.out.println(stu);  // 打印出来的是地址
//            System.out.println(stu.getName()+"---"+stu.getAge());
//        }

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);

            if (stu.getAge() < 18) {
                System.out.println(stu.getName() + "---" + stu.getAge());
            }
        }
    }
}
