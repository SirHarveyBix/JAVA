package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "eggs"};
        List<String> list = List.of(items);

        System.out.println("list: " + list);

        ArrayList<String> groceries = new ArrayList<>(list);
        /*list.add("yogurt");*/ // <= throw exceptions since List is immutable
        groceries.add("yogurt");
        System.out.println("groceries: " + groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese")
        );
        System.out.println("nextList: " + nextList);

        groceries.addAll(nextList);
        System.out.println("groceries: " + groceries);

        if (groceries.contains("mustard")) {
            System.out.println("List contains 'mustard'");
        }

        System.out.println("\n # # # # #\n");

        groceries.add("yogurt");
        System.out.println("first = " + groceries.indexOf("yogurt"));
        System.out.println("last = " + groceries.lastIndexOf("yogurt"));
        System.out.println("groceries = " + groceries);

        groceries.remove(1);
        System.out.println("groceries = " + groceries);

        groceries.remove("yogurt");
        System.out.println("groceries = " + groceries);

        groceries.removeAll(List.of("apples", "eggs"));
        System.out.println("groceries = " + groceries);

        groceries.retainAll(List.of("apples", "milk", "mustard", "cheese", "nothing"));
        System.out.println("groceries = " + groceries);

        groceries.clear();
        System.out.println("groceries = " + groceries);
        System.out.println("groceries isEmpty = " + groceries.isEmpty());

        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));
        System.out.println("groceries = " + groceries);

        groceries.sort(Comparator.naturalOrder());
        System.out.println("groceries = " + groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println("groceries = " + groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        // for lists .length dosent work, we have to use .size();
        System.out.println("groceryArray = " + Arrays.toString( groceryArray));

    }
}
