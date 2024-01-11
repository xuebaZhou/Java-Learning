package com.itheima.oop;

public class BookTest {

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.id = "001";
        b1.name = "三国";
        b1.price = 88.88;
        b1.show();


        Book b2 = new Book();
        b2.id = "002";
        b2.name = "水浒";
        b2.price = 88.88;
        b2.show();


        Book b3 = new Book();
        b3.id = "003";
        b3.name = "富婆通讯录";
        b3.price = 10000;
        b3.show();
    }
}
