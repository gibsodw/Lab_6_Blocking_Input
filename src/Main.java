import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double faren = 0;
        double cel = 0;
        String trash = "";

        System.out.print("Please enter your temperature in Celsius: ");
        if(in.hasNextInt()) {
            cel = in.nextInt();

            faren = cel * (9 / 5) + 32;

            if (faren == 212)
            {
                System.out.println("You entered the boiling point of Fahrenheit, " + faren);

            } else if (faren == 32)
            {
                System.out.println("You entered the freezing point of Fahrenheit, " + faren);

            }
            else
            {
                System.out.println("Your temperature in Fahrenheit is " + faren);

            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered " + trash);
            System.out.println("Rerun the program and do proper input. ");
        }
    }
}