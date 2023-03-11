public class Methods {
    public static void learn(String[] args) throws Exception {
        // ! Methods are blocks of code that performs a specific task
        // ! They are used to avoid code duplication and make the code more readable
        // ! It is executed when it is called and it can be called multiple times such as in a loop

        //? The syntax of a method is:
        // [access modifier] [return type] [method name] ([parameters]) {
        //     [method body]
        //   [return statement]             //? It is optional and it is used to return a value from the method
        // }

       String name = "John";
       int age = 21;
       myMethod(name, age);
}
        static void myMethod(String name , int age) {

            System.out.println("Hello " + name);
            System.out.println("Your age is " + age);

            int var = 10;
            int var2 = 20;
            int result = sum(var, var2);
            System.out.println(result);
            // ? or
            System.out.println(sum(var, var2));
    }

    static int sum(int x, int y) {
        int z = x + y;
        return z;
        // ? or
        // ? return x + y;
    }
}
