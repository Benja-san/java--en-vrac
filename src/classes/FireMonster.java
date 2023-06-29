package src.classes;

public class FireMonster extends Monster {
    private static String type = "fire";

    public FireMonster(String name, int lifePoints, int attackPoints) {
        super(name, lifePoints, attackPoints, type);
    }

     @Override
    public void attackOtherPlayer(Monster otherPlayer){
        System.out.println(this.getName() + " attacks " + otherPlayer.getName() + "!");
        if(otherPlayer.getType() == "air"){
            otherPlayer.setLifePoints(otherPlayer.getLifePoints() - (this.getAttackPoints() * 2));
        } else {
            otherPlayer.setLifePoints(otherPlayer.getLifePoints() - this.getAttackPoints());
        }
        
        if(otherPlayer.isDead()){
            System.out.println(otherPlayer.getName() + " is Dead " + this.getName() + " won");
        } else {
            System.out.println(otherPlayer.getName() + " has " + otherPlayer.getLifePoints() + " life points left.");
        }
    }
}
