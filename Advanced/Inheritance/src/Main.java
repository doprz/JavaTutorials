public class Main {

    public static void main(String[] args) {

        // Just testing a basic animal to see if the parent class works
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Husky", 7, 20, 2, 4, 1, 24, "Silky");
        dog.eat(); // Inherited from the Animal Class because it is a public method, which means that it can be accessed from outside of Animal
        dog.walk();
        dog.run();
    }

}
