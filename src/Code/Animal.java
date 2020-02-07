package Code;

/**
 * author: Ashley Beckers
 * description: the animal abstract class lays out the attributes (aka fields) and functionality (methods) of any
 *   classes that are animals. An abstract class is a class that can have both implemented and abstracted methods. Use
 *   the extends keyword to become a child class of this class
 */

public abstract class Animal {
    /**
     * the protected keyword means that child classes will have free access to these. You can have protected methods too
     * alternatively to this approach, you could make these private and make protected getters and setters
     */
    /** the name of this animal */
    protected String name;
    /** the length in inches of this animal */
    protected double length;
    /** the fur/skin/scale color of this animal */
    protected String color;

    /**
     * This constructor could be called by every
     * creates a baby (new) animal. Baby animals are assumed to have an initial lengthof 0 for the purposes of this
     *   example
     * @param name the name to assign the animal
     * @param color the color to label the animal
     */
    public Animal(String name, String color) {
        this.name = name;
        this.length = 0;
        this.color = color;
    }

    /**
     * abstract classes can have fully implemented methods just like any other class
     * gets the animal's name
     * @return the animal's name
     */
    public String getName() {
        return name;
    }

    /**
     * the abstract keyword means there will be no functionality defined (note the semi-colon (;) as opposed to curly
     *   braces ({}) with code). All child classes of this class MUST define functionality for abstract methods
     * the speak method is used to print the animal's sound to System.out
     */
    public abstract void speak();

    /**
     * Note: Documentation of abstract methods is very important! It defines purpose and rules for everyone who wants to
     *   make their own child class or call this method in their main
     * the grow method is used to increase length as an animal grows up
     */
    public abstract void grow();

    /**
     * Abstract methods can have return types and parameters just like any other method
     * the likes method determines if this animal will like another animal that it encountered
     * @param other the other animal encountered
     * @return true if this liked the other animal, false otherwise
     */
    public abstract boolean likes(Animal other);
}
