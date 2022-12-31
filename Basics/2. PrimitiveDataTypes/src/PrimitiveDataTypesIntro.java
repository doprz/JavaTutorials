/*  Data cited from https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html  */

public class PrimitiveDataTypesIntro {

    /*  This is the entry point in your program/code  */
    public static void main(String[] args) {

        /*  Different Primitive Data Types  */
        /*  Primitive Data Types are different ways of storing data into variables depending on the program's needs  */
        /*  [Note]: Signed variables are both positive and negative  */

        /*
            Variables are just a name to represent data stored in memory

            You can think of it as a name that you give to an object or something in general, in essence it represents it
                For Example: you can make a variable called age to represent someones age

            However data comes in all shapes and forms and that is why data types are made to distinguish between them
                just as a name is different from age in the sense that a name is text while age is composed of a number

            You can create a variable by putting its data type first, then its name (following conventions like camelCase),
                setting it equal to a value, and ending it with a semicolon(;) ex: int variable = 14;
         */


        byte b = 14; // The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive). The byte data type can be useful for saving memory in large arrays, where the memory savings actually matters.
        short s = 12; // The short data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive)
        int i = 10000; // The int data type is a 32-bit signed two's complement integer, which has a minimum value of -231 and a maximum value of 231-1
        /*  [Note]: for long data types you must include a L after the long to define it as a long  */
        long l = 1000000L; // The long data type is a 64-bit two's complement integer. The signed long has a minimum value of -263 and a maximum value of 263-1

        /*  [Note]: for float data types you must include a f after the float to convert it from a double to a float  */
        float f = 12.4f; // The float data type is a single-precision 32-bit IEEE 754 floating point.
        double d = 12.46; // The double data type is a double-precision 64-bit IEEE 754 floating point.
        double scientificNotation = 1246e-2; // You can also use Scientific Notation for doubles
        System.out.println(scientificNotation);

        boolean isItTrue = true; // The boolean data type has only two possible values. true and false. It is generally used to track true/false conditions
        boolean isItFalse = false;

        char character = 'a'; // The char data type is a single 16-bit Unicode character, meaning that is stores a single character
        char unicodeCharacter = '\u0044'; // This is the unicode for 'D'
        System.out.println("Unicode \\u0044 = " + unicodeCharacter);
        /* A String is a special data type (Non-Primitive) that is an object (As shown by the uppercase name), it is a collection of char data types stored
            in an array. So don't worry about it at this moment as it will be covered later */
        String name = "Foo";

        /* ****************************************************** */
        /*                Reassigning Variables                   */
        /* ****************************************************** */

        /*
            Just as you can create and initialize variables, you can also reassign them with a new value just by
                typing the variable name an setting it equal to a new value (of the correct data type, more on this in Casting.java)
        */

        int variable = 10; // Initializing and assigning a variable
        int test; // initializing variable
        test = 20; // assigning variable
        test = 24; // reassigning variable

        /* ****************************************************** */
        /*                Overflow experiments                    */
        /* ****************************************************** */

        /*  Things to consider   */
        /*
            A variable can only hold a certain amount of information before it overflows and this is a common cause for errors
            Also adding incompatible data types causes errors
         */

        // This just gets the min and max values that an integer can store, so don't worry about the syntax
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + minIntValue);
        System.out.println("Integer Maximum value = " + maxIntValue);

        // This is what overflow/underflow can cause
        /* In essence it just resets to the next value, think of it as if you cant count anymore with your hands you reset to 0
            or if you're at 0 and go back then you reset to 10 */
        System.out.println("Overflowed Integer Minimum Value = " + (minIntValue - 1));
        System.out.println("Overflowed Integer Maximum value = " + (maxIntValue + 1));
        System.out.println("_______________________________________________________");

        /* As you can see, we get an error here because an int can't hold a value this big since this is the limit and not maximum value
            that an int can store. The reason for this has to do with binary operations so don't worry about it for now */
        // int maxIntTestError = 2147483648;
        int maxIntTestLimit = 2147483647;


        /*  Same test but with a byte data type   */
        int minByteValue = Byte.MIN_VALUE;
        int maxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = " + minByteValue);
        System.out.println("Byte Maximum value = " + maxByteValue);

        // This is what overflow/underflow can cause
        /* In essence it just resets to the next value, think of it as if you cant count anymore with your hands you reset to 0
            or if you're at 0 and go back then you reset to 10
            In this case once the value goes over 127 it goes back to -127 and vice versa */
        System.out.println("Overflowed Byte Minimum Value = " + (minByteValue - 1));
        System.out.println("Overflowed Byte Maximum value = " + (maxByteValue + 1));
        System.out.println("_______________________________________________________");


    }

}
