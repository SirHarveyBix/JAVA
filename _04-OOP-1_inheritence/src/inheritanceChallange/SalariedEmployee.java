package inheritanceChallange;
class SalariedEmployee extends Employee {
    long annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, long annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double paycheck = annualSalary / 26;
        double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;

        return (int) adjustedPay;
    }

    public void retire() {
        terminated("12/12/2025");
        isRetired = true;
    }
}
