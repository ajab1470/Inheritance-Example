public class Cat { //class
    private String name;
    private int whiskers;
    private double length;

    public Cat(String name, int whiskers, double length) { //constructor
        this.name = name;
        this.whiskers = whiskers;
        this.length = length;
    } //constructor

    public void meow() { //meow
        System.out.println(name + " says Meow!!");
    } //meow

    public String getName() { //getName
        return name;
    } //getName


} //class
