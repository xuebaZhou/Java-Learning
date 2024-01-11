package com.study.python;

public class PassTest {

    float ptValue;
    int val1;
    public static void main(String args[]) {
        String str;
        int val;

        //创建类的实例
        PassTest pt = new PassTest();

        val = 11;// 给整型量val赋值

        // 改变val的值
        pt.changeInt(val);
        System.out.println("Int value is:" + val);

        pt.val1=101;
        pt.changeInt1(pt);
        System.out.println("Int value is  :"+pt.val1);
        // 给字符串str赋值
        str = new String("hello");

        pt.changeStr(str);

        System.out.println("Str value is:" + str);

        pt.ptValue = 101f;

        // 通过对象引用改值
        pt.changeObjValue(pt);
        // 当对象pt作为参数传给changeObjvalue()后，该引用所保存的地址不改变，但是改地址内保存的内容可以变化

        System.out.println("Current ptValue is:" + pt.ptValue);
    }

    public void changeInt(int value) {
        value = 55;
    }

    public void changeInt1(PassTest am){
        am.val1=505;
    }
    public void changeStr(String value) {
        value = new String("different");
    }

    public void changeObjValue(PassTest ref) {
        ref.ptValue = 99f;
    }
}
