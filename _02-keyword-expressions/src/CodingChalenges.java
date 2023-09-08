public class CodingChalenges {
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.176,3.175);
    }

    public static boolean hasTeen(int firstParam, int secondParam, int thirdParam) {
        if (isTeen(firstParam) || isTeen(secondParam)  || isTeen(thirdParam) ) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int age) {
        if (age  >= 13 &&  age <= 19) {
            return true;
        }
        return false;
    }

    public static boolean hasEqualSum(int firstParam, int secondParam, int thirdParam) {
        if (firstParam + secondParam == thirdParam ) {
            return true;
        }
        return false;
    }


    public static boolean areEqualByThreeDecimalPlaces(double firstParam, double secondParam) {
        if ((int) (firstParam * 1000) == (int) (secondParam * 1000)) {
            return true;
        }
        return false;
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    System.out.println(year + " = true  % 100");
                    if (year % 400 == 0) {
                        System.out.println(year + " = true  % 400");
                        return true;
                    }
                    return false;
                }
                System.out.println(year + " = true % 4");
                return true;
            }
            System.out.println("else " + year + " = false");
            return false;
        }
        System.out.println("NOT IN THE RANGE");
        return false;
    }


    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay > 23 || hourOfDay < 0) {
            return false;
        } else if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }
        return false;
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + Math.round(kiloBytes / 1024) + " MB and " + kiloBytes % 1024 + " KB");
        }
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        double mile = 1.609;

        return Math.round(kilometersPerHour / mile);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + "km/h = " + toMilesPerHour(kilometersPerHour) + "mi/h");
        }
    }
}


