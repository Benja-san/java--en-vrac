import java.util.Scanner;
import src.classes.Student;

public class Prompting {
    public static void main(String args[]){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Hello, and welcome to the marvelous university of machines !");
        System.out.println("Enter your name mate");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("So your name is " + name + "! Well that's a funny name...");
        System.out.println("Surname please.");
        String surname = scanner.nextLine();
        System.out.println("Fair enough... though with a name like yours it was difficult but since I hear your surname" + surname + "... well, let's not judge you only with your name, you did not chose it right? heh...");
        System.out.println("How old are you ?");
        Byte age = scanner.nextByte();
        System.out.println(age + "yo, ok I have enough data");
        Student personalStudent = new Student(name, surname, age);
        System.out.println(personalStudent.getName() + " " + personalStudent.getSurname() + " " + personalStudent.getAge() + " years old : " + personalStudent.getAverage());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
