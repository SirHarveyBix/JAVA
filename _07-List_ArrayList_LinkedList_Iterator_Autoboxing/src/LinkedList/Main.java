package LinkedList;

import java.util.LinkedList;

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

        removeElements(newPLaceToVisit);
        System.out.println(newPLaceToVisit);
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
}
