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
    }

}
