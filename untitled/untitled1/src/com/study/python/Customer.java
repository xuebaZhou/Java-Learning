package com.study.python;

import java.util.concurrent.CountDownLatch;

public class Customer {

    String name, address, telephone;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getAddress() {
        return address;
    }

    void setAddress(String address) {
        this.address = address;
    }

    String getTelephone() {
        return telephone;
    }

    void setTelephone(String telephone) {
        this.telephone = telephone;
    }


    public static void main(String[] args) {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        customer1.setName("Kobe Bryant");
        customer1.setAddress("#130 Nan Road");
        customer1.setTelephone("022-23503545");

        customer2.setName("Michael Jordan");
        customer2.setAddress("#130 Bei Road");
        customer2.setTelephone("022-23503546");

        System.out.println(customer1.getName());
        System.out.println(customer1.getAddress());
        System.out.println(customer1.getTelephone());

        System.out.println(customer2.getName());
        System.out.println(customer2.getAddress());
        System.out.println(customer2.getTelephone());
    }
}

