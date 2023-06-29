package src.tools;
import java.util.Random;

public class Average
{
    public static final byte MAX = 20;
    public static final byte MIN = 0;

    private static double roundNumber(double number)
    {
        double result = Math.round(number * 100.0) / 100.0;
        return result;
    }

    private static double average(double notes[])
    {
        double sum = 0;
        for (int i = 0; i < notes.length; i++) {
            sum += notes[i];
        }
        long notesNumber = notes.length;
        double average = sum / notesNumber;
        double formatedAverage = roundNumber(average);
        double result = formatedAverage > MAX ? MAX : formatedAverage < MIN ? MIN : formatedAverage;
        return result;
    }

    private static String getMention(int result)
    {
        String mention = "No statement here";
        switch(result){
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9:
                mention = "insufficient";
                break;
            case 10, 11, 12:
                mention = "pass";
                break;
            case 13, 14, 15:
                mention = "satisfactory";
                break;
            case 16, 17, 18:
                mention = "good";
                break;
            case 19, 20:
                mention = "excellent";
                break;
            default:
                mention = "Result has been falsified, you are fired!";
                break;
        }
        return mention;
    }

    public static String globalMark()
    {
        double allNotes[][] = new double[4][6];
        double globalNotes[] = new double[4];
        int globalIndex = 0;
        for(double notes[] : allNotes)
        {
            int startingIndex = 0;
            for(double note : notes)
            {
                Random random = new Random();
                double randomDoouble = random.nextDouble();
                double randomNote = MIN + (MAX - MIN) * randomDoouble;
                note = roundNumber(randomNote);
                notes[startingIndex] = note;
                startingIndex++;
            }
            globalNotes[globalIndex] = average(notes);
            globalIndex++;
        }
        double result = average(globalNotes);
        String text = " Global grade : ";
        String message = text + result + " / " + MAX + " ";
        String mention = getMention((int) result);
        return message + mention;
    }
}