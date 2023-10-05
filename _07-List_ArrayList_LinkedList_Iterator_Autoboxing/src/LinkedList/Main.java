package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<>();

        var newPLaceToVisit = new LinkedList<String>();

        newPLaceToVisit.add("0 - Sydney");
        newPLaceToVisit.add(0, "0.1 - Canberra");
        System.out.println(newPLaceToVisit);

        System.out.println("\n # # # # # \n");

        addMoreElements(newPLaceToVisit);
        System.out.println(newPLaceToVisit);

        System.out.println("\n # # # # # \n");

//        removeElements(newPLaceToVisit);
//        System.out.println(newPLaceToVisit);
//        System.out.println("\n # # # # # \n");

        gettingElements(newPLaceToVisit);
        System.out.println(newPLaceToVisit);
        System.out.println("\n # # # # # \n");

//        printItinerary(newPLaceToVisit);
//        System.out.println("\n # # # # # \n");

        printItinerary3(newPLaceToVisit);
        System.out.println("\n # # # # # \n");

        testIterator(newPLaceToVisit);
    }

    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("0.2 - Darwin");
        list.addLast("last - Hobart");
        // Queue methods
        list.offer("Melbourne");
        list.addFirst("0.3 - Brisbane");
        list.offerLast("last.1 - Toowoomba");
        // Stack methods
        list.push("Alice Springs");
    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("0.3 - Brisbane");
        System.out.println(list);

        String string1 = list.remove(); // removes first element
        System.out.println(string1 + " was removed\n");
        System.out.println(list);

        String string2 = list.removeFirst(); // removes first element
        System.out.println(string2 + " was removed\n");
        System.out.println(list);

        String string3 = list.removeLast(); // removes last element
        System.out.println(string3 + " was removed\n");
        System.out.println(list);

        // Queue/Deque methods
        String poll1 = list.poll(); // removes first element
        System.out.println(poll1 + " was removed\n");
        System.out.println(list);

        String poll2 = list.pollFirst(); // removes first element
        System.out.println(poll2 + " was removed\n");
        System.out.println(list);

        String poll3 = list.pollLast(); // removes last element
        System.out.println(poll3 + " was removed\n");
        System.out.println(list);

        System.out.println("\n # # # # # \n");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        System.out.println("\n # # # # # \n");

        String poll4 = list.pop(); // removes fist element
        System.out.println(poll4 + " was removed\n");
    }

    private static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrieved Element = " + list.get(4));
        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());

        System.out.println("'0.2 - Darwin' is at position: " + list.indexOf("0.2 - Darwin"));
        System.out.println("'Melbourne' is at position: " + list.lastIndexOf("Melbourne"));

        // Queue retrieval methods
        System.out.println("Element from element() = " + list.element());

        // Stack retrieval methods
        System.out.println("\n # # # # # \n");
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
        }

        System.out.println("Trip ends at " + list.getLast());
        System.out.println("\n # # # # # \n");
    }

    public static void printItinerary2(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());

        String previousTown = list.getFirst();
        for (String town : list) {
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }

        System.out.println("Trip ends at " + list.getLast());
        System.out.println("\n # # # # # \n");
    }

    public static void printItinerary3(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());

        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);

        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }

        System.out.println("Trip ends at " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list) {
//        var iterator = list.iterator();
        var iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("0.3 - Brisbane")) {
//                list.remove(); // ConcurrentModificationException
//                iterator.remove();
                iterator.add("Lake Wivenhoe");
            }
        }
        while (iterator.hasPrevious()) {
            System.out.println("iterator : " + iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.previous());
    }
}
