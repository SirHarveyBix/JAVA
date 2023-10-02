package Challenge;

import java.util.Scanner;

public class MinimumElementExercise {
    public static void main(String[] args) {
        int number = readInteger();
        int[] numberArray = readElements(number);

        System.out.println(findMin(numberArray));
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how much number will you write ?");

        int counter = scanner.nextInt();
        scanner.nextLine();
        return counter;
    }

    private static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] someArray = new int[count];

        for (int i = 0; i < someArray.length; i++) {
            System.out.println("Enter number " + Integer.parseInt(i + 1 + "") + ": ");
            int num = scanner.nextInt();
            scanner.nextLine();
            someArray[i] += num;
        }
        return someArray;
    }

    private static String findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return "Minimum number is: " + min;
    }
}