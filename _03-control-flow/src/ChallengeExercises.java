public class ChallengeExercises {
    public static void main(String[] args) {
        printSquareStarExplained(18);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 0; row < number; row++) {
            for (int column = 0; column < number; column++) {
                if (row == 0 ||
                        row == number - 1 ||
                        column == 0 ||
                        column == number - 1 ||
                        column == row ||
                        column == number - 1 - row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void printSquareStarExplained(int number) {
        if (number < 5) System.out.println("Invalid Value");
        else {
            for (int row = 0; row < number; row++) {
                for (int column = 0; column < number; column++) {
                    if (row == 0 || row == number - 1) System.out.print("1"); // top and bottom rows
                    else if (column == 0) System.out.print("2"); // left column
                    else if (column == number - 1) System.out.print("3"); // right column
                    else if (column == row) System.out.print("4"); // diagonal down to right
                    else if (column == number - 1 - row) System.out.print("5"); // diagonal down to left
                        // alternative to lines 7-11 // if(row==0 || row==number-1 || column==0 || column==number-1 || column==row || column==number-1-row) System.out.print("*");
                    else System.out.print(" ");  // empty space between numbers
                }
                System.out.println(); // puts a return to the row
            }
        }
    }

    public static int getLargestPrime(int number) {
        if (number < 2) return -1;

        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                number /= i;
                i--;
            }
        }
        return number;
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) { // #1 validation
            return false;
        }

        while (bigCount > 0 && goal >= 5) { // #2 subtract 5 from goal for each bigCount
            goal -= 5;
            bigCount--;
        }
        return smallCount >= goal; // #3 make sure enough smallCount to fill remaining goal
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reverseNumber = reverse(number);

        for (int i = 0; i < getDigitCount(number); i++) {
            switch (reverseNumber % 10) {
                case 0 -> System.out.print("Zero ");
                case 1 -> System.out.print("One ");
                case 2 -> System.out.print("Two ");
                case 3 -> System.out.print("Three ");
                case 4 -> System.out.print("Four ");
                case 5 -> System.out.print("Five ");
                case 6 -> System.out.print("Six ");
                case 7 -> System.out.print("Seven ");
                case 8 -> System.out.print("Eight ");
                case 9 -> System.out.print("Nine ");
                default -> {
                }
            }
            reverseNumber /= 10;
        }
    }

    public static int reverse(int number) {
        int reverseNumber = 0;

        while (number != 0) {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;

        int counter = 1;
        while (number > 9) {
            number /= 10;
            counter++;
        }
        return counter;
    }

    public static boolean isPerfectNumber(int number) {
        int divisor = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) divisor += i;
        }

        return divisor == number && number > 1;
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;

        while (first != second) {
            if (first > second) {
                first -= second;
            } else {
                second -= first;
            }
        }
        return second;
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) System.out.println(i);
        }

        System.out.println(number);
    }

    public static boolean isValid(int number) {
        return !((number > 1000) || (number < 10));
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (isValid(x) && isValid(y) && isValid(z)) {
            return (x % 10 == y % 10) ||
                    (y % 10 == z % 10) ||
                    (z % 10 == x % 10);
        }
        return false;
    }

    public static boolean hasSharedDigit(int x, int y) {
        if ((x > 99) || (x < 10) || (y > 99) || (y < 10)) {
            return false;
        }
        return ((x / 10 == y / 10) ||
                (x / 10 == y % 10) ||
                (y / 10 == x % 10) ||
                (x % 10 == y % 10));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 0;
        }
        int evenNumberSun = 0;
        int remainder = 0;

        while (number > 0) {
            remainder = number % 10;
            number /= 10;

            if (remainder % 2 == 0) evenNumberSun += remainder;
        }

        return evenNumberSun;
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 0;
        }

        int lastNumber = number % 10;
        int firstNumber = number;

        while (firstNumber > 9) {
            firstNumber /= 10;
        }

        return lastNumber + firstNumber;
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }
        int reverse = 0;
        int stored = number;

        while (stored > 0) {
            int digit = stored % 10;
            reverse = (reverse * 10) + digit;
            stored /= 10;
        }

        return number == reverse;
    }
}
