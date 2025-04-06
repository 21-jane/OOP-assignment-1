public class Main {
    public static void main(String[] args) {
        // Create a Creature object and use its methods
        Creature creature = new Creature("Generic Creature", 5);
        creature.displayInfo();  // Show name and age
        creature.makeSound();    // Make a sound

        // Create an Aquatic object using an anonymous class
        Aquatic aquatic = new Aquatic("Dolphin") {
            // Write the swim method here
            public void swim() {
                System.out.println(name + " is swimming.");
            }
        };
        aquatic.displayInfo();  // Show name
        aquatic.swim();         // Call swim

        // Create a Cat object using an anonymous class
        Cat cat = new Cat() {
            // Write the makeSound method
            public void makeSound() {
                System.out.println("The cat meows.");
            }

            // Write the performAction method
            public void performAction() {
                System.out.println("The cat jumps.");
            }
        };
        cat.makeSound();       // Call makeSound
        cat.performAction();   // Call performAction
    }
}


