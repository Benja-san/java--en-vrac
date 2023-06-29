package src.classes;

// U can implement Comparable interface to compare objects of a class
public class Monster implements Comparable<Monster>{
    private String name;
    private int lifePoints;
    private int attackPoints;
    private int defensePoints;
    private String description;
    private String type;

    public Monster() {
        name = "Goblin";
        lifePoints = 10;
        attackPoints = 4;
        defensePoints = 2;
        description = "The goblin is a small, ugly creature with a green skin. It is the most common creature you'll face in this area.";
    }

    public Monster(String name, int lifePoints, int attackPoints) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.attackPoints = attackPoints;
        defensePoints = 0;
        description = "No description here";
    }

    public Monster(String name, int lifePoints, int attackPoints, String type) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.attackPoints = attackPoints;
        this.type = type;
        defensePoints = 0;
        description = "No description here";
    }

    public Monster(String name, int lifePoints, int attackPoints, int defensePoints, String description) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Monster " + name + ", has" + lifePoints + "lp, " + attackPoints
                + "Atk " + defensePoints + "Def, " + description + ".";
    }
    
    @Override
    public int compareTo(Monster that) {
        try{
            return this.getName().compareTo(that.getName());
        } catch(UnsupportedOperationException e){
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    protected boolean isDead() {
        return lifePoints <= 0;
    }

    public void attackOtherPlayer(Monster otherPlayer) {
        System.out.println(this.getName() + " attacks " + otherPlayer.getName() + "!");
        otherPlayer.setLifePoints(otherPlayer.getLifePoints() - this.getAttackPoints());
        if(otherPlayer.isDead()){
            System.out.println(otherPlayer.getName() + " is Dead " + this.name + " won");
        } else {
            System.out.println(otherPlayer.getName() + " has " + otherPlayer.getLifePoints() + " life points left.");
        }
    }

}
