public class Panda implements Prey, Predator {

    @Override
    public void hunt() {
        System.out.println("Pandas can hunt!");
    }

    @Override
    public void escape() {
        System.out.println("Pandas can escape!");
    }
}
