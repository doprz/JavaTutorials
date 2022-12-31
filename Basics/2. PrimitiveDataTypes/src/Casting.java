public class Casting {

    public static void main(String[] args) {

        /*
            There's cases where you have a calculation that fits into a 'smaller' data type but it causes errors to do so
                for example storing a small value int into a byte

            This conversion is called casting
         */

        int value1 = 14;
        int value2 = 6;
        /* This causes an ERROR because you're trying to fit in an int into a byte although the value is small enough
            to fit into the byte. The solution to this is to cast the variable. Basically converting it from one
            data type to another

            This is done by putting in parenthesis the data type that you want to convert it into
         */

        /*  Incorrect  */
        // byte avgValue = (value1 + value2) / 2;
        /*  Correct  */
        byte avgValue = (byte) ((value1 + value2) / 2);
        System.out.println("avgValue: " + avgValue);


        /*  Another example, this time with floats and doubles  */
        double price = 87.2;
        byte people = 12;
        /*  Correct use of casting  */
        float pricePerPerson = (float) (price / people);
        System.out.println("pricePerPerson: " + pricePerPerson);


    }

}
