import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double length = 0;
        double area = 0;
        double perimeter = 0;
        double pythag = 0;
        double diagonal = 0;

        String trash = ""; // use for bad input which will read as a String
        boolean done = false;
        do {
            System.out.println("Enter the length of your rectangle: ");

            if (in.hasNextDouble()) {

                // OK safe to read in a double
                length = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                done = true;  // because we got a valid number we can end the loop
            } else {
                // Not a double can’t use nextDouble() read as String with nextLine() instead
                trash = in.nextLine();
                System.out.println("\nYou said your amount was: " + trash);
                System.out.println("You have to enter a valid amount");
            }

        } while (!done);  // initially done is false so !done is true when done is true !done is false
        do {
            System.out.println("Enter the width of your rectangle: ");

            if (in.hasNextDouble()) {

                // OK safe to read in a double
                width = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                done = true;  // because we got a valid number we can end the loop
            } else {
                // Not a double can’t use nextDouble() read as String with nextLine() instead
                trash = in.nextLine();
                System.out.println("\nYou said your amount was: " + trash);
                System.out.println("You have to enter a valid amount");
            }

        } while (!done);  // initially done is false so !done is true when done is true !done is false

        area = length * width;
        perimeter = (length * 2) + (width * 2);
        pythag = (length*length) + (width * width);
        diagonal = Math.sqrt(pythag);

        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
        System.out.println("The diagonal of the rectangle is " + diagonal);
    }
}