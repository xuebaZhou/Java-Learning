package student;

import department.Major;

public class Student {
    int number; // 学号
    String name; // 姓名
    StudentType type; // 学生类型
    Major major; // 所属专业
}


class StudentType {
    int id; // 类型编码
    String name; // 类型名称
}