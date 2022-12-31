import java.util.Scanner;

public class ValidatingUserInput {

    /*
        We've previously learned how to output text to the console through System.out.println("Text");
        However this tutorial will teach you and demonstrate how to get user input through the console using the Scanner class

        We also have to make sure that what the user inputted was in the correct format or else the program will output errors

    */

    public static void main(String[] args) {

        // This creates a new instance of a Scanner object which gets user input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: "); // System.out.print("Text"); doesn't return a new line like System.out.println("Text"); does
        String name = scanner.nextLine(); // This will get what you type on the next line
        System.out.println("Your name is " + name);

        while (true) {

            System.out.print("Enter your age: "); // System.out.print("Text"); doesn't return a new line like System.out.println("Text"); does
            boolean isAnInt = scanner.hasNextInt(); // Check if user input is of type int

            if (isAnInt) {
                int age = scanner.nextInt();
                System.out.println("You're " + age + " years old");
                break;
            } else {
                System.out.println("Error: Invalid format. Expecting integer.");
            }

            scanner.nextLine(); // scanner.nextLine(); handles the next line character(enter key), produces error if a scanner follows it.
        }

        scanner.close(); // Close the scanner

    }
}
