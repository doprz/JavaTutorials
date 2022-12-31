// This is a comment and it will not affect your code

// The public keyword is an access modifier
// The class keyword defines the code inside the curly braces as a class

// The main method is a special method that Java looks for when running a program. It is the entry point

// The void keyword is another Java keyword which means that the method won't return anything


/* Shortcuts
    // This is a single line comment an can be written with ctrl + / or cmd + /
        the other comment with the * in between the // is a multi-line comment
        **Note** if your comments aren't indented automatically go to:
            Intellij: File > Settings > Editor > Code Style > Java > Code Generation and uncheck the option "Line comment at first column"

    To autocomplete your code press press ctrl + space or cmd + space and press enter
    To autocomplete the main method type out main and press ctrl + space or cmd + space and press enter
    To save your code press ctrl + s or cmd + s
 */

public class Hello {

    /*  This is the entry point in your program/code  */
    public static void main(String[] args) {
        // This will print out Hello World! to the console once you run it
        // strings have to have "" around them and expressions must end with a ;
        System.out.println("Hello World!");
    }

}
