package Inheritance;

public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog() {
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super( // call the constructor of Animal
                type,
                weight < 15 ? "small" : (weight < 35 ? "medium" : "large"),
                weight
        );

        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {
        // Override makeNoise method from Animal Class, making this code unique to Dog
        if (type == "Wolf") System.out.println("Ow Woooo !");

        bark();
        System.out.println();
    }

    @Override // implements & Override move method from Animal Class.
    public void move(String speed) {
        super.move(speed); // implements move method from Animal Class: kind of Animal.move(speed);
        if (speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark() {
        System.out.println("Woof! ");
    }

    private void run() {
        System.out.println("Dog Running! ");
    }

    private void walk() {
        System.out.print("Dog Walking ");
    }

    private void wagTail() {
        System.out.println("Tail Waging! ");
    }
}
