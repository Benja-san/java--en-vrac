package src.classes;

public class SuperHuman extends Human
{
    String superPower;

    public SuperHuman(int age, String name, String superPower)
    {
        super(age, name);
        this.superPower = superPower;
        System.out.println(superPower + " is my super power!");
    }

    @Override
    public String toString(){
        return "I am a super human! My name is " + name + " and I am " + age + " years old. My super power is " + superPower + ".";
    }

    public void shout(String startWord, String endWord, String middleWord){
        System.out.println(startWord + " I am shouting with my "+ middleWord +" super power! " + endWord);
    }
}
