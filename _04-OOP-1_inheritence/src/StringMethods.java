public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");

        System.out.println("statingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring((startingIndex)));

        System.out.println("Month = " + birthDate.substring(3, 5));

        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("\t\u2022 newDate = " + newDate);

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("\t\u2022 newDate = " + newDate);

        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println("\t\u2022 newDate = " + newDate);

        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("\t\u2022 newDate = " + newDate + "\n");

        System.out.println("\u2022 newDate.replace = " + newDate.replace('/', '-')); // replaceFirst(), replaceAll()

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("  ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }
}
