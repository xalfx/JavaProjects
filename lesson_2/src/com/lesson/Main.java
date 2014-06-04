package com.lesson;

public class Main {

    public static void main(String[] args) {
        Field field = new Field();
        field.eraseField();
        field.showField();

        field = new Field(5);
        field.eraseField();
        field.showField();
    }


}
