# Java OOP Assignment

This project demonstrates three core object-oriented programming (OOP) concepts in Java:

- *Concrete Class*
- *Abstract Class*
- *Interface*

Each type is implemented properly, followed by a test file that creates objects and calls their methods.

---

## 📄 Contents

- Creature.java – A *Concrete Class* with full method definitions.
- Aquatic.java – An *Abstract Class* with both abstract and normal methods.
- Cat.java – An *Interface* with method declarations only.
- Main.java – A *Testing Class* that creates and uses objects from the above files.

---

## ✅ Descriptions

### 1. Concrete Class - Creature
- A regular class with variables name and age.
- Includes methods:
  - displayInfo() – prints the creature’s name and age.
  - makeSound() – prints a simple sound message.

### 2. Abstract Class - Aquatic
- Has a constructor and a regular method displayInfo().
- Contains an abstract method swim() that must be written by any subclass.

### 3. Interface - Cat
- Only contains method declarations:
  - makeSound()
  - performAction()
- Any class that uses this interface must define both methods.

### 4. Testing - Main
- Uses:
  - A regular Creature object.
  - An anonymous class that extends Aquatic.
  - An anonymous class that implements Cat.

---

## 💻 How to Run

1. Save all .java files in the same folder.
2. Compile them using:
   ```bash
   javac *.java
