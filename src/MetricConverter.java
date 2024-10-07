import java.util.Scanner;
import java.util.Random;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int playerNumber = 0;
        int computerNumber = rand.nextInt(11);

        String trash = ""; // use for bad input which will read as a String
        boolean done = false;
        do {
            System.out.println("Enter your number guess [1 2 3 4 5 6 7 8 9 10] ");

            if (in.hasNextDouble()) {

                // OK safe to read in a double
                playerNumber = in.nextInt();
                in.nextLine(); // clears the newline from the buffer
                done = true;  // because we got a valid number we can end the loop
            } else {
                // Not a double can’t use nextDouble() read as String with nextLine() instead
                trash = in.nextLine();
                System.out.println("\nYou said your amount was: " + trash);
                System.out.println("You have to enter a valid amount");
            }

        } while (!done);  // initially done is false so !done is true when done is true !done is false

        if(playerNumber == computerNumber) {

            System.out.println("The computer number was " + computerNumber);
            System.out.println("\nYou win" );

        }

        if(playerNumber > computerNumber) {

            System.out.println("The computer number was " + computerNumber);
            System.out.println("\nToo high " );

        }

        if(playerNumber < computerNumber) {

            System.out.println("The computer number was " + computerNumber);
            System.out.println("\nToo low " );

        }

    }
}