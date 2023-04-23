/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.
    * This works simultaneously with "Person.java" and "Hero.java" files.
    
*/

/*
    Explaining Super Keyword 
    ======================
    ! The super keyword is used to refer to the superclass (parent) of an object, to access the methods & variables of the superclass.
    ! It's similar to the "this" keyword that refers to the class that "super" keyword refers to the parent class.
    
*/

/*
    Explaining the code
    ======================
    ? 1 > We create an instance from the class.
    ? 2 > We use print its attributes.
    
*/

//! ------------------------------------------------------ The Code ------------------------------------------------------ //

public class SuperKeyword {
    public static void learn(String[] args) {

        Hero hero1 = new Hero("Superman", 30, "Flying"); // ? 1
        Hero hero2 = new Hero("Batman", 40, "Money");

        System.out.println(hero1.name); // ? 2
        System.out.println(hero1.age);
        System.out.println(hero1.power);

        System.out.println(hero2.name);
        System.out.println(hero2.age);
        System.out.println(hero2.power);
    }
}
