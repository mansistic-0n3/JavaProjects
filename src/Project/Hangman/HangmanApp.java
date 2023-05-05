package Project.Hangman;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class HangmanApp {
    public static void main(String[] args) throws FileNotFoundException {
        GameService gameService =new GameService();
        System.out.println("Select game level you want to play: \n0-Beginner\t1-Intermediate\t2-Advance");
        Scanner userInput = new Scanner(System.in);
        int level = userInput.nextInt();
        if (level==0){
            System.out.println("\nBeginner Level\n");
            gameService.start(level);
        } else if (level==1) {
            System.out.println("\nIntermediate Level\n");
            gameService.start(level);
        } else if (level==2) {
            System.out.println("\nAdvance Level\n");
            gameService.start(level);
        } else {
            System.out.println("\nBeginner level game by default: \n");
            gameService.start(level);
        }


    }
}
