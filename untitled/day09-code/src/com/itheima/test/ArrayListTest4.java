package com.itheima.test;

import java.util.ArrayList;

public class ArrayListTest4 {
/*
         for (int i = 0; i < list.size(); i++) {
                    String s = list.get(i);
                    if("test".equals(s)){
                        list.remove(i);
                        i--;
        // 在执行到if语句中的句子时，要是删除了test的元素，后面的元素会自动向前进行补齐操作，这是要进行i--，保证不会漏删除元素
                    }
                }
                       总结:在遍历集合的过程中，有删除操作
                            1.正序遍历:不要忘记     --操作
                            2.倒序遍历:不需要       --操作

 */
    public static void main(String[] args) {

//        String ss=null;
//        System.out.println("test".equals(ss));
        // 变量和常量作比较的话，尽量使用常量调方法进行比较，反过来的话可能会导致空指针异常
        ArrayList<String> list=new ArrayList<>();
        list.add("test");
        list.add("张三");
        list.add("李四");
        list.add("test");
        list.add("test");


        for(int i= list.size()-1;i>=0;i--){
            String s =list.get(i);
            if("test".equals(s)){
                list.remove(i);
                // 倒着删除元素的时候，删除某个元素后，后面的元素会自动的补齐，但是这不影响我们的结果，因为我们后面的元素都是经过比较了的
            }
        }
        System.out.println(list);
    }
}
