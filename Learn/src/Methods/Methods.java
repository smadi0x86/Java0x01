/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.

    
*/

/*
    Explaining Methods
    ======================
    ! Methods are blocks of code that performs a specific task.
    ! Methods are used to avoid code duplication and make the code more readable.
    ! A method is executed when it is called and it can be called multiple times such as in a loop.
    ! So basically, methods are the equivelent to functions in C or C++ etc.... .
    
*/

/*
    Explaining the code
    ======================
    ? 1 > The syntax of a method is:
        ? >> [access modifier] [return type] [method name] ([parameters]) {
                [method body]
                [return statement] //? It is optional and it is used to return a value from the method.
             }
    ? 2 > We create a method and write some instruction that we want to perform without a return value.
    ? 3 > We create a method and write some instruction that we want to perform with a return value.
    ? 4 > We call the method including the parameters we want.
    
*/

public class Methods {
    public static void learn(String[] args) throws Exception {

        String name = "John";
        int age = 21;
        myMethod(name, age); // ? 4
    }

    static void myMethod(String name, int age) { // ? 2

        System.out.println("Hello " + name);
        System.out.println("Your age is " + age);

        int var = 10;
        int var2 = 20;
        int result = sum(var, var2);
        System.out.println(result);
        // ? or
        System.out.println(sum(var, var2));
    }

    static int sum(int x, int y) { // ? 3
        int z = x + y;
        return z;
        // ? or return x + y;
    }
}
