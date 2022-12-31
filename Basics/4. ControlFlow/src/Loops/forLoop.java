package Loops;

public class forLoop {

    public static void main(String[] args) {

        /*
            Loops are an essential part of programming as they allow you to execute code over many iterations
                in a small form factor, where you're in control of what happens

            The most common cases to use one would be for a game loop, waiting for user input, iterating over
                arrays(we'll go through this soon), and checking for a condition to be met.
        */

        /*
            [Syntax]:
            for (int counter = 0; i < numIterations; increase counter by how much) {
                Code Block Executed
            }

            The first part is the counter variable(local variable) to help you manage how many times you loop
            The second part is what restrictions you want to place on your counter. A.k.a the termination/end/condition of the loop
            The third part is by how much you want to increment/decrement your counter

            [WARNING]: Be careful with your parameters because you can cause an INFINITE LOOP
        */


        for (int i = 0; i < 10; i++) {
            System.out.println("This is loop #" + i); // The counter(i) is local and can only be accessed inside of this loop
            // This will loop 10 times, as long as i < 10. The loop will end when i = 9
        }

        System.out.println("____________________");

        for (int j = 0; j < 4; j+=2) { // Incrementing by +2
            System.out.println("This is loop #" + j); // The counter(j) is local and can only be accessed inside of this loop
            // This will loop 2 times, as long as j < 4
        }

        System.out.println("____________________");

        // You can also go backwards(decrement)
        for (int j = 20; j > 0; j-=2) { // Decrementing by +2
            System.out.println("This is loop #" + j); // The counter(j) is local and can only be accessed inside of this loop
            // This will loop 10 times, as long as j > 0
        }

        /* ****************************************************** */
        /*                  Nested for Loops                      */
        /* ****************************************************** */

        /*
            for loops can also be nested within one another. This is especially useful for iterating over multi-dimentional arrays,
                data sets, and data nested inside of each other
        */

        // Basic multiplication table
        for (int x = 0; x <= 12; x++) {
            for (int y = 0; y <= 12; y++) {
                int result = x * y;

                if (result < 10) {
                    System.out.print(result + "   "); // print will just print instead of starting a new line
                } else if (result < 100) {
                    System.out.print(result + "  ");
                } else if (result >= 100) {
                    System.out.print(result + " ");
                }

            } // Every time the y-loop finishes the x-loop increments by 1
            System.out.print("\n"); // Make a new line after a column is done
        }


    }

}
