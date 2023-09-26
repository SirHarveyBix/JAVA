package inheritanceChallange;

public class TextBlockAndFormatting {
    public static void main(String[] args) {
        String bulletIt = "Print a bulleted list :\n" + "\t\u2022 First Point\n" + "\t\t\u2022 Sub Point"; // •
        System.out.println(bulletIt);

        System.out.println("\n # # # # # \n");

        String textBlock = """
                Print a bulleted list :
                    \u2022 First Point
                        \u2022 Sub Point""";
        System.out.println(textBlock);

        System.out.println("\n # # # # # \n");

        int age = 35;
        System.out.printf("Your age is %d%n", age); // %d format specifier (d = decimal)

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth); // %d format specifier
        System.out.printf("Your age is %.2f%n", (float) age); // %f format specifier (f = float)

        System.out.println("\n # # # # # \n");

        for (int i = 1; i <= 10000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }

        System.out.println("\n # # # # # \n");

        String formatedString = String.format("Your age is %d", age);
        System.out.println(formatedString);

        formatedString = "Your age is %d".formatted(age);
        System.out.println(formatedString);

        System.out.println("\n # # # # # \n");


        printInformation("Hello World");
        System.out.println("\n # # # # # \n");
        printInformation("");
        System.out.println("\n # # # # # \n");
        printInformation("\t \n");
        System.out.println("\n # # # # # \n");

        String helloWorld = "Hello World";

        System.out.printf("index of 'r' = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of 'World' = %d %n", helloWorld.indexOf("World"));
        System.out.printf("index of 'l' = %d %n", helloWorld.indexOf('l'));
        System.out.printf("(last) index of 'l' = %d %n", helloWorld.lastIndexOf('l'));
        System.out.printf("index of 'l' = %d %n", helloWorld.indexOf('l', 3));
        System.out.printf("(last) index of 'l' = %d %n", helloWorld.lastIndexOf('l', 8));
        System.out.println("\n # # # # # \n");

        String helloWorldLower = helloWorld.toLowerCase();

        if (helloWorld.equals(helloWorldLower)) System.out.println("Values match exactly");
        if (helloWorld.equalsIgnoreCase(helloWorldLower)) System.out.println("Values match ignoring case");
        if (helloWorld.startsWith("Hello")) System.out.println("String starts with 'Hello'");
        if (helloWorld.endsWith("World")) System.out.println("String ends with 'World'");
        if (helloWorld.contains("World")) System.out.println("String contains with 'World'");
        if (helloWorld.contentEquals("Hello World")) System.out.println("Values match exactly");
    }

    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()) {
            System.out.println("String is Empty.");
            return;
        }
        if (string.isBlank()) {
            System.out.println("String is Blank.");
            return;
        }

        System.out.printf("First char = %c %n", string.charAt(0)); // %c = Char
        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }
}
