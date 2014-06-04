package com.lesson;

public class Field {

    private static final int MIN_FIELD_SIZE = 0;

    private static final int MAX_FIELD_SIZE = 100;

    private static final int DEFAULT_FIELD_SIZE = 3;

    private static final char DEFAULT_CELL_VALUE = ' ';

    private final int fieldSize;

    private final char[][] field;

    public Field() {
        this(DEFAULT_FIELD_SIZE);
    }

    public Field(int size) {
        fieldSize = size;
        field = new char[fieldSize][fieldSize];
    }

//    public void setFieldSize(int newFieldSize) {
//        if (fieldSize > MIN_FIELD_SIZE && newFieldSize < MAX_FIELD_SIZE) {
//            fieldSize = newFieldSize;
//        }
//    }

    public int getFieldSize() {
        return fieldSize;
    }

    public  void eraseField() {
        for (int i = 0; i < fieldSize; i++) {
            for(int i2 = 0; i2 < fieldSize; i2++) {
                field[i][i2] = DEFAULT_CELL_VALUE;
            }
        }
    }

    public void showField() {
        System.out.println();
        for (int i = 0; i < fieldSize; i++) {
            for(int i2 = 0; i2 < fieldSize; i2++) {
                showCell(i, i2);
            }
            System.out.println();
        }
        System.out.println();
    }

    private void showCell(int x, int y) {
            System.out.print("[" + field[x][y] + "]");
    }
}