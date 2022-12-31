package BasicControlFlow; // This is just a package, a method of organizing code into sections

public class switchStatement {

    public static void main(String[] args) {

        /*
            The switch statement is another form of the if-then-else statement to control the flow of a program,
                but instead of a condition it relies on it a the variable matches a 'case'
        */

        int switchValue = 4;

        switch (switchValue) { // The value that the switch statement is evaluating. In this case switchValue
            case 1: // This is the 'case' tested. Similar to if (switchValue == 1) { Code Executed }
                System.out.println("The value was 1"); // Code executed if switchValue == 1
                break; // If this code block is ran then this breaks the program flow out of the switch statement to continue on with the rest of the program
            case 2:
                System.out.println("The value was 2");
                break;
            case 3:
                System.out.println("The value was 3");
                break;
            case 4:case 5:case 6: // You can also next cases
                System.out.println("The value was a value 4-6. It was " + switchValue);
                break;
            default: // This is what gets executed if none of the conditions above ran *You can consider it like the else of an if statement
                System.out.println("The value wasn't a value between 1-6");
                break;
        }

        System.out.println("____________________");

        // This would be the equivalent of the switch statement above but in an if statement version

        switchValue = 5; // Reassigning the variable

        if (switchValue == 1) {
            System.out.println("The value was 1");
        } else if (switchValue == 2) {
            System.out.println("The value was 2");
        } else if (switchValue == 3) {
            System.out.println("The value was 3");
        } else if ((switchValue == 4) || (switchValue == 5) || (switchValue == 6)) { // Same thing. You can nest conditions
            System.out.println("The value was a value 4-6. It was " + switchValue);
        } else {
            System.out.println("The value wasn't a value between 1-6");
        }

    }

}
