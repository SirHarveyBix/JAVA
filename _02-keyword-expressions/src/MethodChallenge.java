public class MethodChallenge {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Kevin", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Didier", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Henry", highScorePosition);

        System.out.println(" ---- ---- ----");

        System.out.println("New score is " + calculateScore("Tim", 500));
        System.out.println(calculateScore(500));
        System.out.println(calculateScore());

        System.out.println(" ---- ---- ----");

        System.out.println(convertToCentimeters(5,8) + " cm ");

        System.out.println(" ---- ---- ----");

        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
    }

    public static String getDurationString(int seconds) {
        int minutes = seconds / 60;
        return getDurationString(minutes, seconds);

    }

    public static String getDurationString(int minutes, int seconds) {
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "h " + remainingMinutes + " m" + remainingSeconds + "s";
    }

    public static double convertToCentimeters(int inches) {
        // 1 inch = 2.54 cm
       return (double) inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        // 1 foot = 12 inches
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        return   convertToCentimeters(totalInches);
    }


    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " Managed to get into position " +
                highScorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
