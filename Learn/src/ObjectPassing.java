public class ObjectPassing {

    public static void learn(String[] args) {
        // ! Object passing is when you pass an object to a method.
        // ! You can pass an object to a method by using the object's name as a parameter.
        // * This works simultaneously with the "Garage.java" and "Trucks.java" files (We want to park the trucks in garage).

        Garage garage = new Garage();

        Trucks truck = new Trucks("Mercedes");
        Trucks truck2 = new Trucks("Jett");

        garage.park(truck);
        garage.park(truck2);
    }
}
