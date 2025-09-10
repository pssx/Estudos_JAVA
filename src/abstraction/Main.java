package abstraction;

public class Main {
    public static void main(String[] args) {
        // https://www.journaldev.com/1582/abstract-class-in-java
        // abstract = abstract classes cannot be instantiated,but they can have a subclass
        //            abstract methods are declared without an implementation
        // abstract keyword is used to create a abstract class and method. Abstract class in java can’t be instantiated. An abstract class is mostly used to provide a base for subclasses to extend and implement the abstract methods and override or use the implemented methods in abstract class.
        //  Vehicle is generic, is abstract


        //Vehicle vehicle = new Vehicle(); //error
        Car car = new Car();
        car.go();
        car.sound();


    }
}
