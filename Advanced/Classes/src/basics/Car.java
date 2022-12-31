package basics;

// This is a blueprint for what a Car object should be
public class Car {

    /*
        They keyword private is an access modifier that makes it so that these variables are private to anything outside of the class
    */

    // A set of Car properties. Also called fields
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    /*
        These are public methods that allow us to modify the class's properties/variables. This is done for security reasons
        Another advantage of this is that you can restrict how the variable changes to prevent errors by setting restrictions
    */
    public void setModel(String model) {
        // Format the model
        String lowercaseModel = model.toLowerCase();
        // Only accept a string as a model
        if (lowercaseModel != null) {
            // The this keyword is used to refer to the class's properties
            this.model = lowercaseModel; // This updates the individual object's model property with a setter method
        } else {
            this.model = "unknown";
        }
    }

    // Returns the model as a string
    public String getModel() {
        return this.model;
    }

}
