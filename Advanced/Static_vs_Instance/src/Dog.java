public class Dog {

    private static String owner = "Me";
    private String name;

    // Constructor
    public Dog(String name) {
        this.name = name;
    }

    // Getters and Setters

    // Static method
    public static String getOwner() {
        // As you can see it is returning the field/variable that is shared among all Dog instances
        // It is written as Dog.owner instead if this.owner
        return owner;
    }

    public static void setOwner(String owner) {
        // As you can see it is setting the field/variable that is shared among all Dog instances
        Dog.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
