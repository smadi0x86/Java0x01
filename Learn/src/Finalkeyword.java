/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.
 
*/

/*
    Explaining FinalKeyword
    ======================
    ! Final keyword is used to make a variable, method, class and parameter constant.
    ! Final keyword can be used with any data type.
    ! Final keyword can be used with any access modifier (public, private, protected).
    ! Final keyword can be used with any non-access modifier (static, abstract,synchronized, native, strictfp)
    ! It is useful when you want to make a variable constant and you don't want to change it's value

*/

/*
    Explaining the code
    ======================
    ? The code is explained below.
    
*/

public class Finalkeyword {
    public static void learn(String[] args) throws Exception {

        // ! How to use final keyword with a class:

        // ? public final class FinalClass {
        // ? // ! code
        // ? }

        // ! How to use final keyword with a method:

        // ? public final void finalMethod() {
        // ? // ! code
        // ? }

        // ! How to use final keyword with a variable:

        // ? final int myInt = 100;
        // ? myInt = 200; // ! Error: cannot assign a value to a final variable

        // ! How to use final keyword with a parameter:

        // ? public void myMethod(final int myInt) {
        // ? // ! code
        // ? }
    }
}
