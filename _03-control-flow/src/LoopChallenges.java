public class LoopChallenges {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        //• Break point => https://www.jetbrains.com/help/idea/debugging-code.html
        for (int loopIteration = 1; loopIteration <= 1000; loopIteration++) {
            if ((loopIteration % 3 == 0) && (loopIteration % 5 == 0)) {
                sum += loopIteration;
                count++;
                System.out.println("Found a match = " + loopIteration);
            }

            if (count == 5) {
                break;
            }
        }

        System.out.println("sum = " + sum);
        System.out.println(" # ---- ---- ---- # ");

        System.out.println(sumOdd(1, 11));

    }

    public static boolean isOdd(int number) {
        if (number % 2 != 0 && number >= 0) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        if (end < start || start < 0 || end < 0) {
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
