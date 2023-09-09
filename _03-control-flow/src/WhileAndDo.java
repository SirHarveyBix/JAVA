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
            if (j > 5) {
                break;
            }
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
    }
}
