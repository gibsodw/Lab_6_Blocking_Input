import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meters = 0;
        double miles =  0;
        double feet = 0;
        double inches = 0;


        String trash = ""; // use for bad input which will read as a String
        boolean done = false;
        do {
            System.out.println("Enter your length in meters: ");

            if (in.hasNextDouble()) {

                // OK safe to read in a double
                meters = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                done = true;  // because we got a valid number we can end the loop
            } else {
                // Not a double can’t use nextDouble() read as String with nextLine() instead
                trash = in.nextLine();
                System.out.println("\nYou said your amount was: " + trash);
                System.out.println("You have to enter a valid amount");
            }

        } while (!done);  // initially done is false so !done is true when done is true !done is false

        miles = meters / 1609;
        feet = meters * 3.281;
        inches = meters * 39.37;

        System.out.println("Your distance in miles is " + miles);
        System.out.println("Your distance in feet is " + feet);
        System.out.println("Your distance in inches is " + inches);

    }
}