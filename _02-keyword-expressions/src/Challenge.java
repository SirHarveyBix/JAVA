public class Challenge {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your highScore = " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("The next highScore = " +
                calculateScore(gameOver, score, levelCompleted, bonus));

        calculateHighScorePosition(1000);
        calculateHighScorePosition(750);
        calculateHighScorePosition(100);
        calculateHighScorePosition(50);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore+= (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }

    public static void calculateHighScorePosition(int score) {

        if (score >= 1000) {
            System.out.println("score >= 1000 = 1");
        } else if (score >= 500 && score < 1000) {
            System.out.println("score >= 500 && score < 1000 = 2");
        } else if (score >= 100 && score < 500) {
            System.out.println("score >= 100 && score < 500 = 3");
        } else {
            System.out.println("else = 4");
        }
    }
}
