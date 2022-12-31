public class PrimitiveDataTypesOperations {

    public static void main(String[] args) {

        /*
            As you learned previously data types are used to distinguish different types of data
            Here we're going to experiment what kinds of data types can be "combined" and what kinds of operations you can do on them
         */

        /* ****************************************************** */
        /*                     int and long                       */
        /* ****************************************************** */

        int bankAccountMoney = 4096;
        int paycheck = 812;
        int totalInBankAccount = bankAccountMoney + paycheck; // Allowed
        System.out.println(totalInBankAccount);

        // NOT Allowed because the mixing of these data types aren't compatible
        // boolean gotPayed = true;
        // int totalInBankAccountError = bankAccountMoney + gotPayed;
        // System.out.println(totalInBankAccountError);

        int secondsInAMinute = 60;
        long seconds = 60000000;
        long minutes = seconds / secondsInAMinute; // Allowed
        System.out.println("minutes: " + minutes);
        // This works because since a long is bigger than an int, it can store int(s) inside of it without overflowing or causing problems


        /* ****************************************************** */
        /*                       Strings                          */
        /* ****************************************************** */

        String firstName = "Foo";
        String lastName = "Bar";
        String fullName = firstName + lastName; // Allowed because you can add (concat) strings together

        String month = "May";
        byte day = 28;
        short year = 2020;
        System.out.println(month + ", " + day + " " + year); // Adding numbers to a String IS Allowed


        /* ****************************************************** */
        /*                   float and double                     */
        /* ****************************************************** */

        float sem1Grade = 96.8f;
        float sem2Grade = 92.8f;
        // Allowed because a double can store more precision than a float. Doubles can store more info than a float
        double avgGrade = (sem1Grade + sem2Grade) / 2;

        double sem1GradeError = 95.3;
        double sem2GradeError = 99.1;
        // NOT Allowed because a float CAN'T store a double because it is larger than it [Hint]: This can be resolved with casting
        // float avgGradeError = (sem1GradeError + sem2GradeError) / 2;

        double pounds = 200d;
        double convertedToKilograms = pounds * 0.45359237d;
        System.out.println("Converted kilograms = " + convertedToKilograms);


    }

}
