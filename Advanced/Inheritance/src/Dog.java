
// The class Dog inherits everything from an Animal object. This is done with the extends keyword
public class Dog extends Animal {

    // Characteristics that all dogs have and not necessarily all animals have
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // Dog constructor. All animals have these characteristics
    // Since we know that all dogs have 1 brain and 1 body, then we can safely omit them from the constructor's parameters
    // public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {

        // Super calls the constructor that is for the class that we're extending from. In this case to call the Animal constructor
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    // Unique method to a dog. This method can't be accessed from anywhere outside of the class because it is private
    private void chew() {
        System.out.println("Dog.chew() called");
    }

    // Overriding the Animal eat method
    @Override
    public void eat() {
        super.eat(); // Calling the Animal eat method
        System.out.println("Dog.eat() called");
        chew();
    }

    public void walk() {
        System.out.println("Dog.walk called");
        move(4);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(8);
    }

}
