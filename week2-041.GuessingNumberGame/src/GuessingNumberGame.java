
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guesses = 1;

        // program your solution here. Do not touch the above lines!
        System.out.println(numberDrawn);
        while(true) {
            System.out.print("Guess a number:");
            int userNumber = Integer.parseInt(reader.nextLine());
            if (userNumber < numberDrawn) {
                System.out.println("The number is greater, guesses made:" + guesses);
            } else if (userNumber > numberDrawn) {
                System.out.println("The number is lesser, guesses made:"+guesses);
            } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
            guesses++;
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
