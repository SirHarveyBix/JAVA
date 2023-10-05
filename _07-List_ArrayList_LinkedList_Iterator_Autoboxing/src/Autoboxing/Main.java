package Autoboxing;

public class Main {
    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15); // preferred but unnecessary
        Integer deprecatedBoxing = new Integer(15); // deprecated since JDK 9
        int unboxedInt = boxedInt.intValue(); // unnecessary

        // Automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
//        System.out.println(autoUnboxed.getClass().getName()); // int cannot be dereferenced

        Double resultBoxed = getDoubleObject();
        double resultUnboxed = getLiteralDoublePrimitive();

        System.out.println("resultBoxed: " + resultBoxed);
        System.out.println("resultUnboxed: " + resultUnboxed);
    }

    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {
        return 100.00;
    }
}
