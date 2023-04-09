/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.
    * This works simultaneously with "Friend.java" file.
    
*/

/*
    Explaining Static Keyword
    ======================
    ! Static keyword is used to create a class attribute.
    ! Static =  A modifier single copy of a variable/method is created and shared.
    ! Static variables are shared among all the objects, class owns the static member.
    ! We can apply the static keyword to methods as well as shown in "Friend.java" file.

*/

/*
    Explaining the code
    ======================
    ? 1 > friend1, friend2 and friend3 share the same numberOfFriends variable (A modifier single copy).
    ? 2 > We can access the static variable using the object name or the class name, but its not recommended due to the confusion.
    ? 3 > This is an example of a static method that we can use without creating an object, instead of using Math math = new Math(); .

*/

//! ------------------------------------------------------ The Code ------------------------------------------------------ //

public class StaticKeyword {
    public static void learn(String[] args) {

        Friend friend1 = new Friend("Yousef"); // ? 1
        Friend friend2 = new Friend("Ahmed");
        Friend friend3 = new Friend("Mohamed");

        System.out.println(Friend.numberOfFriends);
        System.out.println(friend1.numberOfFriends); // ? 2
        System.out.println(friend2.numberOfFriends);
        System.out.println(friend3.numberOfFriends);

        /*
            ! If we remove the static keyword in "Friend.java" from the numberOfFriends variable:
                * > We will get 3 different values for each object and we will have to access the variable using the object name.
        */

        /*
            ! We can apply the static keyword to methods as well as shown in "Friend.java" file.
            ! This method will return the number of friends that we have created:
        */

        Friend.getNumberOfFriends();

        // Math.round(x); // ? 3
    }
}