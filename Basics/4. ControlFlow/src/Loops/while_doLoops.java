package Loops;

public class while_doLoops {

    public static void main(String[] args) {

        /*
            Loops are an essential part of programming as they allow you to execute code over many iterations
                in a small form factor, where you're in control of what happens

            The most common cases to use one would be for a game loop, waiting for user input, iterating over
                arrays(we'll go through this soon), and checking for a condition to be met.
        */

        /*
            [Syntax]:
            while (condition) {
                Code Block Executed
                Something to change your condition
            }

            The first part is what restrictions you want to place on your counter. A.k.a the termination/end/condition of the loop
            The second part is by how much you want to increment/decrement your counter

            [WARNING]: Be careful with your parameters because you can cause an INFINITE LOOP
        */

        /* ****************************************************** */
        /*                     while loop                         */
        /* ****************************************************** */

        int whileCounter = 0;
        // This will loop 10 times and will end when whileCounter = 9
        while (whileCounter < 10) {
            System.out.println("while counter = " + whileCounter);

            whileCounter++;
        }

        System.out.println("____________________");

        /* ****************************************************** */
        /*                      do loop                          */
        /* ****************************************************** */

        int doCounter = 0;

        // This will run 10 times and ends when doCounter = 18
        do {
            System.out.println("do counter = " + doCounter); // This will output numbers from 0-18 by 2s
            doCounter+=2;
        } while (doCounter < 20); // The do loop will run as long as doCounter < 20


    }

}
