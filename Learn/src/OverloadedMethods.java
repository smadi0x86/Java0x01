public class OverloadedMethods {
    public static void learn(String[] args) throws Exception {
        // ! Overloaded Methods - Methods with the same name but different parameters
        // ! It is useful when you want to perform the same task but with different parameters
        // ! You can have as many overloaded methods as you want
        // ! The compiler will decide which method to call based on the parameters that you pass to it

        int add2Parameters = add(1, 2);
        int add3Parameters = add(1, 2, 3);
        int add4Parameters = add(1, 2);

        System.out.println(add2Parameters);
        System.out.println(add3Parameters);
        System.out.println(add4Parameters);
    }
        // ? This is how you overload methods:
        static int add(int x, int y) {
            System.out.println("This is the add method with 2 parameters");
            return x + y;
        }
        // ? Overloading with Different Number of Parameters:
        static int add(int x, int y, int z) {
            System.out.println("This is the add method with 3 parameters");
            return x + y + z;
        }
        // ? Overloading with Different Data Type:
        static double add(double x, double y) {
            System.out.println("This is the add method with 4 parameters");
            return x + y;
        }
}