public class Main {
    public static void main(String[] args) {

        Car car = new Car();
//        car.make = "Porsche";
//        car.model = "Carrera";
//        car.color = "Red";
        System.out.println("Make = " + car.getMake());
        car.describeCar();
    }
}
