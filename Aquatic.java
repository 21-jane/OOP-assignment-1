// Abstract class for aquatic creatures
public abstract class Aquatic {
    // Name of the aquatic creature
    protected String name;

    // Constructor to set the name
    public Aquatic(String name) {
        this.name = name;
    }

    // Abstract method (no body) that must be written in child class
    public abstract void swim();

    // Method to print the name of the aquatic creature
    public void displayInfo() {
        System.out.println("Aquatic Creature: " + name);
    }
}
