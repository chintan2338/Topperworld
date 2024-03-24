package Task1;

import java.util.Scanner;

interface GuessingGame {
    void playGame();
}

class GuessNum implements GuessingGame {
    private int guesserNum = 78;

    public void playGame() {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            System.out.println("Enter a guess number between 1 to 100");
            int num = scan.nextInt();

            if (guesserNum == num) {
                System.out.println("Congratulations! Your guess is correct. You win the game!");
                break;
            } else if (guesserNum > num) {
                System.out.println("Your number is smaller.");
            } else {
                System.out.println("Your number is bigger.");
            }
            i++;
        }
        if (i == 5)
            System.out.println("Sorry! You have reached the maximum number of attempts. The correct number was " + guesserNum);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Guess Number Game");
        System.out.println("You will be asked to guess a number. You have a maximum of 5 attempts.");
        
        GuessingGame game = new GuessNum();
        game.playGame();
    }
}