/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.
    * This works simultaneously with the "Garage.java" and "Trucks.java" files (We want to park the trucks in garage).
    
*/

/*
    Explaining Object Passing
    ======================
    ! Object passing is when you pass an object to a method.
    ! You can pass an object to a method by using the object's name as a parameter.

*/

/*
    Explaining the code
    ======================
    
*/

//! ------------------------------------------------------ The Code ------------------------------------------------------ //



public class ObjectPassing {
    public static void learn(String[] args) { 

        Garage garage = new Garage();

        Trucks truck = new Trucks("Mercedes");
        Trucks truck2 = new Trucks("Jett");

        garage.park(truck);
        garage.park(truck2);
    }
}
