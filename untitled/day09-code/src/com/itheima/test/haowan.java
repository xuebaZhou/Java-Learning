package com.itheima.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class haowan {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "orange"));
        Iterator<String> iterator = list.iterator();
//        将列表 list 转换为一个迭代器对象，并将其赋值给 iterator 变量，以便后续使用该迭代器对象来遍历列表中的元素
        String target = "banana";
        /*
            while (iterator.hasNext()) {
        // 迭代器还有下一个元素
        // 执行相应操作
            }
         */
        while (iterator.hasNext()) {// 通过 hasNext() 方法判断迭代器是否还有下一个元素。如果有，则进入循环；如果没有，则结束循环
            String str = iterator.next();// 使用 next() 方法获取迭代器的下一个元素，并将其赋值给变量 str
            if (str.equals(target)) {
                iterator.remove();
            }
        }
        /*
        for (类型 变量名 : 集合或数组) {
//     循环体
        }
         */
        for (String str : list) {
            System.out.println(str);
        }
//        每次循环迭代时，会将 list 中的元素依次赋值给 str 变量，然后执行循环体内的代码，直到遍历完集合中的所有元素为止
    }
}
