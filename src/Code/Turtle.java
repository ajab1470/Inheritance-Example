package Code;

/**
 * author: Ashley Beckers
 * description: The turtle class is a class that describes a turtle animal. For the purposes of this example, all
 *   turtles add an "os" to the end of their name
 *   Read this class after reading Dog if you are unfamiliar with the basics of extending an abstract class
 */
public class Turtle extends Animal {
    /**
     * creates a turtle object
     * turtles start at 4 inches
     * @param name the name to assign turtle (Before the mandatory "os")
     * @param color the shell color
     */
    public Turtle(String name, String color) {
        super(name, color);
        super.length = 4.0;
    }

    @Override
    public String getName() {
        //since the name must have the "os" on the end, but is otherwise the same, we can just call Animal's version and
        //  add to it
        //You can achieve the same result using super.name, but that is not the case for more complicated methods
        return super.getName() + "os";
    }

    @Override
    public void speak() {
        System.out.println("meep");
    }

    @Override
    public void grow() {
        super.length += .5;
    }

    /**
     * turtles are afraid of animals that aren't turtles
     */
    @Override
    public boolean likes(Animal other) {
        if (other instanceof Turtle) { //instanceof determines if it is of the same type.
            return true;
        }
        return false;
    }
}
