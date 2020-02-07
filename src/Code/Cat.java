package Code;

//TODO rewrite and finish for extending

public class Cat {
    private String name;
    private int whiskers;
    private double length;

    public Cat(String name, int whiskers, double length) {
        this.name = name;
        this.whiskers = whiskers;
        this.length = length;
    }

    public void meow() {
        System.out.println(name + " says Meow!!");
    }

}
