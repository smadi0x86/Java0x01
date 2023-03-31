public class Friend {
    // * This works simultaneously with "StaticKeyword.java" file.

    String name;

    // ! This is a static variable that will be shared among all the objects.
    static int numberOfFriends = 0;

    Friend(String name)
    {
        this.name = name;
        numberOfFriends++; // ? This increments the static variable numberOfFriends by 1 when a new object is created.
    }


    // ! This method will return the number of friends that we have created.
    static void getNumberOfFriends() {
        System.out.println("you have "+numberOfFriends+" friends");
    }
}