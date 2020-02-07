package Code;

/**
 * author: Ashley Beckers
 * description: The cat class is a class that describes a cat animal. For the purposes of this example, all cats are
 *   standoffish
 *   Read this class after reading Dog if you are unfamiliar with the basics of extending an abstract class
 */

public class Cat extends Animal {
    /**
     * Creates a Cat object
     * @param name the name to assign the cat
     * @param length the length to give the cat
     * @param color the fur color of the cat
     */
    public Cat(String name, double length, String color) {
        super(name, color); //Don't forget to always start your constructor with the super constructor
        super.length = length;
    }

    /**
     * child classes can (and often will) have methods unique to them as well as their overridden ones
     * cats, unlike most animals, can purr
     * @param n the number of times to purr
     */
    public void purr(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("purr");;
        }
    }

    @Override
    public void speak() {
        System.out.println("Meow");
    }

    @Override
    public void grow() {
        length += 1;
    }

    /**
     * A cat likes another animal if it is also a cat and the same color
     */
    @Override
    public boolean likes(Animal other) {
        if (other instanceof Cat) {
            if (other.color.equals(super.color)) {
                return true;
            }
        }
        return false;
    }
}
