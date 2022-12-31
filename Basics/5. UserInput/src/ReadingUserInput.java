import java.util.Scanner;

public class ReadingUserInput {

    /*
        We've previously learned how to output text to the console through System.out.println("Text");
        However this tutorial will teach you and demonstrate how to get user input through the console using the Scanner class
    */

    public static void main(String[] args) {

        // This creates a new instance of a Scanner object which gets user input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine(); // This will get what you type on the next line
        System.out.println("Your name is " + name);


        System.out.println("Enter your age: ");
        int age = scanner.nextInt(); // This will get the int typed on the next line
        /*
            scanner.nextLine(); handles the next line character(enter key), produces error if a scanner follows it.
            Try commenting this line out and running the program to see what happens
        */
        scanner.nextLine();
        System.out.println("You're " + age + " years old");


        System.out.println("Enter your favorite color: ");
        String favoriteColor = scanner.nextLine(); // This will get what you type on the next line
        System.out.println("Your favorite color is " + name);

        scanner.close(); // Close the scanner

    }

}
