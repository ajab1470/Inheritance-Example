package Main;
import Code.*;

public class Main {
    public static void main(String[] args) {
        Cat cat0 = new Cat("Fluffy", 5.0, "Tuxedo");
        Dog dog0 = new Dog("Spot", "Brown");
        Turtle turtle0 = new Turtle("Gary", "Green");

        //We can make things of type animal, but Animal is missing functionality in certain methods
        //To get around this, we can "borrow" functionality from child classes, meaning cat1 is of type Animal but will
        //  rely on the Cat class for what to do on method calls
        Animal cat1 = new Cat("Precious", 4.2, "Gray");
        Animal dog1 = new Dog("Fido", "Golden");
        Animal turtle1 = new Turtle("Tom", "Blue");

    }
}
