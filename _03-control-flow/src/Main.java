public class Main {
    public static void main(String[] args) {
        int value = 3;
// switch case value types : byte, short, int, char, String, enum.
        switch (value) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Value 3, 4, or 5");
                System.out.println("Actually it was : " + value);
            }
            default -> System.out.println("Value was not 1, 2, 3, 4, or 5");
        }
        Months month = Months.April;
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");

        getNatoLetter('Z');
    }

    public static String getQuarter(Months months) {

        return switch (months) {
            case January, February, March -> {
                yield "1st";
            }
            case April, May, June -> "2nd";
            case July, August, September -> "3rd";
            case October, November, December -> "4th";
            default -> {
                String badResponse = months + " is bad.";
                yield /*return*/ badResponse;
            }
        };
    }

    public static void getNatoLetter(char letter) {
        switch (letter) {
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            case 'F':
                System.out.println("Fox");
                break;
            case 'G':
                System.out.println("George");
                break;
            case 'H':
                System.out.println("How");
                break;
            case 'I':
                System.out.println("Item");
                break;
            case 'J':
                System.out.println("Jig");
                break;
            case 'K':
                System.out.println("King");
                break;
            case 'L':
                System.out.println("Love");
                break;
            case 'M':
                System.out.println("Mike");
                break;
            case 'N':
                System.out.println("Nan");
                break;
            case 'P':
                System.out.println("Oboe");
                break;
            case 'Q':
                System.out.println("Peter");
                break;
            case 'R':
                System.out.println("Queen");
                break;
            case 'S':
                System.out.println("Roger");
                break;
            case 'T':
                System.out.println("Sugar");
                break;
            case 'U':
                System.out.println("Uncle");
                break;
            case 'V':
                System.out.println("Victor");
                break;
            case 'W':
                System.out.println("William");
                break;
            case 'X':
                System.out.println("X-ray");
                break;
            case 'Y':
                System.out.println("Yoke");
                break;
            case 'Z':
                System.out.println("Zebra");
                break;
            default:
                System.out.println(letter + " :  Not found");
                break;
        }
    }
}
