import java.util.Random;
import java.util.Scanner;

public class HighOrLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        int secret = gen.nextInt(10) + 1; // 1 to 10

        int guess = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Guess a number from 1 to 10: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();
                if (guess >= 1 && guess <= 10) {
                    done = true;
                } else {
                    System.out.println("\nYour guess must be from 1 to 10!");
                }
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said your guess was: " + trash);
                System.out.println("You have to enter a whole number from 1 to 10!");
            }
        } while (!done);

        System.out.println("The number was: " + secret);
        if (guess > secret) {
            System.out.println("Your guess was too high.");
        } else if (guess < secret) {
            System.out.println("Your guess was too low.");
        } else {
            System.out.println("You got it, right on the money!");
        }
    }
}