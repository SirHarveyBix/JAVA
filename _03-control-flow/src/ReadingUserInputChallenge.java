import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        System.out.println(getBiggestSmallestNumber());
    }

    public static String getBiggestSmallestNumber() {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        double bigestNumber = 0;
        double smallestNumber = 0;

        while (true) {
            System.out.println("Enter a number or a character to exit");
            String currentNumber = scanner.nextLine();
            try {
                double currentValidNumber = Double.parseDouble(currentNumber);
                if (counter == 0 || currentValidNumber > bigestNumber) {
                    bigestNumber = currentValidNumber;
                }
                if (counter == 0 || currentValidNumber < smallestNumber) {
                    smallestNumber = currentValidNumber;
                }
                counter++;
                System.out.println("Enter Number # " + counter + ", You entered = " + currentNumber + "\n");
            } catch (NumberFormatException badUserInput) {
                System.out.println("You did not respected the rule, you break the loop.");
                break;
            }
        }
        if (counter > 0) {
            return "Your Biggest number is " + bigestNumber + ", smallest is " + smallestNumber;
        }
        return "No valid data entered.";
    }

    public static String getNumberInput() {
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
