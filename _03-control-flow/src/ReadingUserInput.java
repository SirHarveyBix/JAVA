import java.time.Year;
import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        int currentYear = Year.now().getValue();

        try {
            System.out.println(getInputFromConsole(currentYear)); // allow to use terminal outside of IDE
        } catch (NullPointerException error) {
            System.out.println(getInputFromScanner(currentYear)); // uses builtin IDE terminal
        }
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, what your Name ? ");
        System.out.println("Hi " + name + ", Welcome to this course!");

        String dateOfBirth = System.console().readLine("What year were you born ? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        if (age < 0) {
            return "NO WAY !";
        }

        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in); // .in : input
        System.out.println("Hi, what your Name ? ");// .out : output
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Welcome to this course!");

        // String dateOfBirth = System.console().readLine("What year were you born ? ");
        System.out.println("What year were you born ? ");
        String dateOfBirth = scanner.nextLine();

        int age = currentYear - Integer.parseInt(dateOfBirth);

        if (age < 0 || Integer.parseInt(dateOfBirth) < 0) {
            return "NO WAY !";
        }

        return "So you are " + age + " years old";
    }
}
