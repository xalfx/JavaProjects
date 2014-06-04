package com.lesson;

public class Human {

    private static final int MIN_AGE = 12;

    private static final int MAX_AGE = 120;

    private static final int MINIMAL_LENGTH_NAME = 3;

    private String name;

    private int age;

    public void setAge(int newAge){
        if (newAge > Human.MIN_AGE && newAge < Human.MAX_AGE){
            age = newAge;
        }
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName) {
        if (newName != null && newName.length() > Human.MINIMAL_LENGTH_NAME) {
            name = newName;
        }
    }

    public void sayHello() {
        System.out.println("Привет!");;
    }
}