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
        checkData(currentYear, dateOfBirth);

        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in); // .in : input
        System.out.println("Hi, what your Name ? ");// .out : output
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Welcome to this course!");
        System.out.println("What year were you born ? ");
        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <=" + (currentYear));
            String dateOfBirth = scanner.nextLine();
            try {
                age = checkData(currentYear, dateOfBirth);
                validDOB = age >= 0;
            } catch (NumberFormatException badUserInput) {
                System.out.println("What ?! " + '"' + dateOfBirth + '"' + "'s not a date !");
            }
        } while (!validDOB);

        return "So you are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth) {

        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }
        return (currentYear - dob);
    }
}
