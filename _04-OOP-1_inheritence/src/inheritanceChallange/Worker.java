package inheritanceChallange;

import java.util.Date;

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker() {
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        int currentYear = 2023;
        int birthYear = Integer.parseInt(birthDate.substring(6));

        System.out.println("currentYear " + currentYear);
        return (currentYear - birthYear);
    }

    public double collectPay() {
        return 0.0; //meanwhile
    }

    public void terminated(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}

