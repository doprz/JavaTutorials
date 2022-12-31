public class ParsingValuesFromAString {

    public static void main(String[] args) {

        /*
            Similar to casting, parsing a value from a string is essentially getting a number in a string format
                and parsing(converting) it into a number (byte, short, int, long, float, and double)
        */

        String year = "2020";
        System.out.println("The current year is: " + year);

        // As you can see this will output "20201" instead of 2021 because it adds it to the end of year as a string and not number
        System.out.println("Next year will be: " + (year + 1));

        // To fix this we need to parse the string
        int nextYear = Integer.parseInt(year) + 1; // This parses(converts) the year into a number and adds 1 to it as a number and not a string
        System.out.println("Next year will be: " + nextYear);

        System.out.println("____________________");

        /*
            This also works with other data types such as byte, short, int, long, float, and double
        */

        String temperature = "92.5";
        float howManyDegreesUntil100 = 100 - Float.parseFloat(temperature);
        System.out.println("Temperature: " + temperature);
        System.out.println("Degrees until 100: " + howManyDegreesUntil100);

        System.out.println("____________________");

        String size_m = "0.0128";
        double size_cm = Double.parseDouble(size_m) * 100;
        double size_mm = Double.parseDouble(size_m) * 1000;
        System.out.println("Size in cm: " + size_cm);
        System.out.println("Size in mm: " + size_mm);

    }

}
