package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();
        //rw.name = "Ankush";
        //System.out.println(rw.name); // Error : java: name has private access in com.driver.RWOnly
        rw.setName("Ankush");
        System.out.println(rw.getName());
    }
}