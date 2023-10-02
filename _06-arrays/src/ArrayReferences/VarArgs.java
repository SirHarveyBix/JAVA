package ArrayReferences;

public class VarArgs {
    public static void main(String... args) { // String[] >> String...
        System.out.println("Hello World again.\n");
        String[] splitStrings = "Hello World again".split(" ");

        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello World");

        System.out.println("_".repeat(20));
        printText("Hello", "World", "again", "and 0again");

        System.out.println("_".repeat(20));
        printText();

        System.out.println("_".repeat(20));
        String[] stringArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(", ", stringArray));
    }

    private static void printText(String... textList) {
        // '...' can receive any string from an array, literal or none
        for (String string : textList) {
            System.out.println(string);
        }
    }
}
