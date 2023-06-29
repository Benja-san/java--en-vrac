package src.classes;

class Human
{
    int age;
    String name;

    public Human(int age, String name)
    {
        this.age = age;
        this.name = name;
        System.out.println(name + " is " + age + " years old : Am a Human!");
    }

    public String toString(){
        return "I am a human! My name is " + name + " and I am " + age + " years old.";
    }

    public void shout(String startWord, String endWord){
        System.out.println(startWord + " I am shouting like a human! " + endWord);
    }

}
