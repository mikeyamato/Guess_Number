import java.util.Scanner;

public class GuessNumber {
    public static void main(String [] args){
        int randomNum = (int)(Math.random()*100) + 1;
        int numGuessLeft = 10;
        boolean correctGuess = false;

        System.out.println("You have 10 tries to guess a number from 1 and 100.");
        System.out.println("Type your guess in the terminal and hit enter.");
        System.out.println("You have " + numGuessLeft + " guesses left.");

        for (int i = 10; i > 0; i--){
            Scanner scanner = new Scanner(System.in);
            int userNum = scanner.nextInt();
            numGuessLeft--;
            if (userNum == randomNum){
                System.out.println("You guessed correctly.");
                correctGuess = true;
                break;
            }
            else if (userNum > randomNum){
                System.out.println("Incorrect! Try guessing a number less than " + userNum + ". You have " + numGuessLeft + " guesses left.");
            }
            else if (userNum < randomNum){
                System.out.println("Incorrect! Try guessing a number greater than " + userNum + ". You have " + numGuessLeft + " guesses left.");
            }
        }
        if (correctGuess){
            System.out.println("Congrats, You Won!");
        } else {
            System.out.println("You ran out of guesses. The random number was " + randomNum + ". Better luck next time.");
        }
    }
}

