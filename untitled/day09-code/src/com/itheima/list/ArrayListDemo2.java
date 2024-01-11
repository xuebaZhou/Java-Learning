package com.itheima.list;

import java.util.ArrayList;

public class ArrayListDemo2 {
    /*
        ArrayList 常用的成员方法：

            1、增:
                    public boolean add(E e) :将指定的元素添加到此列表的尾部
                    public void add(int index ,E element) :  在指定索引位置，添加对应的元素(插队)

            2、删
                    public E remove(int index) :  根据索引做删除，返回被删除掉的元素
                    public boolean remove (Object o)  : 根据元素做删除,返回是否删除成功的状态

            3、改
                    public E  set(int index ,E element) : 修改指定索引位置，为对应元素, 返回被覆盖掉的元素

            -------------------------------------------------------------------------------------------
                    以上的方法，返回值通常不做接收

            4、查
                    public E get(int index) : 根据索引，获取集合中的元素

                    public int size() : 返回集合中元素的个数

     */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("张三1");
        list.add("张三2");
        list.add("张三3");

        String result = list.get(2);

        System.out.println(result);

        System.out.println(list.size());
    }



    private static void updateMethod() {
        ArrayList<String> list = new ArrayList<>();

        list.add("张三1");
        list.add("张三2");
        list.add("张三3");

        String result = list.set(1, "李四");

        System.out.println(result);

        System.out.println(list);
    }

    private static void removeMethod() {
        ArrayList<String> list = new ArrayList<>();

        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);

        boolean flag = list.remove("李四");
        System.out.println(flag);

        boolean flag1 = list.remove("张三2");
        System.out.println(flag1); // false 删除错误的条件: 集合中没有该元素.

        System.out.println(list);
    }

    private static void addMethod() {
        ArrayList<String> list = new ArrayList<>();

        list.add("123");  // 这里的添加 不支持链式编程的
        list.add("456");
        list.add("789");
        list.add(1, "789");

        System.out.println(list);
    }
}
