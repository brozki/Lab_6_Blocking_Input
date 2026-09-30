import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String trash = "";
        boolean done;

        double gallons = 0;
        done = false;
        do {
            System.out.print("Enter the gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said the gallons were: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        } while (!done);

        double mpg = 0;
        done = false;
        do {
            System.out.print("Enter the fuel efficiency (miles per gallon): ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said the efficiency was: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        } while (!done);

        double price = 0;
        done = false;
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                price = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said the price was: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        } while (!done);

        double costPer100 = 100.0 / mpg * price;
        double rangeOnTank = gallons * mpg;

        System.out.printf("Cost to drive 100 miles: $%.2f%n", costPer100);
        System.out.printf("Distance on a full tank: %.1f miles%n", rangeOnTank);
    }
}