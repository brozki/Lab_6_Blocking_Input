import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String trash = "";
        boolean done;

        double width = 0;
        done = false;
        do {
            System.out.print("Enter the width: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said the width was: " + trash);
                System.out.println("You have to enter a valid number!");
            }
        } while (!done);

        double height = 0;
        done = false;
        do {
            System.out.print("Enter the height: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said the height was: " + trash);
                System.out.println("You have to enter a valid number!");
            }
        } while (!done);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);

        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimeter: %.2f%n", perimeter);
        System.out.printf("Diagonal: %.2f%n", diagonal);
    }
}