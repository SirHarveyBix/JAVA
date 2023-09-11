import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        System.out.println(getInputFromScanner());
    }

    public static String getInputFromScanner() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        double sum = 0;

        do {
            System.out.println("Write down a number");
            String number = scanner.nextLine();
            try {
                sum += Double.parseDouble(number);
                counter++;
                System.out.println("Enter Number # " + counter + ", You entered = " + number + "\n");
            } catch (NumberFormatException badUserInput) {
                System.out.println("Invalid number");
            }
        } while (counter < 5);

        return "Total of these 5 number is " + sum;
    }
}
