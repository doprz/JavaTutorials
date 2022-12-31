public class Methods {

    /*
        When programming, many times we come across cases where code is very repetitive and very few things change
        We can use methods to bundle up code and even make changes for each case

        Methods also have parameters to change what they do in different cases based on what input they're given
    */

    /*
        For now don't worry about the access modifiers. Just focus on void.
        In this case void means that this method doesn't return anything. If it were to return something, we would
            replace it with the data type that it is returning
    */
    public static void sayHello() {
        System.out.println("Hello");
    }

    // This method takes in an int as a parameter
    public static void numberSquared(int num) {
        int result =  num * num;
        System.out.println(result);
    }

    // As you can see here this method takes an int as a parameter and returns an int
    public static int returnNumberSquared(int num) {
        return num * num;
    }

    public static boolean areTheyTheSame(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }


    public static void fahrenheitToCelsius(float tempF) {
        float Celsius = (tempF - 32) * (5/9f);
        System.out.println(tempF + " degrees Fahrenheit = " + Celsius + " degrees Celsius");
    }

    public static void celsiusToFahrenheit(float tempC) {
        float Fahrenheit = (tempC * (9/5f)) + 32;
        System.out.println(tempC + " degrees Celsius = " + Fahrenheit + " degrees Fahrenheit");
    }


    public static void main(String[] args) {

        sayHello();

        numberSquared(3);

        int whatIs4Squared = returnNumberSquared(4); // This method returned the value. Essentially copy and pasted it here
        System.out.println(whatIs4Squared);

        System.out.println("____________________");

        fahrenheitToCelsius(82.4f);
        celsiusToFahrenheit(0f); // Freezing point

        System.out.println("____________________");

        boolean areTheyEqual = areTheyTheSame(2, 3); // This method will return true is equal and false if not equal
        System.out.println(areTheyEqual);

    }

}
