package com.itheima.demo;

import com.itheima.domain.Student;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        Student stu1 = new Student("heima001", "张三", 23, "1991-11-11");
        Student stu2 = new Student("heima002", "李四", 24, "1991-11-12");
        Student stu3 = new Student("heima003", "王五", 25, "1991-12-11");

        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        String id = "heima007";

        int index = getIndex(id, list);
        System.out.println(index);
    }

    private static int getIndex(String id, ArrayList<Student> list) {
        // 遍历集合，获取到每一个集合对象
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
//            stu.getId() : 从集合中取出的学生学号
//            id: 要查找的学号
            if (stu.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
