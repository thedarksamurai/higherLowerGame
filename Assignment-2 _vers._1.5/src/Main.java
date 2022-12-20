import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int computerInput = random.nextInt(100) + 1;

        Scanner scanner =new Scanner(System.in);
        int userTries = 0;
        boolean done = false;

        while (userTries <5){
            System.out.println("Pick a number between 1 and 100");
            System.out.println("Please in a whole number and press enter");

            int userInput = scanner.nextInt();

            if (userInput < 1 || userInput > 100){
                System.out.println("Your guess is not between 1 and 100, please try again");
                continue;
            } else {
                if (userInput < computerInput){
                    System.out.println("Please pick a higher number");
                    userTries++;
                } else if (userInput > computerInput) {
                    System.out.println("PLease pick a lower number");
                    userTries++;
                } else if (userInput == computerInput) {
                    System.out.println("You win!");
                    done = true;
                    break;
                }
            }
        }
        if (done){
            System.out.println("Victory");
        } else {
            System.out.println("You loose");
            System.out.println("The number to guess was: " + computerInput);

        }
    }
}