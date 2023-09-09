public class Loop {
    public static void main(String[] args) {

        double amount = 100.00;

        for (double rate = 7.5; rate <= 10; rate += 0.25) {
            double interestAmount = calculateInterest(amount, rate);

            if (interestAmount > 8.5) break;
            System.out.println(buildString(amount, rate, interestAmount));
        }
        System.out.println(" # ---- ---- ---- # ");

        int count = 0;

        for (int number = 0; number <= 5; number++) {
            if (count == 5) break; // not necessary here because of : number <= 5
            if (isPrime(number)) {
                count++;
            }
            System.out.println(number + " is " + (isPrime(number) ? "" : "NOT ") + "a prime number.");
        }
        System.out.println("Total number of prime number is " + count);
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor < wholeNumber; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static String buildString(double amount, double rate, double interest) {
        return "$" + amount + " at " + rate + "% interest = $" + interest;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
