package Challenge;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        ReverseArray.reverse(myArray);

        SortedArray.getIntegers(2);
    }
}

class SortedArray {
    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[number];

        System.out.println("Enter " + number + " integers:");

        for (int i = 0; i < number; i++) {
            myArray[i] = scanner.nextInt();
        }
        printArray(myArray);

        System.out.println(Arrays.toString(sortIntegers(myArray)));
        scanner.close();

        return myArray;
    }

    public static void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Value of index " + i + " is " + myArray[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;

            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}

class ReverseArray {
    public static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int maxIndex = array.length - 1;
        int lengthArray = array.length / 2;

        for (int i = 0; i < lengthArray; i += 1) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}