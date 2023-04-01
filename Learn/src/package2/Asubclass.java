package package2;
import package1.*; // import everything from package1

public class Asubclass extends A {
    public static void learn(String[] args) {

        C c = new C();

        System.out.println(c.defaultMessage); // ? It's accessible because it's in the same package.

        System.out.println(c.publicMessage); // ? It's accessible because it's public which is visible to all classes.

        Asubclass asub = new Asubclass(); // ? We can access the protected variable from the parent class because we're in a subclass.
        System.out.println(asub.protectedMessage); // ? It's accessible because it's protected which is accessible in the same package and subclasses.
    }
}
