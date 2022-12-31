public class MethodOverloading {

    /*
        Method overloading is where you use the same method name but with different parameters.
        This is especially useful for accepting a wide variety of data types in your method.

        For example in the last lesson we made a method called areTheyTheSame to test if two variables were the
        same, however we set it up to only accept int
        We can overload this method by creating methods with the same name but with different parameters to allow for
            more data types to be tested.
    */

    public static boolean areTheyTheSame(byte a, byte b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean areTheyTheSame(short a, short b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean areTheyTheSame(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean areTheyTheSame(float a, float b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean areTheyTheSame(double a, double b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean areTheyTheSame(boolean a, boolean b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean areTheyTheSame(String a, String b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static double calculateMetersToKilometers(byte meters) {
        return ((double)(meters) / 1000); // We need to cast meters to a double
    }
    public static double calculateMetersToKilometers(short meters) {
        return ((double)(meters) / 1000); // We need to cast meters to a double
    }
    public static double calculateMetersToKilometers(int meters) {
        return ((double)(meters) / 1000); // We need to cast meters to a double
    }
    public static double calculateMetersToKilometers(float meters) {
        return ((double)(meters) / 1000); // We need to cast meters to a double
    }
    public static double calculateMetersToKilometers(double meters) {
        return ((double)(meters) / 1000); // We need to cast meters to a double
    }
    // You can even overload a function and have it do different things
    public static double calculateMetersToKilometers(double meters, int decimalPlaces) {
        double result = ((double)(meters) / 1000);
        int dp = (int) Math.pow(10, decimalPlaces);
        double result_trimmed = Math.floor(result * dp) / dp;
        return result_trimmed;
    }

    public static void main(String[] args) {

        boolean areTheyEqual; // Initialized it
        areTheyEqual = areTheyTheSame(12, 2);
        System.out.println(areTheyEqual);

        areTheyEqual = areTheyTheSame(12.2f, 12.2f);
        System.out.println(areTheyEqual);

        areTheyEqual = areTheyTheSame(128.12, 128.128);
        System.out.println(areTheyEqual);

        areTheyEqual = areTheyTheSame(true, false);
        System.out.println(areTheyEqual);

        areTheyEqual = areTheyTheSame("Hello", "Hello");
        System.out.println(areTheyEqual);


        System.out.println("____________________");


        double result;
        result = calculateMetersToKilometers(14);
        System.out.println(result);

        result = calculateMetersToKilometers(102);
        System.out.println(result);

        result = calculateMetersToKilometers(1024);
        System.out.println(result);

        result = calculateMetersToKilometers(10245.3f);
        System.out.println(result);

        result = calculateMetersToKilometers(1458.189, 4);
        System.out.println(result);

    }

}
