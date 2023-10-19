package Autoboxing.Exercise;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer(String nameOfCustomer) {
        for (int i = 0; i < this.customers.size(); i++) {
            if (this.customers.get(i).getName().equals(nameOfCustomer)) {
                return this.customers.get(i);
            }
        }
        return null;
    }

    public boolean newCustomer(String nameOfCustomer, double initialTransaction) {
        Customer tempCustomer = findCustomer(nameOfCustomer);
        if (tempCustomer == null) {
            tempCustomer = new Customer(nameOfCustomer, initialTransaction);
            this.customers.add(tempCustomer);
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String nameOfCustomer, double transaction) {
        Customer tempCustomer = findCustomer(nameOfCustomer);
        if (tempCustomer != null) {
            tempCustomer.addTransaction(transaction);
            return true;
        } else {
            return false;
        }
    }
}