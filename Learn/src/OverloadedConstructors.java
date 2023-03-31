public class OverloadedConstructors {
    public static void learn(String[] args) {
        // ! overloaded constructors = multiple within a class with the same name, but different parameters.
        // ! name + parameters = signature
        // * This works simultaneously with "Pizza.java"

        Pizza pizza = new Pizza("Thin Crust", "Tomato Sauce", "Pepperoni", "Mozzarella");

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.topping);
        System.out.println(pizza.cheese);

        Pizza pizza2 = new Pizza("Thin Crust", "Tomato Sauce", "Pepperoni");

        System.out.println("Here are the ingredients of your pizza wihout cheese: ");

        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.topping);

        Pizza pizza3 = new Pizza("Thin Crust", "Tomato Sauce");

        System.out.println("Here are the ingredients of your pizza wihout cheese and pepperoni: ");

        System.out.println(pizza3.bread);
        System.out.println(pizza3.sauce);
    }
}
