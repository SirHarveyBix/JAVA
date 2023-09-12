public class Main {
    public static void main(String[] args) {

        Car car = new Car();
//        car.make = "Porsche"; // => can't access this way since make is private; instead uses setter
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setColor("Black");
        car.setConvertible(true);

        System.out.println("Make = " + car.getMake());
        System.out.println("Model = " + car.getModel());

        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        car.setConvertible(false);
        targa.setColor("Red");

        targa.describeCar();

        System.out.println("\n # ---- ---- ---- # \n");

        BankAccount bobAccount = new BankAccount("123456", 2500, "Bobby Brown", "Bobby@brown.me", "(+33) 123-4567");
        System.out.println(bobAccount.getNumber());
        System.out.println(bobAccount.getBalance());

        bobAccount.withdrawFunds(1000);
        bobAccount.depositFunds(250);
        bobAccount.withdrawFunds(500);
    }
}
