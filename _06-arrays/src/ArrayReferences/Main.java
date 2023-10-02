package ArrayReferences;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray: " + Arrays.toString(myIntArray));
        System.out.println("anotherArray: " + Arrays.toString(anotherArray));
        System.out.println("\n # # # # # \n");

        anotherArray[0] = 1;

        System.out.println("After changes myIntArray: " + Arrays.toString(myIntArray));
        System.out.println("After changes anotherArray: " + Arrays.toString(anotherArray));
        // both have changes, because we have 2 arrays with the same reference, the same 'address'
        // Arrays are "reference Type" same sames as JS / TS
        System.out.println("\n # # # # # \n");

        modifyArray(myIntArray);

        System.out.println("After changes myIntArray: " + Arrays.toString(myIntArray));
        System.out.println("After changes anotherArray: " + Arrays.toString(anotherArray));
        // same as before, we now have 3 references to the same array:
        // myIntArray, anotherArray, array (from modifyArray())
    }

    private static void modifyArray(int[] array) {
        array[1] = 2;
    }
}
