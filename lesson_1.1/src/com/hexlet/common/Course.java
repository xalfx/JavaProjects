package com.hexlet.common;

/**
 * Created by snake on 17.05.14.
 */
public class Course {
    public String name = "N/A";

    public int hours = 1;

    public void aboutCourse() {
        System.out.println("Course name: " + name);
        System.out.println("Hours: " + hours);
    }
}
