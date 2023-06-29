package src.classes;

public class MoodIndicator{
    private int mood;
    
    public MoodIndicator() {
        mood = 0;
    }
    public MoodIndicator(int mood)
    {
        this.mood = mood;
    }
    public int getMood() {
        return mood;
    }
    public synchronized void betterMood()
    {
        mood++;
    }
}
