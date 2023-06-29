import src.classes.FireMonster;
import src.classes.Monster;
import src.classes.WaterMonster;

public class Arena {

    public static void main(String[] args) {

        Monster opponent = new FireMonster("Behemoth", 100, 54);
        Monster player = new WaterMonster("Shiva", 100, 75);

        System.out.println(opponent.getType());

        System.out.println("Welcome to the Arena!");
        System.out.println("Today's match is " + player.getName() + " vs " + opponent.getName() + "!");
        while(opponent.getLifePoints() > 0 && player.getLifePoints() > 0) {
            player.attackOtherPlayer(opponent);
            if(opponent.getLifePoints() > 0){
                opponent.attackOtherPlayer(player);
            }
        }
    }
}
