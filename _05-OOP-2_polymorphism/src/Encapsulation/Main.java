package Encapsulation;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health = " + player.healthRemaining());
//
//        player.health = 200;
//
//        player.loseHealth(11);
//        System.out.println("Remaining Health = " + player.healthRemaining());

        EnhancedPlayer gui = new EnhancedPlayer("Gui");
        System.out.println("Initial health is " + gui.healthRemaining());
    }
}

//encapsulated class :
// creeer des constrcutors pour l'inistialisation des objects, ce qui force les objects a avoir des données valide
// private acces modifyiers
//getter / setter suelement pour les methods qui en ont besoin.
// uses acces modifyiers non private seuelemnt pour les medhotes qui ont besoin d'etre utilisées.
