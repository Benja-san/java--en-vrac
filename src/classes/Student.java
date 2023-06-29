package src.classes;

import src.tools.Average;

public class Student {
    private String name;
    private String surname;
    private byte age;
    private String average;

    // Static Block: Will be loaded on class load, before any instance is created!
    static
    {
    }

    public Student(String name, String surname, byte age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.average = Average.globalMark();
    }

    public String toString(){
        return "I am a student! My name is " + name + " and I am " + age + " years old. My average is " + average + ".";
    }

    public static void main(String args[]) {
        System.out.println("Hello World");
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public byte getAge() {
        return age;
    }
    public void setAge(byte age) {
        this.age = age;
    }
    public String getAverage() {
        return average;
    }
}
