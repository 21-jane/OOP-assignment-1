// Concrete class representing a creature
public class Creature {
    // Instance variables
    private String name;
    private int age;

    // Constructor to initialize the creature's name and age
    public Creature(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to print the creature's name and age
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Method to make the creature sound
    public void makeSound() {
        System.out.println("The creature makes a sound.");
    }
}
