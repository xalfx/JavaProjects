package com.hexlet; /**
 * Created by snake on 12.05.14.
 */

import com.hexlet.common.Course;
import com.hexlet.humans.Student;

public class Main {
    public static void main(String[] args) {

        // <type> <name>

        Student studentMax = new Student();
        studentMax.course = new Course();
        studentMax.course.name = "Java course";
        studentMax.name = "Maksim";
        studentMax.sayHello();

        Student studentDima = new Student();
        studentDima.course = new Course();
        studentDima.sayHello();


    }
}
