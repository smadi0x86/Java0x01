/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.
    * This works simultaneously with "StaticKeyword.java" file.
    
*/

/*
    Explaining the code
    ======================
    ? 1 > This is a static variable that will be shared among all the objects.
    ? 2 > This increments the static variable numberOfFriends by 1 when a new object is created.
    ? 3 > This method will return the number of friends that we have created.
    
*/

//! ------------------------------------------------------ The Code ------------------------------------------------------ //


public class Friend {
    // 

    String name;

    // ? 1 
    static int numberOfFriends = 0;

    Friend(String name)
    {
        this.name = name;
        numberOfFriends++; // ? 2
    }


    // ? 3 
    static void getNumberOfFriends() {
        System.out.println("you have "+numberOfFriends+" friends");
    }
}