package com.hexlet.humans;

/**
 * Created by snake on 19.05.14.
 */
public class Teacher {
    public String name = "N/A";
    public int age = 30;
    public String className = "Math";
    //public void <name>(<values>) <exception> {...}
    public void helloMyNameIs(){
        System.out.println("Hello!");
        System.out.println("My name is - " + name);
        System.out.println("My age is - " + age);
        System.out.println("My class is: " + className);

    }
}
