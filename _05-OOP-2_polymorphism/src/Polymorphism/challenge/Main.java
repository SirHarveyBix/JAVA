package Polymorphism.challenge;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);
        System.out.println("\n # # # # # \n");

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 15.4, 6);
        runRace(ferrari);
        System.out.println("\n # # # # # \n");

        Car tesla = new electricCar("2022 red tesla model 3", 568, 75);
        runRace(tesla);
        System.out.println("\n # # # # # \n");

        Car ferrariHybrid = new HybridCar("2022 Black Ferrari SF90 stradale", 16, 8, 8);
        runRace(ferrariHybrid);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
