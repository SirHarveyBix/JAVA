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

}
