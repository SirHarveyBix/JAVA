package UsingArrays;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);

        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        // ^! Sort
        System.out.println("\n # # Sort # # \n");

        System.out.println(Arrays.toString(firstArray));
        System.out.println("\n # # Fill # # \n");

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        // ^! Fill

        System.out.println(Arrays.toString(secondArray));
        System.out.println("\n # # CopyOf # # \n");

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        // ^! CopyOf
        System.out.println(Arrays.toString(fourthArray));
        Arrays.sort(fourthArray);
        System.out.println("\n # # Sort & Unsorted # # \n");

        System.out.println("Unsorted: " + Arrays.toString(thirdArray));
        System.out.println("Sorted: " + Arrays.toString(fourthArray));

        System.out.println("\n # # CopyOf /w length # # \n");
        int[] smallArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallArray));

        int[] largeArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largeArray));

    }

    public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];

        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
