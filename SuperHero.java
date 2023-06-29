import src.classes.SuperHuman;

public class SuperHero {
    public static void main(String args[]){
        SuperHuman human = new SuperHuman(20, "John", "Flying");
        human.shout("Hey Mate!", "See you later!");
        human.shout("Hey Mate!", "See you later!", "F**king");
        System.out.println(human);
    }
}
