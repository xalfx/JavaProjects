/**
 * Created by snake on 30.05.14.
 */
import java.util.Scanner;
import java.util.Random;

public class Game {
    public Scanner input = new Scanner(System.in);
    private final static int paper = 1;
    private final static int stone = 2;
    private final static int scissors = 3;




    public void Menu() {
        int choice;
        System.out.println("1. Play new game?");
        System.out.println("2. Exit.");
        choice = input.nextInt();
        if( choice == 1 ) {
            play();
        } else if( choice == 2 ) {
            return;
        }

    }

    public void play() {
        int choice;
        System.out.println("Choose your weapon: ");
        System.out.println("    1) stone    (keyboard 1) ");
        System.out.println("    2) paper    (keyboard 2) ");
        System.out.println("    3) scissors (keyboard 3) ");
        System.out.println("Your choice is: ");
        choice = input.nextInt();
        if (whoWins(computerChoice(),choice) == 1) {
            System.out.println("Computer Wins!" + computerChoice());
        } else if (whoWins(computerChoice(),choice) == 2) {
            System.out.println("You Win! Congratulation!" + computerChoice());
        } else if (whoWins(computerChoice(),choice) == 0) {
            System.out.println("Draw " + computerChoice());
        }
    }

    public static int whoWins(int computerChoice, int humanChoice) {
        if (computerChoice == 1 && humanChoice == 2) {
            return 2;
        } else if (computerChoice == 1 && humanChoice == 3) {
            return 1;
        } else if (computerChoice == 2 && humanChoice == 3) {
            return 2;
        } else if (computerChoice == 2 && humanChoice == 1) {
            return 1;
        } else if (computerChoice == 3 && humanChoice == 1) {
            return 2;
        } else if (computerChoice == 3 && humanChoice == 2) {
            return 1;
        } else {
            return 0;
        }
    }

    public int computerChoice(){

        Random rand = new Random();
        int  step = rand.nextInt(3) + 1;
        return step;
    }

}
