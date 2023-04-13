package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
//        obj.name = "Ankush";
//        System.out.println(obj.name);
        obj.setName("Ankush");
        obj.getName();
    }
  
}