package inheritanceChallange;

public class HourlyEmployee extends Employee {
    private double hourlyRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyRate) {
        super(name, birthDate, hireDate);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double collectPay() {
        return 40 * hourlyRate;
    }

    public double getDoublePay() {
        return 2 * collectPay();
    }
}
