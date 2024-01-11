package com.itheima.test;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest5 {
    /*
                        需求:定义一个方法，方法接收-一个集合对象(泛型为Student)
                               方法内部将年龄低于18的学生对象找出
                               并存入新集合对象，方法返回新集合
     */
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你想要录入的学生人数:");
        int n = sc.nextInt();
//        list.add(new Student("zhangsan", 23));
//        list.add(new Student("lishi", 14));
//        list.add(new Student("wangwu", 15));
        for (int i = 1; i <= n; i++) {
            System.out.println("请输入第" + i + "个学生的姓名、学号:");
            addStudent(list);
        }
        ArrayList<Student> newList = filter(list);

        System.out.println("年龄小于18岁的人员的信息为:");
        for (int i = 0; i < newList.size(); i++) {
            Student stu = newList.get(i);
            System.out.println(stu.getName() + "    " + stu.getAge());
        }

    }

    private static ArrayList<Student> filter(ArrayList<Student> list) {

        // 1.创建新的集合容器，准备存储筛选后的学生对象

        ArrayList<Student> newlist = new ArrayList<>();
        //遍历原集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            //筛选
            if (stu.getAge() < 18) {
                // 将满足要求的学生对象，存入新集合
                newlist.add(stu);
            }
        }
        return newlist;
    }

    private static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
//        键盘录入的学生信息，封装为学生对象
        Student stu = new Student(name, age);
//        将封装好的学生对象，存入集合
        list.add(stu);
    }
}
