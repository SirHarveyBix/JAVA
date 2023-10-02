package arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
        myIntArray[1] = 1;
        myIntArray[0] = 45;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        System.out.println("\n # # # # # \n");

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + firstTen[0]);

        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);
        System.out.println("length of array = " + firstTen[arrayLength - 1]); // as js arrays stats at 0

        System.out.println("\n # # # # # \n");

        int[] newArray;
        newArray = new int[]{5, 4, 3, 2, 1};
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i] + " ");
        }
    }
}
