import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter the temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine(); // clear the newline from the buffer
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said the temperature was: " + trash);
                System.out.println("You have to enter a valid number!");
            }
        } while (!done);

        double fahrenheit = celsius * 9.0 / 5.0 + 32;
        System.out.printf("%.1f C is %.1f F%n", celsius, fahrenheit);
    }
}