package Solution;
/**
 * author: Ashley Beckers
 * description: creates and tests various animals. Used to show different situations with inheritance
 * Note: Read the documentation of Main.Main before reading this and try to answer the 10 questions asked. Run the code
 * to check if you were right, then read the comments here for answers and explanations
 */

import Code.*;

public class Main {
    public static void main(String[] args) {
        Dog dog0 = new Dog("Spot", "Brown");
        Cat cat0 = new Cat("Fluffy", 5.0, "Tuxedo");
        Turtle turtle0 = new Turtle("Gary", "Green");
//1. You cannot create an instance of an abstract class! We can't say new Animal() because the computer wouldn't
//   know what to do for its abstract classes
        //Animal animal0 = new Animal("Gerald", "Red")


        /** testing dog0 */
        dog0.grow();
        System.out.println("Dog0 grew!");
//2. Prints exactly what you'd expect from Animal's toString. Note that the height started as the initial height
//   provided by animal and increased 3.0 by the grow method in Dog
        System.out.println("Dog0: " + dog0);
        dog0.speak();
//3. Prints true! all cats are animals, because Cat extends Animal. Dogs like all animals, so dog likes cat
        System.out.println("Does dog0 like cat0? " + dog0.likes(cat0)); //3. What does this print?
        System.out.println();


        /** testing cat0 */
        cat0.purr(3);  //prints purr 3 times
        cat0.grow();      //increases length by one inch
        System.out.println("Cat0 grew!");
//4. Again, exactly what you'd expect. Note that this time it started with an initial height of 5 because of the
//   way we created it and increased by one
        System.out.println("Cat0: " + cat0);  //4. What does this print?
        cat0.speak();
//5. False. Cats only like cats that are the same color. While dog0 is an animal, it is not a cat nor the same
//   color
        System.out.println("Does cat0 like dog0? " + cat0.likes(dog0));

        System.out.println(); //new line

        /** testing turtle0 */
        turtle0.grow();
        System.out.println("Turtle0 grew!");
//6. Not quite what you expected? Animal's toString relies on getName for the name. Since this animal is a
//   turtle, getName will return the name followed by "os"
        System.out.println("Turtle0: " + turtle0);
        turtle0.speak();
        System.out.println("Does turtle0 like cat0? " + turtle0.likes(cat0));

        System.out.println(); //new line


        //We can make things of type animal, but Animal is missing functionality in certain methods
        //To get around this, we can "borrow" functionality from child classes, meaning cat1 is of type Animal but will
        //  rely on the Cat class for what to do on method calls
        Animal dog1 = new Dog("Fido", "Golden");
        Animal cat1 = new Cat("Precious", 4.2, "Gray");
        Animal turtle1 = new Turtle("Tom", "Blue");

        /** testing dog1 */
        //No questions here. But observe how dog1 and dog0 behaved the same


        /** testing cat1 */
 //7. The following line does not compile. Remember, cat1 is an Animal, so it only has methods that Animal has.
//cat1.purr(3);

//8. Yes! we are still relying on the Cat class for how to actually execute method calls
        cat1.grow();
        System.out.println("Cat1 grew!");
        System.out.println("Cat1: " + cat1);


        System.out.println(); //new line

        /** testing turtle1 */
//9. Even though turtle1 is an Animal type, and Animal has implementation for getName, turtle1 still borrows
//   its functionality from the Turtle class, so it still uses Turtle's getName
        System.out.println("Turtle1: " + turtle1);
        turtle1.speak();
//10. True! Even though turtle1 is defined as an Animal type, it is using Turtle as its actual functionality.
//    This means that it will pass the instanceof Turtle check. The computer sees it as both Animal and Turtle
        System.out.println("Does turtle0 like turtle1? " + turtle0.likes(turtle1));

        System.out.println(); //new line

        System.out.println("read all the documentation for this file to get a better understanding of why this code" +
                " behaves the way it does.");
    }
}
