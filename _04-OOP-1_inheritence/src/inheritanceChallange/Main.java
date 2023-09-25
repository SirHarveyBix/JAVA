package inheritanceChallange;
public class Main {
    public static void main(String[] args) {
        Employee gui = new Employee("Gui", "17/08/1988", "14/02/2022");
        System.out.println(gui);

        System.out.println("Age = " + gui.getAge());
        System.out.println("Pay = " + gui.collectPay());

        Employee kev = new Employee("Kevin", "10/10/1998", "17/02/2002");
        System.out.println(kev);
    }
}
