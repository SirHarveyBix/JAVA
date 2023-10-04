package ArrayList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayAndArrayLists {
    public static void main(String[] args) {
        String[] originalArray = new String[]{"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));

        System.out.println("\n # # # # # \n");

        originalList.sort(Comparator.naturalOrder()); // sort list
        System.out.println("array: " + Arrays.toString(originalArray)); // array is not sorted

//        originalList.remove(0); // UnsupportedOperationException
//        originalList.add("Fourth"); // UnsupportedOperationException

        System.out.println("\n # # # # # \n");

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");

        System.out.println("newList: " + newList);

    }
}
