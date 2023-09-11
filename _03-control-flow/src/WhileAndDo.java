public class WhileAndDo {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println(" # ---- ---- ---- # ");

        int j = 1;
        while (j <= 5) {
//        while (true) {
//            if (j > 5) {
//                break;
//            }
            System.out.println(j);
            j++;
        }
        j = 1;
        System.out.println(" # ---- ---- ---- # ");

        boolean isReady = false;

        do {
            if (j > 5) break;

            System.out.println(j);
            j++;
            isReady = (j > 0);
        } while (isReady);

        System.out.println(" # ---- Continue Statement ---- # ");

        int number = 0;
        while (number < 50) {
            number += 5;

            if (number % 25 == 0) {
                continue;
            }
            System.out.print(number + ", ");
        }
        
        System.out.println("\n\n # ---- ---- ---- # \n");

        number = 4;
        int evenCount = 0;
        int oddCount = 0;

        while (number <= 20) {
            number++;
            if (!isEvenNumber(number)) {
                oddCount++;
                continue; // bypass all the other code while break completely stops
            }
            System.out.println("Even = " + number);
            evenCount++;
            if (evenCount >= 5) {
                break;
            }
        }

        System.out.println("evenCount = " + evenCount);
        System.out.println("oddCount = " + oddCount);
    }

    public static boolean isEvenNumber(int number) {
        return (number % 2) == 0 ? true : false;
    }
}
