import src.classes.Student;

public class Students {

    public static void main(String[] args) {

        Student john = new Student("John", "Doe", (byte) 20);
        Student Ava = new Student("Ava", "Max", (byte) 18);
        Student Dehlia = new Student("Dehlia", "John", (byte) 19);
        Student Ixnay = new Student("Ixnay", "On-The-Hombre", (byte) 23);
        Student[] students = new Student[4];
        students[0] = john;
        students[1] = Ava;
        students[2] = Dehlia;
        students[3] = Ixnay;
        for(Student student : students)
        {
            System.out.println(student.getName() + " " + student.getSurname() + " " + student.getAge() + " years old : " + student.getAverage());
        }

    }
    
}
