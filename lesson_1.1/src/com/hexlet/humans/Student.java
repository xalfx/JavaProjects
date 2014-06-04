package com.hexlet.humans;

import com.hexlet.common.Course;

/**
 * Created by snake on 17.05.14.
 */
public class Student {

    // public <type> <name> [ = <initial value>];
    public String name = "N/A";

    public int age = 15;

    public Course course;

    //public void <name>(<values>) <exception> {...}
    public void sayHello(){
        System.out.println("Hello!");
        System.out.println("My name is - " + name);
        System.out.println("My age is: " + age);
        course.aboutCourse();
    }

}
