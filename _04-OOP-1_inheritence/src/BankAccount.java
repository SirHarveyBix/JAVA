public class BankAccount {
    private String number = "123";
    private double balance = 0;
    private String customerName = "Kevin";
    private String customerEmail = "Kevin@me.com";
    private String customerPhone = "+336789898989";

    public BankAccount() { // constructor
        // constructor inside a constructor => constructor chaining
        this("56792", 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor Called !");
    }

    public BankAccount(String number, double balance, String customerName, String email, String phone) { // constructor
        System.out.println("BankAccount constructor with parameters Called");

        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phone;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhone) { // constructor without all values
        this("999999", 100.55, customerName, customerEmail, customerPhone); // adding all necessary values
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public void setNumber(String accountNumber) {
        this.number = accountNumber;
    }
    public void setBalance(int accountBalance) {
        this.balance = accountBalance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.customerEmail = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.customerPhone = phoneNumber;
    }

    public String getNumber() {
        return number;
    }
    public double getBalance() {
        return balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getEmail() {
        return customerEmail;
    }
    public String getPhoneNumber() {
        return customerPhone;
    }
    public void depositFunds(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + ". New balance is $" + balance);
    }

    public void withdrawFunds(double withdrawalAmount) {

        if (balance - withdrawalAmount < 0) {
            System.out.println("Insufficient Funds! You only have $" + balance);
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed, Remaining balance = $" + balance);
        }
    }
}
