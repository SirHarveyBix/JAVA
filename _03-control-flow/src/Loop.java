public class Loop {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        System.out.println(" # ---- ---- ---- # ");

        double amount = 100.00;

        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(amount, rate);
            System.out.println(buildString(amount, rate, interestAmount));
        }

        System.out.println(" # ---- ---- ---- # ");

        for (double rate = 7.5; rate <= 10; rate += 0.25) {

            double interestAmount = calculateInterest(amount, rate);
            if (interestAmount > 8.5) break;

            System.out.println(buildString(amount, rate, interestAmount));
        }
    }

    public static String buildString(double amount, double rate, double interest) {
        return "$" + amount + " at " + rate + "% interest = $" + interest;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
