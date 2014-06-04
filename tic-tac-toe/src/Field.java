/**
 * Created by snake on 28.05.14.
 */
import java.io.IOException;
import java.util.Scanner;

public class Field {

    private static final int FIELD_SIZE = 3;

    private static final char DEFAULT_CELL_VALUE = ' ';

    private char[][] field = new char[FIELD_SIZE][FIELD_SIZE];

    public String gotVictory = "Winner is: ";

    public char cross = 'x';

    public char nul = '0';

    public  void eraseField() {
        for (int line = 0; line < FIELD_SIZE; line++) {
            for(int column = 0; column < FIELD_SIZE; column++) {
                field[line][column] = DEFAULT_CELL_VALUE;
            }
        }
    }

    public void showField() {
        System.out.println();
        for (int line = 0; line < FIELD_SIZE; line++) {
            for(int column = 0; column < FIELD_SIZE; column++) {
                showCell(line, column);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void makeStep() {
        for (int line = 0; line < FIELD_SIZE; line++) {
            for (int column = 0; column < FIELD_SIZE; column++) {
                showCell(line, column);
            }
        }
    }

    public void detectNullCell() {
        if (cellValue != DEFAULT_CELL_VALUE) {
            System.out.println("Error: this cell is not Null!");
        }
    }

    public int checkLines(){
        for(int line=0 ; line<3 ; line++){

            if( (field[line][0] + field[line][1] + field[line][2]) == -3)
                return -1;
            if( (field[line][0] + field[line][1] + field[line][2]) == 3)
                return 1;
        }

        return 0;

    }

    public int checkColumns(){
        for(int column=0 ; column<3 ; column++){

            if( (field[0][column] + field[1][column] + field[2][column]) == -3)
                return -1;
            if( (field[0][column] + field[1][column] + field[2][column]) == 3)
                return 1;
        }

        return 0;

    }

    public int checkDiagonals(){
        if( (field[0][0] + field[1][1] + field[2][2]) == -3)
            return -1;
        if( (field[0][0] + field[1][1] + field[2][2]) == 3)
            return 1;
        if( (field[0][2] + field[1][1] + field[2][0]) == -3)
            return -1;
        if( (field[0][2] + field[1][1] + field[2][0]) == 3)
            return 1;

        return 0;
    }

    private void showCell(int x, int y) {
        System.out.print("[" + field[x][y] + "]");
    }
}