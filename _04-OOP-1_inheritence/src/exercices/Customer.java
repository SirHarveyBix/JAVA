package exercices;

public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer() { // no-args constructor
        this("personne", "cki@cpersonne.lui");
    }

    public Customer(String name, String emailAddress) {
        this(name, 80000, emailAddress);
    }

    public Customer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
