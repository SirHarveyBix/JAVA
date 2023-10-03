package TwoDimensionalArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {2, 3}};

        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("array2.length = " + array2.length);

        for (int[] outer : array2) {
            System.out.println(Arrays.toString(outer));
        }

        /* ---- Traditional for loop --- */
        for (int i = 0; i < array2.length; i++) {
            var innerArray = array2[i];
            for (int j = 0; j < innerArray.length; j++) {
//                System.out.println(array2[i][j] + " ");
                array2[i][j] = (i * 10) + (j + 1);
            }
            System.out.println();
        }

        /* ---- for each loop --- */
//        for (var outer : array2) {
//            for (var element : outer) {
//                System.out.println(element + " ");
//            }
//            System.out.println();
//        }

        System.out.println(Arrays.deepToString(array2));
        System.out.println("\n # # # # # \n");

        array2[1] = new int[]{16, 26, 36};
        System.out.println(Arrays.deepToString(array2));
        System.out.println("\n # # # # # \n");

        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));
        System.out.println("\n # # # # # \n");

        anyArray[0] = new String[]{"a", "b", "c"};
        System.out.println(Arrays.deepToString(anyArray));
        System.out.println("\n # # # # # \n");

        anyArray[1] = new String[][]{
                {"1", "2"},
                {"2", "3", "4"},
                {"6", "7", "8", "9"},
        };
        System.out.println(Arrays.deepToString(anyArray));
        System.out.println("\n # # # # # \n");

        anyArray[2] = new int[2][2][2];
//        anyArray[2] = "Hello";
        System.out.println(Arrays.deepToString(anyArray));
        System.out.println("\n # # # # # \n");

        for (Object element : anyArray) {
            System.out.println("Element type: " + element.getClass().getSimpleName());
            System.out.println("Element toString(): " + element);
            System.out.println(Arrays.deepToString((Object[]) element));
            System.out.println("# # # # # \n");
        }
    }
}
