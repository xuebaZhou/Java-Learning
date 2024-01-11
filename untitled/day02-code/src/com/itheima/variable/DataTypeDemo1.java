package com.itheima.variable;

public class DataTypeDemo1 {
    /*
          数据类型

                1. 基本数据类型

                        整数
                                byte          1个字节                -128~127
                                short         2个字节
                                int           4个字节
                                long          8个字节
                        小数
                                float         4个字节
                                double        8个字节
                        字符
                                char          2个字节
                        布尔
                                boolean       1个字节


                2. 引用数据类型

         ---------------------------------------------------------------------------------------
         使用思路 :
                        1.整数类型 : 首选int, 如果发现int装不下了，将类型换为long,定义long类型变量需要加入L的标识

                        2.小数类型 : 首选double , 非要用float类型，需要加入F标识
    */
    public static void main(String[] args) {
        //long tel = 15611111111L;后面加大小写L均可，但建议用大写L来表示。
        //float height = 183.1F;后面加大小写F均可。
        char gender = '男';

        boolean flag = true;

        char c = 97;//另一种等价写法 : char c = 'a';一般都会用后面一种写法，因为ASCII码太多了，记不住!

        System.out.println(c);
    }
}
