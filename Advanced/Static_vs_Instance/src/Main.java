public class Main {

    /*
        Static variables are declared by using the keyword static otherwise they are instance variables

        Every instance of that class shares the same static variable. It is only created once instead of a new one for
            each instance of the class (instance variable)

        Any change made to static variables is reflected upon all instances of the class because it is shared
    */

    public static void main(String[] args) {

        Dog Banjo = new Dog("Banjo");
        Dog Rex = new Dog("Rex");

        // Incorrect way of getting the static variable/field owner but it's for clarification reasons
        // System.out.println(Banjo.getOwner());
        // System.out.println(Rex.getOwner());

        // Banjo.setOwner("You"); // Incorrect way of setting the static variable
        Dog.setOwner("You"); // Correct way
        // System.out.println(Banjo.getOwner()); // Outputs: You
        // System.out.println(Rex.getOwner()); // Outputs: You

        // Correct way of getting the static variable/field
        System.out.println(Dog.getOwner()); // Outputs: You


        System.out.println("____________________");


        Banjo.setName("Banjo Snyder"); // This will only modify this instance since the variable/field is an instance version and not static
        System.out.println(Banjo.getName()); // Outputs: Banjo Snyder
        System.out.println(Rex.getName()); // Outputs: Rex

    }

}
