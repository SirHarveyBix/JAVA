package inheritanceChallange;
public class Main {
    public static void main(String[] args) {
        System.out.println("# # # # #\n");
        Employee gui = new Employee("Gui", "17/08/1988", "14/02/2022");
        System.out.println(gui);

        System.out.println("Age = " + gui.getAge());
        System.out.println("Pay = " + gui.collectPay());

        System.out.println("# # # # #\n");

        SalariedEmployee kev = new SalariedEmployee("Kevin", "10/10/1998", "17/02/2002", 35000);
        System.out.println(kev);

        System.out.println("Kevin's paycheck = $" + kev.collectPay());
        kev.retire();
        System.out.println("Kevin's Pension check = $" + kev.collectPay());
        
        System.out.println("# # # # #\n");

        HourlyEmployee mary = new HourlyEmployee("Mary", "09/12/193", "17/03/2020", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = " + mary.collectPay());
        System.out.println("Mary's Holiday Pay = " + mary.getDoublePay());
    }
}
