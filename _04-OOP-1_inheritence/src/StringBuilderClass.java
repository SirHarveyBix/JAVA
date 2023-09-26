public class StringBuilderClass {
    public static void main(String[] args) {
        String helloWorld = "Hello" + " World";
        /*
         * create a new Object in Memory,
         * doesn't change existing string object
         * return a reference to this new object
         * */
        helloWorld.concat(" and Goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        /*
         * return a StringBuilder reference as a self-reference
         * */
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        System.out.println("\n # # # # # \n");

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("*".repeat(57));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("*".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        System.out.println("\n # # # # # \n");

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16,'g');
        System.out.println(builderPlus);

        builderPlus.replace(16,17,"G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("Length = " + builder.length());
        System.out.println("Capacity = " + builder.capacity());
    }
}
