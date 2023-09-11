public class SumDigits {
    public static void main(String[] args) {
        int digits = 1234;
        System.out.println("Sum of Digits in " + digits + " is " + sumDigits(digits));
    }

    public static int sumDigits(int number) {
        if (number < 0) return -1;
        int sum = 0;

        while (number > 9) {
            sum += (number % 10);
            number = number / 10;
        }

        return sum += number;
    }
}
