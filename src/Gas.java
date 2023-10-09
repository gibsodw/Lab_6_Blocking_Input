import java.util.Scanner;

public class Gas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double miles = 0;
        double price = 0;
        double mpg = 0;
        double cost = 0;
        String trash = ""; // use for bad input which will read as a String
        boolean done = false;
        do
        {
            System.out.println("Enter the number of gallons your car holds: ");

            if(in.hasNextDouble()){

                // OK safe to read in a double
                gallons = in.nextDouble();
            in.nextLine(); // clears the newline from the buffer
            done = true;  // because we got a valid number we can end the loop
            }else
            {
            // Not a double can’t use nextDouble() read as String with nextLine() instead
            trash = in.nextLine();
            System.out.println("\nYou said your amount was: " + trash);
            System.out.println("You have to enter a valid amount" );
            }

        }while(!done);  // initially done is false so !done is true when done is true !done is false
        do
        {
            System.out.println("Enter the number of miles your car can drive per gallon: ");

            if(in.hasNextDouble()){

                // OK safe to read in a double
                miles = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                done = true;  // because we got a valid number we can end the loop
            }else
            {
                // Not a double can’t use nextDouble() read as String with nextLine() instead
                trash = in.nextLine();
                System.out.println("\nYou said your amount was: " + trash);
                System.out.println("You have to enter a valid amount" );
            }

        }while(!done);  // initially done is false so !done is true when done is true !done is false
        do
        {
            System.out.println("Enter the price of gas per gallon: ");

            if(in.hasNextDouble()){

                // OK safe to read in a double
                price = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                done = true;  // because we got a valid number we can end the loop
            }else
            {
                // Not a double can’t use nextDouble() read as String with nextLine() instead
                trash = in.nextLine();
                System.out.println("\nYou said your amount was: " + trash);
                System.out.println("You have to enter a valid amount" );
            }

        }while(!done);  // initially done is false so !done is true when done is true !done is false

        mpg = gallons * miles;
        cost = price * 100;

        System.out.println("The total cost of a 100 mile trip would be " + cost);
        System.out.println("The total distance you can drive is " + mpg);
    }
}