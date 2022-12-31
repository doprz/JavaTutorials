package BasicControlFlow; // This is just a package, a method of organizing code into sections

public class LogicalOperators {

    public static void main(String[] args) {

        /*
            Controlling the flow and how your program runs is an essential part of programming
            It helps you selectively execute certain sections of code based on if a condition gets evaluated
            to true or false (booleans)

            We can achieve this through the use of if-then, if-then-else, switch, and ternary operators and statements
            which are controlled by logical and comparision operators such as:

            Comparision Operators:
                == Equal to
                != Not equal to
                >  Greater than
                <  Less than
                >= Greater than or equal to
                <= Less than or equal to

            Logical Operators:
                && Logical and
                || Logical or
                !  Logical not

                &&: BOTH terms have to be true for this to output true, else outputs false
                ||: EITHER one or BOTH of the terms have to be true for this to output true, if they are BOTH false, it outputs false
                ! : This reverses a boolean expression, so a true boolean will output false, and a false boolean will output true

        */

        boolean isItSummer = true;
        boolean isTheSchoolYearOver = true;

        /*
            If the condition in the parenthesis after the if is evaluated to be true then the code inside
                the {} is run, else the code in the {} following the else is run if that condition turns out to be false
        */
        // BOTH isItSummer AND isTheSchoolYearOver have to be true in order for the result to output true
        if ((isItSummer == true) && (isTheSchoolYearOver == true)) {
            System.out.println("It's SUMMER and time to relax!");
        } else {
            System.out.println("We're still in school...\n"); // The \n makes a new line
        }
        /*
            If you're trying to evaluate booleans you can also leave them as is in the if statement without having to
                compare it to true or false with == != !
                You can think of it as substituting the boolean's value for the variable

            This block of code (lines 47-51) do the same thing
        */
        // BOTH isItSummer AND isTheSchoolYearOver have to be true in order for the result to output true
        if (isItSummer && isTheSchoolYearOver) { // The same as if (true && true) { Code Executed }
            System.out.println("It's SUMMER and time to relax!");
        } else {
            System.out.println("We're still in school...\n"); // The \n makes a new line
        }

        System.out.println("____________________");


        boolean isPhoneCharged = false;
        boolean hasPortableBattery = true;
        boolean hasCharger = false;

        // EITHER one of these variables have to be true for the if statement to return true and execute the code in the {}
        if (isPhoneCharged) {
            System.out.println("You're good to go!");
        } else if(hasCharger || hasPortableBattery) {
            System.out.println("Phew");
        } else {
            System.out.println("Go ask a friend...");
        }

        System.out.println("____________________");


        boolean hasID = true;

        // This will inverse the boolean has ID, since hasID = true, this will output false and thus the else statement code will run instead
        if (!hasID) {
            System.out.println("Can't take the ACT");
        } else {
            System.out.println("You're good to go!");
        }


    }

}
