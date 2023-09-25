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
        // Override makeNoise method from Animal Class, but here it does nothing,
        // because it does not implementing makeNoise method : super.makeNoise() is missing
    }

    @Override // implements & Override move method from Animal Class.
    public void move(String speed) {
        super.move(speed); // implements move method from Animal Class: kind of Animal.move(speed)
        System.out.println("Dogs walk, run & wag their tail");
    }
}
