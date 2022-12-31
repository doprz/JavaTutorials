package basics;

public class Main {

    /*
        A class is a blueprint from which objects are created. In essence it is like a blueprint.
        They are useful because they make a common blueprint/prototype where you can create objects from it with shared
            properties and characteristics but with different identities.
    */

    public static void main(String[] args) {

        /*
            The class Car can be treated somewhat like a datatype
            To initialize a new object type out the class name followed by the variable name
                and set it equal to a new class
        */
        Car lamborghini = new Car(); // Initializing a new Car object
        Car ford = new Car(); // Initializing a new Car object

        ford.setModel("Mustang"); // Using the public setModel() method to change the model property(private)
        lamborghini.setModel("Aventador"); // Using the public setModel() method to change the model property(private)

        // As you can see the getModel() method properly formats and checks for a valid model name
        System.out.println("The model is a " + lamborghini.getModel());
        System.out.println("The model is a " + ford.getModel());

    }

}
