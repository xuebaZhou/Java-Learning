package come.ithema.string;

import come.ithema.domain.Student;

public class StringDemo1 {
    /*
            String类的特点:

                1. Java 程序中所有双引号字符串,都是String这个类的对象

                2. 字符串一旦被创建, 就不可更改,字符串的内容不可改变
                            如果想要更改,只能使用新的对象,做替换


                3. String 字符串虽然不可改变，但是可以被共享

                            字符串常量值 : 当我们使用双引号创建字符串对象时,会检查常量池中是否存在该数据
                                                不存在 : 创建
                                                存在 : 复用
     */
    public static void main(String[] args) {
        String s = "abc";
        s = "def";
        //System.out.println(s.toUpperCase());
        // System.out.println("helloworld".toUpperCase());
        Student stu = new Student("张三", 23);
        stu = new Student("李四", 24);

        System.out.println(stu.getName() + "---" + stu.getAge());

        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);
    }
}
