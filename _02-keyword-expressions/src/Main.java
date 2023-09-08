public class Main {

    public static void main(String[] args) {
    double kilometers = (100 * 1.609344); // statement : (100 * 1.609344), expression : kilometers = (100 * 1.609344)

        int highScore = 50;

        if (highScore > 50) {
            highScore = 1000 + highScore;
        }

        int health = 100;

        if ((health < 25) && (highScore > 1000)) {
            highScore = highScore - 1000;
        }
    }
}