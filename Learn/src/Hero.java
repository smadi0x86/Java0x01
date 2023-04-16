// * This works simultaneously with "Person.java" and "SuperKeyword.java" files.

public class Hero extends Person{

    String power;

    Hero(String name, int age, String power) {
        super(name, age); // ? This is referring to the constructor of the parent class.
        this.power = power; // ? This is referring to the power variable of the current class.
    }
}
