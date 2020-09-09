package Main;
/**
 * author: Ashley Beckers
 * description: creates and tests various animals. Used to show different situations with inheritance
 * Note: Read the documentation of all classes in the Code package before examining this code. You should attempt to
 *   figure out what the code will output before running it, then read the comments of Solution.Main for explanations
 */

import Code.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ignore this bit
        Scanner scan = new Scanner(System.in);

        //Lets make some animals!
        Dog dog0 = new Dog("Spot", "Brown");
        Cat cat0 = new Cat("Fluffy", 5.0, "Tuxedo");
        Turtle turtle0 = new Turtle("Gary", "Green");
        //1. The following line does not compile. Why is that?
        //Animal animal0 = new Animal("Gerald", "Red")


        /** testing dog0 */
        dog0.grow();
        System.out.println("Dog0 grew!");
        System.out.println("Dog0: " + dog0); //2. What does this print?
        dog0.speak();
        System.out.println("Does dog0 like cat0? " + dog0.likes(cat0)); //3. What does this print?

        System.out.println("Press enter to proceed to next test, or q to quit");
        if (scan.nextLine().equals("q")) {
            System.exit(0);
        }

        System.out.println();


        /** testing cat0 */
        cat0.purr(3);  //prints purr 3 times
        cat0.grow();      //increases length by one inch
        System.out.println("Cat0 grew!");
        System.out.println("Cat0: " + cat0);  //4. What does this print?
        cat0.speak();
        System.out.println("Does cat0 like dog0? " + cat0.likes(dog0)); //5. What does this print?

        System.out.println("Press enter to proceed to next test, or q to quit");
        if (scan.nextLine().equals("q")) {
            System.exit(0);
        }

        System.out.println(); //new line

        /** testing turtle0 */
        turtle0.grow();
        System.out.println("Turtle0 grew!");
        System.out.println("Turtle0: " + turtle0); //6. What does this print? HINT: see Animal's toString
        turtle0.speak();
        System.out.println("Does turtle0 like cat0? " + turtle0.likes(cat0));

        System.out.println("Press enter to proceed to next test, or q to quit");
        if (scan.nextLine().equals("q")) {
            System.exit(0);
        }

        System.out.println(); //new line


        //We can make things of type animal, but Animal is missing functionality in certain methods
        //To get around this, we can "borrow" functionality from child classes, meaning cat1 is of type Animal but will
        //  rely on the Cat class for what to do on method calls
        Animal dog1 = new Dog("Fido", "Golden");
        Animal cat1 = new Cat("Precious", 4.2, "Gray");
        Animal turtle1 = new Turtle("Tom", "Blue");

        /** testing dog1 */
        //No questions here. But observe how dog1 and dog0 behave the same
        dog1.grow();
        System.out.println("Dog1 grew!");
        System.out.println("Dog1: " + dog1);
        dog1.speak();
        System.out.println("Does dog1 like cat1? " + dog1.likes(cat1));

        System.out.println("Press enter to proceed to next test, or q to quit");
        if (scan.nextLine().equals("q")) {
            System.exit(0);
        }

        System.out.println();


        /** testing cat1 */
        //7. The following line does not compile. Why is that?
        //cat1.purr(3);
        cat1.grow();      //8. Does this still increase by one inch?
        System.out.println("Cat1 grew!");
        System.out.println("Cat1: " + cat1);

        System.out.println("Press enter to proceed to next test, or q to quit");
        if (scan.nextLine().equals("q")) {
            System.exit(0);
        }

        System.out.println(); //new line

        /** testing turtle1 */
        System.out.println("Turtle1: " + turtle1); //9. What does this print?
        turtle1.speak();
        System.out.println("Does turtle0 like turtle1? " + turtle0.likes(turtle1));   //10. What does this print?

        System.out.println(); //new line

        System.out.println("All done! Be sure to read the comments in Solution to check your understanding");
    }
}
