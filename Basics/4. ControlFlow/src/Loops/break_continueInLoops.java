package Loops;

public class break_continueInLoops {

    /*
        Loops are an essential part of programming as they allow you to execute code over many iterations
            in a small form factor, where you're in control of what happens

        The most common cases to use one would be for a game loop, waiting for user input, iterating over
            arrays(we'll go through this soon), and checking for a condition to be met.
    */

    /*
        break and continue are special keywords used to control how a loop works
        break exits/"jumps out" of the loop
        continue breaks out of the loop for one iteration and continues with the next iteration
    */

    public static void main(String[] args) {

        for (int counter = 0; counter < 10; counter++) {
            if (counter == 4) {
                break; // if counter == 4, then break will cause the loop to end
            }
            System.out.println(counter);
        }

        System.out.println("____________________");

        for (int counter = 0; counter < 10; counter++) {
            if (counter == 8) {
                continue; // if counter == 8, then continue will cause the loop skip this iteration but continue on to the next iteration
            }
            System.out.println(counter);
        }

    }

}
