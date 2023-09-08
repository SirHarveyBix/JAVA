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
        printEqual(1, 2, 3);
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimit = summer ? 45 : 35;
        return temperature >= 25 && temperature <= upperLimit;
    }


    public static void printEqual(int first, int second, int third) {
        if (first < 0 || second < 0 || third < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (first == second && second == third && third == first) {
            System.out.println("All numbers are equal");
            return;
        }
        if (first != second && second != third && third != first) {
            System.out.println("All numbers are different");
            return;
        }
        if (first != second || second != third || third != first) {
            System.out.println("Neither all are equal or different");
            return;
        }
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long day = (minutes % 525600) / 1440;
        long year = minutes / 525600;
        System.out.println(minutes + " min = " + year + " y and " + day + " d");
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }
        return x * y;
    }

    public static boolean hasTeen(int firstParam, int secondParam, int thirdParam) {
        if (isTeen(firstParam) || isTeen(secondParam) || isTeen(thirdParam)) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int age) {
        if (age >= 13 && age <= 19) {
            return true;
        }
        return false;
    }

    public static boolean hasEqualSum(int firstParam, int secondParam, int thirdParam) {
        if (firstParam + secondParam == thirdParam) {
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


