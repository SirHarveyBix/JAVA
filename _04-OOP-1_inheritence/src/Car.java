public class Car {

    public Car() { // constructor
        System.out.println("Empty constructor Called !");
    }

    // fields :
    private String make = "Tesla"; // default value
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    // Getters
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getDoors() {
        return doors;
    }
    public boolean isConvertible() {
        return convertible;
    }
    public String getMake(){
        return make;
    }

    // Setters
    public void setMake(String make) {
        // Validation
        if (make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake){
            case "holden", "porsche", "tesla"-> this.make = make;
            default -> {
                this.make ="Unsupported";
            }
        }
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {
        System.out.println(doors + "-Doors " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}
