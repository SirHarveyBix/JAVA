import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        System.out.println(getBiggestSmallestNumber());
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;
        return (int) Math.ceil(width * height / areaPerBucket - extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        // if(width<=0 || height<=0 || areaPerBucket<=0) return -1;
        // return (int) Math.ceil(width * height / areaPerBucket);
        return getBucketCount(width, height, areaPerBucket, 0); // call first method
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        // if(area <= 0 || areaPerBucket <= 0) return -1;
        // return (int) Math.ceil(area / areaPerBucket);
        return getBucketCount(area, 1, areaPerBucket, 0); // call first method where width*height = area is the same as area*1 = area
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double count = 0;

        while (true) {
            String number = scanner.nextLine();
            try {
                sum += Integer.parseInt(number);
                count++;
            } catch (NumberFormatException badUserInput) {
                System.out.println("SUM = " + sum + " AVG = " + Math.round(sum / count));
                break;
            }
        }
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
