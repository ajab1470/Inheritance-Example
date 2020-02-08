package Code;

/**
 * author: Ashley Beckers
 * description: The dog class is a class that describes a dog animal.
 * Read this class after reading Animal so you can understand the the inherited things
 */
public class Dog extends Animal {
    //We only need the fields provided by animal, so none need to be specified here
    //if Dog were to need a unique field, that can be put here

    /**
     * Creates a new Dog class
     * @param name the name given to this dog
     * @param color the fur color of the dog
     */
    public Dog(String name, String color) {
        super(name, color); //the first line of the constructor must ALWAYS be a call to the parent's constructor
        //note that java will put a default constructor (that takes no parameters) in every class, so if no constructor
        //  is specified in the parent class, simply say super();
    }

    //the override keyword is used to indicate this is replacing a method from another class
    //using @Override replaces documentation (the reader should refer to the docs for the original)
    @Override
    public void speak() {
        System.out.println("Woof");
    }

    @Override
    public void grow() {
        //the super keyword is used to indicate it is an attribute from the parent class
        //it is completely optional, but highly recommended, unless you have another option of the same name
        super.length += 3;
    }

    /**
     * If you are overriding an abstract method where the rules are implementation dependent, you should leave a block
     *   comment like this one
     * A dog likes every other animal
     */
    @Override
    public boolean likes(Animal other) {
        return true;
    }
}
