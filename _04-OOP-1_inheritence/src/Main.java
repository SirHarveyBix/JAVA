import exercices.Customer;

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

        // BankAccount bobAccount = new BankAccount("123456", 2500, "Bobby Brown", "Bobby@brown.me", "(+33) 123-4567");
        BankAccount bobAccount = new BankAccount();
        System.out.println("Account number " + bobAccount.getNumber() + " its balance " + bobAccount.getBalance());

        bobAccount.withdrawFunds(1000);
        bobAccount.depositFunds(250);
        bobAccount.withdrawFunds(500);

        System.out.println("\n # ---- ---- ---- # \n");

        BankAccount timsAccount = new BankAccount("Tim", "Tim@email.com", "12345");
        System.out.println("Account N° " + timsAccount.getNumber() + "; name " + timsAccount.getCustomerName());

        System.out.println("\n # ---- ---- ---- # \n");

        Customer customer = new Customer("Didier", 1000, "Didier.me");
        System.out.println(customer.getName() + " - " + customer.getEmailAddress() + " - " + customer.getCreditLimit());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName() + " - " + secondCustomer.getEmailAddress() + " - " + secondCustomer.getCreditLimit());

        Customer thirdCustomer = new Customer("Denis", 259, "Denis@chezlesdenis.me");
        System.out.println(thirdCustomer.getName() + " - " + thirdCustomer.getEmailAddress() + " - " + thirdCustomer.getCreditLimit());

        System.out.println("\n # ---- POJO ---- # \n");

        for (int i = 1; i <= 5; i++) {
            Student student = new Student(
                    "S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Lisa";
                        case 5 -> "Henry";
                        default -> "Anonymous";
                    },
                    "17/08/1988",
                    "Java Masterclass"
            );
            System.out.println(student);
        }
        System.out.println("\n # ---- Record ---- # \n");

        for (int i = 1; i <= 5; i++) {
            LPAStudent lpaStudent = new LPAStudent(
                    "S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Lisa";
                        case 5 -> "Henry";
                        default -> "Anonymous";
                    },
                    "17/08/1988",
                    "Java Masterclass"
            );
            System.out.println(lpaStudent);
        }

        System.out.println("\n # ---- POJO vs. Record ---- # \n");

        Student pojoStudent = new Student("S923006", "Ann", "17/08/1988", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "17/08/1988", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);
        System.out.println();
        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829"); // Setter
        System.out.println(pojoStudent.getName() + " isTaking " + pojoStudent.getClassList());     // Accessor

//        recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829"); // Record doesn't have Setter
        System.out.println(recordStudent.name() + " isTaking " + recordStudent.classList());     // Accessor


    }
}
