package overloaded_constructors;

public class Main {
    public static void main(String[] args) {
        // overloaded constructors = multiple  constructors within a class with same naame,
        //                           but have different parameters
        //                           name + parameters = signature

        Pizza pizza = new Pizza("thicc crust","tomato","mozzarella");

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.toppíng);


    }
}
