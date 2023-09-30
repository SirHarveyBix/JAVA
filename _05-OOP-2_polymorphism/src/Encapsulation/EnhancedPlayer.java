package Encapsulation;

public class EnhancedPlayer {
    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String fullName) {
        this(fullName, 100, "Sword"); // set up 'default values'
    }

    public EnhancedPlayer(String fullName, int healthPercentage, String weapon) {
        this.fullName = fullName;
        if (healthPercentage <= 0) {
            this.healthPercentage = 1;
        } else if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = healthPercentage;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        healthPercentage = healthPercentage - damage;
        if (healthPercentage < 0) {
            System.out.println("Player knocker out the game");
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth) {
        healthPercentage = healthPercentage + extraHealth;
        if (healthPercentage > 100) {
            System.out.println("Player restored to 100%");
            healthPercentage = 100;
        }
    }
}
