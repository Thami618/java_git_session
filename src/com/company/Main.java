package com.company;

public class Main {

    public static void main(String[] args) {
        int a =10;
        int b = a;
        a = 100;
        System.out.println();

        Person alex = new Person("Alex");
        Person mariam = alex;
        System.out.println("B4 Changing alex");
        System.out.println(alex.name + " " + mariam.name);
        alex.name = "Alendra";
        System.out.println("B4 Changing alex");
        System.out.println(alex.name + " " + mariam.name);
    }
    static class Person{
        String name;
        Person(String name){
            this.name = name;
        }
    }
}
